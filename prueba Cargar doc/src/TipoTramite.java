import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


public class TipoTramite {
/*ATRIBUTOS */
private int CodigoTT;
private int diasMaxDocumentacion;
private LocalDate FechaHoraBaja;
private String nombreTipoTramite;
private ArrayList<TipoDocumentacion> tipoDocumentaciones ;

/* CONSTRUCTOR*/

    public TipoTramite(int codigoTT) {
        this.tipoDocumentaciones = new ArrayList<TipoDocumentacion>();
        if(codigoTT == 1){
            this.CodigoTT = codigoTT;
            this.diasMaxDocumentacion = 10;
            this.nombreTipoTramite = "Tramite de DNI";
            this.tipoDocumentaciones.add(new TipoDocumentacion(1,"Acta n°1"));
            this.tipoDocumentaciones.add(new TipoDocumentacion(2,"Acta n°2"));
        }

        if(codigoTT == 2){
            this.CodigoTT = codigoTT;
            this.diasMaxDocumentacion = 20;
            this.nombreTipoTramite = "Tramite de carnet de conducir";
            this.tipoDocumentaciones.add(new TipoDocumentacion(3,"Acta n°3"));
            this.tipoDocumentaciones.add(new TipoDocumentacion(4,"Acta n°4"));
        }
        if(codigoTT == 3){
            this.CodigoTT = codigoTT;
            this.diasMaxDocumentacion = 13;
            this.nombreTipoTramite = "Jubilacion";
            this.tipoDocumentaciones.add(new TipoDocumentacion(5,"Acta n°5"));
            this.tipoDocumentaciones.add(new TipoDocumentacion(6,"Acta n°6"));
        }
        if(codigoTT == 4){
            this.CodigoTT = codigoTT;
            this.diasMaxDocumentacion = 20;
            this.nombreTipoTramite = "Ser un capo (fischil)";
            this.tipoDocumentaciones.add(new TipoDocumentacion(7,"Acta n°7"));
            this.tipoDocumentaciones.add(new TipoDocumentacion(8,"Acta n°8"));
        }



    }

    public int getCodigoTT() {
        return CodigoTT;
    }

    public String getNombreTipoTramite() {
        return nombreTipoTramite;
    }

    public ArrayList<TipoDocumentacion> getTipoDocumentaciones() {
        return tipoDocumentaciones;
    }

}
