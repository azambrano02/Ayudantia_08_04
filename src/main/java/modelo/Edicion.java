package modelo;
import java.util.ArrayList;
import java.util.List;
public class Edicion {
    private List<Locacion> locaciones;
    public List<Locacion> getLocaciones() {
        return locaciones;
    }
    public void setLocaciones(List<Locacion> locaciones) {
        this.locaciones = locaciones;
    }
    public Edicion() {
        this.locaciones = new ArrayList<>();
    }
}
