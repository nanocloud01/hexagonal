package bo.sigep.hexa.infrastructure;

import bo.sigep.hexa.infrastructure.controller.LogErrorEntity;
import org.springframework.data.repository.CrudRepository;

public interface LogErrorRepository extends CrudRepository<LogErrorEntity, Long> {
}
