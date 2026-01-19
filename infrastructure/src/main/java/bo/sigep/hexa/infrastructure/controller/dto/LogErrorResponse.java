package bo.sigep.hexa.infrastructure.controller.dto;

import java.time.LocalDateTime;

public record LogErrorResponse(
        Long id,
        String traza,
        String usuario,
        LocalDateTime fechaHora,
        String parametrosError
) {
}
