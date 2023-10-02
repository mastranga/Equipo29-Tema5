
package equipo29.tema5.Conexion;

import equipo29.tema5.Data.Ciudadano;
import java.sql.Connection;


public class CiudadanoData {
    private Connection con = null;

    public CiudadanoData() {
        con = Conexion.buscarConexion();
    }
    
    public void guardarCiudadano (Ciudadano ciudadano){
        
    }
    
}
