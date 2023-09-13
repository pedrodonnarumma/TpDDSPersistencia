public class Cantidad {

    private int cantidad;
    private Alimento alimento;
    private String nombre;

    public Cantidad(int cantidad,Alimento alimento) {
        this.cantidad = cantidad;
        this.alimento =  alimento;
        this.nombre = alimento.getNombreAlimento();
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }
}