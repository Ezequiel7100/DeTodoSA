
package detodosa.vista;

import detodosa.entidades.Categoria;
import detodosa.entidades.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

public class ConsultaRubro extends javax.swing.JInternalFrame {
private TreeSet<Producto> productos;
    
    public ConsultaRubro(TreeSet<Producto> productos) {
        initComponents();
        this.productos = productos;
        llenarCombo();
        armarTabla();
        jcBuscarRubro.addActionListener(new ActionListener() {//actionListener sirve para usar en comboBox 
            @Override
            public void actionPerformed(ActionEvent e) {
                removerFilas();
                buscarPorRubro();
            }
        });
    
    }

    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
        return false;
        }
    };
    
    public void armarTabla(){
        modelo.addColumn("Categoria");
        modelo.addColumn("Precio");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Codigo");
        modelo.addColumn("Stock");
        
        jTableRubro.setModel(modelo);
    }
    
    public void removerFilas(){
        int filas = modelo.getRowCount()-1;
        for (int i = filas; i  >=0; i--) {
            modelo.removeRow(i);
        }
    }
    
    Categoria limpieza=new Categoria(1,"Limpieza");
    Categoria comestible=new Categoria(2,"Comestible");
    Categoria perfumeria=new Categoria(3,"Perfumeria");
    private void llenarCombo(){
    
        
        jcBuscarRubro.addItem(limpieza);
        jcBuscarRubro.addItem(comestible);
        jcBuscarRubro.addItem(perfumeria);
        
    }
    
    public void buscarPorRubro(){
        
        for (Producto prod : productos) {
            Categoria categoriaSeleccionada = (Categoria) jcBuscarRubro.getSelectedItem();
            if (prod.getCategoria().equals(categoriaSeleccionada)) {
                 modelo.addRow(new Object[]{
                     prod.getCategoria(),
                     prod.getPrecio(),
                     prod.getDescripcion(),
                     prod.getCodigo(),
                     prod.getStock()});
            }
        }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jcBuscarRubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRubro = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Lista Por Rubro");

        jcBuscarRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBuscarRubroActionPerformed(evt);
            }
        });

        jTableRubro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableRubro);

        jLabel2.setText("Elija Rubro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jcBuscarRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcBuscarRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcBuscarRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBuscarRubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcBuscarRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRubro;
    private javax.swing.JComboBox<Categoria> jcBuscarRubro;
    // End of variables declaration//GEN-END:variables
}
