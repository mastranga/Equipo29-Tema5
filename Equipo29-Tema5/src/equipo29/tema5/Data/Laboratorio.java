
package equipo29.tema5.Data;


public class Laboratorio {
    private String cuit;
    private String nombre;
    private String pais;
    private String Domicilio;

    public Laboratorio() {
    }

    public Laboratorio(String cuit, String nombre, String pais, String Domicilio) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.pais = pais;
        this.Domicilio = Domicilio;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "cuit=" + cuit + ", nombre=" + nombre + ", pais=" + pais + ", Domicilio=" + Domicilio + '}';
    }
    
    
}
