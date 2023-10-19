/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo29.tema5.Vistas;

import equipo29.tema5.Conexion.CitaData;
import equipo29.tema5.Conexion.CiudadanoData;
import equipo29.tema5.Conexion.VacunaData;
import equipo29.tema5.Conexion.VacunatorioData;
import equipo29.tema5.Data.Cita;
import equipo29.tema5.Data.Ciudadano;
import equipo29.tema5.Data.Vacuna;
import equipo29.tema5.Data.Vacunatorio;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author juanma
 */
public class ABMCitas extends javax.swing.JInternalFrame {
private CitaData citad;
private CiudadanoData cd;
private VacunatorioData cvd;
private VacunaData vd;
    /**
     * Creates new form ABMCitas
     */
    public ABMCitas(CitaData citad, CiudadanoData cd, VacunatorioData cvd, VacunaData vd) {
        initComponents();
        this.citad=citad;
        this.cd=cd;
        this.cvd=cvd;
        this.vd=vd;
        armarComboCiudadano();
        //cargarComboVacunatorio(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboCiudadano = new javax.swing.JComboBox();
        fecha = new com.toedter.calendar.JDateChooser();
        volver = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        hora = new javax.swing.JComboBox<>();
        vacunatorio = new javax.swing.JComboBox<>();
        patologia = new javax.swing.JCheckBox();
        esencial = new javax.swing.JCheckBox();

        comboCiudadano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCiudadanoActionPerformed(evt);
            }
        });

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        confirmar.setText("Confirmar Aplicacion");

        patologia.setText("Patologia");
        patologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patologiaActionPerformed(evt);
            }
        });

        esencial.setText("Esencial");
        esencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esencialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(297, 343, Short.MAX_VALUE)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(vacunatorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(guardar)
                                .addGap(18, 18, 18)
                                .addComponent(modificar)
                                .addGap(18, 18, 18)
                                .addComponent(limpiar)
                                .addGap(18, 18, 18)
                                .addComponent(volver))
                            .addComponent(comboCiudadano, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(patologia, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(esencial, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(comboCiudadano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patologia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esencial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar)
                    .addComponent(vacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver)
                    .addComponent(limpiar)
                    .addComponent(modificar)
                    .addComponent(guardar))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void comboCiudadanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCiudadanoActionPerformed
        // TODO add your handling code here:
        try {

            if (!comboCiudadano.getSelectedItem().toString().isEmpty()) {

                CiudadanoData cd = new CiudadanoData();

                Ciudadano ciu = (Ciudadano) comboCiudadano.getSelectedItem();

                Cita cita = citad.buscarCita(ciu.getDni());

                try {

                    fecha.setDate(Date.valueOf(cita.getFechaHoraCita().substring(0, 10)));

                    String horario = cita.getFechaHoraCita().substring(11, 16);

                    armarComboHorario(horario);
                    
                    cargarComboVacunatorio(cita.getVacunatorio().toString());

                } catch (StringIndexOutOfBoundsException ex) {

                }

            } else {

                String horario = null;

                armarComboHorario(horario);
                
                String vacun = null;
                    
                cargarComboVacunatorio(vacun);

            }

        } catch (NullPointerException ex) {
            limpiar();
        }

    }//GEN-LAST:event_comboCiudadanoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        if(!comboCiudadano.getSelectedItem().toString().isEmpty() || !fecha.getDate().toString().isEmpty() || !hora.getSelectedItem().toString().isEmpty() || !vacunatorio.getSelectedItem().toString().isEmpty()){
            try {
                Ciudadano ciudadano = (Ciudadano) comboCiudadano.getSelectedItem();
                int cr = 1;
                //String fech = citad.formatoFecha(fecha.getDate().toString());
                String fech = fecha.getDate().toInstant().toString().substring(0, 10);
                //String fech = fecha.getDate().
                String hor = hora.getSelectedItem().toString();
                Vacunatorio vacun = cvd.buscarVacunatorioDescipcion(vacunatorio.getSelectedItem().toString());
                Vacuna vacuna = vd.buscarVacunaDisponible();
                if(!vacuna.getMarca().isEmpty()){
                    citad.guardarCita(new Cita(ciudadano, cr, fech+" "+hor,vacuna,vacun));
                    vd.bajaVacuna(vacuna.getNroSerie());
                }else{
                    //JOptionPane.showMessageDialog(null, "Verifique la disponibilidad de Vacunas ");
                }
            } catch (SQLException ex ) {
                
            } catch (NullPointerException ex){
                
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        //this.patologias.setSelected(false);
        //esencial.setSelected(false);
        //patologia.setState(false);
        //esencial.setState(false);
        comboCiudadano.removeAllItems();
        fecha.setDate(null);
        hora.removeAllItems();
        vacunatorio.removeAllItems();
        armarComboCiudadano();
        cargarComboVacunatorio(null);
    }//GEN-LAST:event_limpiarActionPerformed

    private void patologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patologiaActionPerformed
        // TODO add your handling code here:
        armarComboCiudadano();
    }//GEN-LAST:event_patologiaActionPerformed

    private void esencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esencialActionPerformed
        // TODO add your handling code here:
        armarComboCiudadano();
    }//GEN-LAST:event_esencialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboCiudadano;
    private javax.swing.JButton confirmar;
    private javax.swing.JCheckBox esencial;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton guardar;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton modificar;
    private javax.swing.JCheckBox patologia;
    private javax.swing.JComboBox<String> vacunatorio;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

 private void armarComboCiudadano() {
        CiudadanoData cd = new CiudadanoData();
        comboCiudadano.removeAllItems();
        
        if (!patologia.isSelected() && !esencial.isSelected()) {
            comboCiudadano.removeAllItems();
            comboCiudadano.addItem("");
            for (Ciudadano ciu : cd.listarCiudadanos()) {
                comboCiudadano.addItem(ciu);
            }
        } else if (patologia.isSelected() && !esencial.isSelected()) {
            comboCiudadano.removeAllItems();
            comboCiudadano.addItem("");
            for (Ciudadano ciu : cd.listarCiudadanosPatologia()) {
                comboCiudadano.addItem(ciu);
            }
        } else if (patologia.isSelected() && esencial.isSelected()) {
            comboCiudadano.removeAllItems();
            comboCiudadano.addItem("");
            for (Ciudadano ciu : cd.listarCiudadanosPatologiaEsenciales()) {
                comboCiudadano.addItem(ciu);
            }
        } else if (!patologia.isSelected() && esencial.isSelected()) {
            comboCiudadano.removeAllItems();
            comboCiudadano.addItem("");
            for (Ciudadano ciu : cd.listarCiudadanosEsenciales()) {
                comboCiudadano.addItem(ciu);
            }
        }
        
    }
    
    
    private void armarComboHorario(String horario){
            hora.addItem("");
            for(int i = 9 ;  i < 18 ; i++){
            for(int j = 0 ; j < 46 ; j+=15){
                if(i==9 && j==0){
                    hora.addItem("0"+i+":"+j+"0");
                }else if(i==9){
                hora.addItem("0"+i+":"+j);
                }else if (j==0){
                    hora.addItem(i+":"+j+"0");
                }else{
                    hora.addItem(i+":"+j);
                }
            }
        }
            if(horario!=null){
            hora.setSelectedItem(horario);
            }
    }
    
    private void cargarComboVacunatorio(String vacu) {
        VacunatorioData cvd = new VacunatorioData();
        vacunatorio.removeAllItems();
        vacunatorio.addItem("");
        for (Vacunatorio cv : cvd.listarVacunatorios()) {
            vacunatorio.addItem(cv.toString());
        }
        if (vacu!=null) {
            vacunatorio.setSelectedItem(vacu);
        }       
    }
    
    private void limpiar (){
        //this.patologia.setSelected(false);
        //esencial.setSelected(false);
        //patologia.setState(false);
        //esencial.setState(false);
        fecha.setDate(null);
        armarComboHorario("");
        cargarComboVacunatorio(null);
    }
}
