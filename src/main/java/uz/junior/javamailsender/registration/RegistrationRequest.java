package uz.junior.javamailsender.registration;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@Data
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    private final String firstName;
    private final String lastName;
    private final String password;
    private final String email;


}
