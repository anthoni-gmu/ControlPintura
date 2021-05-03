package View;

import Model.Formula;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DecimalFormat;


public class CalculaView extends javax.swing.JFrame {

    public int modo = 0;

    public CalculaView() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        Panel1.setBackground(new Color(0, 0, 0, 0));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        rendimiento = new javax.swing.JTextField();
        areaPintado = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnBrocha = new javax.swing.JButton();
        btnRodillo = new javax.swing.JButton();
        btnSayer = new javax.swing.JButton();
        btnAirles = new javax.swing.JButton();
        btnAirmix = new javax.swing.JButton();
        btnContimex = new javax.swing.JButton();
        btnVoller = new javax.swing.JButton();
        btnAcuario = new javax.swing.JButton();
        btnMadera = new javax.swing.JButton();
        btnConcreto = new javax.swing.JButton();
        btnYeso = new javax.swing.JButton();
        btnJson = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnTxt = new javax.swing.JButton();
        btnAerografo7 = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rendimiento.setBackground(new Color(0,0,0,0));
        rendimiento.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        rendimiento.setBorder(null);
        rendimiento.setOpaque(false);
        Panel1.add(rendimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 180, 50));

        areaPintado.setBackground(new Color(0,0,0,0));
        areaPintado.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        areaPintado.setBorder(null);
        areaPintado.setOpaque(false);
        Panel1.add(areaPintado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, 50));

        calcular.setBackground(new Color(0,0,0,0));
        calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCalcular.png"))); // NOI18N
        calcular.setBorder(null);
        calcular.setOpaque(false);
        calcular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCalcularP.png"))); // NOI18N
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        Panel1.add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 170, 63));

        btnClose.setBackground(new Color(0,0,0,0));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnClose.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setOpaque(false);
        btnClose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCloseP.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        Panel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 38, 38));

        btnBrocha.setBackground(new Color(0,0,0,0));
        btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrocha.png"))); // NOI18N
        btnBrocha.setBorder(null);
        btnBrocha.setOpaque(false);
        btnBrocha.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrochaP.png"))); // NOI18N
        btnBrocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrochaActionPerformed(evt);
            }
        });
        Panel1.add(btnBrocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 74, 74));

        btnRodillo.setBackground(new Color(0,0,0,0));
        btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodillo.png"))); // NOI18N
        btnRodillo.setBorder(null);
        btnRodillo.setOpaque(false);
        btnRodillo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodilloP.png"))); // NOI18N
        btnRodillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRodilloActionPerformed(evt);
            }
        });
        Panel1.add(btnRodillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 74, 74));

        btnSayer.setBackground(new Color(0,0,0,0));
        btnSayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSayer.png"))); // NOI18N
        btnSayer.setBorder(null);
        btnSayer.setOpaque(false);
        btnSayer.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSayerP.png"))); // NOI18N
        btnSayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSayerActionPerformed(evt);
            }
        });
        Panel1.add(btnSayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 94, 92));

        btnAirles.setBackground(new Color(0,0,0,0));
        btnAirles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMotor.png"))); // NOI18N
        btnAirles.setBorder(null);
        btnAirles.setOpaque(false);
        btnAirles.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMotorP.png"))); // NOI18N
        btnAirles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlesActionPerformed(evt);
            }
        });
        Panel1.add(btnAirles, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 74, 74));

        btnAirmix.setBackground(new Color(0,0,0,0));
        btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistola.png"))); // NOI18N
        btnAirmix.setBorder(null);
        btnAirmix.setOpaque(false);
        btnAirmix.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistolaP.png"))); // NOI18N
        btnAirmix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirmixActionPerformed(evt);
            }
        });
        Panel1.add(btnAirmix, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 74, 74));

        btnContimex.setBackground(new Color(0,0,0,0));
        btnContimex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnContimex.png"))); // NOI18N
        btnContimex.setBorder(null);
        btnContimex.setOpaque(false);
        btnContimex.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnContimexP.png"))); // NOI18N
        btnContimex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContimexActionPerformed(evt);
            }
        });
        Panel1.add(btnContimex, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 94, 92));

        btnVoller.setBackground(new Color(0,0,0,0));
        btnVoller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVoller.png"))); // NOI18N
        btnVoller.setBorder(null);
        btnVoller.setOpaque(false);
        btnVoller.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVollerP.png"))); // NOI18N
        btnVoller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVollerActionPerformed(evt);
            }
        });
        Panel1.add(btnVoller, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 94, 92));

        btnAcuario.setBackground(new Color(0,0,0,0));
        btnAcuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAcuario.png"))); // NOI18N
        btnAcuario.setBorder(null);
        btnAcuario.setOpaque(false);
        btnAcuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAcuarioP.png"))); // NOI18N
        btnAcuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcuarioActionPerformed(evt);
            }
        });
        Panel1.add(btnAcuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 94, 92));

        btnMadera.setBackground(new Color(0,0,0,0));
        btnMadera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMadera.png"))); // NOI18N
        btnMadera.setBorder(null);
        btnMadera.setOpaque(false);
        btnMadera.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMaderaP.png"))); // NOI18N
        btnMadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaderaActionPerformed(evt);
            }
        });
        Panel1.add(btnMadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 760, 74, 74));

        btnConcreto.setBackground(new Color(0,0,0,0));
        btnConcreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnConcreto.png"))); // NOI18N
        btnConcreto.setBorder(null);
        btnConcreto.setOpaque(false);
        btnConcreto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnConcretoP.png"))); // NOI18N
        btnConcreto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcretoActionPerformed(evt);
            }
        });
        Panel1.add(btnConcreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 760, 74, 74));

        btnYeso.setBackground(new Color(0,0,0,0));
        btnYeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnYeso.png"))); // NOI18N
        btnYeso.setBorder(null);
        btnYeso.setOpaque(false);
        btnYeso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnYesoP.png"))); // NOI18N
        btnYeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesoActionPerformed(evt);
            }
        });
        Panel1.add(btnYeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 760, 74, 74));

        btnJson.setBackground(new Color(0,0,0,0));
        btnJson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnJson.png"))); // NOI18N
        btnJson.setBorder(null);
        btnJson.setOpaque(false);
        btnJson.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnJsonP.png"))); // NOI18N
        btnJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJsonActionPerformed(evt);
            }
        });
        Panel1.add(btnJson, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 280, 103, 105));

        btnPdf.setBackground(new Color(0,0,0,0));
        btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPdf.png"))); // NOI18N
        btnPdf.setBorder(null);
        btnPdf.setOpaque(false);
        btnPdf.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPdfP.png"))); // NOI18N
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });
        Panel1.add(btnPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 410, 103, 105));

        btnExportar.setBackground(new Color(0,0,0,0));
        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnExportar.png"))); // NOI18N
        btnExportar.setBorder(null);
        btnExportar.setOpaque(false);
        btnExportar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnExportarE.png"))); // NOI18N
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        Panel1.add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 740, 170, 63));

        btnTxt.setBackground(new Color(0,0,0,0));
        btnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnTxt.png"))); // NOI18N
        btnTxt.setBorder(null);
        btnTxt.setOpaque(false);
        btnTxt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnTxtP.png"))); // NOI18N
        btnTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTxtActionPerformed(evt);
            }
        });
        Panel1.add(btnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 550, 103, 105));

        btnAerografo7.setBackground(new Color(0,0,0,0));
        btnAerografo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMano.png"))); // NOI18N
        btnAerografo7.setBorder(null);
        btnAerografo7.setOpaque(false);
        btnAerografo7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnManoP.png"))); // NOI18N
        btnAerografo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAerografo7ActionPerformed(evt);
            }
        });
        Panel1.add(btnAerografo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 74, 74));

        nuevo.setBackground(new Color(0,0,0,0));
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnNuevo.png"))); // NOI18N
        nuevo.setBorder(null);
        nuevo.setOpaque(false);
        nuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnNuevoP.png"))); // NOI18N
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        Panel1.add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 790, 170, 63));

        resultado.setBackground(new Color(0,0,0,0));
        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        resultado.setRows(5);
        resultado.setBorder(null);
        resultado.setOpaque(false);
        jScrollPane1.setViewportView(resultado);

        Panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 520, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Background.png"))); // NOI18N
        Panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1280, 900));

        getContentPane().add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        calcular();
    }//GEN-LAST:event_calcularActionPerformed

    private void btnBrochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrochaActionPerformed
        modoBrocha();
        estado();
    }//GEN-LAST:event_btnBrochaActionPerformed

    private void btnRodilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRodilloActionPerformed
        modoRodillo();
        estado();
    }//GEN-LAST:event_btnRodilloActionPerformed

    private void btnAirmixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirmixActionPerformed
        modoAirmix();
        estado();
    }//GEN-LAST:event_btnAirmixActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        nuevo();
        modo = 0;
        estado();
    }//GEN-LAST:event_nuevoActionPerformed

    private void btnSayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSayerActionPerformed

    private void btnAirlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirlesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAirlesActionPerformed

    private void btnContimexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContimexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContimexActionPerformed

    private void btnVollerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVollerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVollerActionPerformed

    private void btnAcuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcuarioActionPerformed

    private void btnMaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaderaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaderaActionPerformed

    private void btnConcretoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcretoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConcretoActionPerformed

    private void btnYesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnYesoActionPerformed

    private void btnAerografo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAerografo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAerografo7ActionPerformed

    private void btnJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJsonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJsonActionPerformed

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPdfActionPerformed

    private void btnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTxtActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void estado() {
        if (1 == modo) {
            btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodillo.png")));
            btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistola.png")));

        } else if (2 == modo) {
            btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrocha.png")));

            btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistola.png")));
        } else if (3 == modo) {
            btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrocha.png")));

            btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodillo.png")));
        } else {
            btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodillo.png")));
            btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistola.png")));
            btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrocha.png")));

        }
    }

    public int modoBrocha() {
        if (modo == 1) {
            modo = 0;
            btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrocha.png")));

        } else {
            modo = 1;
            btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrochaE.png")));

        }
        return modo;

    }

    public int modoRodillo() {
        if (modo == 2) {
            modo = 0;
            System.out.println(modo);
            btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodillo.png")));

        } else {
            modo = 2;
            System.out.println(modo);
            btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodilloE.png")));

        }
        return modo;
    }

    public int modoAirmix() {
        if (modo == 3) {
            modo = 0;
            System.out.println(modo);
            btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistola.png")));

        } else {
            modo = 3;
            btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistolaE.png")));

            System.out.println(modo);
        }
        return modo;
    }

    public void nuevo() {
        areaPintado.setText("");
        resultado.setText("");
        rendimiento.setText("");
    }

    public void calcular() {
        double res = 0;
        double cp = 0;
        double fCorrecion = 0;
        double presupuesto = 0, descuento = 0;
        String instrumento, presu, desc;

        if (modo == 1) {
            fCorrecion = 0.95;
        } else if (modo == 3) {
            fCorrecion = 0.70;
        } else if (modo == 2) {
            fCorrecion = 0.90;
        }

        cp = obj.consumoPractico(Double.parseDouble(areaPintado.getText()), Double.parseDouble(rendimiento.getText()), fCorrecion);
        res = Math.round(cp);
        presupuesto = res * 13.90;
        if (modo == 1) {
            instrumento = "brocha";
        } else if (modo == 2) {
            instrumento = "rodillo";

        } else {
            instrumento = "pistola de aire";

        }

        if (res >= 12) {
            descuento = 0.10;
        }
        descuento = presupuesto * descuento;
        presupuesto = presupuesto - descuento;
        presu = getTwoDecimals(presupuesto);
        desc = getTwoDecimals(descuento);

        resultado.setText("---Presupuesto de pintura---" + "\nGalones necesarios: " + res + "\nInstrumento a usar: " + instrumento + "\nDescuento: " + desc + " soles" +"\n"+"\n"+"\n------------------------------------"+ "\nPrecio Total: " + presu + " soles");
    }

    private static String getTwoDecimals(double value) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(value);
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculaView().setVisible(true);
            }
        });
    }
    Formula obj = new Formula();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JTextField areaPintado;
    private javax.swing.JButton btnAcuario;
    private javax.swing.JButton btnAerografo7;
    private javax.swing.JButton btnAirles;
    private javax.swing.JButton btnAirmix;
    private javax.swing.JButton btnBrocha;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnConcreto;
    private javax.swing.JButton btnContimex;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnJson;
    private javax.swing.JButton btnMadera;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnRodillo;
    private javax.swing.JButton btnSayer;
    private javax.swing.JButton btnTxt;
    private javax.swing.JButton btnVoller;
    private javax.swing.JButton btnYeso;
    private javax.swing.JButton calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField rendimiento;
    private javax.swing.JTextArea resultado;
    // End of variables declaration//GEN-END:variables
}
