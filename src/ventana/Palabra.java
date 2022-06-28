/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;
import javax.swing.JOptionPane;
import metromendeley.GlobalVariables;
import metromendeley.HashTable2;
import metromendeley.KeyWordObject;
import metromendeley.HashTable1;
import metromendeley.infoObject;
/**
 *
 * @author leste
 */
public class Palabra extends javax.swing.JFrame {

    /**
     * Creates new form Palabra
     */
    public Palabra() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        KeywordTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Buscarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Busqueda por Palabra Clave");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        Salir.setBackground(new java.awt.Color(204, 204, 255));
        Salir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Salir.setText("Menu");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 100, 40));

        KeywordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeywordTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(KeywordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, -1));

        jLabel3.setText("Escriba la palabra clave por la que desea buscar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        Buscarbtn.setText("Buscar");
        Buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Buscarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        OutputTextArea.setColumns(20);
        OutputTextArea.setRows(5);
        jScrollPane1.setViewportView(OutputTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 420, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palabrasclaves.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Menu m = new Menu();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

    private void KeywordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeywordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KeywordTextFieldActionPerformed

    private void BuscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarbtnActionPerformed
        HashTable1 mainTable = GlobalVariables.getTable();
        String keywordToSearch = KeywordTextField.getText();
        
        HashTable2 keywordTable = GlobalVariables.getKeywordTable();
        
        KeyWordObject obj = keywordTable.buscarKeyWord(keywordToSearch);
        
        if(obj != null){
            infoObject output = mainTable.buscarObjeto(obj.getTitle());
            OutputTextArea.setText(output.createInfo());
        }else{
            JOptionPane.showMessageDialog(this, "La palabra Clave no esta en la base de datos");
        }
        

    }//GEN-LAST:event_BuscarbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Palabra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Palabra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Palabra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Palabra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Palabra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarbtn;
    private javax.swing.JTextField KeywordTextField;
    private javax.swing.JTextArea OutputTextArea;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
