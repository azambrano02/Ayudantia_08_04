package modelo;
public class Poema extends Texto{
    private int numVersos;
    public int getNumVersos() {
        return numVersos;
    }
    public void setNumVersos(int numVersos) {
        this.numVersos = numVersos;
    }
    public Poema(Autor autor, int año, int numVersos) {
        super(autor, año);
        this.numVersos = numVersos;
    }
}
