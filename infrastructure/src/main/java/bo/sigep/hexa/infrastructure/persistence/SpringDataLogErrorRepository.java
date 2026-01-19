package bo.sigep.hexa.infrastructure.persistence;

import bo.sigep.hexa.infrastructure.controller.LogErrorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataLogErrorRepository extends JpaRepository<LogErrorEntity, Long> {
}
