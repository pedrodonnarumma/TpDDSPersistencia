import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
public class TipoDocumentacion {

private int codigoDoc;
private String nombreDoc;
private DocEntregada docEntregada;
    public TipoDocumentacion(int codigoDoc,String nombreDoc) {
        this.codigoDoc = codigoDoc;
        this.nombreDoc = nombreDoc;
        this.docEntregada = new DocEntregada();

    }
    public TipoDocumentacion(){}

    public int getCodigoDoc() {
        return codigoDoc;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public DocEntregada getDocEntregada() {
        return docEntregada;
    }

    public void entregarDocumentacion(int codigoDoc){

        this.docEntregada.setFechaPresentada(LocalDate.now());
        System.out.println("Se ha entregado la documentacion de tipo: " + this.nombreDoc);
        System.out.println("Se entrego el dia: "+ this.getDocEntregada().getFechaPresentada());
    }
}
