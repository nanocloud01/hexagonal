package bo.sigep.hexa.infrastructure.config;

import bo.sigep.hexa.application.port.in.CreateLogErrorUseCase;
import bo.sigep.hexa.application.port.out.LogErrorRepositoryPort;
import bo.sigep.hexa.application.service.LogErrorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateLogErrorUseCase createLogErrorUseCase(LogErrorRepositoryPort logErrorRepositoryPort) {
        return new LogErrorService(logErrorRepositoryPort);
    }
}
