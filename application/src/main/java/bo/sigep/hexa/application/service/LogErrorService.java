package bo.sigep.hexa.application.service;

import bo.sigep.hexa.application.port.in.CreateLogErrorUseCase;
import bo.sigep.hexa.application.port.in.GetLogErrorUseCase;
import bo.sigep.hexa.application.port.out.LogErrorRepositoryPort;
import bo.sigep.hexa.domain.model.LogError;

import java.util.Optional;

public class LogErrorService implements CreateLogErrorUseCase, GetLogErrorUseCase {

    private final LogErrorRepositoryPort logErrorRepositoryPort;

    public LogErrorService(LogErrorRepositoryPort logErrorRepositoryPort) {
        this.logErrorRepositoryPort = logErrorRepositoryPort;
    }

    @Override
    public LogError createLogError(LogError logError) {
        return logErrorRepositoryPort.save(logError);
    }

    @Override
    public Optional<LogError> findById(Long id) {
        return logErrorRepositoryPort.findById(id);
    }
}
