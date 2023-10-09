package equipo29.tema5.Conexion;

import equipo29.tema5.Data.Laboratorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
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
    
    public void modificarLaboratorio(Laboratorio laboratorio) throws SQLIntegrityConstraintViolationException, SQLException {

        String sql = "UPDATE laboratorio SET cuit=?,nombre=?,pais=?,domicilio=? WHERE 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, laboratorio.getDni());
            ps.setString(2, ciudadano.getNombreCompleto());
            ps.setString(3, ciudadano.getEmail());
            ps.setString(4, ciudadano.getCelular());
            ps.setString(5, ciudadano.getPatologia());
            ps.setString(6, ciudadano.getAmbitoTrabajo());
            ps.setInt(7, ciudadano.getId());

            int affectedRows = ps.executeUpdate();
            if (affectedRows == 1) {

                JOptionPane.showMessageDialog(null, "Ciudadano modificado");
            }

        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "El email o el celular indicado ya se encuentra registrado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos");
        }

    }
}