/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Controlador.CtrlViaticos;
import Modelo.Dependencia;
import Modelo.Empleado;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AUXINVTIC
 */
public class diaViaticosMun extends java.awt.Dialog {

    CtrlViaticos ctrl = new CtrlViaticos();
    
    public diaViaticosMun(java.awt.Frame parent, boolean modal, String usuario) {
        super(parent, modal);
        initComponents();
        setTitle("Viáticos asignados a técnicos de municipios");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pagar.png"));
        setIconImage(icon);
        setLocationRelativeTo(null);
        ctrl.llenarDependencias(cbDependencia);
        txtUsuario.setText(usuario);
        txtUsuario.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblEmpleado = new javax.swing.JLabel();
        cbDependencia = new javax.swing.JComboBox<>();
        cbEmpleado = new javax.swing.JComboBox<>();
        fechaInicial = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        checkTodos = new javax.swing.JCheckBox();
        txtUsuario = new javax.swing.JTextField();
        fechaRegistro = new com.toedter.calendar.JDateChooser();
        lblEmpleado1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panel de información a consultar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Fecha:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Dependencia:");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/broom.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(102, 102, 102));
        lblEmpleado.setText("Empleado:");

        cbDependencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbDependencia.setForeground(new java.awt.Color(51, 51, 51));
        cbDependencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbDependencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDependenciaItemStateChanged(evt);
            }
        });

        cbEmpleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        cbEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        fechaInicial.setDateFormatString("d-MM-yyyy");
        fechaInicial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(fechaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addGap(132, 132, 132))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbDependencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addGap(248, 248, 248))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(106, 106, 106)))
                .addComponent(btnBuscar)
                .addGap(8, 8, 8)
                .addComponent(btnLimpiar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDependencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(btnLimpiar))))
                .addGap(1, 1, 1))
        );

        tblResultados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblResultados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblResultados.setGridColor(new java.awt.Color(204, 204, 204));
        tblResultados.setRowHeight(25);
        tblResultados.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblResultados.setSelectionForeground(new java.awt.Color(204, 51, 0));
        tblResultados.setShowVerticalLines(false);
        tblResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblResultados);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panel de acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(51, 51, 51));
        lblTotal.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Total:");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(102, 102, 102));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/diskette.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setIconTextGap(6);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setIconTextGap(6);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        checkTodos.setBackground(new java.awt.Color(255, 255, 255));
        checkTodos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkTodos.setForeground(new java.awt.Color(102, 102, 102));
        checkTodos.setText("Seleccionar todos");
        checkTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTodosActionPerformed(evt);
            }
        });

        fechaRegistro.setDateFormatString("d-MM-yyyy");
        fechaRegistro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblEmpleado1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpleado1.setForeground(new java.awt.Color(102, 102, 102));
        lblEmpleado1.setText("Fecha de registro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpleado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkTodos)
                .addGap(32, 32, 32)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotal)
                .addGap(87, 87, 87)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEmpleado1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(lblTotal)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(checkTodos)
                                .addComponent(btnGuardar)
                                .addComponent(btnCancelar)))
                        .addComponent(fechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Dependencia dep = (Dependencia) cbDependencia.getSelectedItem();
        Empleado empleado = (Empleado) cbEmpleado.getSelectedItem();

        if(fechaInicial.getDate() == null){
            JOptionPane.showMessageDialog(null, "Ingrese una fecha inicial.");
        }else if(dep.getId_dependencia().equals("0")){
            JOptionPane.showMessageDialog(null, "Seleccione una dependencia.");
        }else if(empleado.getId().equals("0")){
            JOptionPane.showMessageDialog(null, "Seleccione un empleado.");
        }else{
            String strDateFormat = "yyyy-MM-dd"; // El formato de fecha está especificado  
            SimpleDateFormat f = new SimpleDateFormat(strDateFormat);
            String feInicial = f.format(fechaInicial.getDate());
            ctrl.viaticosMunicipios(tblResultados, feInicial, empleado.getId(), this);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbDependenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDependenciaItemStateChanged
        Dependencia dep = (Dependencia) cbDependencia.getSelectedItem();        
        ctrl.llenarEmpleados(cbEmpleado, dep.getId_dependencia());
    }//GEN-LAST:event_cbDependenciaItemStateChanged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(tblResultados.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No hay registros en la lista \npara guardar.");
        }else if(fechaRegistro.getDate() == null){
            JOptionPane.showMessageDialog(null, "Ingrese la fecha de registro.");
        }else{
            ctrl.cambiarEstadoViatico(this);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void checkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTodosActionPerformed
        Empleado empleado = (Empleado) cbEmpleado.getSelectedItem();
        int filas = tblResultados.getRowCount();
        
        if(filas > 0){
            String strDateFormat = "yyyy-MM-dd"; // El formato de fecha está especificado  
            SimpleDateFormat f = new SimpleDateFormat(strDateFormat);
            String feInicial = f.format(fechaInicial.getDate());
            ctrl.viaticosMunicipios(tblResultados, feInicial, empleado.getId(), this);           
        }else{
            checkTodos.setSelected(false);
            JOptionPane.showMessageDialog(null, "No existen registros para seleccionar.");
        }
        
    }//GEN-LAST:event_checkTodosActionPerformed

    private void tblResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadosMouseClicked
        int fila = tblResultados.rowAtPoint(evt.getPoint());
        int columna = tblResultados.columnAtPoint(evt.getPoint());

        if(columna == 8){
            //JOptionPane.showMessageDialog(null,"Bien");
            validarSeleccion(fila);
        }
    }//GEN-LAST:event_tblResultadosMouseClicked

    private void validarSeleccion(int fila){
        String id_viatico = tblResultados.getValueAt(fila, 10).toString();
        ctrl.consultarDetalleViatico(id_viatico);
    }
   private void limpiar(){
       fechaInicial.setDate(null);
       fechaRegistro.setDate(null);
       cbDependencia.setSelectedIndex(0);
       checkTodos.setSelected(false);
       lblTotal.setText("0");
       DefaultTableModel modelo = (DefaultTableModel) tblResultados.getModel();
       while(modelo.getRowCount()>0)modelo.removeRow(0);
   }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    public javax.swing.JComboBox<String> cbDependencia;
    public javax.swing.JComboBox<String> cbEmpleado;
    public javax.swing.JCheckBox checkTodos;
    public com.toedter.calendar.JDateChooser fechaInicial;
    public com.toedter.calendar.JDateChooser fechaRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblEmpleado1;
    public javax.swing.JLabel lblTotal;
    public javax.swing.JTable tblResultados;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
