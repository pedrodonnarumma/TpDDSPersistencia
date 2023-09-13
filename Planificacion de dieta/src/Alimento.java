public class Alimento {
    private String NombreAlimento;
    private int IDAlimento;
    private int CaloriasAlimento;
    private int ProteinasAlimento;
    private int CarbosAlimento;
    private int GrasasAlimento;
    private int PrecioAlimento;
    static int contadorAlimentos;

    public Alimento(String NombreAlimento) {
        this.NombreAlimento = NombreAlimento;
        this.IDAlimento = ++contadorAlimentos;
    }

    public String getNombreAlimento() {
        return NombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        NombreAlimento = nombreAlimento;
    }

    public int getIDAlimento() {
        return IDAlimento;
    }

    public void setIDAlimento(int IDAlimento) {
        this.IDAlimento = IDAlimento;
    }

    public int getCaloriasAlimento() {
        return CaloriasAlimento;
    }

    public void setCaloriasAlimento(int caloriasAlimento) {
        CaloriasAlimento = caloriasAlimento;
    }

    public int getProteinasAlimento() {
        return ProteinasAlimento;
    }

    public void setProteinasAlimento(int proteinasAlimento) {
        ProteinasAlimento = proteinasAlimento;
    }

    public int getCarbosAlimento() {
        return CarbosAlimento;
    }

    public void setCarbosAlimento(int carbosAlimento) {
        CarbosAlimento = carbosAlimento;
    }

    public int getGrasasAlimento() {
        return GrasasAlimento;
    }

    public void setGrasasAlimento(int grasasAlimento) {
        GrasasAlimento = grasasAlimento;
    }

    public int getPrecioAlimento() {
        return PrecioAlimento;
    }

    public void setPrecioAlimento(int precioAlimento) {
        PrecioAlimento = precioAlimento;
    }
}
