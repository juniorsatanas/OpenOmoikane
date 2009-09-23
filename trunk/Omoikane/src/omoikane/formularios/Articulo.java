/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Articulo.java
 *
 * Created on 22/08/2008, 07:40:21 PM
 */

package omoikane.formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import omoikane.sistema.*;

/**
 *
 * @author Octavio
 */
public class Articulo extends javax.swing.JInternalFrame {

    BufferedImage fondo;
    public int ID;
    /** Creates new form Articulo */
    public Articulo() {
        initComponents();
        //Instrucciones para el funcionamiento del fondo semistransparente
        this.setOpaque(false);
        ((JPanel)this.getContentPane()).setOpaque(false);
        this.getLayeredPane().setOpaque(false);
        this.getRootPane().setOpaque(false);
        this.generarFondo(this);

        Herramientas.centrarVentana(this);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDArticulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIDLinea = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtExistencias = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUModificacion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        txtIDGrupo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCodigos = new javax.swing.JTable();
        btnAddCode = new javax.swing.JButton();
        btnDelCode = new javax.swing.JButton();
        btnModCode = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPrecio2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtUtilidadPorc = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtDesctoPorcentaje = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtImpuestosPorc = new javax.swing.JTextField();
        txtImpuestos = new javax.swing.JTextField();
        txtUtilidad = new javax.swing.JTextField();
        txtDescuento2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaComentarios = new javax.swing.JTextArea();

        setTitle("Artículos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Artículo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 80, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 80, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 100, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 10, 10));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Artículo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        txtIDArticulo.setEditable(false);
        jPanel1.add(txtIDArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 240, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>Código <br>principal:<html>");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 30));

        txtCodigo.setEditable(false);
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 240, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Línea [F1]:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 20));

        txtIDLinea.setEditable(false);
        txtIDLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDLineaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 240, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        txtDescripcion.setEditable(false);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 240, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Unidad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        txtUnidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pza", "Kg", "Lt" }));
        txtUnidad.setEnabled(false);
        jPanel1.add(txtUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 240, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Existencias:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        txtExistencias.setEditable(false);
        jPanel1.add(txtExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 240, -1));

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Tahoma", 1, 18));
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioFocusLost(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 240, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Precio:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html>Última<br>Modificación:</html>");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        txtUModificacion.setEditable(false);
        jPanel1.add(txtUModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 240, 30));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -40, -1, 20));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Descuento:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 20));

        txtDescuento.setEditable(false);
        jPanel1.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 240, -1));

        txtIDGrupo.setEditable(false);
        txtIDGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDGrupoActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 240, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID Grupo [F1] :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 20));

        jTabbedPane1.addTab("General", jPanel1);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCodigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código"
            }
        ));
        jScrollPane1.setViewportView(tblCodigos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 300));

        btnAddCode.setText("+");
        jPanel2.add(btnAddCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 40, 20));

        btnDelCode.setText("-");
        jPanel2.add(btnDelCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, 20));

        btnModCode.setText("Mod");
        jPanel2.add(btnModCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 60, 20));

        jTabbedPane1.addTab("Códigos", jPanel2);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Impuestos (%):");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        txtPrecio2.setEditable(false);
        txtPrecio2.setFont(new java.awt.Font("Arial", 0, 24));
        txtPrecio2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio2ActionPerformed(evt);
            }
        });
        txtPrecio2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecio2FocusLost(evt);
            }
        });
        jPanel5.add(txtPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 130, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Costo:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 20));

        txtCosto.setFont(new java.awt.Font("Arial", 0, 24));
        txtCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCosto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCostoFocusLost(evt);
            }
        });
        jPanel5.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 130, 30));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Utilidad (%):");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        txtUtilidadPorc.setFont(new java.awt.Font("Arial", 0, 14));
        txtUtilidadPorc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUtilidadPorc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUtilidadPorcFocusLost(evt);
            }
        });
        jPanel5.add(txtUtilidadPorc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 110, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Detalles del precio y costo");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Precio:");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));

        txtDesctoPorcentaje.setFont(new java.awt.Font("Arial", 0, 14));
        txtDesctoPorcentaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDesctoPorcentaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDesctoPorcentajeFocusLost(evt);
            }
        });
        jPanel5.add(txtDesctoPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 110, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("$:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("$:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("$:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, 20));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("$:");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, 20));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Descuento (%):");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("$:");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, 20));

        txtImpuestosPorc.setFont(new java.awt.Font("Arial", 0, 14));
        txtImpuestosPorc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImpuestosPorc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtImpuestosPorcFocusLost(evt);
            }
        });
        jPanel5.add(txtImpuestosPorc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 110, -1));

        txtImpuestos.setEditable(false);
        txtImpuestos.setFont(new java.awt.Font("Arial", 0, 14));
        txtImpuestos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImpuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpuestosActionPerformed(evt);
            }
        });
        jPanel5.add(txtImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 110, -1));

        txtUtilidad.setEditable(false);
        txtUtilidad.setFont(new java.awt.Font("Arial", 0, 14));
        txtUtilidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtUtilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 110, -1));

        txtDescuento2.setEditable(false);
        txtDescuento2.setFont(new java.awt.Font("Arial", 0, 14));
        txtDescuento2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtDescuento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 110, -1));

        jTabbedPane1.addTab("Detalles", jPanel5);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Código", "Descripción"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 300));

        jButton4.setText("+");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 40, 20));

        jButton5.setText("-");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, 20));

        jButton6.setText("Mod");
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 60, 20));

        jTabbedPane1.addTab("Componentes", jPanel3);

        jPanel6.setOpaque(false);
        jTabbedPane1.addTab("Movimientos", jPanel6);

        txaComentarios.setColumns(25);
        txaComentarios.setRows(20);
        jScrollPane4.setViewportView(txaComentarios);

        jPanel7.add(jScrollPane4);

        jTabbedPane1.addTab("Notas", jPanel7);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 370, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Articulos.guardar(this);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Articulos.modificar(this);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtIDLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDLineaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDLineaActionPerformed

    private void txtIDGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDGrupoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtIDGrupoActionPerformed

    private void txtImpuestosPorcFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtImpuestosPorcFocusLost
        omoikane.principal.Articulos.recalcularCampos(this);
    }//GEN-LAST:event_txtImpuestosPorcFocusLost

    private void txtCostoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCostoFocusLost
        omoikane.principal.Articulos.recalcularCampos(this);
    }//GEN-LAST:event_txtCostoFocusLost

    private void txtUtilidadPorcFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUtilidadPorcFocusLost
        omoikane.principal.Articulos.recalcularCampos(this);
    }//GEN-LAST:event_txtUtilidadPorcFocusLost

    private void txtDesctoPorcentajeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDesctoPorcentajeFocusLost
        omoikane.principal.Articulos.recalcularCampos(this);
    }//GEN-LAST:event_txtDesctoPorcentajeFocusLost

    private void txtImpuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpuestosActionPerformed

    private void txtPrecio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio2ActionPerformed

    private void txtPrecio2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecio2FocusLost
        omoikane.principal.Articulos.recalcularUtilidad(this, txtPrecio2);
    }//GEN-LAST:event_txtPrecio2FocusLost

    private void txtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusLost
         omoikane.principal.Articulos.recalcularUtilidad(this, txtPrecio);
    }//GEN-LAST:event_txtPrecioFocusLost

    public void setEditable(boolean editable)
    {
        this.txtCodigo.setEditable(editable);
        this.txtIDLinea.setEditable(editable);
        this.txtIDGrupo.setEditable(editable);
        this.txtDescripcion.setEditable(editable);
        this.getTxtPrecio2().setEditable(editable);
        this.txtUnidad.setEnabled(editable);
        this.txtCosto.setEditable(editable);
        this.getTxtUtilidadPorc().setEditable(editable);
        this.txtPrecio.setEditable(editable);
    }
    public void setModoDetalles()
    {
        setEditable(false);
        this.btnGuardar.setVisible(false);
        this.btnModificar.setVisible(false);

    }
    public void setModoModificar()
    {
        setEditable(true);
        this.btnGuardar.setVisible(false);
        this.btnModificar.setVisible(true);
    }
    public void setModoNuevo()
    {
        setEditable(true);
        this.txtExistencias.setEditable(true);
        this.btnModificar.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCode;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDelCode;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModCode;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tblCodigos;
    private javax.swing.JTextArea txaComentarios;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDesctoPorcentaje;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDescuento2;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtIDArticulo;
    public javax.swing.JTextField txtIDGrupo;
    public javax.swing.JTextField txtIDLinea;
    private javax.swing.JTextField txtImpuestos;
    private javax.swing.JTextField txtImpuestosPorc;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecio2;
    private javax.swing.JTextField txtUModificacion;
    private javax.swing.JComboBox txtUnidad;
    private javax.swing.JTextField txtUtilidad;
    private javax.swing.JTextField txtUtilidadPorc;
    // End of variables declaration//GEN-END:variables

    public String getTxtCodigo() {return txtCodigo.getText();}
    public String getTxtDescripcion() {return txtDescripcion.getText();}
    public String getTxtIDArticulo() {return txtIDArticulo.getText();}
    public String getTxtUnidad(){return String.valueOf(txtUnidad.getSelectedItem());}
    public String getTxtUModificacion(){return this.txtUModificacion.getText();}
    public String getTxtIDLinea(){return txtIDLinea.getText();}
    public String getTxtIDGrupo(){return txtIDGrupo.getText();}
    public String getTxtDescuento()   { return this.txtDescuento.getText(); }
    public String getTxtCosto()       { return this.txtCosto.getText(); }
    public String getTxtExistencias() { return this.txtExistencias.getText(); }
    public String getTxtPrecio() {return txtPrecio.getText();}
    public void setTxtCodigo(String txtCodigo) {this.txtCodigo.setText(txtCodigo);}
    public void setTxtDescripcion(String txtDescripcion) {this.txtDescripcion.setText(txtDescripcion);}
    public void setTxtIDArticulo(String txtIDArticulo) {this.txtIDArticulo.setText(txtIDArticulo);}
    public void setTxtUnidad(String txt){this.txtUnidad.setSelectedItem(txt);}
    public void setTxtUModificacion(String txt){txtUModificacion.setText(txt);}
    public void setTxtIDLinea(String IDLinea){txtIDLinea.setText(IDLinea);}
    public void setTxtIDGrupo(String IDGrupo){txtIDGrupo.setText(IDGrupo);}
    public void setTxtDescuento(String descuento)     { txtDescuento.setText(descuento); }
    public void setTxtCosto(String costo)             { txtCosto.setText(costo); }
    public void setTxtExistencias(String existencias) { txtExistencias.setText(existencias); }
    public void setTxtPrecio(String precio) {this.txtPrecio.setText(precio);}
    public Component getIDLinea() { return this.txtIDLinea; }
    public Component getIDGrupo() { return this.txtIDGrupo; }
    public JTextField getTxtImpuestos(){return this.txtImpuestos;}
    public JTextField getCampoID() {return txtIDLinea;}
    public JTextField getCampoGrupo() {return txtIDGrupo;}
    public JTextField getTxtDesctoPorcentaje() {return txtDesctoPorcentaje;}
    public JTextField getTxtDescuento2() {return txtDescuento2;}
    public JTextField getTxtImpuestos3() {return txtImpuestos;}
    public JTextField getTxtImpuestosPorc() {return txtImpuestosPorc;}
    public JTextField getTxtPrecio2() {return txtPrecio2;}
    public JTextField getTxtUtilidadPorc() {return txtUtilidadPorc;}
    public JTextField getTxtUtilidad() {return txtUtilidad;}
    public void setTxtImpuestos(String txt){this.getTxtPrecio2().setText(txt);}
    public void setTxtUtilidadPorc(String utilidad)       { getTxtUtilidadPorc().setText(utilidad); }
    public void setTxtDesctoPorcentaje(javax.swing.JTextField txtDestoPorcentaje) {this.txtDesctoPorcentaje = txtDestoPorcentaje;}
    public void setTxtDescuento2(javax.swing.JTextField txtDescuento2) {this.txtDescuento2 = txtDescuento2;}
    public void setTxtDescuento3(String descuento) {this.txtDescuento2.setText(descuento);}
    public void setTxtImpuestos3(javax.swing.JTextField txtImpuestos3) {this.txtImpuestos = txtImpuestos3;}
    public void setTxtImpuestos4(String txtImpuestos3) {this.txtImpuestos.setText(txtImpuestos3);}
    public void setTxtImpuestosPorc(javax.swing.JTextField txtImpuestosPorc) {this.txtImpuestosPorc = txtImpuestosPorc;}
    public void setTxtPrecio2(javax.swing.JTextField txtPrecio2) {this.txtPrecio2 = txtPrecio2;}
    public void setTxtPrecio3(String precio) {this.txtPrecio2.setText(precio) ;}
    public void setTxtUtilidadPorc(javax.swing.JTextField txtUtilidadPorc) {this.txtUtilidadPorc = txtUtilidadPorc;}
    public void setTxtUtilidadPorcText(String txt) {txtUtilidadPorc.setText(txt);}
    public void setTxtUtilidad(javax.swing.JTextField txtUtilidad) {this.txtUtilidad = txtUtilidad;}
    public void setTxtUtilidad2(String utilidad) {this.txtUtilidad.setText(utilidad);}

    public void paintComponent(Graphics g)
    {
      Graphics2D g2d = (Graphics2D) g;
      g2d.drawImage(fondo, 0, 0, null);

    }
    public void generarFondo(Component componente)
    {
      Rectangle areaDibujo = this.getBounds();
      BufferedImage tmp;
      GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();

      tmp = gc.createCompatibleImage(areaDibujo.width, areaDibujo.height,BufferedImage.TRANSLUCENT);
      Graphics2D g2d = (Graphics2D) tmp.getGraphics();
      g2d.setColor(new Color(55,55,255,225));
      g2d.fillRect(0,0,areaDibujo.width,areaDibujo.height);
      fondo = tmp;
    }
    

    public String getTxtComentarios() {
        return txaComentarios.getText();
    }

    public void setTxtComentarios(String text) {
        txaComentarios.setText(text);
    }
}
