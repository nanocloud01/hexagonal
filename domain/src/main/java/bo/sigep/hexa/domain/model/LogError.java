package bo.sigep.hexa.domain.model;

import java.time.LocalDateTime;
import java.util.Objects;

public final class LogError {
    private final Long id;
    private final String traza;
    private final String usuario;
    private final LocalDateTime fechaHora;
    private final String parametrosError;

    public LogError(Long id, String traza, String usuario, LocalDateTime fechaHora, String parametrosError) {
        this.id = id;
        this.traza = traza;
        this.usuario = usuario;
        this.fechaHora = fechaHora;
        this.parametrosError = parametrosError;
    }

    public LogError(String traza, String usuario, LocalDateTime fechaHora, String parametrosError) {
        this(null, traza, usuario, fechaHora, parametrosError);
    }

    public Long id() {
        return id;
    }

    public String traza() {
        return traza;
    }

    public String usuario() {
        return usuario;
    }

    public LocalDateTime fechaHora() {
        return fechaHora;
    }

    public String parametrosError() {
        return parametrosError;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (LogError) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.traza, that.traza) &&
                Objects.equals(this.usuario, that.usuario) &&
                Objects.equals(this.fechaHora, that.fechaHora) &&
                Objects.equals(this.parametrosError, that.parametrosError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, traza, usuario, fechaHora, parametrosError);
    }

    @Override
    public String toString() {
        return "LogError[" +
                "id=" + id + ", " +
                "traza=" + traza + ", " +
                "usuario=" + usuario + ", " +
                "fechaHora=" + fechaHora + ", " +
                "parametrosError=" + parametrosError + ']';
    }

}
