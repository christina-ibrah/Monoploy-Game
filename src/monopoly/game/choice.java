/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
 

/**
 *
 * @author user
 */
public class choice extends javax.swing.JFrame {

    /**
     * Creates new form choice
     */
    JFrame frame;
    public choice(JFrame f) {
        initComponents();
        frame=f;
        validate();
    }

    private choice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("choose players");

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(350, 300));

        btn_2.setBackground(new java.awt.Color(255, 204, 102));
        btn_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(255, 204, 102));
        btn_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_4.setBackground(new java.awt.Color(255, 204, 102));
        btn_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 102));
        jLabel1.setText("Enter Number of Players :");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btn_2)
                        .addGap(29, 29, 29)
                        .addComponent(btn_3)
                        .addGap(39, 39, 39)
                        .addComponent(btn_4)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_2)
                    .addComponent(btn_3)
                    .addComponent(btn_4))
                .addContainerGap(227, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed

      
        JLabel label1=new JLabel("player 1 :");
        label1.setBounds(80, 100, 50, 50);
        JLabel label2=new JLabel("player 2 :");
        label2.setBounds(80, 150, 50, 50);
        JTextField tf_1=new JTextField("PLAYER 1");
        JTextField tf_2=new JTextField("PLAYER 2");
        tf_1.setBounds(150, 110, 150, 35);
        tf_2.setBounds(150, 160, 150, 35);
        JButton btn_ok=new JButton("OK");
        btn_ok.setBounds(310, 240, 50, 40);
        btn_ok.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

               board_test bt;
                try {
                    bt = new board_test(2,tf_1.getText(),tf_2.getText(),"","");
                     bt.setVisible(true);
                     setVisible(false);
                     frame.setVisible(false);
               bt.setExtendedState(JFrame.MAXIMIZED_BOTH);
               
                } catch (IOException ex) {
                    Logger.getLogger(choice.class.getName()).log(Level.SEVERE, null, ex);
                }
              
            
            }
           public String string;

            /**
             * Get the value of string
             *
             * @return the value of string
             */
           public String getString() {
                return string;
            }

            /**
             * Set the value of string
             *
             * @param string new value of string
             */
            public void setString(String string) {
                this.string = string;
            }

        });
        panel.add(label1);
        panel.add(label2);
        panel.add(tf_1);
        panel. add(tf_2);
        panel.add(btn_ok);
        btn_ok.setVisible(true);
        label1.setVisible(true);
        label2.setVisible(true);
        tf_1.setVisible(true);
        tf_2.setVisible(true);
        btn_2.enable(false);
        btn_3.enable(false);
        btn_4.enable(false);
       
        repaint();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        JLabel label1=new JLabel("player 1 :");
        label1.setBounds(80, 100, 50, 50);
        JLabel label2=new JLabel("player 2 :");
        label2.setBounds(80, 150, 50, 50);
        JLabel label3=new JLabel("player 3 :");
        label3.setBounds(80, 200, 50, 50);
        JTextField tf_1=new JTextField("PLAYER 1");
        
        JTextField tf_2=new JTextField("PLAYER 2");
        JTextField tf_3=new JTextField("PLAYER 3");
         tf_1.setBounds(150, 110, 150, 35);
         tf_2.setBounds(150, 160, 150, 35);
         tf_3.setBounds(150, 210, 150, 35);
         JButton btn_ok=new JButton("OK");
         btn_ok.setBounds(310, 240, 50, 40);
          btn_ok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               //close start and choic
                //show game board frame
                
                board_test bt;
                try {
                    bt = new board_test(3,tf_1.getText(),tf_2.getText(),tf_3.getText(),"");
                    bt.setVisible(true);
                    setVisible(false);
                    frame.setVisible(false);
                 bt.setExtendedState(JFrame.MAXIMIZED_BOTH);
                } catch (IOException ex) {
                    Logger.getLogger(choice.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
            }
        });
        panel.add(label1);
        panel.add(label2);
       panel. add(label3);
        panel.add(tf_1);
        panel.add(tf_2);
        panel.add(tf_3);
        panel.add(btn_ok);
        btn_ok.setVisible(true);
        label1.setVisible(true);
        label2.setVisible(true);
        label3.setVisible(true);
        tf_1.setVisible(true);
        tf_2.setVisible(true);
         tf_3.setVisible(true);
          btn_2.enable(false);
        btn_3.enable(false);
        btn_4.enable(false);
         repaint();
        
       
         
    }//GEN-LAST:event_btn_3ActionPerformed

    public String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        JLabel label1=new JLabel("player 1 :");
        label1.setBounds(80, 100, 50, 50);
        JLabel label2=new JLabel("player 2 :");
        label2.setBounds(80, 150, 50, 50);
        JLabel label3=new JLabel("player 3 :");
        label3.setBounds(80, 200, 50, 50);
        JLabel label4=new JLabel("player 4 :");
        label4.setBounds(80, 250, 50, 50);
        JTextField tf_1=new JTextField("PLAYER 1");
        JTextField tf_2=new JTextField("PLAYER 2");
        JTextField tf_3=new JTextField("PLAYER 3");
        JTextField tf_4=new JTextField("PLAYER 4");
         tf_1.setBounds(150, 110, 150, 35);
         tf_2.setBounds(150, 160, 150, 35);
         tf_3.setBounds(150, 210, 150, 35);
         tf_4.setBounds(150, 260, 150, 35);
         JButton btn_ok=new JButton("OK");
         btn_ok.setBounds(310, 260, 50, 40);
         btn_ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                board_test bt;
                try {
                    bt = new board_test(4,tf_1.getText(),tf_2.getText(),tf_3.getText(),tf_4.getText());
                    bt.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                   bt.setVisible(true);
                   frame.setVisible(false);
                   setVisible(false);
                   
                } catch (IOException ex) {
                    Logger.getLogger(choice.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
            }
        });
       panel. add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(tf_1);
        panel.add(tf_2);
        panel.add(tf_3);
       panel. add(tf_4);
       panel.add(btn_ok);
        btn_ok.setVisible(true);
        label1.setVisible(true);
        label2.setVisible(true);
        label3.setVisible(true);
        label4.setVisible(true);
        tf_4.setVisible(true);
        tf_1.setVisible(true);
        tf_2.setVisible(true);
         tf_3.setVisible(true);
         btn_2.enable(false);
        btn_3.enable(false);
        btn_4.enable(false);

        repaint();
        
    }//GEN-LAST:event_btn_4ActionPerformed

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
            java.util.logging.Logger.getLogger(choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choice().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
