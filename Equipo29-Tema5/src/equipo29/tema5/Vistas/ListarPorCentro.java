/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo29.tema5.Vistas;

import equipo29.tema5.Conexion.CitaData;
import equipo29.tema5.Conexion.VacunatorioData;
import equipo29.tema5.Data.Cita;
import equipo29.tema5.Data.Vacunatorio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanma
 */
public class ListarPorCentro extends javax.swing.JInternalFrame {
    private List<Cita> citas = new ArrayList<>();
    private CitaData citad;
    private Cita cita;
    private VacunatorioData cvd;
    private DefaultTableModel modelo = new DefaultTableModel() { //Sobreescribimos un método de DefaultTableModel para que las celdas no sean editables
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    /**
     * Creates new form ListarPorCentro
     */
    public ListarPorCentro(CitaData citad, VacunatorioData cvd) {
        initComponents();
        this.citad=citad;
        this.cita = cita;
        this.cvd=cvd;
        armarCabecera();
        cargarComboVacunatorio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vacunatorios = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        limpiar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setTitle("Vacunas aplicadas por centro vacunatorio");

        vacunatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacunatoriosActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione C. Vacunatorio");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(vacunatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(limpiar)
                        .addGap(45, 45, 45)
                        .addComponent(salir)
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vacunatorios))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar)
                    .addComponent(salir))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void vacunatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacunatoriosActionPerformed
        // TODO add your handling code here:
        try {
            if (!vacunatorios.getSelectedItem().toString().isEmpty()) {

                citas = citad.consultaXCentroX(cvd.buscarVacunatorioDescipcion(vacunatorios.getSelectedItem().toString()).getIdVacunatorio());
                borrarFilas();
                Collections.sort(citas);
                cargarDatos(citas);
            }
        } catch (NullPointerException ex) {
        }
    }//GEN-LAST:event_vacunatoriosActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        cargarComboVacunatorio();
    }//GEN-LAST:event_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox vacunatorios;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Nro. Serie Vacuna");
        modelo.addColumn("Datos Ciudadano");
        tabla.setModel(modelo);
    }
    
    private void borrarFilas() {
        int f = tabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    
    private void cargarDatos(List<Cita> citas) { //Esta lista de alumnos puede provenir de la BD o cargada por parámetros
        for (Cita cita : citas) {
            modelo.addRow(new Object[]{cita.getVacuna().getNroSerie(), cita.getCiudadano().getDni()+" "+cita.getCiudadano().getNombreCompleto()});
        }
    }
    
    private void cargarComboVacunatorio() {
        VacunatorioData cvd = new VacunatorioData();
        vacunatorios.removeAllItems();
        vacunatorios.addItem("");
        for (Vacunatorio cv : cvd.listarVacunatorios()) {
            vacunatorios.addItem(cv.toString());
        }
    }
    
}
