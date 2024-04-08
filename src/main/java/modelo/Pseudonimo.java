package modelo;

public enum Pseudonimo {
    PSEU_LIBRO("editor de libro"),
    PSEU_COMIC("editor de comic"),
    PSEU_POEMA("editor de poema");

    private String pseudonimo;

    private Pseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }
    public String getPseudonimo() {
        return pseudonimo;
    }
    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }
}
