package personal.weighthealthapi.application.service;

import org.springframework.stereotype.Service;
import personal.weighthealthapi.application.port.in.CreateUserUseCase;
import personal.weighthealthapi.application.port.out.UserRepositoryPort;
import personal.weighthealthapi.domain.model.User;

@Service
public class UserUseCaseService implements CreateUserUseCase {

    @Override
    public User createUser(User user) {
        return null;
    }
}
