package bo.sigep.hexa.infrastructure;

import bo.sigep.hexa.infrastructure.controller.LogErrorEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/logErrors")
public class LogErrorController {

    private final LogErrorRepository logErrorRepository;
    private Optional<LogErrorEntity> aa;

    public LogErrorController(LogErrorRepository logErrorRepository) {
        this.logErrorRepository = logErrorRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<LogErrorEntity> getLogError(@PathVariable Long id) {
        System.out.println(id);
        /*
        aa = logErrorRepository.findById(id);
        if(aa.isPresent()) {
            LogErrorEntity logErrorEntity = aa.get();
            System.out.println(logErrorEntity.getCodigoError());
        }
         */

        //aa.ifPresent(logErrorEntity -> System.out.println(logErrorEntity.getCodigoError()));

        return logErrorRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
