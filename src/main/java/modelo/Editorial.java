package modelo;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private List<Editor> editores;
    private List<Autor> autores;
    private List<Libro> librosParaAprobar;
    public List<Editor> getEditores() {
        return editores;
    }
    public void setEditores(List<Editor> editores) {
        this.editores = editores;
    }
    public List<Autor> getAutores() {
        return autores;
    }
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    public List<Libro> getLibrosParaAprobar() {
        return librosParaAprobar;
    }
    public void setLibrosParaAprobar(List<Libro> librosParaAprobar) {
        this.librosParaAprobar = librosParaAprobar;
    }
    public Editorial() {
        this.editores = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.librosParaAprobar = new ArrayList<>();
    }
}
