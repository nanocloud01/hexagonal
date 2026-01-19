package bo.sigep.hexa.application.port.out;

import bo.sigep.hexa.domain.model.LogError;

import java.util.Optional;

public interface LogErrorRepositoryPort {

    LogError save(LogError logError);
    Optional<LogError> findById(Long id);

}
