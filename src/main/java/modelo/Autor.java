package modelo;

import java.util.List;

public class Autor {
    private TipoAutor tipoAutor;
    private List<Pseudonimo> pseudonimos;

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
}

