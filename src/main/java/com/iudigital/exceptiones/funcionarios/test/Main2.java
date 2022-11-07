package com.iudigital.exceptiones.funcionarios.test;

import com.iudigital.exceptiones.funcionarios.controller.FuncionariosController;
import com.iudigital.exceptiones.funcionarios.dominio.Funcionarios;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author User
 */
public class Main2 extends javax.swing.JFrame {

    
    private final FuncionariosController funcionariosController;
    private final String[] COLUMNS = {"NUMERO DE IDENTIFICACION FUNCIONARIO", "ID_IDENTIFICACION_FUN", "COD_IES_UNIVER_FUN", "NOMBRES_FUN", "apellidos_fun", "estados_civil_fun", "sexo_fun","direccion_fun","telefono_fun","fecha_nacimiento_fun","id_pariente_fun","id_identidad_fun"};
    private final static String SELECCIONE = " -- SELECCIONE --";
    
    
    /**
     * Creates new form Main2
     */
    public Main2() {
        initComponents();
        txtIdfuncionario.setEditable(false);
        funcionariosController = new FuncionariosController();
        listFuncionarios();
        addListener();
    }
    
    public void listFuncionarios(){
    cbxFuncionario.removeAllItems();
    Funcionarios funcionario1 = new Funcionarios();
    funcionario1.setNombres_fun(SELECCIONE);
    funcionario1.setApellidos_fun("");
    cbxFuncionario.addItem(funcionario1);
    tblFuncionario.removeAll();
    
    
     DefaultTableModel defaultTableModel = new DefaultTableModel();
     for (String COLUMN : COLUMNS) {
     defaultTableModel.addColumn(COLUMN);
        }
     
    tblFuncionario.setModel(defaultTableModel);
    try{
    
    List<Funcionarios> funcionarios = funcionariosController.obtenerFuncionarios();
    if (funcionarios.isEmpty()) {
     return;
     }
     defaultTableModel.setRowCount(funcionarios.size());
            int row = 0;
            for (Funcionarios funcionario : funcionarios) {
                defaultTableModel.setValueAt(funcionario.getId_funcionario(), row, 0);
                defaultTableModel.setValueAt(funcionario.getId_identificacion_fun(), row, 1);
                defaultTableModel.setValueAt(funcionario.getCod_IES_univer_fun(), row, 2);
                defaultTableModel.setValueAt(funcionario.getNombres_fun(), row, 3);
                defaultTableModel.setValueAt(funcionario.getApellidos_fun(), row, 4);
                defaultTableModel.setValueAt(funcionario.getEstados_civil_fun(), row, 5);
                defaultTableModel.setValueAt(funcionario.getSexo_fun(), row, 6);
                defaultTableModel.setValueAt(funcionario.getDireccion_fun(), row, 7);
                defaultTableModel.setValueAt(funcionario.getTelefono_fun(), row, 8);
                defaultTableModel.setValueAt(funcionario.getFecha_nacimiento_fun(), row, 9);
                defaultTableModel.setValueAt(funcionario.getId_pariente_fun(), row, 10);
                defaultTableModel.setValueAt(funcionario.getId_identidad_fun(), row, 11);
                row++;

                cbxFuncionario.addItem(funcionario);
           
            }
}catch (SQLException ex){

ex.printStackTrace();

}
    
}
//mostrar todos los funcionarios creados
 private void addListener() {
        cbxFuncionario.addItemListener(event -> {
            Funcionarios selectedFuncionario = (Funcionarios) event.getItem();
            if (selectedFuncionario.getNombres_fun().equals(SELECCIONE)) {
                txtIdfuncionario.setText("");
                txtIdenticacion.setText("");
                txtUniversidad.setText("");
                txtNombre.setText("");
                txtApellido1.setText("");
                txtEstado.setText("");
                txtGenero.setText("");
                txtDireccion1.setText("");
                txtTelefono.setText("");
                txtFecha1.setText("");
                txtPariente1.setText("");
                txtFamilia.setText("");
                            

            } else {
                txtIdfuncionario.setText(String.valueOf(selectedFuncionario.getId_funcionario()));
                txtIdenticacion.setText(String.valueOf(selectedFuncionario.getId_identificacion_fun()));
                txtUniversidad.setText(String.valueOf(selectedFuncionario.getCod_IES_univer_fun()));
                txtNombre.setText(selectedFuncionario.getNombres_fun());
                txtApellido1.setText(selectedFuncionario.getApellidos_fun());
                txtEstado.setText(selectedFuncionario.getEstados_civil_fun());
                txtGenero.setText(selectedFuncionario.getSexo_fun());
                txtDireccion1.setText(selectedFuncionario.getDireccion_fun());
                txtEstado.setText(selectedFuncionario.getEstados_civil_fun());
                txtTelefono.setText(selectedFuncionario.getEstados_civil_fun());
                txtFecha1.setText(selectedFuncionario.getFecha_nacimiento_fun());
                txtPariente1.setText(String.valueOf(selectedFuncionario.getId_pariente_fun()));
                txtFamilia.setText(String.valueOf(selectedFuncionario.getId_identidad_fun()));
            }
            System.out.println("selectedFuncionario = " + selectedFuncionario);
        });
    }
    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JPFuncionario1 = new javax.swing.JTabbedPane();
        jPFuncionario = new javax.swing.JPanel();
        JPFuncionario2 = new javax.swing.JPanel();
        lblIdentidad = new javax.swing.JLabel();
        lblUniversidad = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblEstadocivil = new javax.swing.JLabel();
        LBLSexo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblPariente = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtUniversity = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEstadocivil = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtPariente = new javax.swing.JTextField();
        TxtFamiliar = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblFamiliar2 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        jPFuncionario3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxFuncionario = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblUniversidad1 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblApellido1 = new javax.swing.JLabel();
        lblEstadocivil1 = new javax.swing.JLabel();
        LBLSexo1 = new javax.swing.JLabel();
        lblDireccion1 = new javax.swing.JLabel();
        lblTelefono1 = new javax.swing.JLabel();
        lblPariente1 = new javax.swing.JLabel();
        lblFamiliar1 = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        lblIdentidad1 = new javax.swing.JLabel();
        txtIdfuncionario = new javax.swing.JTextField();
        txtIdenticacion = new javax.swing.JTextField();
        txtUniversidad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtDireccion1 = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtFecha1 = new javax.swing.JTextField();
        txtPariente1 = new javax.swing.JTextField();
        txtFamilia = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Gestion de funcionarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 160, -1));

        jPFuncionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPFuncionario2.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite los siguientes campos"));
        JPFuncionario2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdentidad.setText("Identificacion");
        JPFuncionario2.add(lblIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblUniversidad.setText("IES de Universidad");
        JPFuncionario2.add(lblUniversidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        lblName.setText("Nombre del funcionario");
        JPFuncionario2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        lblApellido.setText("Apellido del funcionario");
        JPFuncionario2.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        lblEstadocivil.setText("Estado civil");
        JPFuncionario2.add(lblEstadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        LBLSexo.setText("Sexo");
        JPFuncionario2.add(LBLSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lblFecha.setText("Fecha de nacimiento");
        JPFuncionario2.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        lblPariente.setText("id del pariente");
        JPFuncionario2.add(lblPariente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        lblDireccion.setText("Direccion");
        JPFuncionario2.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        lblTelefono.setText("Telefono");
        JPFuncionario2.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));
        JPFuncionario2.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));
        JPFuncionario2.add(txtUniversity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 70, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        JPFuncionario2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 100, -1));
        JPFuncionario2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 50, 70, -1));

        txtEstadocivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadocivilActionPerformed(evt);
            }
        });
        JPFuncionario2.add(txtEstadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 70, -1));
        JPFuncionario2.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, -1));
        JPFuncionario2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 60, -1));

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        JPFuncionario2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 90, -1));
        JPFuncionario2.add(txtPariente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 80, -1));
        JPFuncionario2.add(TxtFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        JPFuncionario2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        lblFamiliar2.setText("Numero identificacion del familiar");
        JPFuncionario2.add(lblFamiliar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono1ActionPerformed(evt);
            }
        });
        JPFuncionario2.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 60, -1));

        jPFuncionario.add(JPFuncionario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 600, 300));

        tblFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblFuncionario);

        jPFuncionario.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 590, 140));

        JPFuncionario1.addTab("Crear Funcionario", jPFuncionario);

        jPFuncionario3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Modifique los siguientes campos"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Funcionarios");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 20));

        cbxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(cbxFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, -1));

        btnActualizar.setText("Actualizar");
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        lblId.setText("Id");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        lblUniversidad1.setText("IES de Universidad");
        jPanel1.add(lblUniversidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        lblName1.setText("Nombre del funcionario");
        jPanel1.add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        lblApellido1.setText("Apellido del funcionario");
        jPanel1.add(lblApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        lblEstadocivil1.setText("Estado civil");
        jPanel1.add(lblEstadocivil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        LBLSexo1.setText("Sexo");
        jPanel1.add(LBLSexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        lblDireccion1.setText("Direccion");
        jPanel1.add(lblDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        lblTelefono1.setText("Telefono");
        jPanel1.add(lblTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        lblPariente1.setText("id del pariente");
        jPanel1.add(lblPariente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        lblFamiliar1.setText("Numero identificacion del familiar");
        jPanel1.add(lblFamiliar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lblFecha1.setText("Fecha de nacimiento");
        jPanel1.add(lblFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        lblIdentidad1.setText("Identificacion");
        jPanel1.add(lblIdentidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));
        jPanel1.add(txtIdfuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 40, -1));
        jPanel1.add(txtIdenticacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 70, -1));
        jPanel1.add(txtUniversidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 80, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 80, -1));
        jPanel1.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 80, -1));
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 60, -1));
        jPanel1.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 50, -1));
        jPanel1.add(txtDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 60, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 60, -1));
        jPanel1.add(txtFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 80, -1));
        jPanel1.add(txtPariente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 70, -1));
        jPanel1.add(txtFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 100, -1));

        jPFuncionario3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 350));

        JPFuncionario1.addTab("Editar Funcionario", jPFuncionario3);

        getContentPane().add(JPFuncionario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 600, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEstadocivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadocivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadocivilActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void cbxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFuncionarioActionPerformed

    private void txtTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
         if (txtIdentificacion.getText().trim().length() == 0) { //trim es para que no deje espacios
            JOptionPane.showMessageDialog(null, "Digite el numero de identificacion"); // mostramos el mensaje si el campo está vacío
            txtIdentificacion.requestFocus(); //nos deja el cursor sobre el campo que esta vacío
            return;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JPFuncionario1;
    private javax.swing.JPanel JPFuncionario2;
    private javax.swing.JLabel LBLSexo;
    private javax.swing.JLabel LBLSexo1;
    private javax.swing.JTextField TxtFamiliar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Funcionarios> cbxFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPFuncionario;
    private javax.swing.JPanel jPFuncionario3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblEstadocivil;
    private javax.swing.JLabel lblEstadocivil1;
    private javax.swing.JLabel lblFamiliar1;
    private javax.swing.JLabel lblFamiliar2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdentidad;
    private javax.swing.JLabel lblIdentidad1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPariente;
    private javax.swing.JLabel lblPariente1;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JLabel lblUniversidad;
    private javax.swing.JLabel lblUniversidad1;
    private javax.swing.JTable tblFuncionario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadocivil;
    private javax.swing.JTextField txtFamilia;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFecha1;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtIdenticacion;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtIdfuncionario;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPariente;
    private javax.swing.JTextField txtPariente1;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtUniversidad;
    private javax.swing.JTextField txtUniversity;
    // End of variables declaration//GEN-END:variables
}
