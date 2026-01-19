package bo.sigep.hexa.application.port.in;

import bo.sigep.hexa.domain.model.LogError;

import java.util.Optional;

public interface GetLogErrorUseCase {

    Optional<LogError> findById(Long id);
}
