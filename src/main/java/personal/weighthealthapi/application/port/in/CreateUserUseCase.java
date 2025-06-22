package personal.weighthealthapi.application.port.in;

import personal.weighthealthapi.domain.model.User;

public interface CreateUserUseCase {

    User createUser(User user);

}

