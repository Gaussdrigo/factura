/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientetabla;

import conectar.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class formulario_cliente extends javax.swing.JFrame {

    conexion con = new conexion();
    Connection cone;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int ruc;

    public formulario_cliente() {
        initComponents();
        consultar(b.getText());
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
        agregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        r = new java.awt.TextField();
        n = new java.awt.TextField();
        b = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DATOS DEL CLIENTE");
        jLabel1.setAutoscrolls(true);

        jLabel2.setText("RUC");

        jLabel3.setText("NOMBRE");

        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        jButton2.setText("MODIFICAR ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ELIMINAR ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("NUEVO ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUC", "NOMBRE CLIENTE"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });

        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bKeyReleased(evt);
            }
        });

        jLabel4.setText("BUSCAR CLIENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregar)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jButton2)
                                .addGap(107, 107, 107)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(r, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(n, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        agregar();
        limpiar_tabla();
        consultar(b.getText());
    }//GEN-LAST:event_agregarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fil = tabla.getSelectedRow();
        if (fil == -1) {
            JOptionPane.showMessageDialog(null, "NO SE SELECCIONÓ NINGUNA FILA");
        }
        int ru = Integer.parseInt(r.getText());
        String sql = "DELETE FROM `cliente` WHERE ruc_cliente=" + ru;
        try {
            cone = con.getConnection();
            st = cone.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "CLIENTE ELIMINADO DEL SISTEMA");
            limpiar_tabla();
            consultar(b.getText());
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        r.setText("");
        n.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fil = tabla.getSelectedRow();
        if (fil == -1) {
            JOptionPane.showMessageDialog(null, "NO SE SELECCIONÓ NINGUNA FILA");
        } else {
            ruc = Integer.parseInt((String) tabla.getValueAt(fil, 0).toString());
            String nombre = (String) tabla.getValueAt(fil, 1);

            r.setText("" + ruc);
            n.setText(nombre);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fil = tabla.getSelectedRow();
        if (fil == -1) {
            JOptionPane.showMessageDialog(null, "NO SE SELECCIONÓ NINGUNA FILA");
        }
        int ru = Integer.parseInt(r.getText());
        String nom = n.getText();
        String sql = "UPDATE `cliente` SET `ruc_cliente`=" + ru + ",`nombre_cliente`='" + nom + "' WHERE ruc_cliente=" + ruc;
        try {
            cone = con.getConnection();
            st = cone.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "CLIENTE MODIFICADO DEL SISTEMA ");
            limpiar_tabla();
            consultar(b.getText());
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyReleased
        limpiar_tabla();
        consultar(b.getText());
    }//GEN-LAST:event_bKeyReleased

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formulario_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario_cliente().setVisible(true);
            }
        });
    }

    void consultar(String buscar) {
        String sql = "";
        if (buscar.equals("")) {
            sql = "select * from cliente";
        } else {
            sql = "SELECT * FROM `cliente` WHERE nombre_cliente LIKE '%" + buscar + "%'";
        }

        try {
            cone = con.getConnection();
            st = cone.createStatement();
            rs = st.executeQuery(sql);
            Object[] cliente = new Object[2];
            modelo = (DefaultTableModel) tabla.getModel();
            while (rs.next()) {
                cliente[0] = rs.getInt("ruc_cliente");
                cliente[1] = rs.getString("nombre_cliente");
                modelo.addRow(cliente);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {

        }
    }

    void agregar() {
        System.out.println("VER");
        int ruc = Integer.parseInt(r.getText());
        String nombre = n.getText();
        try {
            if ((ruc <= 0) || (nombre.equals(""))) {
                JOptionPane.showMessageDialog(null, "FALTAN INGRESAR DATOS");
            } else {
                String sql = "insert into cliente(ruc_cliente,nombre_cliente)values(" + ruc + ",'" + nombre + "')";
                cone = con.getConnection();
                st = cone.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "NUEVO CLIENTE AGREGADO");
                limpiar_tabla();
            }
        } catch (Exception e) {
        }
    }

    void limpiar_tabla() {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField b;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField n;
    private java.awt.TextField r;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
