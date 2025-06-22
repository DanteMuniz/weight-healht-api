package personal.weighthealthapi.infraestructura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import personal.weighthealthapi.infraestructura.persistance.UserEntity;

@Repository
public interface SpringDataUserRepository extends JpaRepository<UserEntity, Integer> {
}
