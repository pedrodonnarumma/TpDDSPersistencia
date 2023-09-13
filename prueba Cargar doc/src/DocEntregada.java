import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
public class DocEntregada {

 private int codigoDocEntregada;
 private LocalDate fechaPresentada;
 //private TipoDocumentacion tipoDocumentacionEntregada;


 public DocEntregada(int codigoDocEntregada){
    this.codigoDocEntregada = codigoDocEntregada;
 }
 public DocEntregada(){};

 public void setFechaPresentada(LocalDate fechaPresentada) {
  this.fechaPresentada = fechaPresentada;
 }

 public LocalDate getFechaPresentada() {
  return fechaPresentada;
 }

 public int getCodigoDocEntregada() {
  return codigoDocEntregada;
 }
}
