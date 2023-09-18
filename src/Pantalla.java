
import java.util.LinkedHashSet;
import javax.swing.ImageIcon;

public class Pantalla extends javax.swing.JFrame {

    SeleccionPerks perk;
    BaseDeDatos perksLista;

    public Pantalla() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/perks.png")).getImage());
        perksLista = new BaseDeDatos();
        perk = new SeleccionPerks(perksLista.cargaDatos());
        //tempLista = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaBorrar = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaGuardar = new javax.swing.JTextArea();
        jlbMostrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PERKS ALEATORIAS");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(156, 147, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel1.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel2.setBackground(new java.awt.Color(156, 147, 215));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setMaximumSize(new java.awt.Dimension(77, 25));
        jPanel2.setMinimumSize(new java.awt.Dimension(56, 25));
        jPanel2.setPreferredSize(new java.awt.Dimension(77, 200));
        jPanel2.setLayout(new java.awt.GridLayout(3, 0, 0, 5));

        jButton1.setBackground(new java.awt.Color(196, 189, 241));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("Aleatorio");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 189, 241), 1, true));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setBackground(new java.awt.Color(196, 189, 241));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 189, 241), 1, true));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setBackground(new java.awt.Color(196, 189, 241));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setText("Borrar");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 189, 241), 1, true));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(156, 147, 215));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 281));
        jPanel3.setPreferredSize(new java.awt.Dimension(125, 281));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(156, 147, 215));
        jPanel5.setMinimumSize(new java.awt.Dimension(43, 25));
        jPanel5.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(185, 181, 217));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("METALMUTT");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 8)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(185, 181, 217));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VERSION 0.5");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(jLabel2);

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(156, 147, 215));
        jPanel4.setLayout(new java.awt.BorderLayout(5, 5));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(242, 98));

        jtaBorrar.setBackground(new java.awt.Color(221, 215, 255));
        jtaBorrar.setColumns(1);
        jtaBorrar.setFont(new java.awt.Font("Feather Bold", 3, 14)); // NOI18N
        jtaBorrar.setForeground(new java.awt.Color(103, 103, 103));
        jtaBorrar.setLineWrap(true);
        jtaBorrar.setRows(1);
        jtaBorrar.setBorder(null);
        jtaBorrar.setMinimumSize(new java.awt.Dimension(101, 23));
        jtaBorrar.setName(""); // NOI18N
        jtaBorrar.setSelectionColor(new java.awt.Color(141, 132, 197));
        jScrollPane1.setViewportView(jtaBorrar);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.PAGE_END);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(242, 98));

        jtaGuardar.setBackground(new java.awt.Color(221, 215, 255));
        jtaGuardar.setColumns(1);
        jtaGuardar.setFont(new java.awt.Font("Feather Bold", 3, 14)); // NOI18N
        jtaGuardar.setForeground(new java.awt.Color(103, 103, 103));
        jtaGuardar.setLineWrap(true);
        jtaGuardar.setRows(1);
        jtaGuardar.setBorder(null);
        jtaGuardar.setMaximumSize(new java.awt.Dimension(101, 23));
        jtaGuardar.setMinimumSize(new java.awt.Dimension(101, 23));
        jtaGuardar.setName(""); // NOI18N
        jtaGuardar.setSelectionColor(new java.awt.Color(141, 132, 197));
        jScrollPane2.setViewportView(jtaGuardar);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jlbMostrar.setBackground(new java.awt.Color(221, 215, 255));
        jlbMostrar.setFont(new java.awt.Font("Feather Bold", 0, 14)); // NOI18N
        jlbMostrar.setForeground(new java.awt.Color(103, 103, 103));
        jlbMostrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbMostrar.setAlignmentX(0.5F);
        jlbMostrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jlbMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlbMostrar.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jlbMostrar.setMinimumSize(new java.awt.Dimension(240, 90));
        jlbMostrar.setName(""); // NOI18N
        jlbMostrar.setOpaque(true);
        jlbMostrar.setPreferredSize(new java.awt.Dimension(240, 95));
        jPanel4.add(jlbMostrar, java.awt.BorderLayout.PAGE_START);
        jlbMostrar.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (perk.getPerks().isEmpty()) {
            jlbMostrar.setText("No hay Perks registradas.");
            return;
        }
        if (perk.getPerks().size() < 4) {
            jlbMostrar.setText("No hay suficientes perks.");
            return;
        }
        
        jlbMostrar.setText("");
        LinkedHashSet<String> set = new LinkedHashSet<>();//un list que no admite duplicados y mantiene el orden de inserción
        while(set.size()<4){
            set.add(perk.seleccion());
        }
        
        set.forEach((s)->jlbMostrar.setText(jlbMostrar.getText()+ "  " + s));
        
        //este for es equivalente a la linea de arriba
        /*for (String pasiva : set) {
            jlbMostrar.setText(jlbMostrar.getText()+ "  " + pasiva);
        }*/
        
        
        /*int contador = 4;
        String lineas;
        String lineaPerk = "";
        while (contador > 0) {
            lineas = perk.seleccion();
            System.out.println("LINEAS: "+lineas);
            if (!tempLista.contains(lineas)) {
                tempLista.add(lineas);
                contador -= 1;
            }
        }
        for (String pasiva : tempLista) {
            System.out.println("PASIVA: "+pasiva);
            lineaPerk += "  " + pasiva;
        }
        jlbMostrar.setText(lineaPerk);
        tempLista.clear();*/

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jtaGuardar.getText().isBlank()) {
            return;
        }
        if (perk.getPerks().contains(perksLista.capitalize(jtaGuardar.getText()))) {
            jlbMostrar.setText("La Perk ya se encuentra registrada.");
            jtaGuardar.setText("");
        } else {
            perk.getPerks().add(perksLista.capitalize(jtaGuardar.getText()));
            perksLista.agregarPerk(perksLista.capitalize(jtaGuardar.getText()));
            jtaGuardar.setText("");
            jlbMostrar.setText("Se ha guardado correctamente.");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jtaBorrar.getText().isBlank()) {
            return;
        }
        if (perk.getPerks().contains(perksLista.capitalize(jtaBorrar.getText()))) {
            perk.getPerks().remove(perksLista.capitalize(jtaBorrar.getText()));
            perksLista.eliminar(perk);
            jlbMostrar.setText("Se ha eliminado correctamente.");
            jtaBorrar.setText("");
        } else {
            jlbMostrar.setText("No se encontró la Perk.");
            jtaBorrar.setText("");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pantalla().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbMostrar;
    private javax.swing.JTextArea jtaBorrar;
    private javax.swing.JTextArea jtaGuardar;
    // End of variables declaration//GEN-END:variables
}
