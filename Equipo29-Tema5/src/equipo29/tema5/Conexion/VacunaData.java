
package equipo29.tema5.Conexion;

import equipo29.tema5.Data.Vacuna;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class VacunaData {
    private Connection con = null;
    private LaboratorioData ld = new LaboratorioData();

    public VacunaData() {
        con = Conexion.buscarConexion();
    }
    
    public Vacuna buscarVacuna(int nroSerie) throws NullPointerException {

        String sql = "SELECT nroSerie, marca, medida, fechaCad, estado, cuit FROM vacuna WHERE nroSerie=?";
        Vacuna vacuna = null;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, nroSerie);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                vacuna = new Vacuna();
                vacuna.setNroSerie(rs.getInt("nroSerie"));
                vacuna.setMarca(rs.getString("marca"));
                vacuna.setMedida(rs.getDouble("medida"));
                vacuna.setFechaCad(rs.getDate("fechaCad").toLocalDate());
                vacuna.setEstado(rs.getBoolean("estado"));
                //vacuna.setLaboratorio(ld.buscarLaboratorio(rs.getInt("cuit")));

            } else {
                JOptionPane.showMessageDialog(null, "Esta Vacuna no existe en la base de datos ");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos-Bruno");
        }
        return vacuna;
    }
}