/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.game;

import javax.swing.JFrame;
import sun.swing.SwingAccessor;

/**
 *
 * @author user
 */
public class start extends javax.swing.JFrame {

    /**
     * Creates new form start
     */
    public start() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        btn_howtoPlay = new javax.swing.JButton();
        btn_newgame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/Untitled0.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 0, 778, 230);

        btn_howtoPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/how to play0.png"))); // NOI18N
        btn_howtoPlay.setPreferredSize(new java.awt.Dimension(420, 195));
        btn_howtoPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_howtoPlayActionPerformed(evt);
            }
        });
        jPanel1.add(btn_howtoPlay);
        btn_howtoPlay.setBounds(370, 350, 339, 72);

        btn_newgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/game/pics/new game0.png"))); // NOI18N
        btn_newgame.setName("btn_newgame"); // NOI18N
        btn_newgame.setPreferredSize(new java.awt.Dimension(420, 195));
        btn_newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newgameActionPerformed(evt);
            }
        });
        jPanel1.add(btn_newgame);
        btn_newgame.setBounds(370, 260, 339, 75);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
choice c=new choice(this);
    private void btn_newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newgameActionPerformed
        
        c.setVisible(true);
       
        
    }//GEN-LAST:event_btn_newgameActionPerformed

    private void btn_howtoPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_howtoPlayActionPerformed

        howTOplay h=new howTOplay();
        h.setVisible(true);
        
    }//GEN-LAST:event_btn_howtoPlayActionPerformed

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
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_howtoPlay;
    private javax.swing.JButton btn_newgame;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
