/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo29.tema5.Vistas;

import equipo29.tema5.Conexion.CitaData;
import equipo29.tema5.Conexion.CiudadanoData;
import equipo29.tema5.Data.Ciudadano;
import java.sql.Date;

/**
 *
 * @author juanma
 */
public class ABMCitas extends javax.swing.JInternalFrame {
private CitaData citad;
    /**
     * Creates new form ABMCitas
     */
    public ABMCitas(CitaData citad) {
        initComponents();
        this.citad=citad;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboCiudadano = new javax.swing.JComboBox<>();
        patologia = new javax.swing.JCheckBox();
        esenciales = new javax.swing.JCheckBox();
        fecha = new com.toedter.calendar.JDateChooser();
        hora = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        comboCiudadano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCiudadanoActionPerformed(evt);
            }
        });

        patologia.setText("Patologias");
        patologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patologiaActionPerformed(evt);
            }
        });

        esenciales.setText("Esenciales");
        esenciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esencialesActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");

        jButton3.setText("Modificar");

        jButton4.setText("Guardar");

        jButton5.setText("Confirmar Aplicacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patologia)
                        .addGap(18, 18, 18)
                        .addComponent(esenciales))
                    .addComponent(comboCiudadano, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(comboCiudadano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patologia)
                    .addComponent(esenciales))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void patologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patologiaActionPerformed
        // TODO add your handling code here:
        CiudadanoData cd = new CiudadanoData();
        comboCiudadano.removeAllItems();
        if (!patologia.isSelected() && !esenciales.isSelected()) {
            comboCiudadano.removeAllItems();
            comboCiudadano.addItem("");
            for (Ciudadano ciu : cd.listarCiudadanos()) {
            comboCiudadano.addItem(""+ciu.getDni()+" - "+ciu.getNombreCompleto());
        }
        } else if (!patologia.isSelected() && esenciales.isSelected()) {
            comboCiudadano.removeAllItems();
            comboCiudadano.addItem("");
            for (Ciudadano ciu : cd.listarCiudadanosEsenciales()) {
                comboCiudadano.addItem("" + ciu.getDni() + " - " + ciu.getNombreCompleto() + " - " + ciu.getAmbitoTrabajo());
            }
        } else if (patologia.isSelected() && esenciales.isSelected()) {
            comboCiudadano.removeAllItems();
            comboCiudadano.addItem("");
            for (Ciudadano ciu : cd.listarCiudadanosPatologiaEsenciales()) {
                comboCiudadano.addItem("" + ciu.getDni() + " - " + ciu.getNombreCompleto() + " - " + ciu.getPatologia() + " - " + ciu.getAmbitoTrabajo());
            }
        } else if(patologia.isSelected() && !esenciales.isSelected()){
            comboCiudadano.removeAllItems();
            comboCiudadano.addItem("");
            for (Ciudadano ciu : cd.listarCiudadanosPatologia()) {
            comboCiudadano.addItem("" + ciu.getDni() + " - " + ciu.getNombreCompleto() + " - " + ciu.getPatologia());
        }
        }
    }//GEN-LAST:event_patologiaActionPerformed

    private void esencialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esencialesActionPerformed
        // TODO add your handling code here:
        patologiaActionPerformed(evt);
    }//GEN-LAST:event_esencialesActionPerformed

    private void comboCiudadanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCiudadanoActionPerformed
        // TODO add your handling code here:
        Ciudadano ciu = (Ciudadano) comboCiudadano.getSelectedItem();
        String ci = citad.buscarFechaCita(ciu.getDni());
        fecha.setDate(Date.valueOf(ci.substring(0, 9)));
        hora.setValue(ci.substring(9));
    }//GEN-LAST:event_comboCiudadanoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCiudadano;
    private javax.swing.JCheckBox esenciales;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JSpinner hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox patologia;
    // End of variables declaration//GEN-END:variables


}