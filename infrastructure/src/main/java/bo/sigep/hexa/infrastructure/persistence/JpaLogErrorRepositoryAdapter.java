package bo.sigep.hexa.infrastructure.persistence;

import bo.sigep.hexa.application.port.out.LogErrorRepositoryPort;
import bo.sigep.hexa.domain.model.LogError;
import bo.sigep.hexa.infrastructure.controller.LogErrorEntity;
import bo.sigep.hexa.infrastructure.controller.dto.LogErrorResponse;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaLogErrorRepositoryAdapter implements LogErrorRepositoryPort {

    private final SpringDataLogErrorRepository springDataLogErrorRepository;

    public JpaLogErrorRepositoryAdapter(SpringDataLogErrorRepository springDataLogErrorRepository) {
        this.springDataLogErrorRepository = springDataLogErrorRepository;
    }

    @Override
    public LogError save(LogError logError) {
        LogErrorEntity logErrorEntity = new LogErrorEntity(logError.traza(), logError.usuario(), logError.fechaHora(), logError.parametrosError());
        final LogErrorEntity saveLogError = springDataLogErrorRepository.save(logErrorEntity);
        return new LogError(saveLogError.getCodigoError(), saveLogError.getTraza(), saveLogError.getUsuario(), saveLogError.getFechaHora(), saveLogError.getParametrosError());
    }

    @Override
    public Optional<LogError> findById(Long id) {
        final LogErrorEntity logError = springDataLogErrorRepository.findById(id).orElseThrow(()->new IllegalArgumentException("LogError not found"));
        return Optional.of(new LogError(logError.getCodigoError(), logError.getTraza(), logError.getUsuario(), logError.getFechaHora(), logError.getParametrosError()));
    }
}
