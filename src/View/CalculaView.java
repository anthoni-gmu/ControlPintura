package View;

import Model.Formula;
import Model.Resultado;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.*;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.json.simple.JSONObject;

public class CalculaView extends javax.swing.JFrame {

    public int modo = 0, marca = 0, superficie = 0, export = 0;
    public String tmodo, tmarca, tsuperficie;
    Resultado rs = new Resultado();
    Formula obj = new Formula();
    File f;
    FileWriter w;
    BufferedWriter bw;
    PrintWriter wr;

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
        btnAerografo = new javax.swing.JButton();
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
        Panel1.add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 343, 170, 63));

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
        Panel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 38, 38, 38));

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
        Panel1.add(btnBrocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 470, 74, 74));

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
        Panel1.add(btnRodillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 470, 74, 74));

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
        Panel1.add(btnSayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 157, 94, 92));

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
        Panel1.add(btnAirles, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 590, 74, 74));

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
        Panel1.add(btnAirmix, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 470, 74, 74));

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
        Panel1.add(btnContimex, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 157, 94, 92));

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
        Panel1.add(btnVoller, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 155, 94, 92));

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
        Panel1.add(btnAcuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 157, 94, 92));

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
        Panel1.add(btnMadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 760, 74, 74));

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
        Panel1.add(btnConcreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 762, 74, 74));

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
        Panel1.add(btnYeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 760, 74, 74));

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
        Panel1.add(btnJson, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 277, 103, 105));

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
        Panel1.add(btnPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1111, 412, 103, 105));

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
        Panel1.add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 728, 170, 63));

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
        Panel1.add(btnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1109, 549, 103, 105));

        btnAerografo.setBackground(new Color(0,0,0,0));
        btnAerografo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMano.png"))); // NOI18N
        btnAerografo.setBorder(null);
        btnAerografo.setOpaque(false);
        btnAerografo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnManoP.png"))); // NOI18N
        btnAerografo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAerografoActionPerformed(evt);
            }
        });
        Panel1.add(btnAerografo, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 590, 74, 74));

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
        Panel1.add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 793, 170, 63));

        resultado.setBackground(new Color(0,0,0,0));
        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        resultado.setRows(5);
        resultado.setBorder(null);
        resultado.setOpaque(false);
        jScrollPane1.setViewportView(resultado);

        Panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 500, 300));

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
        marca = 0;
        superficie = 0;
        export = 0;
        estado();
        forma();
        situacion();
        export();


    }//GEN-LAST:event_nuevoActionPerformed

    private void btnSayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSayerActionPerformed
        sayer();
        forma();
    }//GEN-LAST:event_btnSayerActionPerformed

    private void btnAirlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirlesActionPerformed
        modoAirles();
        estado();
    }//GEN-LAST:event_btnAirlesActionPerformed

    private void btnContimexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContimexActionPerformed
        Conti();
        forma();
    }//GEN-LAST:event_btnContimexActionPerformed

    private void btnVollerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVollerActionPerformed
        voller();
        forma();
    }//GEN-LAST:event_btnVollerActionPerformed

    private void btnAcuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcuarioActionPerformed
        acuario();
        forma();
    }//GEN-LAST:event_btnAcuarioActionPerformed

    private void btnMaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaderaActionPerformed
        madera();
        situacion();
    }//GEN-LAST:event_btnMaderaActionPerformed

    private void btnConcretoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcretoActionPerformed
        concreto();
        situacion();
    }//GEN-LAST:event_btnConcretoActionPerformed

    private void btnYesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesoActionPerformed
        yeso();
        situacion();
    }//GEN-LAST:event_btnYesoActionPerformed

    private void btnAerografoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAerografoActionPerformed
        modoAerografo();
        estado();
    }//GEN-LAST:event_btnAerografoActionPerformed

    private void btnJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJsonActionPerformed
        jsonIcon();
        export();
    }//GEN-LAST:event_btnJsonActionPerformed

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        pdfIcon();
        export();
    }//GEN-LAST:event_btnPdfActionPerformed

    private void btnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTxtActionPerformed
        txtIcon();
        export();
    }//GEN-LAST:event_btnTxtActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
     exportar();
    }//GEN-LAST:event_btnExportarActionPerformed

    /**
     * @param args the command line arguments
     */
    //METODO DE PINTADO
    private void estado() {
        switch (modo) {
            case 1:
                btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodillo.png")));
                btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistola.png")));
                btnAirles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMotor.png")));
                btnAerografo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMano.png")));
                break;
            case 2:
                btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrocha.png")));
                btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistola.png")));
                btnAirles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMotor.png")));
                btnAerografo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMano.png")));
                break;
            case 3:
                btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrocha.png")));
                btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodillo.png")));
                btnAirles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMotor.png")));
                btnAerografo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMano.png")));
                break;
            case 4:
                btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrocha.png")));
                btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodillo.png")));
                btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistola.png")));
                btnAerografo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMano.png")));
                break;
            case 5:
                btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrocha.png")));
                btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodillo.png")));
                btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistola.png")));
                btnAirles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMotor.png")));
                break;
            default:
                btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrocha.png")));
                btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodillo.png")));
                btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistola.png")));
                btnAirles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMotor.png")));
                btnAerografo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMano.png")));
                break;
        }
    }

    private int modoBrocha() {
        if (modo == 1) {
            modo = 0;
            btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrocha.png")));

        } else {
            modo = 1;
            btnBrocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBrochaE.png")));
            tmodo = "brocha";

        }
        return modo;

    }

    private int modoRodillo() {
        if (modo == 2) {
            modo = 0;
            btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodillo.png")));

        } else {
            modo = 2;
            btnRodillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRodilloE.png")));
            tmodo = "rodillo";

        }
        return modo;
    }

    private int modoAirmix() {
        if (modo == 3) {
            modo = 0;
            btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistola.png")));

        } else {
            modo = 3;
            btnAirmix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPistolaE.png")));
            tmodo = "Airmix";
        }
        return modo;
    }

    private int modoAerografo() {
        if (modo == 5) {
            modo = 0;
            btnAirles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMotor.png")));

        } else {
            modo = 5;
            btnAerografo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnManoE.png")));
            tmodo = "Aerografo";

        }
        return modo;
    }

    private int modoAirles() {
        if (modo == 4) {
            modo = 0;
            btnAirles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMotor.png")));

        } else {
            modo = 4;
            btnAirles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMotorE.png")));
            tmodo = "Airles";

        }
        return modo;
    }

    // SUPERFICIE A PINTAR
    private void situacion() {
        switch (superficie) {
            case 1:
                btnConcreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnConcreto.png")));
                btnYeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnYeso.png")));
                break;
            case 2:
                btnMadera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMadera.png")));
                btnYeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnYeso.png")));
                break;
            case 3:
                btnMadera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMadera.png")));
                btnConcreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnConcreto.png")));
                break;
            default:
                btnMadera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMadera.png")));
                btnConcreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnConcreto.png")));
                btnYeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnYeso.png")));
                break;
        }
    }

    private int madera() {
        if (superficie == 1) {
            superficie = 0;
            btnMadera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMadera.png")));

        } else {
            superficie = 1;
            btnMadera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMaderaE.png")));
            tsuperficie = "madera";

        }
        return superficie;
    }

    private int concreto() {
        if (superficie == 2) {
            superficie = 0;
            btnConcreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnConcreto.png")));

        } else {
            superficie = 2;
            btnConcreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnConcretoE.png")));
            tsuperficie = "concreto";
        }
        return superficie;
    }

    private int yeso() {
        if (superficie == 3) {
            superficie = 0;
            btnYeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnYeso.png")));

        } else {
            superficie = 3;
            btnYeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnYesoE.png")));
            tsuperficie = "yeso";
        }
        return superficie;
    }

    //MARCA DE PINTURA
    private void forma() {
        switch (marca) {
            case 1:
                btnContimex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnContimex.png")));
                btnVoller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVoller.png")));
                btnAcuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAcuario.png")));
                break;
            case 2:
                btnSayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSayer.png")));
                btnVoller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVoller.png")));
                btnAcuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAcuario.png")));
                break;
            case 3:
                btnSayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSayer.png")));
                btnContimex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnContimex.png")));
                btnAcuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAcuario.png")));
                break;
            case 4:
                btnSayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSayer.png")));
                btnContimex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnContimex.png")));
                btnVoller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVoller.png")));
                break;
            default:
                btnSayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSayer.png")));
                btnContimex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnContimex.png")));
                btnVoller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVoller.png")));
                btnAcuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAcuario.png")));
                break;
        }
    }

    private int sayer() {
        if (marca == 1) {
            marca = 0;
            btnSayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSayer.png")));

        } else {
            marca = 1;
            btnSayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSayerE.png")));
            tmarca = "sayer";
        }
        return marca;
    }

    private int Conti() {
        if (marca == 2) {
            marca = 0;
            btnContimex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnContimex.png")));

        } else {
            marca = 2;
            btnContimex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnContimexE.png")));
            tmarca = "contimex";
        }
        return marca;
    }

    private int voller() {
        if (marca == 3) {
            marca = 0;
            btnVoller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVoller.png")));

        } else {
            marca = 3;
            btnVoller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVollerE.png")));
            tmarca = "voller home";

        }
        return marca;
    }

    private int acuario() {
        if (marca == 4) {
            marca = 0;
            btnAcuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAcuario.png")));
        } else {
            marca = 4;
            btnAcuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAcuarioE.png")));
            tmarca = "pinturas acuario";

        }
        return marca;
    }

    //Diseño de .txt .pdf .json
    private void export() {
        switch (export) {
            case 1:
                btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPdf.png")));
                btnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnTxt.png")));
                break;
            case 2:
                btnJson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnJson.png")));
                btnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnTxt.png")));
                break;
            case 3:
                btnJson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnJson.png")));
                btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPdf.png")));
                break;
            default:
                btnJson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnJson.png")));
                btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPdf.png")));
                btnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnTxt.png")));
                break;
        }
    }

    private int jsonIcon() {
        if (export == 1) {
            marca = 0;
            btnJson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnJson.png")));

        } else {
            export = 1;
            btnJson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnJsonE.png")));

        }
        return export;
    }

    private int pdfIcon() {
        if (export == 2) {
            marca = 0;
            btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPdf.png")));

        } else {
            export = 2;
            btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnPdfE.png")));

        }
        return export;
    }

    private int txtIcon() {
        if (export == 3) {
            marca = 0;
            btnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnTxt.png")));

        } else {
            export = 3;
            btnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnTxtE.png")));

        }
        return export;
    }

    //Limpiar campos
    private void nuevo() {
        areaPintado.setText("");
        resultado.setText("");
        rendimiento.setText("");
    }
    //
    private void calcular() {

        String imprimir;

        double fa, fr, cp, ct, presupuesto, precio, descuento, total;
        fa = obj.FactorAplicacion(modo);
        fr = obj.FactorRugocidad(superficie);
        ct = obj.consumoTeorico(Double.parseDouble(areaPintado.getText()), Double.parseDouble(rendimiento.getText()));
        cp = obj.consumoPractico(ct, fa, fr);
        double balde = Math.round(cp);
        precio = obj.Precios(marca);
        presupuesto = obj.presupeto(balde, precio);
        descuento = obj.descuento(balde, presupuesto);
        total = obj.montoTotal(presupuesto, descuento);
        imprimir = obj.mensaje(balde, tmarca, tsuperficie, tmodo, descuento, total);

        //paso necesario para imprimir en pdf
        rs.setBalde(balde);
        rs.setDescuento(descuento);
        rs.setMarca(tmarca);
        rs.setMetodo(tmodo);
        rs.setMonto(total);
        rs.setSuperficie(tsuperficie);

        resultado.setText(imprimir);
    }

    
    //METODOS PARA EXPORTAR
    private void txt(String nombre) {
        try {
            f = new File(nombre);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            wr.write(resultado.getText());
            wr.close();
            bw.close();
            JOptionPane.showMessageDialog(null, "Archivo exportado en .txt");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e);
        }
    }

    private void json() {
        JSONObject json = new JSONObject();
        json.put("Operacion", "Presupuesto de pintura");
        json.put("Baldes necesarios", rs.getBalde());
        json.put("Instrumento", rs.getMetodo());
        json.put("Superficie", rs.getSuperficie());
        json.put("Marca", rs.getMarca());
        json.put("Descuento", rs.getDescuento());
        json.put("Monto a pagar", rs.getMonto());
        
        try (FileWriter file = new FileWriter("presupuesto.json")) {
            file.write(json.toJSONString());
            file.flush();
            JOptionPane.showMessageDialog(null, "Archivo exportado en .json");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e);
        }
    }

    public void pdf() {
        try {
            PDDocument pd = new PDDocument();
            PDPage pg = new PDPage(PDRectangle.A6);
            pd.addPage(pg);
            PDPageContentStream contenido = new PDPageContentStream(pd, pg);

            contenido.beginText();

            contenido.setFont(PDType1Font.HELVETICA, 12);
            contenido.newLineAtOffset(20, pg.getMediaBox().getHeight() - 52);
            //newLineAtoffset sirve para añadir una linea en pdf
            contenido.showText("-------------Presupuesto de pintura-------------");
            contenido.newLineAtOffset(0, -15);
            contenido.showText("Baldes necesarios: " + rs.getBalde());
            contenido.newLineAtOffset(0, -15);
            contenido.showText("Instrumento: " + rs.getMetodo());
            contenido.newLineAtOffset(0, -15);
            contenido.showText("Superficie: " + rs.getSuperficie());
            contenido.newLineAtOffset(0, -15);
            contenido.showText("Marca :" + rs.getMarca());
            contenido.newLineAtOffset(0, -15);
            contenido.showText("Descuento: " + rs.getDescuento());
            contenido.newLineAtOffset(0, -15);
            contenido.showText("---------------------------------------------------------");
            contenido.newLineAtOffset(0, -15);
            contenido.showText("Monto a pagar: " + rs.getMonto());

            contenido.endText();
            contenido.close();
            pd.save("D:\\Proyectos\\Java\\Prototipo-CalculadoraPintura\\presupuesto.pdf");
            JOptionPane.showMessageDialog(null, "Archivo exportado en .pdf");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e);
            System.out.println(e);
        }
    }
    public void exportar(){
        switch(export){
            case 1:
                json();
                break;
            case 2:
                pdf();
                break;
            case 3:
                txt("presupuesto.txt");
                break;
        }
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculaView().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JTextField areaPintado;
    private javax.swing.JButton btnAcuario;
    private javax.swing.JButton btnAerografo;
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
