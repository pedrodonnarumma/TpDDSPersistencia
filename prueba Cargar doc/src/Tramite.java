import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;


//LocalDate.now()

public class Tramite {
    private LocalDate FechaFinTramite;
    private LocalDate FechaIngresoTramite;
    private LocalDate FechaTopeDoc;
   private int nroTramite;
    static int cantidadTramites = 0;

    private TipoTramite tipoTramite;
    private ArrayList<DocEntregada> docEntregadas;

    private EstadoTramite estadoTramite;
    public Tramite(int CTT) {
        this.nroTramite = ++cantidadTramites;
        //  System.out.println(); mostrar nro tramite generado
        this.FechaIngresoTramite = LocalDate.now();
        this.tipoTramite = new TipoTramite(CTT);
        this.estadoTramite = new EstadoTramite("Ingreasdo");
      //  this.estadoTramite.setNombreEstadoTramite("Ingresado");

    }

    public LocalDate getFechaIngresoTramite() {
        return FechaIngresoTramite;
    }

    public int getNroTramite() {
        return nroTramite;
    }

    public LocalDate getFechaFinTramite() {
        return FechaFinTramite;
    }

    public TipoTramite getTipoTramite() {
        return tipoTramite;
    }

    public void setEstadoTramite(String estadoTramite) {
        this.estadoTramite.setNombreEstadoTramite(estadoTramite);
    }

    public EstadoTramite getEstadoTramite() {
        return estadoTramite;
    }
}
