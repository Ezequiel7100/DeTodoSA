
package detodosa.vista;

import detodosa.entidades.Producto;
import java.util.TreeSet;



public class Menu extends javax.swing.JFrame {
private TreeSet<Producto> productos=new TreeSet<>();
    
    public Menu() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmRubro = new javax.swing.JMenuItem();
        jmNombre = new javax.swing.JMenuItem();
        jmPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");

        jmiProductos.setText("Productos");
        jmiProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("consultas");

        jmRubro.setText("Por rubro");
        jmRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRubroActionPerformed(evt);
            }
        });
        jMenu2.add(jmRubro);

        jmNombre.setText("Por nombre");
        jmNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jmNombre);

        jmPrecio.setText("Por precio");
        jmPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jmPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductosActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        GestionProducto gp=new GestionProducto(productos);
        gp.setVisible(true);
        escritorio.add(gp);
        escritorio.moveToFront(gp);
    }//GEN-LAST:event_jmiProductosActionPerformed

    private void jmNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNombreActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaNombre nombre = new ConsultaNombre(productos);
        nombre.setVisible(true);
        escritorio.add(nombre);
        
    }//GEN-LAST:event_jmNombreActionPerformed

    private void jmPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrecioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaPrecio precio = new ConsultaPrecio(productos);
        precio.setVisible(true);
        escritorio.add(precio);
    }//GEN-LAST:event_jmPrecioActionPerformed

    private void jmRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRubroActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaRubro precio = new ConsultaRubro(productos);
        precio.setVisible(true);
        escritorio.add(precio);
    }//GEN-LAST:event_jmRubroActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmNombre;
    private javax.swing.JMenuItem jmPrecio;
    private javax.swing.JMenuItem jmRubro;
    private javax.swing.JMenuItem jmiProductos;
    // End of variables declaration//GEN-END:variables
}
