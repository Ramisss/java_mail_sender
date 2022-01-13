package uz.junior.javamailsender.registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import uz.junior.javamailsender.appuser.AppUser;
import uz.junior.javamailsender.appuser.AppUserRole;
import uz.junior.javamailsender.appuser.AppUserService;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final EmailValidator emailValidator;
    private final AppUserService appUserService;

    public String register(RegistrationRequest request){
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if (!isValidEmail){
            throw new IllegalStateException("email not found");
        }

        return appUserService.signUpUser(
                new AppUser (
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );
    }

}
