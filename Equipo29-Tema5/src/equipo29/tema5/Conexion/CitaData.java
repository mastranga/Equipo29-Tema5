
package equipo29.tema5.Conexion;

import equipo29.tema5.Data.Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class CitaData {
    private Connection con = null;
    private CiudadanoData ciudata = new CiudadanoData();
    private VacunaData vacudata = new VacunaData();

    public CitaData() {
        con = Conexion.buscarConexion();
    }
    
    public List<Cita> buscarCita(int dni) throws NullPointerException {
        List<Cita> citas = new ArrayList<>();
        String sql = "SELECT codCita, fechaHoraCita, centroVacunacion FROM cita WHERE dni=? AND cancelada = 1";
        Cita cita = null;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cita = new Cita();
                cita.setCodCita(rs.getInt("codCita"));
                cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacunacion(rs.getString("centroVacunacion"));
                citas.add(cita);
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos");
        }
        return citas;
    }
    
    public void cancelarCita(int codCita){
        String upd = "UPDATE cita SET cancelada = 0 WHERE codCita = ?";
         
        try {
            PreparedStatement ps = con.prepareStatement(upd);
            ps.setInt(1, codCita);
            int registro = ps.executeUpdate();
            if (registro == 1) {
                JOptionPane.showMessageDialog(null, "Cita cancelada, se generara una nueva cita");
            }
//            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cancelar la cita " + ex.getMessage());
        }
    }
    
//    public void reprogramarCita(int codCita){
//        String sql = "SELECT codRefuerzo, fechaHoraCita, centroVacunacion, dni, nroSerie FROM cita WHERE codCita = ?";
//        Cita cita = null;
//        try (PreparedStatement ps = con.prepareStatement(sql)) {
//            ps.setInt(1, codCita);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                cita = new Cita();
//                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
//                cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
//                cita.setCentroVacunacion(rs.getString("centroVacunacion"));
//                cita.setCiudadano(ciudata.buscarCiudadanoDni(rs.getInt("dni")));
//                //cita.setVacuna(vacudata.buscarVacuna(rs.getInt("nroSerie")));
//            } 
//            
//        String insert = "INSERT INTO cita(codRefuerzo, fechaHoraCita, centroVacunacion, dni, nroSerie, cancelada) VALUES (?,?,?,?,?,1)";
//        PreparedStatement ps2 = con.prepareStatement(insert);
//        ps2.setInt(1, cita.getCodRefuerzo());
//        ps2.setString(2, cita.getFechaHoraCita()); // aca hay que ver como calcular la nueva fecha
//        ps2.setString(3, cita.getCentroVacunacion());
//        ps2.setInt(4, cita.getCiudadano().getDni());
//        ps2.setInt(5, cita.getVacuna().getNroSerie());
//        int affectedRows = ps2.executeUpdate();
//        if (affectedRows == 0) {
//                    JOptionPane.showMessageDialog(null, "No se pudo agendar una nueva cita");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Nueva cita agendada");
//                }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos");
//        }
//    }
    
    public void reprogramarCita(int codCita){
        String sql = "SELECT codRefuerzo, fechaHoraCita, centroVacunacion, dni, nroSerie FROM cita WHERE codCita = ?";
        Cita cita = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, codCita);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cita = new Cita();
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacunacion(rs.getString("centroVacunacion"));
                cita.setCiudadano(ciudata.buscarCiudadanoDni(rs.getInt("dni")));
                //cita.setVacuna(vacudata.buscarVacuna(rs.getInt("nroSerie")));
            } 
            
        String insert = "INSERT INTO cita(codRefuerzo, fechaHoraCita, centroVacunacion, dni, nroSerie, cancelada) VALUES (?,?,?,?,?,1)";
        PreparedStatement ps2 = con.prepareStatement(insert);
        ps2.setInt(1, cita.getCodRefuerzo());
        ps2.setString(2, cita.getFechaHoraCita()); // aca hay que ver como calcular la nueva fecha
        ps2.setString(3, cita.getCentroVacunacion());
        ps2.setInt(4, cita.getCiudadano().getDni());
        ps2.setInt(5, cita.getVacuna().getNroSerie());
        int affectedRows = ps2.executeUpdate();
        if (affectedRows == 0) {
                    JOptionPane.showMessageDialog(null, "No se pudo agendar una nueva cita");
                } else {
                    JOptionPane.showMessageDialog(null, "Nueva cita agendada");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos");
        }
    }
    
}
