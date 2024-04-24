package modelo;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private TipoAutor tipoAutor;
    private List<Pseudonimo> pseudonimos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public TipoAutor getTipoAutor() {
        return tipoAutor;
    }

    public void setTipoAutor(TipoAutor tipoAutor) {
        this.tipoAutor = tipoAutor;
    }

    public List<Pseudonimo> getPseudonimos() {
        return pseudonimos;
    }
    public void setPseudonimos(List<Pseudonimo> pseudonimos) {
        this.pseudonimos = pseudonimos;
    }

    public Autor(String nombre, TipoAutor tipoAutor) {
        this.nombre = nombre;
        this.tipoAutor = tipoAutor;
        this.pseudonimos = new ArrayList<>();
    }
}

