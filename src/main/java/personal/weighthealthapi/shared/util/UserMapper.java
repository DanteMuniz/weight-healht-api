package personal.weighthealthapi.shared.util;

import org.springframework.stereotype.Component;
import personal.weighthealthapi.domain.model.User;
import personal.weighthealthapi.infraestructura.persistance.UserEntity;

public class UserMapper {

    public static User userEntityToUser (UserEntity userEntity) {
        User user = new User(userEntity.getId(), userEntity.getUserName(), userEntity.getLastName());
        return user;
    }

    public static UserEntity userToUserEntity (User user) {
        UserEntity userEntity = new UserEntity(user.id(), user.username(), user.lastName());
        return userEntity;
    }
}
