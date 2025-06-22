package personal.weighthealthapi.infraestructura.persistance;

import org.springframework.stereotype.Repository;
import personal.weighthealthapi.application.port.out.UserRepositoryPort;
import personal.weighthealthapi.domain.model.User;
import personal.weighthealthapi.infraestructura.repository.SpringDataUserRepository;
import personal.weighthealthapi.shared.util.UserMapper;

@Repository
public class JpaUserRepositoryAdapter implements UserRepositoryPort {

    private final SpringDataUserRepository springDataUserRepository;

    public JpaUserRepositoryAdapter(SpringDataUserRepository springDataUserRepository) {
        this.springDataUserRepository = springDataUserRepository;
    }


    @Override
    public User save(User user) {

        UserEntity userEntity = UserMapper.userToUserEntity(user);
        UserEntity userEntitySaved = springDataUserRepository.save(userEntity);
        User userSaved = UserMapper.userEntityToUser(userEntitySaved);
        return userSaved;
    }
}
