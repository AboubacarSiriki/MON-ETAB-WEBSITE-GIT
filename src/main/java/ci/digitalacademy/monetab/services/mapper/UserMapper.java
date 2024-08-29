package ci.digitalacademy.monetab.services.mapper;


import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.dto.UserDTO;

public final class UserMapper {

    private UserMapper(){

    }

    public static UserDTO toDto(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setSpeudo(user.getSpeudo());
        userDTO.setPassword(user.getPassword());
        userDTO.setCreationdate(user.getCreationdate());
        return userDTO;
    }

    public static User toEntity(UserDTO userDTO){
        User user = new User();
        user.setId(userDTO.getId());
        user.setSpeudo(userDTO.getSpeudo());
        user.setCreationdate(userDTO.getCreationdate());
        user.setPassword(userDTO.getPassword());
        return user;
    }
}
