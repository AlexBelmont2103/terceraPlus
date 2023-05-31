package com.mycompany.terceraplus_alejandromunozgarcia;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.*;

/**
 *
 * @author AMG
 */
public class AltaDR extends javax.swing.JDialog {

    /**
     * Creates new form AltaBI
     */
    private DAO_Tributos dao;

    public AltaDR(java.awt.Frame principal, boolean modal) {
        super(principal, modal);
        initComponents();
        dao = Principal.getDao();
    }

    public JButton getBtnAlta() {
        return btnAlta;
    }

    public void setBtnAlta(JButton btnAlta) {
        this.btnAlta = btnAlta;
    }

    public JButton getBtnPagar() {
        return btnPagar;
    }

    public void setBtnPagar(JButton btnPagar) {
        this.btnPagar = btnPagar;
    }

    public JTextField getFldID() {
        return fldID;
    }

    public void setFldID(JTextField fldID) {
        this.fldID = fldID;
    }

    public JTextField getFldImporte() {
        return fldImporte;
    }

    public void setFldImporte(JTextField fldImporte) {
        this.fldImporte = fldImporte;
    }

    public JTextField getFldCilindrada() {
        return fldCilindrada;
    }

    public void setFldCilindrada(JTextField fldCilindrada) {
        this.fldCilindrada = fldCilindrada;
    }

    public JTextField getFldNif() {
        return fldNif;
    }

    public void setFldNif(JTextField fldNif) {
        this.fldNif = fldNif;
    }

    public JTextField getFldPagado() {
        return fldPagado;
    }

    public void setFldPagado(JTextField fldPagado) {
        this.fldPagado = fldPagado;
    }

    public JTextField getFldPago() {
        return fldPago;
    }

    public void setFldPago(JTextField fldPago) {
        this.fldPago = fldPago;
    }

    public JTextField getFldMatricula() {
        return fldMatricula;
    }

    public void setFldMatricula(JTextField fldMatricula) {
        this.fldMatricula = fldMatricula;
    }

    public void setFields(VehiculoDosRuedas dr) {
        fldID.setText(dr.getId().toString());
        fldNif.setText(dr.getNIF());
        fldPago.setText(dr.getFecha_limite().toString());
        fldPagado.setText(LocalDate.now().toString());
        fldCilindrada.setText(dr.getCilindrada().toString());
        fldMatricula.setText(dr.getMatricula());
        fldImporte.setText(dr.calcularImporte().toString());
    }

    public void disableAll() {
        this.fldID.setEditable(false);
        this.fldImporte.setEditable(false);
        this.fldCilindrada.setEditable(false);
        this.fldNif.setEditable(false);
        this.fldPagado.setEditable(false);
        this.fldPago.setEditable(false);
        this.fldMatricula.setEditable(false);

        this.btnAlta.setEnabled(false);
    }

    public void disableSome() {
        this.fldID.setEditable(false);
        this.fldImporte.setEditable(false);
        this.fldPagado.setEditable(false);

        this.btnPagar.setEnabled(false);
    }

    private boolean comprobarCampos() {
        boolean bandera = false;
        if (fldNif.getText() == null || fldPago.getText() == null
                || fldCilindrada.getText() == null || fldMatricula.getText() == null) {
            bandera = true;
        }

        return bandera;
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
        fldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fldNif = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fldPago = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fldPagado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fldMatricula = new javax.swing.JTextField();
        fldCilindrada = new javax.swing.JTextField();
        fldImporte = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Referencia");

        jLabel2.setText("NIF");

        jLabel3.setText("Fecha pago");

        jLabel4.setText("Fecha pagado");

        jLabel5.setText("Cilindrada");

        jLabel6.setText("Matrícula");

        jLabel7.setText("Importe");

        btnAlta.setText("ALTA");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnPagar.setText("PAGAR");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(fldPagado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(btnAlta))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnPagar)
                                .addGap(37, 37, 37)
                                .addComponent(btnSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fldNif, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fldPago, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fldID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fldCilindrada, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(fldMatricula)
                                    .addComponent(fldImporte))))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fldNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fldPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fldPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fldCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnPagar)
                    .addComponent(btnSalir))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        if (!comprobarCampos()) {
            try {
                String nif = fldNif.getText();
                LocalDate pago = utils.UtilFechas.convertirString_LocalDate(fldPago.getText());
                Integer cilindrada = Integer.valueOf(fldCilindrada.getText());
                String matricula = fldMatricula.getText();

                VehiculoDosRuedas dr = new VehiculoDosRuedas(nif, pago, matricula, cilindrada);
                dao.insertDR(dr);
                JOptionPane.showMessageDialog(this, "Operación completada con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (DateTimeParseException ex) {
                JOptionPane.showMessageDialog(this, "Usa el siguiente formato: dd/mm/aaaa", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Debes poner números en el campo 'cilindrada'", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Rellena todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        try {
            Double importe = Double.valueOf(fldImporte.getText());
            String matricula = fldMatricula.getText();
            dao.updatePagadoCR(matricula);
            dao.updateImporteCR(matricula, importe);
            JOptionPane.showMessageDialog(this, "Pago completado. Gracias", "Operación completada con éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField fldCilindrada;
    private javax.swing.JTextField fldID;
    private javax.swing.JTextField fldImporte;
    private javax.swing.JTextField fldMatricula;
    private javax.swing.JTextField fldNif;
    private javax.swing.JTextField fldPagado;
    private javax.swing.JTextField fldPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
