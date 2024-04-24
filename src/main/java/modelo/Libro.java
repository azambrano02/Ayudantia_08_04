package modelo;

public class Libro extends Texto {
    private Pais pais;
    private int numCopias;
    private int ventas;
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public int getNumCopias() {
        return numCopias;
    }
    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }
    public int getVentas() {
        return ventas;
    }
    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    public Libro(Autor autor, int año, Pais pais, int numCopias, int ventas) {
        super(autor, año);
        this.pais = pais;
        this.numCopias = numCopias;
        this.ventas = ventas;
    }
}
