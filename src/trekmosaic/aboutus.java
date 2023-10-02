/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trekmosaic;

/**
 *
 * @author ADMIN
 */
public class aboutus extends javax.swing.JFrame {

    /**
     * Creates new form aboutus
     */
    public aboutus() {
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

        jButton2 = new javax.swing.JButton();
        about_us = new javax.swing.JTextArea();
        home = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        about_us.setBackground(new java.awt.Color(153, 153, 153));
        about_us.setColumns(20);
        about_us.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        about_us.setForeground(new java.awt.Color(255, 255, 255));
        about_us.setLineWrap(true);
        about_us.setRows(5);
        about_us.setText("About Us \n\n At Trek Mosaic, we strive to create unforgettable memories for our participants. We carefully curate each trek, tour, and camping experience to showcase the hidden treasures of Maharashtra, from the majestic forts perched atop rugged mountains to the serene valleys and pristine lakes that adorn the landscape. We believe in the transformative power of nature and adventure, and our aim is to provide you with immersive experiences that leave a lasting impact.\n\nThank you for choosing Trek Mosaic. Together, let’s create memories, conquer new heights, and celebrate the beauty of Maharashtra’s unexplored wonders.\n\n\nCreated by : - \nAkshata Khandekar\nMohini Deore\nYash Baviskar ");
        about_us.setWrapStyleWord(true);
        about_us.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        home.setBackground(new java.awt.Color(102, 102, 102));
        home.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(about_us, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(about_us, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        aboutus.this.dispose();
        dashboard_v2 db = new dashboard_v2();
        db.setLocationRelativeTo(null);
        db.setVisible(true); 
    }//GEN-LAST:event_homeActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea about_us;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
