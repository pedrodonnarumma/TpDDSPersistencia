import java.util.ArrayList;

public class Comida {
    private String NombreComida;
    private int IDComida;
    private ArrayList<Cantidad> alimentos = new ArrayList<>();

    private int CaloriasTotalesComida;
    private int ProteinasTotalesComida;
    private int CarbosTotalesComida;
    private int GrasasTotalesComida;

    public Comida(String nombreComida){
        this.NombreComida =nombreComida;
    }

    public String getNombreComida(){
        return NombreComida;
    }

    public void setAlimentos(ArrayList<Cantidad> alimentos) {
        this.alimentos = alimentos;
    }
}
