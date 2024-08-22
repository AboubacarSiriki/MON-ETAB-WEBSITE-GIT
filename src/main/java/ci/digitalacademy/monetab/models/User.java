package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="utilisateur")
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",unique = true,nullable = false)
    private String speudo;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "create_date",nullable = false)
    private Instant creationdate;
}
