package ci.digitalacademy.monetab.services.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class UserDTO {

    private Long id;

    private String speudo;

    private String password;

    private Instant creationdate;


}
