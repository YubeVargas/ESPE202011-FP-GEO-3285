/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provincias.y.capitales;

/**
 *
 * @author User
 */
public class esmeraldas extends javax.swing.JFrame {

    /**
     * Creates new form esmeraldas
     */
    public esmeraldas() {
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

        informacionesmeraldas = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        bandera_esmeraldas = new javax.swing.JLabel();
        esc_esmeraldas = new javax.swing.JLabel();
        inf_esmeraldas = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bnd_esme = new javax.swing.JLabel();
        esc_esme = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        informacionesmeraldas.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        informacionesmeraldas.setText("ESMERALDAS INFO");

        btn_regresar.setText("BACK");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        bandera_esmeraldas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/provincias/y/capitales/Bandera Esmeraldas.png"))); // NOI18N

        esc_esmeraldas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/provincias/y/capitales/ESCUDO ESMERALDAS.png"))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("-Fundación: 20 de noviembre de 1847 (173 años).\n\n-Capital: Esmeraldas.\n\n-Cantones:  \n        1) Esmeraldas\n        2) Atacames\n        3) Eloy Alfaro\n        4) Muisne\n        5) Quinindé\n        6) Rioverde\n        7) San Lorenzo\n\n-Limites: \n        a) Norte: Colombia\n        b) Sur: Santo Domingo de los Tsáchilas y Manabí\n        c) Este: Carchi e Imbabura\n        d) Oeste: Océano Pacifico\n\n-Habitantes: 643.654 personas\n\n-Hidrografía: \n        • Río Santiago: Nace en la cordillera occidental en los páramos de Piñán. Sus afluentes son el Uimbí, el Bogotá, el Tululbí y el Palabí.\n        • Río Santiago y Cayapas riega toda la zona norte de la provincia.\n        • Río Esmeraldas: El sistema hidrográfico del río Esmeraldas está formado por el río Blanco, el Guayllabamba, el Toachi y el Quinindé y abarca 20.000 km². \n          Su nacimiento se encuentra en los deshielos de la cordillera y el río Guayllabamba es el afluente más largo que recoge las aguas del norte del callejón interandino. \n          Desde la confluencia del Esmeralda y el Guayllabamba en Quinindé (Rosa Zárate) hasta la desembocadura es navegable. La capital, Esmeraldas, se encuentra a 3 km de la desembocadura.\n        • Río Blanco: Nace en el Pichincha, y sus afluentes son el Toachi, Caoní y el Quinindé. También es navegable.\n        • Otros ríos, el Atacames, el San Francisco, el Bunche y el Muisne. \n        • Otro de los ríos principales es el Río Verde, recorriendo desde la Parroquia Chumundé hasta su desembocuadra en el Cabecera cantonal Río verde.\n\n-Economía:\nLas actividades principales de la provincia son el comercio, la ganadería, la industria y la agricultura. \nGran parte de su economía depende de la exportación de camarón y banano. Además de este, se produce cacao, tabaco y café. Son importantes la pesca, la industria petroquímica y el turismo.\n\n-Cultura: \nLa provincia guarda los secretos de la historia del más grande pueblo negro que se complementa con el ritmo de la marimba, sus expresiones culturales y su deliciosa gastronomía, con la sazón esmeraldeña, que muchos la califican como afrodisiaca.  \nEntre las delicias a disfrutar en esta temporada te recomendamos: el caldo de mariscos, ´ensumacao´, tres sin sacar, encocado y una diversidad de platillos gastronómicos preparados con verde y frutos frescos del mar.");
        inf_esmeraldas.setViewportView(jTextArea1);

        bnd_esme.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        bnd_esme.setText("FLAG");

        esc_esme.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        esc_esme.setText("SHIELD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(162, 162, 162)
                                        .addComponent(bandera_esmeraldas))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(bnd_esme)
                                        .addGap(25, 25, 25)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(esc_esme))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(esc_esmeraldas))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(inf_esmeraldas, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(informacionesmeraldas)))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(informacionesmeraldas)
                .addGap(18, 18, 18)
                .addComponent(inf_esmeraldas, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnd_esme)
                    .addComponent(esc_esme))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bandera_esmeraldas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(btn_regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(esc_esmeraldas)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
        paginaprincipal frame2 = new paginaprincipal(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);  //para que la ventana anterior se oculte
    }//GEN-LAST:event_btn_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(esmeraldas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(esmeraldas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(esmeraldas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(esmeraldas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new esmeraldas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bandera_esmeraldas;
    private javax.swing.JLabel bnd_esme;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel esc_esme;
    private javax.swing.JLabel esc_esmeraldas;
    private javax.swing.JScrollPane inf_esmeraldas;
    private javax.swing.JLabel informacionesmeraldas;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
