/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trekmosaic;

/**
 *
 * @author ADMIN
 */
public class profile extends javax.swing.JFrame {

    /**
     * Creates new form profile
     */
    public profile() {
        initComponents();
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
        textArea1 = new java.awt.TextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        textArea2 = new java.awt.TextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        usernametext = new javax.swing.JLabel();
        myprofiletext = new javax.swing.JLabel();
        agetext = new javax.swing.JLabel();
        blankpfp = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        verifybutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(null);

        textArea1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(textArea1);
        textArea1.setBounds(120, 320, 500, 80);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setText("location : ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 180, 90, 20);

        jButton4.setText("home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1325, 682, 93, 23);

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("HOME");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(590, 580, 110, 40);
        jPanel1.add(textArea2);
        textArea2.setBounds(120, 440, 500, 80);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Past Treks : ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 440, 74, 20);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("facebook : ");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(100, 640, 80, 20);

        usernametext.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        usernametext.setText("username : ");
        jPanel1.add(usernametext);
        usernametext.setBounds(150, 120, 101, 25);

        myprofiletext.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        myprofiletext.setText("MY PROFILE");
        jPanel1.add(myprofiletext);
        myprofiletext.setBounds(20, 30, 120, 50);

        agetext.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        agetext.setText("age : ");
        jPanel1.add(agetext);
        agetext.setBounds(150, 150, 52, 25);

        blankpfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/EMPTY_PFP.png"))); // NOI18N
        jPanel1.add(blankpfp);
        blankpfp.setBounds(20, 100, 130, 130);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("instagram : ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(100, 600, 80, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setText("twitter : ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(100, 620, 70, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("About me : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 320, 72, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel10.setText("Connect with me : ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 570, 135, 22);

        verifybutton.setText("VERIFY PROFILE");
        verifybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifybuttonActionPerformed(evt);
            }
        });
        jPanel1.add(verifybutton);
        verifybutton.setBounds(600, 110, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/BGpict.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1080, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1230, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        profile.this.dispose();
        dashboard_v2 dashboard = new dashboard_v2();
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void verifybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifybuttonActionPerformed
        // TODO add your handling code here:
        profile.this.dispose();
        Verification verify = new Verification();
        verify.setLocationRelativeTo(null);
        verify.setVisible(true);
    }//GEN-LAST:event_verifybuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agetext;
    private javax.swing.JLabel blankpfp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel myprofiletext;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    private javax.swing.JLabel usernametext;
    private javax.swing.JButton verifybutton;
    // End of variables declaration//GEN-END:variables
}
