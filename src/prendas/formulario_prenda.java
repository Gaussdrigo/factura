/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prendas;

import clientetabla.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formulario_prenda extends javax.swing.JFrame {

    conexion con = new conexion();
    Connection cone;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int cod;

    public formulario_prenda() {
        initComponents();
        listar(b.getText());
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
        c = new javax.swing.JTextField();
        p = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        cant = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        e = new javax.swing.JButton();
        NUEVO = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        b = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("STOCK DE PRENDAS");

        jLabel2.setText("CODIGO");

        jLabel3.setText("PRECIO");

        jLabel4.setText("DESCRIPCION");

        jLabel5.setText("CANTIDAD");

        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        e.setText("ELIMINAR");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        NUEVO.setText("NUEVO");
        NUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVOActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "PRECIO", "DESCRIPCION", "CANTIDAD PRENDA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(75, 75, 75)
                            .addComponent(jButton2)
                            .addGap(78, 78, 78)
                            .addComponent(e)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NUEVO))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(206, 206, 206)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(e)
                    .addComponent(NUEVO))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fil = tabla.getSelectedRow();
        if (fil == -1) {
            JOptionPane.showMessageDialog(null, "NO SE SELECCIONÓ NINGUNA PRENDA");
        }
        int co = Integer.parseInt(c.getText());
        String des = d.getText();
        int precio = Integer.parseInt(p.getText().toString());
        int ca = Integer.parseInt(cant.getText().toString());
        String sql = "UPDATE `prenda` SET `cod_prenda`=" + co + ",`precio`=" + precio + ",`descripcion`='" + des + "',`cantidad_prenda`=" + ca + " WHERE cod_prenda=" + cod;
        try {
            cone = con.getConnection();
            st = cone.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "PRENDA MODIFICADA DEL SISTEMA ");
            limpiar_tabla();
            listar(b.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        anhadir();
        limpiar_tabla();
        listar(b.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVOActionPerformed
        c.setText("");
        p.setText("");
        d.setText("");
        cant.setText("");
    }//GEN-LAST:event_NUEVOActionPerformed

    private void bKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyReleased
        limpiar_tabla();
        listar(b.getText());
    }//GEN-LAST:event_bKeyReleased

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fil = tabla.getSelectedRow();
        if (fil == -1) {
            JOptionPane.showMessageDialog(null, "NO SE SELECCIONÓ NINGUNA PRENDA");
        } else {
            cod = Integer.parseInt((String) tabla.getValueAt(fil, 0).toString());
            String precio = tabla.getValueAt(fil, 1).toString();
            String des = tabla.getValueAt(fil, 2).toString();
            String can = tabla.getValueAt(fil, 3).toString();
            c.setText("" + cod);
            d.setText(des);
            p.setText(precio);
            cant.setText(can);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        int fil = tabla.getSelectedRow();
        if (fil == -1) {
            JOptionPane.showMessageDialog(null, "NO SE SELECCIONÓ NINGUNA PRENDA");
        }
        int co = Integer.parseInt(c.getText());
        String sql = "DELETE FROM `prenda` WHERE cod_prenda=" + co;
        try {
            cone = con.getConnection();
            st = cone.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "PRENDA ELIMINADA DEL SISTEMA");
            limpiar_tabla();
            listar(b.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_eActionPerformed

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
            java.util.logging.Logger.getLogger(formulario_prenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario_prenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario_prenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario_prenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario_prenda().setVisible(true);
            }
        });
    }

    void anhadir() {
        if (c.getText().isEmpty() || p.getText().isEmpty() || cant.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR INGRESADOS CON LOS DATOS DE LA PRENDA");
        } else {
            int cod = Integer.parseInt(c.getText());
            int precio = Integer.parseInt(p.getText());
            String des = d.getText();
            int ca = Integer.parseInt(cant.getText());
            try {
                if (cod <= 0 || precio <= 0 || ca <= 0) {
                    JOptionPane.showMessageDialog(null, "CANTIDADES NO VALIDAS");
                    System.out.println("ERROR");
                } else {
                    String sql = "INSERT INTO `prenda`(`cod_prenda`, `precio`, `descripcion`, `cantidad_prenda`) VALUES (" + cod + "," + precio + ",'" + des + "'," + ca + ")";
                    cone = con.getConnection();
                    st = cone.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "NUEVO PRODUCTO AGREGADO");
                    //limpiar_tabla();
                }
            } catch (Exception e) {
            }
        }
    }

    void listar(String buscar) {
        String sql = "";
        if (buscar.equals("")) {
            sql = "select * from prenda";
        } else {
            sql = "SELECT * FROM `prenda` WHERE descripcion LIKE '%" + buscar + "%'";
        }

        try {
            cone = con.getConnection();
            st = cone.createStatement();
            rs = st.executeQuery(sql);
            Object[] prenda = new Object[4];
            modelo = (DefaultTableModel) tabla.getModel();
            while (rs.next()) {
                prenda[0] = rs.getInt("cod_prenda");
                prenda[1] = rs.getInt("precio");
                prenda[2] = rs.getString("descripcion");
                prenda[3] = rs.getInt("cantidad_prenda");
                modelo.addRow(prenda);
            }
            tabla.setModel(modelo);
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
    private javax.swing.JButton NUEVO;
    private javax.swing.JTextField b;
    private javax.swing.JTextField c;
    private javax.swing.JTextField cant;
    private javax.swing.JTextField d;
    private javax.swing.JButton e;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField p;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
