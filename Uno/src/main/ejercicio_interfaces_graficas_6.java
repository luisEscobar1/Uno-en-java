package main;

import baraja.Baraja;
import baraja.BarajaUno;

import baraja.Carta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ejercicio_interfaces_graficas_6 extends javax.swing.JFrame {

    public ejercicio_interfaces_graficas_6() {
        initComponents();

        Metodos.mostrarImagen(this.lblCarta, TAPA);

        baraja = new BarajaUno();

        btnIniciar.setEnabled(true);

        Metodos.mostrarImagen(this.lblCarta, Fondo);
        Metodos.mostrarImagen(this.lblCarta1, Fondo);
        Metodos.mostrarImagen(this.lblCarta2, Fondo);

        this.txtCartasSacadas.setText((baraja.getPosSiguienteCarta()) + "");
        this.txtCartaDisponible.setText(baraja.cartasDisponible() + "");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblCarta = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnBarajar = new javax.swing.JButton();
        txtCartasSacadas = new javax.swing.JTextField();
        txtCartaDisponible = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCarta1 = new javax.swing.JLabel();
        lblCarta2 = new javax.swing.JLabel();
        btnPonerCj1 = new javax.swing.JButton();
        btnMoverCj1 = new javax.swing.JButton();
        btnSacarCarta1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Carta");

        lblCarta.setBackground(new java.awt.Color(255, 255, 255));
        lblCarta.setForeground(new java.awt.Color(153, 153, 153));

        btnIniciar.setText("Iniciar");
        btnIniciar.setEnabled(false);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnBarajar.setText("Barajar");
        btnBarajar.setEnabled(false);
        btnBarajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarajarActionPerformed(evt);
            }
        });

        txtCartasSacadas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCartasSacadas.setText("0");
        txtCartasSacadas.setEnabled(false);

        txtCartaDisponible.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCartaDisponible.setText("0");
        txtCartaDisponible.setEnabled(false);

        jLabel3.setText("Cartas sacadas");

        jLabel4.setText("Cartas disponibles");

        jLabel2.setText("Carta jugador 1");

        lblCarta1.setForeground(new java.awt.Color(255, 255, 255));

        lblCarta2.setBackground(new java.awt.Color(255, 255, 255));
        lblCarta2.setForeground(new java.awt.Color(153, 153, 153));

        btnPonerCj1.setText("poner carta");
        btnPonerCj1.setEnabled(false);
        btnPonerCj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPonerCj1ActionPerformed(evt);
            }
        });

        btnMoverCj1.setText("Siguiente carta");
        btnMoverCj1.setEnabled(false);
        btnMoverCj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverCj1ActionPerformed(evt);
            }
        });

        btnSacarCarta1.setText("sacar carta");
        btnSacarCarta1.setEnabled(false);
        btnSacarCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarCarta1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(lblCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCartaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtCartasSacadas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnBarajar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMoverCj1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPonerCj1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSacarCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnIniciar)
                                .addGap(18, 18, 18)
                                .addComponent(btnBarajar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCartasSacadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCartaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(lblCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(btnPonerCj1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSacarCarta1)
                .addGap(18, 18, 18)
                .addComponent(btnMoverCj1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        baraja.barajar();
        ArrayList<Carta> listToRemove = new ArrayList<Carta>();
        for (int i = 0; i < barajaJ1.size(); i++) {
            listToRemove.add(barajaJ1.get(i));
        }
        barajaJ1.removeAll(listToRemove);
        System.out.println(barajaJ1.isEmpty());

        for (int i = 0; i <barajaSobra.size(); i++) {
            listToRemove.add(barajaSobra.get(i));
        }
        barajaSobra.removeAll(listToRemove);
        System.out.println(barajaSobra.isEmpty());
        btnBarajar.setEnabled(true);
        Metodos.mostrarImagen(this.lblCarta, TAPA);
        Metodos.mostrarImagen(this.lblCarta1, Fondo);
        Metodos.mostrarImagen(this.lblCarta2, Fondo);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnBarajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarajarActionPerformed

        baraja.barajar();
        for (int i = 0; i < 7; i++) {
            Carta c = baraja.siguienteCarta();
            barajaJ1.add(c);
        }
        Carta c = barajaJ1.get(0);
        this.btnIniciar.setEnabled(true);
        this.btnMoverCj1.setEnabled(true);
        this.btnPonerCj1.setEnabled(true);
        this.btnSacarCarta1.setEnabled(true);
        Metodos.mostrarImagen(this.lblCarta, TAPA);
        Metodos.mostrarImagen(this.lblCarta1, DIR_IMG + "\\Color\\" + c.getPalo().toString().toLowerCase() + "\\" + c.getNumero() + ".png");
        System.out.println(c.getPalo().toString().toLowerCase() + "\\" + c.getNumero());
        this.btnPonerCj1.setEnabled(true);
        this.txtCartasSacadas.setText((baraja.getPosSiguienteCarta()) + "");
        this.txtCartaDisponible.setText(baraja.cartasDisponible() + "");
        this.btnBarajar.setEnabled(false);
    }//GEN-LAST:event_btnBarajarActionPerformed

    private void btnPonerCj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPonerCj1ActionPerformed
        if (barajaJ1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ganador");
            this.btnIniciar.setEnabled(false);
        } else {

            if (barajaSobra.isEmpty()) {
                Carta c = barajaJ1.get(aux1);
                barajaSobra.add(c);
                System.out.println("-----");
                Metodos.mostrarImagen(this.lblCarta2, DIR_IMG + "\\Color\\" + c.getPalo().toString().toLowerCase() + "\\" + c.getNumero() + ".png");
                this.barajaJ1.remove(aux1);
                System.out.println("");
                Carta c2 = barajaJ1.get(aux1);
                Metodos.mostrarImagen(this.lblCarta1, DIR_IMG + "\\Color\\" + c2.getPalo().toString().toLowerCase() + "\\" + c2.getNumero() + ".png");
                System.out.println(barajaJ1.size());
                if (aux1 > 0) {
                    aux1 = -1;
                }

            } else {
                System.out.println("-----------------------");
                System.out.println(aux1);
                Carta c = barajaJ1.get(aux1);

                Carta c2 = barajaSobra.get(barajaSobra.size() - 1);
                System.out.println("so");
                System.out.println(c2.getPalo().toString().toLowerCase() + "\\" + c2.getNumero());
                System.out.println(c.getPalo().toString().toLowerCase() + "\\" + c.getNumero());
                if (c.getPalo().toString() == c2.getPalo().toString() || c2.getNumero() == c.getNumero()) {

                    Metodos.mostrarImagen(this.lblCarta2, DIR_IMG + "\\Color\\" + c2.getPalo().toString().toLowerCase() + "\\" + c2.getNumero() + ".png");

                    if (barajaJ1.size() == 0) {

                        Metodos.mostrarImagen(this.lblCarta1, TAPA);
                        JOptionPane.showMessageDialog(this, "ganador j1");
                        this.btnIniciar.setEnabled(false);
                        this.btnPonerCj1.setEnabled(false);
                        this.btnMoverCj1.setEnabled(false);

                    } else {

                        System.out.println("");
                        System.out.println("");
                        System.out.println(aux1);
                        System.out.println(barajaJ1.size() - 1);
                        if (aux1 == barajaJ1.size() - 1) {

                            System.out.println("entro xddd");
                            Carta c1 = barajaJ1.get(aux1);
                            Metodos.mostrarImagen(this.lblCarta1, DIR_IMG + "\\Color\\" + c1.getPalo().toString().toLowerCase() + "\\" + c1.getNumero() + ".png");
                            System.out.println(aux1);
                            Metodos.mostrarImagen(this.lblCarta2, DIR_IMG + "\\Color\\" + c2.getPalo().toString().toLowerCase() + "\\" + c2.getNumero() + ".png");
                            this.barajaJ1.remove(aux1);
                            System.out.println(c1.getPalo().toString().toLowerCase() + "\\" + c1.getNumero());
                            System.out.println(c2.getPalo().toString().toLowerCase() + "\\" + c2.getNumero());
                            barajaSobra.add(c);
                            c2 = barajaSobra.get(barajaSobra.size() - 1);
                            Metodos.mostrarImagen(this.lblCarta2, DIR_IMG + "\\Color\\" + c2.getPalo().toString().toLowerCase() + "\\" + c2.getNumero() + ".png");

                        } else {
                            System.out.println("entro ");
                            System.out.println("");
                            Carta c1 = barajaJ1.get(aux1);
                            Metodos.mostrarImagen(this.lblCarta1, DIR_IMG + "\\Color\\" + c1.getPalo().toString().toLowerCase() + "\\" + c1.getNumero() + ".png");
                            System.out.println("");
                            System.out.println(aux1);
                            Metodos.mostrarImagen(this.lblCarta2, DIR_IMG + "\\Color\\" + c2.getPalo().toString().toLowerCase() + "\\" + c2.getNumero() + ".png");
                            this.barajaJ1.remove(aux1);
                            System.out.println(c1.getPalo().toString().toLowerCase() + "\\" + c1.getNumero());
                            System.out.println(c2.getPalo().toString().toLowerCase() + "\\" + c2.getNumero());
                            barajaSobra.add(c);
                            c2 = barajaSobra.get(barajaSobra.size() - 1);

                            Metodos.mostrarImagen(this.lblCarta2, DIR_IMG + "\\Color\\" + c2.getPalo().toString().toLowerCase() + "\\" + c2.getNumero() + ".png");
                            c1 = barajaJ1.get(aux1);
                            Metodos.mostrarImagen(this.lblCarta1, DIR_IMG + "\\Color\\" + c1.getPalo().toString().toLowerCase() + "\\" + c1.getNumero() + ".png");

                        }
                    }

                    if (aux1 > 0) {
                        aux1 = aux1 - 1;
                        System.out.println("yoloxddd");
                        System.out.println(aux1);
                        Carta c1 = barajaJ1.get(aux1);
                        Metodos.mostrarImagen(this.lblCarta1, DIR_IMG + "\\Color\\" + c1.getPalo().toString().toLowerCase() + "\\" + c1.getNumero() + ".png");
                        c2 = barajaSobra.get(barajaSobra.size() - 1);
                        Metodos.mostrarImagen(this.lblCarta2, DIR_IMG + "\\Color\\" + c2.getPalo().toString().toLowerCase() + "\\" + c2.getNumero() + ".png");

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "no se puede, tome una carta");
                    System.out.println("no tene");
                    System.out.println(aux1);
                }
            }

            if (barajaJ1.isEmpty()) {
                Metodos.mostrarImagen(this.lblCarta1, TAPA);
                JOptionPane.showMessageDialog(this, "ganador j1");
                this.btnIniciar.setEnabled(false);
                this.btnPonerCj1.setEnabled(false);
                this.btnMoverCj1.setEnabled(false);
            }

        }
    }//GEN-LAST:event_btnPonerCj1ActionPerformed

    private void btnMoverCj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverCj1ActionPerformed
        if (this.aux1 < barajaJ1.size() - 1) {
            aux1 += 1;
            System.out.println(aux1);
            Carta c = barajaJ1.get(aux1);

            Metodos.mostrarImagen(this.lblCarta1, DIR_IMG + "\\Color\\" + c.getPalo().toString().toLowerCase() + "\\" + c.getNumero() + ".png");
            System.out.println(aux1);

        } else {
            this.aux1 = 0;
            Carta c = barajaJ1.get(0);
            Metodos.mostrarImagen(this.lblCarta1, DIR_IMG + "\\Color\\" + c.getPalo().toString().toLowerCase() + "\\" + c.getNumero() + ".png");
        }
    }//GEN-LAST:event_btnMoverCj1ActionPerformed

    private void btnSacarCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarCarta1ActionPerformed
        Carta c = baraja.siguienteCarta();

        if (c != null) {
            Metodos.mostrarImagen(this.lblCarta1, DIR_IMG + "\\Color\\" + c.getPalo().toString().toLowerCase() + "\\" + c.getNumero() + ".png");
            barajaJ1.add(c);
            System.out.println("-----");
            System.out.println("---------");
            aux1 = barajaJ1.size() - 1;
            System.out.println(aux1);
            System.out.println((barajaJ1.size()));
            this.txtCartasSacadas.setText((baraja.getPosSiguienteCarta()) + "");
            this.txtCartaDisponible.setText(baraja.cartasDisponible() + "");

        } else {
            JOptionPane.showMessageDialog(this, "No hay mas cartas", "Error", JOptionPane.ERROR_MESSAGE);
            this.btnIniciar.setEnabled(false);

        }
    }//GEN-LAST:event_btnSacarCarta1ActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio_interfaces_graficas_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio_interfaces_graficas_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio_interfaces_graficas_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio_interfaces_graficas_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio_interfaces_graficas_6().setVisible(true);
            }
        });
    }

    private Baraja baraja;
    private int aux1 = 0;
    private ArrayList<Carta> barajaJ1 = new ArrayList<Carta>();
    private ArrayList<Carta> barajaSobra = new ArrayList<Carta>();

    private final String DIR_IMG = "img";
    private final String TAPA = DIR_IMG + "\\otras\\tapa.png";
    private final String Fondo = DIR_IMG + "\\otras\\tapa1.png";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarajar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMoverCj1;
    private javax.swing.JButton btnPonerCj1;
    private javax.swing.JButton btnSacarCarta1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCarta;
    private javax.swing.JLabel lblCarta1;
    private javax.swing.JLabel lblCarta2;
    private javax.swing.JTextField txtCartaDisponible;
    private javax.swing.JTextField txtCartasSacadas;
    // End of variables declaration//GEN-END:variables
}
