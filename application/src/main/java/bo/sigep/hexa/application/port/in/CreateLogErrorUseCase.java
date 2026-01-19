package bo.sigep.hexa.application.port.in;

import bo.sigep.hexa.domain.model.LogError;

public interface CreateLogErrorUseCase {

    LogError createLogError(LogError logError);

}
