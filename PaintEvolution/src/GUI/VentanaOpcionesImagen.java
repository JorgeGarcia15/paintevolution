/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author proyectosbeta
 */
/**
 * Clase Ventana donde sale opciones de la imagen.
 * Puede ser dinamica o estatica.
 */
public class VentanaOpcionesImagen extends javax.swing.JDialog {
    // Objetos de clase.
    private VentanaLoginBaseDatos ventanaLoginBaseDatos;
    
    /**
     * Creates new form VentanaOpcionesImagen
     */
    public VentanaOpcionesImagen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializarObjetos();
        setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOpcionesImagen = new javax.swing.ButtonGroup();
        jPanelOpcionesImagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonImagenEstatica = new javax.swing.JRadioButton();
        jRadioButtonImagenDinamica = new javax.swing.JRadioButton();
        jButtonGenerarImagen = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Opciones de imagen");

        jRadioButtonImagenEstatica.setText("Imagen estática");
        jRadioButtonImagenEstatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonImagenEstaticaActionPerformed(evt);
            }
        });

        jRadioButtonImagenDinamica.setText("Imagen dinámica");
        jRadioButtonImagenDinamica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonImagenDinamicaActionPerformed(evt);
            }
        });

        jButtonGenerarImagen.setText("Generar");
        jButtonGenerarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarImagenActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcionesImagenLayout = new javax.swing.GroupLayout(jPanelOpcionesImagen);
        jPanelOpcionesImagen.setLayout(jPanelOpcionesImagenLayout);
        jPanelOpcionesImagenLayout.setHorizontalGroup(
            jPanelOpcionesImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesImagenLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanelOpcionesImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonImagenEstatica)
                    .addGroup(jPanelOpcionesImagenLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButtonGenerarImagen)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar))
                    .addComponent(jRadioButtonImagenDinamica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcionesImagenLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPanelOpcionesImagenLayout.setVerticalGroup(
            jPanelOpcionesImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesImagenLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonImagenEstatica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonImagenDinamica)
                .addGap(18, 18, 18)
                .addGroup(jPanelOpcionesImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGenerarImagen)
                    .addComponent(jButtonCancelar))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelOpcionesImagen);
        jPanelOpcionesImagen.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonImagenEstaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonImagenEstaticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonImagenEstaticaActionPerformed

    private void jRadioButtonImagenDinamicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonImagenDinamicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonImagenDinamicaActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Se cierra la VentanaOpcionesImagen.
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonGenerarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarImagenActionPerformed
        // Objeto String.
        String mensaje = "";
        
        if(!jRadioButtonImagenEstatica.isSelected() && !jRadioButtonImagenDinamica.isSelected()){
            mensaje = "Debe seleccionar una opción!!!";
            JOptionPane.showMessageDialog(null, mensaje, "Error!", JOptionPane.WARNING_MESSAGE);
        }else if(jRadioButtonImagenEstatica.isSelected()){
             mensaje = "Imagen Estatica!!!";
            JOptionPane.showMessageDialog(null, mensaje, "Error!", JOptionPane.WARNING_MESSAGE);
        }else if(jRadioButtonImagenDinamica.isSelected()){
             ventanaLoginBaseDatos = new VentanaLoginBaseDatos(new javax.swing.JFrame(), rootPaneCheckingEnabled);
             ventanaLoginBaseDatos.setLocationRelativeTo(this);
	     ventanaLoginBaseDatos.mostraLoginBaseDatos();
        }
    }//GEN-LAST:event_jButtonGenerarImagenActionPerformed

    /**
     * Donde despliega las opciones de imagen.
     *
     * @since 1.6
     */
    public void mostrarOpcionesImagen(){
        // Hace visbile la VentanaOpcionesImagen.
        this.setVisible(true);
    }
     
    /**
     * Metodo que inicializa los objetos.
     */
    private void inicializarObjetos(){
        /* 
         * Se agrega las dos opciones (jRadioButtonImagenEstatica y jRadioButtonImagenDinamica)
         * al buttonGroupOpcionesImagen.
         */
        buttonGroupOpcionesImagen.add(jRadioButtonImagenEstatica);
        buttonGroupOpcionesImagen.add(jRadioButtonImagenDinamica);
        
        // Colocamos el nuevo tipo de layout que queremos que tenga nuestro JDialog.
        this.setLayout(new FlowLayout());
        
        // Agregamos el jPanelOpcionesImagen con un layout al centro.
        this.add(jPanelOpcionesImagen, BorderLayout.CENTER);
        
        // Hacemos que el JDialog tenga el tamaño de todos sus elementos.
        this.pack();
    }
    
    /**
    * Donde se ejecuta la Ventana OpcionesImagen.
    *
    * @param args La linea de argumentos del comando
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
            java.util.logging.Logger.getLogger(VentanaOpcionesImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOpcionesImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOpcionesImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOpcionesImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaOpcionesImagen dialog = new VentanaOpcionesImagen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupOpcionesImagen;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGenerarImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelOpcionesImagen;
    private javax.swing.JRadioButton jRadioButtonImagenDinamica;
    private javax.swing.JRadioButton jRadioButtonImagenEstatica;
    // End of variables declaration//GEN-END:variables
}
