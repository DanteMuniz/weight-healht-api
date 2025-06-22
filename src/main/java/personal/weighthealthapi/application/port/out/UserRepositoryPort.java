package personal.weighthealthapi.application.port.out;

import personal.weighthealthapi.domain.model.User;

public interface UserRepositoryPort {

    User save(User user);

}
