/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MovimientoAlmacen.java
 *
 * Created on 3/09/2008, 11:09:08 AM
 */

package omoikane.formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.util.*;
import java.text.*;
import omoikane.principal.*;
import omoikane.sistema.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;

/**
 *
 * @author Octavio
 */
public class MovimientoAlmacen extends javax.swing.JInternalFrame {

    BufferedImage fondo;
    Celda cellCodigo = new Celda();
    /** Creates new form MovimientoAlmacen */
    public MovimientoAlmacen() {
        initComponents();
        //Instrucciones para el funcionamiento del fondo semistransparente
        this.setOpaque(false);
        ((JPanel)this.getContentPane()).setOpaque(false);
        this.getLayeredPane().setOpaque(false);
        this.getRootPane().setOpaque(false);
        this.generarFondo(this);

        Herramientas.centrarVentana(this);

        this.tablaPrincipal.addKeyListener(new TabListener());
        tablaPrincipal.getModel().addTableModelListener(modelListener);
        tablaPrincipal.getColumn("Código artículo").setCellEditor(cellCodigo);

        this.fecha.setDate(new java.util.Date());
        //tablaPrincipal.setDefaultEditor(Object.class, new Celda());
        Action cerrar = new AbstractAction() { public void actionPerformed(ActionEvent e) {
            btnCerrar.doClick();
        } };
        Action nuevo = new AbstractAction() { public void actionPerformed(ActionEvent e) {
            btnNuevo.doClick();
        } };
        Action imprimir = new AbstractAction() { public void actionPerformed(ActionEvent e) {
            btnImprimir.doClick();
        } };
        Action eliminar = new AbstractAction() { public void actionPerformed(ActionEvent e) {
            btnEliminarRenglon.doClick();
        } };
        Herramientas.Input2Action(this.getRootPane(), KeyEvent.VK_ESCAPE, "cerrar"   , cerrar  );
        Herramientas.Input2Action(this.getRootPane(), KeyEvent.VK_F5    , "nuevo"    , nuevo   );
        Herramientas.Input2Action(this.getRootPane(), KeyEvent.VK_F8    , "imprimir" , imprimir);
        Herramientas.Input2Action(tablaPrincipal, KeyEvent.VK_F12, "eliminar" , eliminar);

    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        folio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrincipal = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        almacen = new javax.swing.JTextField();
        tipoMovimiento = new javax.swing.JComboBox();
        txtSumaTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnEliminarRenglon = new javax.swing.JButton();
        fecha = new org.jdesktop.swingx.JXDatePicker();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36));
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Movimiento de almacén");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descripción:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 600, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Folio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, 30));
        getContentPane().add(folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 80, -1));

        tablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código artículo", "Descripción", "Costo", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPrincipal.setShowHorizontalLines(false);
        tablaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPrincipalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPrincipal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 820, 280));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/omoikane/media/64x64/page_add.png"))); // NOI18N
        btnNuevo.setText("<html><center>Agregar éste movimiento [F5]</center></html>");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 190, 60));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/omoikane/media/64x64/printer.png"))); // NOI18N
        btnImprimir.setText("<html><center>Imprimir [F8]</center></html>");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 160, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 30, 30));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/omoikane/media/64x64/back.png"))); // NOI18N
        btnCerrar.setText("<HTML>Regresar a almacén [Esc]</HTML>");
        btnCerrar.setRequestFocusEnabled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 230, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de movimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 40, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Almacén:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 60, 30));
        getContentPane().add(almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 190, -1));

        tipoMovimiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Entrada al almacén", "Salida del almacén", "Ajuste" }));
        getContentPane().add(tipoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 210, -1));
        getContentPane().add(txtSumaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, -1, 20));

        btnEliminarRenglon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/omoikane/media/16x16/remove.png"))); // NOI18N
        btnEliminarRenglon.setText("Eliminar renglón seleccionado [Supr]");
        btnEliminarRenglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRenglonActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarRenglon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        fecha.setFormats(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM));
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 160, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/omoikane/media/16x16/search.png"))); // NOI18N
        jButton1.setText("Catálogo de artículos [F2]");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public DateFormat       formatoFecha = DateFormat.getDateInstance(DateFormat.MEDIUM);
    public SimpleDateFormat sdf          = new SimpleDateFormat("yyyy-MM-dd");

    public String  getTipoMovimiento()    { return (String)this.tipoMovimiento.getSelectedItem(); }
    public String getAlmacen()           { return (String)(this.almacen.getText()); }
    public String  getFecha()             { return (String)sdf.format(this.fecha.getDate()); }
    public String  getDescripcion()       { return (String)this.descripcion.getText(); }
    public String  getFolio()             { return (String)this.folio.getText(); }
    public Double  getGranTotal()         { return Double.parseDouble(this.txtSumaTotal.getText()); }
    public Vector  getTablaPrincipal(){
        return ((DefaultTableModel)this.tablaPrincipal.getModel()).getDataVector();
    }
    public JTextField getFieldAlmacen()   { return this.almacen; }
    public void setTipoMovimiento(String val) { tipoMovimiento.setSelectedItem(val); }
    public void setAlmacen       (String val) { almacen.setText(val); }
    public void setFecha         (String val) { try { fecha.setDate(sdf.parse(val)); } catch(Exception e) { omoikane.sistema.Dialogos.lanzarDialogoError(null, "Error en el registro: Fecha inválida", omoikane.sistema.Herramientas.getStackTraceString(e)); } }
    public void setDescripcion   (String val) { descripcion.setText(val); }
    public void setFolio         (String val) { folio.setText(val);}
    public void setTablaPrincipal(java.util.List val) {
        DefaultTableModel modelo = ((DefaultTableModel)this.tablaPrincipal.getModel());
        for(int i = 0; i < val.size(); i++)
        {
            modelo.addRow(((java.util.ArrayList) val.get(i)).toArray());
        }
        this.calculaSumas();
    }

int ID = -1;
public void setID(int ID) { this.ID = ID; }
public int  getID() { return ID; }

public void setModoModificaciones()
{
    this.setTitle("Modificar movimiento " + ID);
    //this.btnEliminar.setVisible(false);
    this.btnNuevo.setVisible(false);
    this.lblTitulo.setText("Modificar Movimiento de Almacén");
    this.btnEliminarRenglon.setVisible(true);
    //this.btnModificar.setVisible(true);
    this.folio.setEditable(true);
    this.descripcion.setEditable(true);
    this.fecha.setEditable(true);
    this.tipoMovimiento.setEditable(true);
    this.almacen.setEditable(true);
    this.tablaPrincipal.setEnabled(true);
}
public void setModoNuevo()
{
    this.setTitle("Registrar nuevo movimiento de almacén");
    this.lblTitulo.setText("Nuevo movimiento de almacén");
    //this.btnEliminar.setVisible(false);
    //this.btnModificar.setVisible(false);
    ((DefaultTableModel)this.tablaPrincipal.getModel()).addRow(new Object[] {});
}
public void setModoDetalles()
{
    this.setTitle("Detalles del movimiento de almacén " + ID);
    this.lblTitulo.setText("Detalles del movimiento");
    this.btnEliminarRenglon.setVisible(false);
    this.btnNuevo.setVisible(false);
    //this.btnModificar.setVisible(false);
    this.folio.setEditable(false);
    this.descripcion.setEditable(false);
    this.fecha.setEditable(false);
    this.tipoMovimiento.setEditable(false);
    this.almacen.setEditable(false);
    this.tablaPrincipal.setEnabled(false);
}

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEliminarRenglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRenglonActionPerformed
        // TODO add your handling code here:
        int IDRenglon = this.tablaPrincipal.getSelectedRow();
        if(IDRenglon != -1) {
            if(JOptionPane.showConfirmDialog(null, "¿Realmente desea eliminar el renglón seleccionado?", "¿Eliminar?", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                ((DefaultTableModel)tablaPrincipal.getModel()).removeRow(IDRenglon);
            }
        }
    }//GEN-LAST:event_btnEliminarRenglonActionPerformed

    private void tablaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPrincipalMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tablaPrincipalMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Almacenes.guardarMovimiento(this);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Almacenes.lanzarImprimirMovimiento(this);
    }//GEN-LAST:event_btnImprimirActionPerformed

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
      g2d.setColor(new Color(55,55,255,165));
      g2d.fillRect(0,0,areaDibujo.width,areaDibujo.height);
      fondo = tmp;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField almacen;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminarRenglon;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNuevo;
    public javax.swing.JTextField descripcion;
    private org.jdesktop.swingx.JXDatePicker fecha;
    private javax.swing.JTextField folio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaPrincipal;
    private javax.swing.JComboBox tipoMovimiento;
    private javax.swing.JTextField txtSumaTotal;
    // End of variables declaration//GEN-END:variables

    public void calculaSumas()
    {
        try{
        TableModel tm = this.tablaPrincipal.getModel();
        int tamTabla = tm.getRowCount();
        double costo, cantidad, totalFila, sumaTotal;
        sumaTotal = 0.0;

        for(int i = 0; i < tamTabla; i++)
        {
            if(tm.getValueAt(i, 2) != null && tm.getValueAt(i, 3) != null)
            {
                costo    = Double.valueOf(String.valueOf(tm.getValueAt(i, 2)));
                cantidad = Double.valueOf(String.valueOf(tm.getValueAt(i, 3)));
                totalFila= costo * cantidad;

                tm.setValueAt(totalFila, i, 4);
                sumaTotal += totalFila;
            }

        }

        txtSumaTotal.setText(String.valueOf(sumaTotal));
    }
        catch(Exception e){Dialogos.lanzarAlerta("Cantidades invalidas, puede que algun numero este mal escrito");}
    }
    
    //Clase encargada de recibir los eventos de la tabla, para crear nuevas filas y calcular sumas
    class TabListener extends KeyAdapter
    {
        public void keyPressed(KeyEvent ke)
        {

            if(ke.getKeyCode()==ke.VK_TAB)
            {
                int x         = ((JTable)ke.getSource()).getSelectedColumn();
                int y         = ((JTable)ke.getSource()).getSelectedRow();
                int maxX      = ((JTable)ke.getSource()).getColumnCount();
                int maxY      = ((JTable)ke.getSource()).getRowCount();
                TableModel tm = ((JTable)ke.getSource()).getModel();
                if(x==maxX-1 && y==maxY-1) { ((DefaultTableModel)tm).addRow(new Object[maxX]); }
            }
        }

    }
    public TableModelListener modelListener = new javax.swing.event.TableModelListener()
    {
        public void tableChanged(javax.swing.event.TableModelEvent tme)
        {
            DefaultTableModel tm     = (DefaultTableModel)tme.getSource();
            int col                  = tme.getColumn();
            int row                  = tme.getFirstRow();
            String            valCel = (String)tm.getValueAt(tme.getFirstRow(), 0);

            if(tme.getType() == 0 && (col == 2 || col == 3))
            {
                calculaSumas();
            }
        }
    };

    class Celda extends DefaultCellEditor
    {
        JTextField componente;
        Celda() { super(new JTextField()); componente = (JTextField) this.getComponent(); /*componente.addKeyListener(new CellCodigoKeyListener());*/}

        public boolean stopCellEditing() {
            Object descrip = null, costo = null;
            JTextField campo = ((JTextField)this.getComponent());
            String codigo = campo.getText();
            if(codigo == "") { return false; }
            descrip= Almacenes.groovyPort("omoikane.principal.Articulos.getArticulo('codigo = \""+codigo+"\"').descripcion");
            costo  = Almacenes.groovyPort("omoikane.principal.Articulos.getArticulo('select * from articulos,precios where articulos.codigo = \""+codigo+"\" " +
                    "and articulos.id_articulo = precios.id_articulo and precios.id_almacen = '+omoikane.principal.Principal.config.idAlmacen[0].text()).costo");

            if(descrip==null)
            {
                Dialogos.lanzarAlerta("El artículo que capturó no exíste");
                campo.setText("");
                return false;
            } else {
                tablaPrincipal.setValueAt(descrip, tablaPrincipal.getEditingRow(), tablaPrincipal.getEditingColumn()+1);
                tablaPrincipal.setValueAt(costo  , tablaPrincipal.getEditingRow(), tablaPrincipal.getEditingColumn()+2);
                return super.stopCellEditing();
                
            }
        }
    }
}

