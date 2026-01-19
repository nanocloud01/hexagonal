package bo.sigep.hexa.infrastructure.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="LOG_ERROR")
public class LogErrorEntity {

    @Id
    @Column(name = "CODIGO_ERROR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoError;

    @Column(name = "TRAZA")
    private String traza;

    @Column(name = "USUARIO")
    private String usuario;

    @Column(name = "FECHA_HORA")
    private LocalDateTime fechaHora;

    @Column(name = "PARAMETROS_ERROR")
    private String parametrosError;

    public LogErrorEntity() {
    }

    public LogErrorEntity(Long codigoError, String traza, String usuario, LocalDateTime fechaHora, String parametrosError) {
        this.codigoError = codigoError;
        this.traza = traza;
        this.usuario = usuario;
        this.fechaHora = fechaHora;
        this.parametrosError = parametrosError;
    }

    public LogErrorEntity(String traza, String usuario, LocalDateTime fechaHora, String parametrosError) {
        this.traza = traza;
        this.usuario = usuario;
        this.fechaHora = fechaHora;
        this.parametrosError = parametrosError;
    }

    public Long getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(Long codigoError) {
        this.codigoError = codigoError;
    }

    public String getTraza() {
        return traza;
    }

    public void setTraza(String traza) {
        this.traza = traza;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getParametrosError() {
        return parametrosError;
    }

    public void setParametrosError(String parametrosError) {
        this.parametrosError = parametrosError;
    }
}
