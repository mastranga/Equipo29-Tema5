/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo29.tema5.Vistas;

import equipo29.tema5.Conexion.LaboratorioData;
import equipo29.tema5.Conexion.VacunaData;
import equipo29.tema5.Data.Laboratorio;
import equipo29.tema5.Data.Vacuna;
import java.sql.Date;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 20352555674
 */
public class ABMVacunas extends javax.swing.JInternalFrame {

    private VacunaData vd;
    private LaboratorioData ld;
    private List<Laboratorio> laboratorios = new ArrayList<>();

    /**
     * Creates new form ABMVacunas
     */
    public ABMVacunas(VacunaData vd, LaboratorioData ld) {
        initComponents();
        this.vd = vd;
        this.ld = ld;
        cargarComboLaboratorio();
        cargarComboMedida();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nroserie = new javax.swing.JTextField();
        laboratorio = new javax.swing.JComboBox();
        marca = new javax.swing.JTextField();
        vencimiento = new com.toedter.calendar.JDateChooser();
        buscar = new javax.swing.JButton();
        alta = new javax.swing.JButton();
        baja = new javax.swing.JButton();
        modificacion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        medida = new javax.swing.JComboBox();

        jLabel1.setText("Nro. Serie");

        jLabel2.setText("Laboratorio");

        jLabel3.setText("Marca");

        jLabel4.setText("Medida");

        jLabel5.setText("F. Vencimiento");

        nroserie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nroserieKeyTyped(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        alta.setText("Alta");
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActionPerformed(evt);
            }
        });

        baja.setText("Baja");
        baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaActionPerformed(evt);
            }
        });

        modificacion.setText("Modificacion");
        modificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificacionActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(medida, 0, 132, Short.MAX_VALUE)
                            .addComponent(nroserie)
                            .addComponent(laboratorio, 0, 132, Short.MAX_VALUE)
                            .addComponent(marca)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alta)
                        .addGap(18, 18, 18)
                        .addComponent(baja)
                        .addGap(18, 18, 18)
                        .addComponent(modificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nroserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(laboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alta)
                    .addComponent(baja)
                    .addComponent(modificacion)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        nroserie.setText("");
        laboratorio.setSelectedItem(null);
        marca.setText("");
        medida.setSelectedItem(null);
        vencimiento.setDate(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nroserieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nroserieKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_nroserieKeyTyped

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        if (!nroserie.getText().isEmpty()) {
            Vacuna vacuna = vd.buscarVacuna(Integer.parseInt(nroserie.getText()));
            laboratorio.setSelectedItem(vacuna.getLaboratorio().getNombre().toString());
            marca.setText(vacuna.getMarca());
            medida.setSelectedItem(String.valueOf(vacuna.getMedida()));
            vencimiento.setDate(Date.from(vacuna.getFechaCad().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el Nro de Serie de la Vacuna");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaActionPerformed
        // TODO add your handling code here:
        if (!nroserie.getText().isEmpty()) {
            try {
                vd.bajaVacuna(Integer.parseInt(nroserie.getText()));
            } catch (SQLException ex) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el numero de serie de la vacuna");
        }
    }//GEN-LAST:event_bajaActionPerformed

    private void altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActionPerformed
        // TODO add your handling code here:
        if (!nroserie.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ingrese datos en el campo Nro Serie");
        } else if (laboratorio.getSelectedItem().toString().isEmpty() || marca.getText().isEmpty() || medida.getSelectedItem().toString().isEmpty() || vencimiento.getDate().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
        } else {
            try {
                vd.guardarVacuna(new Vacuna(marca.getText(), Double.parseDouble(medida.getSelectedItem().toString()),
                        vencimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        true, ld.buscarLaboratorioNombre(laboratorio.getSelectedItem().toString())));
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_altaActionPerformed

    private void modificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificacionActionPerformed
        // TODO add your handling code here:
        if (laboratorio.getSelectedItem().toString().isEmpty() || marca.getText().isEmpty() || medida.getSelectedItem().toString().isEmpty() || vencimiento.getDate().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
        } else {
            try {
                vd.modificarVacuna(new Vacuna(Integer.parseInt(nroserie.getText()), marca.getText(), Double.parseDouble(medida.getSelectedItem().toString()),
                        vencimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        true, ld.buscarLaboratorioNombre(laboratorio.getSelectedItem().toString())));
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_modificacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alta;
    private javax.swing.JButton baja;
    private javax.swing.JButton buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox laboratorio;
    private javax.swing.JTextField marca;
    private javax.swing.JComboBox medida;
    private javax.swing.JButton modificacion;
    private javax.swing.JTextField nroserie;
    private javax.swing.JButton salir;
    private com.toedter.calendar.JDateChooser vencimiento;
    // End of variables declaration//GEN-END:variables

    private void cargarComboMedida() {
        medida.addItem("");
        medida.addItem("0.3");
        medida.addItem("0.5");
        medida.addItem("0.9");
    }

    private void cargarComboLaboratorio() {
        LaboratorioData ld = new LaboratorioData();
        laboratorio.addItem("");
        laboratorios = ld.listarLaboratorios();
        Collections.sort(laboratorios);
        for (Laboratorio lab : laboratorios) {
            laboratorio.addItem(lab.getNombre());
        }
    }

}
