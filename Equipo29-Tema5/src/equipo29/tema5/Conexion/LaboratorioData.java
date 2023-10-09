package equipo29.tema5.Conexion;

import equipo29.tema5.Data.Laboratorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LaboratorioData {
    private Connection con = null;

    public LaboratorioData() {
        con = Conexion.buscarConexion();
    }
    
    public Laboratorio buscarLaboratorioCuit(String cuit){

        String sql = "SELECT cuit, nombre, pais, domicilio FROM laboratorio WHERE cuit=?";
        Laboratorio laboratorio = null;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cuit);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                laboratorio = new Laboratorio();
                laboratorio.setCuit(rs.getString("cuit"));
                laboratorio.setNombre(rs.getString("nombre"));
                laboratorio.setPais(rs.getString("pais"));
                laboratorio.setDomicilio(rs.getString("domicilio"));

            } else {
                JOptionPane.showMessageDialog(null, "Este Laboratorio no existe en la base de datos ");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos");
        }
        return laboratorio;
    }
    
    public Laboratorio buscarLaboratorioNombre(String nombre){

        String sql = "SELECT cuit, nombre, pais, domicilio FROM laboratorio WHERE nombre=?";
        Laboratorio laboratorio = null;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                laboratorio = new Laboratorio();
                laboratorio.setCuit(rs.getString("cuit"));
                laboratorio.setNombre(rs.getString("nombre"));
                laboratorio.setPais(rs.getString("pais"));
                laboratorio.setDomicilio(rs.getString("domicilio"));

            } else {
                JOptionPane.showMessageDialog(null, "Este Laboratorio no existe en la base de datos ");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos");
        }
        return laboratorio;
    }
    
}