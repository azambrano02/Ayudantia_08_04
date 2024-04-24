package modelo;
public class Comic extends Texto{
    private int numViñetas;
    public int getNumViñetas() {
        return numViñetas;
    }
    public void setNumViñetas(int numViñetas) {
        this.numViñetas = numViñetas;
    }
    public Comic(Autor autor, int año, int numViñetas) {
        super(autor, año);
        this.numViñetas = numViñetas;
    }
}
