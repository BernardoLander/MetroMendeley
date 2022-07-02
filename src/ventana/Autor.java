/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import javax.swing.JOptionPane;
import metromendeley.Functions;
import metromendeley.GlobalVariables;
import metromendeley.HashTable1;
import metromendeley.HashTable2;
import metromendeley.ListObject;
import metromendeley.NodeObject;
import metromendeley.infoObject;
import metromendeley.ListKeywordOBJ;
import metromendeley.NodeKeywordOBJ;

/**
 *
 * @author leste
 */
public final class Autor extends javax.swing.JFrame {

    /**
     * Creates new form Autor
     */
    public Autor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        AllAuthors();
        
    }
    
    public void AllAuthors() {
        ListObject lista = GlobalVariables.getObjetos();
        NodeObject pointer = lista.getHead();
        int index = 0;
        while (pointer != null) {
            infoObject summary = pointer.getElement();
            String[] autores = summary.getAutores();
            for (int i = 0; i < autores.length; i++) {        
                Autores.insertItemAt(autores[i], index);
                index++;
            }
            pointer = pointer.getNext();
        }
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
        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        InvestigacionesComboBox = new javax.swing.JComboBox<>();
        selccionarInvBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputTextArea = new javax.swing.JTextArea();
        jlabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        crearInvestigacionesBtn = new javax.swing.JButton();
        Autores = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Busqueda por Autor ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        Salir.setBackground(new java.awt.Color(153, 255, 153));
        Salir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Salir.setText("Menu");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 100, 40));

        InvestigacionesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvestigacionesComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(InvestigacionesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 290, 30));

        selccionarInvBtn.setBackground(new java.awt.Color(204, 204, 255));
        selccionarInvBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        selccionarInvBtn.setText("Seleccionar Investigacion");
        selccionarInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selccionarInvBtnActionPerformed(evt);
            }
        });
        jPanel1.add(selccionarInvBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 220, 40));

        OutputTextArea.setColumns(20);
        OutputTextArea.setRows(5);
        jScrollPane1.setViewportView(OutputTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 470, 150));

        jlabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlabel5.setText("Investigaciones de este Autor:");
        jPanel1.add(jlabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Autor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 50, -1));

        crearInvestigacionesBtn.setBackground(new java.awt.Color(204, 255, 204));
        crearInvestigacionesBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        crearInvestigacionesBtn.setText("Buscar Investigaciones de Autor");
        crearInvestigacionesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearInvestigacionesBtnActionPerformed(evt);
            }
        });
        jPanel1.add(crearInvestigacionesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        jPanel1.add(Autores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Menu m = new Menu();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

    private void InvestigacionesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvestigacionesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvestigacionesComboBoxActionPerformed

    private void selccionarInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selccionarInvBtnActionPerformed
        HashTable1 mainTable = GlobalVariables.getTable();
        
        if (InvestigacionesComboBox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "No agrego ningun elemento.");
        }
        else{
            infoObject output = mainTable.buscarObjeto((String) InvestigacionesComboBox.getSelectedItem());
            OutputTextArea.setText(output.createInfo());
        }
    }//GEN-LAST:event_selccionarInvBtnActionPerformed

    private void crearInvestigacionesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearInvestigacionesBtnActionPerformed
        
        String keywordToSearch = (String) Autores.getSelectedItem();
        System.out.println(keywordToSearch);
        
        int itemCount = InvestigacionesComboBox.getItemCount();

        for(int i = 0; i < itemCount; i++){
            InvestigacionesComboBox.removeItemAt(0);
        }
        
        HashTable2 authorTable = GlobalVariables.getAuthorTable();
        
        authorTextList= authorTable.buscarAutor(keywordToSearch);
        
        if(authorTextList != null){
            NodeKeywordOBJ pointer = authorTextList.getHead();
            while(pointer != null){
                InvestigacionesComboBox.addItem(pointer.getElement().getTitle());
                pointer = pointer.getNext();
            }
        }else{
            JOptionPane.showMessageDialog(this, "El autor no esta en la base de datos.");
        }
        
    }//GEN-LAST:event_crearInvestigacionesBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autor().setVisible(true);
            }
        });
    }
    private ListKeywordOBJ authorTextList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Autores;
    private javax.swing.JComboBox<String> InvestigacionesComboBox;
    private javax.swing.JTextArea OutputTextArea;
    private javax.swing.JButton Salir;
    private javax.swing.JButton crearInvestigacionesBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel5;
    private javax.swing.JButton selccionarInvBtn;
    // End of variables declaration//GEN-END:variables
}
