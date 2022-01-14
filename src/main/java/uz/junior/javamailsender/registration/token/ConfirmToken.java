//package uz.junior.javamailsender.registration.token;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@AllArgsConstructor
//@Data
//@Entity
//public class ConfirmToken {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column(nullable = false)
//    private String token;
//
//    private LocalDateTime createdAt;
//    private LocalDateTime expiredAt;
//    private LocalDateTime confirmedAt;
//
//    public ConfirmToken(String token,
//                        LocalDateTime createdAt,
//                        LocalDateTime expiredAt,
//                        LocalDateTime confirmedAt) {
//        this.token = token;
//        this.createdAt = createdAt;
//        this.expiredAt = expiredAt;
//        this.confirmedAt = confirmedAt;
//    }
//
//    public ConfirmToken() {
//
//    }
//}
