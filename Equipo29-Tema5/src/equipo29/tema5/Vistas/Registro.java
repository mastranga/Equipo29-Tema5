/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo29.tema5.Vistas;

import equipo29.tema5.Conexion.CiudadanoData;
import equipo29.tema5.Data.Ciudadano;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruce
 */
public class Registro extends javax.swing.JInternalFrame {
    private CiudadanoData cd;

    /**
     * Creates new form Registro
     */
    public Registro(CiudadanoData cd) {
        initComponents();
        this.cd = cd;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dnilabel = new javax.swing.JLabel();
        nombreyapellidolabel = new javax.swing.JLabel();
        emaillabel = new javax.swing.JLabel();
        Celularlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        nombreyapellido = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        patologia = new javax.swing.JTextField();
        ambitolaboral = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        salir = new javax.swing.JButton();

        dnilabel.setText("dni");

        nombreyapellidolabel.setText("Nombre y Apellido");

        emaillabel.setText("Email");

        Celularlabel.setText("Celular");

        jLabel1.setText("Patologia preexistente");

        jLabel2.setText("Ambito laboral");

        dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniKeyTyped(evt);
            }
        });

        nombreyapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreyapellidoKeyTyped(evt);
            }
        });

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });

        patologia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                patologiaKeyTyped(evt);
            }
        });

        ambitolaboral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ambitolaboralKeyTyped(evt);
            }
        });

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel3.setText("id");

        id.setEditable(false);

        salir.setText("SALIR");
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dnilabel)
                            .addComponent(nombreyapellidolabel)
                            .addComponent(emaillabel)
                            .addComponent(Celularlabel))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dni)
                            .addComponent(nombreyapellido)
                            .addComponent(email)
                            .addComponent(celular, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registrar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patologia)
                            .addComponent(ambitolaboral)
                            .addComponent(id)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(modificar)
                                .addGap(49, 49, 49)
                                .addComponent(salir)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dnilabel)
                            .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreyapellidolabel)
                            .addComponent(nombreyapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emaillabel)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Celularlabel)
                            .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(patologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ambitolaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(modificar)
                    .addComponent(salir))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        if(dni.getText().isEmpty() || nombreyapellido.getText().isEmpty() || email.getText().isEmpty() || celular.getText().isEmpty()
                 || ambitolaboral.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor complete los campos requeridos");
        }else if (dni.getText().length() < 7 || dni.getText().length() > 8) {
            JOptionPane.showMessageDialog(null, "El documento debe tener entre 7 y 8 digitos de longitud");
        }else if(celular.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Verificar numero de celular ingresado");
        }else {
            try {
                cd.guardarCiudadano(new Ciudadano(Integer.parseInt(dni.getText()), nombreyapellido.getText(), email.getText(), celular.getText(), patologia.getText(), ambitolaboral.getText()));
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        if(dni.getText().isEmpty() || nombreyapellido.getText().isEmpty() || email.getText().isEmpty() || celular.getText().isEmpty()
                 || ambitolaboral.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor complete los campos requeridos");
        }else if (dni.getText().length() < 7 || dni.getText().length() > 8) {
            JOptionPane.showMessageDialog(null, "El documento debe tener entre 7 y 8 digitos de longitud");
        }else if(celular.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Verificar numero de celular ingresado");
        }else {
            Ciudadano ciudadano = new Ciudadano();
            ciudadano.setId(Integer.parseInt(id.getText()));
            ciudadano.setDni(Integer.parseInt(dni.getText()));
            ciudadano.setNombreCompleto(nombreyapellido.getText());
            ciudadano.setEmail(email.getText());
            ciudadano.setCelular(celular.getText());
            ciudadano.setPatologia(patologia.getText());
            ciudadano.setAmbitoTrabajo(ambitolaboral.getText());
            try {
                cd.modificarCiudadano(ciudadano);
            } catch (SQLException ex) {

            }
        }
        
    }//GEN-LAST:event_modificarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(!dni.getText().isEmpty()){
            Ciudadano ciudadano = cd.buscarCiudadano(Integer.parseInt(dni.getText()));
        nombreyapellido.setText(ciudadano.getNombreCompleto());
        email.setText(ciudadano.getEmail());
        celular.setText(ciudadano.getCelular());
        patologia.setText(ciudadano.getPatologia());
        ambitolaboral.setText(ciudadano.getAmbitoTrabajo());
        id.setText(ciudadano.getId()+"");
        } else{
             JOptionPane.showMessageDialog(null, "Ingrese Documento valido del ciudadano para realizar una busqueda");   
        }
        
        
    }//GEN-LAST:event_buscarActionPerformed

    private void dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_dniKeyTyped

    private void nombreyapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreyapellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_nombreyapellidoKeyTyped

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_emailKeyTyped

    private void patologiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patologiaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_patologiaKeyTyped

    private void ambitolaboralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ambitolaboralKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_ambitolaboralKeyTyped

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Celularlabel;
    private javax.swing.JTextField ambitolaboral;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel dnilabel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombreyapellido;
    private javax.swing.JLabel nombreyapellidolabel;
    private javax.swing.JTextField patologia;
    private javax.swing.JButton registrar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
