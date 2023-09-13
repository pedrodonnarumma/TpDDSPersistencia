import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Tramite hola = new Tramite();
        //Tramite chau = new Tramite();
        Scanner sc = new Scanner(System.in);

        /* PREGUNTAMOS SI DESEA CREAR UN NUEVO TRAMITE */

        System.out.println("Desea crear un nuevo tramite? ...");
        System.out.println("1 SI ");
        System.out.println("2 NO ");
        System.out.println("************************************");
        int desicion;
        desicion = sc.nextInt();

        if (desicion == 1){
            System.out.println("Ingrese CODIGO TIPO TRAMITE");
            int CTT;
            do {
                CTT = sc.nextInt();
                if(CTT<0 || CTT>4) System.out.println("Codigo de TIPO TRAMITE NO VÁLIDO, INTENTE NUEVAMENTE!!");
            }while(CTT<0 || CTT>4);
            Tramite nuevoTramite = new Tramite(CTT);
            System.out.println("**********************************");
            System.out.printf("Tramite creado con exito!!!");
            System.out.println("NUMERO DE TRAMITE : " + nuevoTramite.getNroTramite());
            System.out.println("Tipo de tramite: " + nuevoTramite.getTipoTramite().getNombreTipoTramite());
            System.out.println("Tramite creado el día: " + nuevoTramite.getFechaIngresoTramite());
            System.out.println("Estado del tramite: "+nuevoTramite.getEstadoTramite().getNombreEstadoTramite());
            System.out.println("****************************************");
            System.out.println("La documentacion faltante para este tramite es: ");
          /*
                ACA MUESTRO LA DOC FALTANTE
           */
           // boolean faltaDocumentacion = true;


            int contadorFaltaDoc = 0;
            for(TipoDocumentacion nro : nuevoTramite.getTipoTramite().getTipoDocumentaciones()){
                if(nro.getDocEntregada().getFechaPresentada()==null){
                    System.out.println("Falta: " + nro.getNombreDoc()+ ", Codigo de documento: "+nro.getCodigoDoc());
                    contadorFaltaDoc++;
                }

            }
            if(contadorFaltaDoc==0){ System.out.println("Ya se entrego toda la documentacion, el tramite esta iniciado");}
            else{
                System.out.println("Faltan "+contadorFaltaDoc+" documentos por entregar");
                System.out.println("****************************************");
                System.out.println("CARGAR DOCUMENTACION");
                System.out.println("****************************************");
                System.out.println("INGRESE NRO TIPO DOCUMENTO: ");
                int codigoIngresado;
                codigoIngresado = sc.nextInt();
                boolean correspondeDoc = false;

                for(TipoDocumentacion nro : nuevoTramite.getTipoTramite().getTipoDocumentaciones()){
                    if(nro.getCodigoDoc() == codigoIngresado){
                        if(nro.getDocEntregada().getFechaPresentada() == null){
                            nuevoTramite.getTipoTramite().getTipoDocumentaciones().get(0).entregarDocumentacion(codigoIngresado);
                           /*
                           Arreglar eso
                           Sacar el 0 del GET()  por que siempre me da el mismo TipoDoc
                            */


                            int contadorFaltaDocumentacion = 0;
                            for(TipoDocumentacion nro1 : nuevoTramite.getTipoTramite().getTipoDocumentaciones()){
                                if(nro1.getDocEntregada().getFechaPresentada()==null){
                                 System.out.println("Falta: " + nro.getNombreDoc()+ ", Codigo de documento: "+nro.getCodigoDoc());
                                    contadorFaltaDocumentacion++;
                                }

                            }
                            if(contadorFaltaDocumentacion==0){
                                System.out.println("Ya se entrego toda la documentacion");
                                if(nuevoTramite.getEstadoTramite().getNombreEstadoTramite() == "Iniciado"){}
                                else{
                                    nuevoTramite.setEstadoTramite("Iniciado");
                                }
                                System.out.println("El estado del tramite es: "+nuevoTramite.getEstadoTramite().getNombreEstadoTramite());
                            }
                            correspondeDoc = true;

                        break;




                        }
                        else{
                            System.out.println("Ya se entrego esta documentacion!!!");
                        }

                    }

                  /*  else{
                        System.out.println("El tipo de documentacion no corresponde al TIPO DE TRAMITE");
                    }  */
            }

                if(correspondeDoc==false) System.out.println("La documentacion no corresponde al TIPO DE TRAMITE");


            }

        }




    }
}