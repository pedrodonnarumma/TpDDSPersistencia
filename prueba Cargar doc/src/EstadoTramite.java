import java.util.Date;
public class EstadoTramite {
    private Date fechaHoraBajaET;
    private String nombreEstadoTramite;

    public EstadoTramite(String nombreEstadoTramite) {
        this.nombreEstadoTramite = nombreEstadoTramite;
    }

    public void setFechaHoraBajaET(Date fechaHoraBajaET) {
        this.fechaHoraBajaET = fechaHoraBajaET;
    }

    public void setNombreEstadoTramite(String nombreEstadoTramite) {
        this.nombreEstadoTramite = nombreEstadoTramite;
    }

    public String getNombreEstadoTramite() {
        return nombreEstadoTramite;
    }
}
