package modelo;

public class Locacion {
    private Pais pais;
    private String infoCensura;
    private String infoTraducido;
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public String getInfoCensura() {
        return infoCensura;
    }
    public void setInfoCensura(String infoCensura) {
        this.infoCensura = infoCensura;
    }
    public String getInfoTraducido() {
        return infoTraducido;
    }
    public void setInfoTraducido(String infoTraducido) {
        this.infoTraducido = infoTraducido;
    }
    public Locacion(Pais pais, String infoCensura, String infoTraducido) {
        this.pais = pais;
        this.infoCensura = infoCensura;
        this.infoTraducido = infoTraducido;
    }
}
