package bo.sigep.hexa.infrastructure.controller;

import bo.sigep.hexa.application.port.in.CreateLogErrorUseCase;
import bo.sigep.hexa.application.port.in.GetLogErrorUseCase;
import bo.sigep.hexa.domain.model.LogError;
import bo.sigep.hexa.infrastructure.controller.dto.LogErrorRequest;
import bo.sigep.hexa.infrastructure.controller.dto.LogErrorResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logs")
public class LogController {

    private final CreateLogErrorUseCase createLogErrorUseCase;
    private final GetLogErrorUseCase getLogErrorUseCase;

    public LogController(CreateLogErrorUseCase createLogErrorUseCase, GetLogErrorUseCase getLogErrorUseCase) {
        this.createLogErrorUseCase = createLogErrorUseCase;
        this.getLogErrorUseCase = getLogErrorUseCase;
    }

    @GetMapping
    public String test() {
        return "Hola REST";
    }

    @PostMapping
    public LogErrorResponse createLogError(@RequestBody LogErrorRequest logErrorRequest) {
        final LogError logError = new LogError(logErrorRequest.traza(), logErrorRequest.usuario(), logErrorRequest.fechaHora(), logErrorRequest.parametrosError());
        final LogError logErrorCrated = createLogErrorUseCase.createLogError(logError);
        return new LogErrorResponse(logErrorCrated.id(), logErrorCrated.traza(), logErrorCrated.usuario(), logErrorCrated.fechaHora(), logErrorCrated.parametrosError());
    }

    @GetMapping("/{id}")
    public LogErrorResponse getLogError(@PathVariable Long id) {
        final LogError logError = getLogErrorUseCase.findById(id).orElseThrow(()->new IllegalArgumentException("LogError not found"));
        return new LogErrorResponse(logError.id(), logError.traza(), logError.usuario(), logError.fechaHora(), logError.parametrosError());
    }
}
