package io.laaf.security.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "\"User\"") // postgresql에서 User는 예약어라 문자열로 명시해 줘야 테이블 생성 가능
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String username;
    private String password;
    private String email;
    private String role;

    private String provider;
    private String providerId;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @Builder
    public User(Long user_id, String username, String password, String email, String role, String provider, String providerId, LocalDateTime createdDate) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.provider = provider;
        this.providerId = providerId;
        this.createdDate = createdDate;
    }
}
