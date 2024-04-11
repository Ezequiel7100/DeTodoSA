/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detodosa.vista;

import detodosa.entidades.Producto;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MegaTecnologia
 */
public class ConsultaPrecio extends javax.swing.JInternalFrame {
private TreeSet<Producto> productos;
    
    public ConsultaPrecio(TreeSet<Producto> productos) {
        initComponents();
        this.productos=productos;
        armarTabla();
    }
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
        return false;
        }
    };
    
    public void armarTabla(){
        modelo.addColumn("Precio");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Codigo");
        modelo.addColumn("Categoria");
        modelo.addColumn("Stock");
        
        jTablePrecio.setModel(modelo);
    }
    
    public void removerFilas(){
        int filas = modelo.getRowCount()-1;
        for (int i = filas; i  >=0; i--) {
            modelo.removeRow(i);
        }
    }
    
    public void bucarPorPrecio(){
        double precioFinal;
        double precioInicio;
        
        try{
        precioInicio=Double.parseDouble(jtInicio.getText());
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"INGRESE UN NUMERO VALIDO");
            jtInicio.setText("");
            jtInicio.requestFocus();
            return;
        }
                
        try{  
            precioFinal=Double.parseDouble(jtFinal.getText());
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"INGRESE UN NUMERO VALIDO");
            jtFinal.setText("");
            jtFinal.requestFocus();
            return;
        }
        for (Producto prod: productos) {
            if (prod.getPrecio()>= precioInicio && prod.getPrecio()<= precioFinal) {
                modelo.addRow(new Object[]{
                    prod.getPrecio(),
                    prod.getDescripcion(),
                    prod.getCodigo(),
                    prod.getCategoria(),
                    prod.getStock()});
            }
        }

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtInicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtFinal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrecio = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Lista Por Precio");

        jLabel3.setText("Entre $:");

        jtFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFinalKeyReleased(evt);
            }
        });

        jLabel4.setText("y");

        jTablePrecio.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablePrecio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFinalKeyReleased
        removerFilas();
    if(!jtFinal.getText().equals("") || !jtInicio.getText().equals("")){
        bucarPorPrecio();
    }//GEN-LAST:event_jtFinalKeyReleased
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePrecio;
    private javax.swing.JTextField jtFinal;
    private javax.swing.JTextField jtInicio;
    // End of variables declaration//GEN-END:variables
}
