package equipo29.tema5.Conexion;

import equipo29.tema5.Data.Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        String sql = "SELECT codCita, codRefuerzo, fechaHoraCita, centroVacunacion, fechaHoraColoca, dni, nroSerie FROM cita WHERE dni=? AND cancelada = 1";
        Cita cita = null;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cita = new Cita();
                cita.setCodCita(rs.getInt("codCita"));
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacunacion(rs.getString("centroVacunacion"));
//                cita.setFechaHoraColoca(rs.getDate("fechaHoraColoca").toLocalDate());
                cita.setCiudadano(ciudata.buscarCiudadanoDni(rs.getInt("dni")));
                cita.setVacuna(vacudata.buscarVacuna(rs.getInt("nroSerie")));
                citas.add(cita);
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos ");
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
    
    public String sumar2Semanas(String fechaHoraCita){
        //creamos formateador
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm");
        //lo convertimos a objeto
        LocalDateTime fhc = LocalDateTime.parse(fechaHoraCita, formateador);
        //sumamos 2 semanas
        fhc = fhc.plusWeeks(2);
        //formateamos nuevamente y retornamos como cadena
        return fhc.format(formateador).toString();
    }
    
    public void reprogramarCita(int codRefuerzo, String fechaHoraCita, String centroVacunacion, int dni, int nroSerie){
        String insert = "INSERT INTO cita(codRefuerzo, fechaHoraCita, centroVacunacion, fechaHoraColoca, dni, nroSerie, cancelada) VALUES (?,?,?,?,?,?,1)";
      
        try(PreparedStatement ps = con.prepareStatement(insert)){
        ps.setInt(1, codRefuerzo);
        ps.setString(2, sumar2Semanas(fechaHoraCita)); // aca hay que ver como calcular la nueva fecha
        ps.setString(3, centroVacunacion);
        ps.setDate(4, null);
        ps.setInt(5, dni);
        ps.setInt(6, nroSerie);
        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0) {
                    JOptionPane.showMessageDialog(null, "No se pudo agendar una nueva cita");
                } else {
                    JOptionPane.showMessageDialog(null, "Nueva cita agendada");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos"+ex.getMessage());
        }
    }
    
    
    
}
