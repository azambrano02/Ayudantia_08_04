package modelo;
import java.util.ArrayList;
import java.util.List;
public abstract class Texto {
    private Autor autor;
    private int año;
    private List<Edicion> ediciones;
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public List<Edicion> getEdiciones() {
        return ediciones;
    }
    public void setEdiciones(List<Edicion> ediciones) {
        this.ediciones = ediciones;
    }
    public Texto(Autor autor, int año) {
        this.autor = autor;
        this.año = año;
        this.ediciones = new ArrayList<>();
    }

}

