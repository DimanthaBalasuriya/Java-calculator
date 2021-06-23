package calculator;

public class AdvanceCalculator extends javax.swing.JFrame {

    double num1;
    double num2;
    String num1S;
    String num2S;
    double ans;
    String ope;
    String state;

    public AdvanceCalculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btnmul = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnClreat = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnBin = new javax.swing.JButton();
        btnOct = new javax.swing.JButton();
        btnHex = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labHex = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labOct = new javax.swing.JLabel();
        labBin = new javax.swing.JLabel();
        labDec = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 40));

        btnmul.setText("*");
        btnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulActionPerformed(evt);
            }
        });
        jPanel1.add(btnmul, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 80, 50));

        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        jPanel1.add(btnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 80, 50));

        btnClreat.setText("C");
        btnClreat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClreatActionPerformed(evt);
            }
        });
        jPanel1.add(btnClreat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 80, 50));

        btnDel.setText("X");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jPanel1.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 80, 50));

        btnMin.setText("-");
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });
        jPanel1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 80, 50));

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 80, 50));

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 80, 50));

        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 80, 50));

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 80, 50));

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 80, 50));

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 80, 50));

        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        jPanel1.add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 50));

        btndot.setText(".");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });
        jPanel1.add(btndot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 80, 50));

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 80, 50));

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 80, 50));

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel1.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 50));

        jButton17.setText("=");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 170, 50));

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 80, 50));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 80, 50));

        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        jPanel1.add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 80, 50));

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 80, 50));

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 80, 50));

        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        jPanel1.add(btnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 80, 50));

        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });
        jPanel1.add(btndiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 80, 50));

        btnF.setText("F");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        jPanel1.add(btnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 80, 50));

        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        jPanel1.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 50));

        btnBin.setText("BIN");
        btnBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinActionPerformed(evt);
            }
        });
        jPanel1.add(btnBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, 50));

        btnOct.setText("OCT");
        btnOct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOctActionPerformed(evt);
            }
        });
        jPanel1.add(btnOct, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 80, 50));

        btnHex.setText("HEX");
        btnHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexActionPerformed(evt);
            }
        });
        jPanel1.add(btnHex, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 80, 50));

        jLabel1.setText("HEX");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        labHex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labHex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labHex, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, 20));

        jLabel3.setText("OCT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        labOct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labOct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labOct, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 20));

        labBin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labBin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 120, 20));

        labDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 20));

        jLabel7.setText("DEC");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel8.setText("BIN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        btnDec.setText("DEC");
        btnDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecActionPerformed(evt);
            }
        });
        jPanel1.add(btnDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 80, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinActionPerformed
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        btnE.setEnabled(false);
        btnF.setEnabled(false);
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        state = "BIN";
    }//GEN-LAST:event_btnBinActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("2"));
        int currValue = Integer.parseInt(jTextField1.getText());
        String binValue = Integer.toBinaryString(currValue);
        String hexValue = Integer.toHexString(currValue);
        String octValue = Integer.toOctalString(currValue);
        labBin.setText(binValue + "");
        labHex.setText(hexValue + "");
        labOct.setText(octValue + "");
        labDec.setText(currValue + "");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("7"));
        int currValue = Integer.parseInt(jTextField1.getText());
        String binValue = Integer.toBinaryString(currValue);
        String hexValue = Integer.toHexString(currValue);
        String octValue = Integer.toOctalString(currValue);
        labBin.setText(binValue + "");
        labHex.setText(hexValue + "");
        labOct.setText(octValue + "");
        labDec.setText(currValue + "");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("8"));
        int currValue = Integer.parseInt(jTextField1.getText());
        String binValue = Integer.toBinaryString(currValue);
        String hexValue = Integer.toHexString(currValue);
        String octValue = Integer.toOctalString(currValue);
        labBin.setText(binValue + "");
        labHex.setText(hexValue + "");
        labOct.setText(octValue + "");
        labDec.setText(currValue + "");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("9"));
        int currValue = Integer.parseInt(jTextField1.getText());
        String binValue = Integer.toBinaryString(currValue);
        String hexValue = Integer.toHexString(currValue);
        String octValue = Integer.toOctalString(currValue);
        labBin.setText(binValue + "");
        labHex.setText(hexValue + "");
        labOct.setText(octValue + "");
        labDec.setText(currValue + "");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("6"));
        int currValue = Integer.parseInt(jTextField1.getText());
        String binValue = Integer.toBinaryString(currValue);
        String hexValue = Integer.toHexString(currValue);
        String octValue = Integer.toOctalString(currValue);
        labBin.setText(binValue + "");
        labHex.setText(hexValue + "");
        labOct.setText(octValue + "");
        labDec.setText(currValue + "");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("5"));
        int currValue = Integer.parseInt(jTextField1.getText());
        String binValue = Integer.toBinaryString(currValue);
        String hexValue = Integer.toHexString(currValue);
        String octValue = Integer.toOctalString(currValue);
        labBin.setText(binValue + "");
        labHex.setText(hexValue + "");
        labOct.setText(octValue + "");
        labDec.setText(currValue + "");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("4"));
        int currValue = Integer.parseInt(jTextField1.getText());
        String binValue = Integer.toBinaryString(currValue);
        String hexValue = Integer.toHexString(currValue);
        String octValue = Integer.toOctalString(currValue);
        labBin.setText(binValue + "");
        labHex.setText(hexValue + "");
        labOct.setText(octValue + "");
        labDec.setText(currValue + "");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("1"));
        int currValue = Integer.parseInt(jTextField1.getText());
        String binValue = Integer.toBinaryString(currValue);
        String hexValue = Integer.toHexString(currValue);
        String octValue = Integer.toOctalString(currValue);
        labBin.setText(binValue + "");
        labHex.setText(hexValue + "");
        labOct.setText(octValue + "");
        labDec.setText(currValue + "");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("3"));
        int currValue = Integer.parseInt(jTextField1.getText());
        String binValue = Integer.toBinaryString(currValue);
        String hexValue = Integer.toHexString(currValue);
        String octValue = Integer.toOctalString(currValue);
        labBin.setText(binValue + "");
        labHex.setText(hexValue + "");
        labOct.setText(octValue + "");
        labDec.setText(currValue + "");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("0"));
        int currValue = Integer.parseInt(jTextField1.getText());
        String binValue = Integer.toBinaryString(currValue);
        String hexValue = Integer.toHexString(currValue);
        String octValue = Integer.toOctalString(currValue);
        labBin.setText(binValue + "");
        labHex.setText(hexValue + "");
        labOct.setText(octValue + "");
        labDec.setText(currValue + "");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("."));
    }//GEN-LAST:event_btndotActionPerformed

    private void btnOctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOctActionPerformed
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        btnE.setEnabled(false);
        btnF.setEnabled(false);
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        state = "OCT";
    }//GEN-LAST:event_btnOctActionPerformed

    private void btnDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecActionPerformed
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        btnE.setEnabled(false);
        btnF.setEnabled(false);
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        state = "DEC";
    }//GEN-LAST:event_btnDecActionPerformed

    private void btnHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexActionPerformed
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnE.setEnabled(true);
        btnF.setEnabled(true);
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        state = "HEX";
    }//GEN-LAST:event_btnHexActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        int length = jTextField1.getText().length();
        for (int i = 0; i < length; --i) {

        }
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnClreatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClreatActionPerformed
        jTextField1.setText(null);
    }//GEN-LAST:event_btnClreatActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        jTextField1.setText(null);
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("A"));
        //int currValue = Integer.parseInt(jTextField1.getText());
//        int binVal = Integer.parseInt(jTextField1.getText(), 2);
//        int hexVal = Integer.parseInt(jTextField1.getText(), 16);
//        int octVal = Integer.parseInt(jTextField1.getText(), 8);
//        labBin.setText(binVal + "");
//        labHex.setText(hexVal + "");
//        labOct.setText(octVal + "");
//        //labDec.setText(currValue + "");
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("B"));
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("C"));
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("D"));
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("E"));
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        jTextField1.setText(jTextField1.getText().toString().concat("F"));
    }//GEN-LAST:event_btnFActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        ope = "/";
        if (state.equals("HEX")) {
            num1S = jTextField1.getText();
        } else {
            num1 = Double.parseDouble(jTextField1.getText());
        }
        jTextField1.setText(null);
    }//GEN-LAST:event_btndivActionPerformed

    private void btnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmulActionPerformed
        ope = "*";
        if (state.equals("HEX")) {
            num1S = jTextField1.getText();
        } else {
            num1 = Double.parseDouble(jTextField1.getText());
        }
        jTextField1.setText(null);
    }//GEN-LAST:event_btnmulActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        ope = "-";
        if (state.equals("HEX")) {
            num1S = jTextField1.getText();
        } else {
            num1 = Double.parseDouble(jTextField1.getText());
        }
        jTextField1.setText(null);
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        ope = "+";
        if (state.equals("HEX")) {
            num1S = jTextField1.getText();
        } else {
            num1 = Double.parseDouble(jTextField1.getText());
        }
        jTextField1.setText(null);
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if (state.equalsIgnoreCase("BIN")) {
            if (ope.equals("+")) {
                num2 = Double.parseDouble(jTextField1.getText());
                int currVal = (int) (num1 + num2);
                System.out.println(currVal);
                labBin.setText(Integer.toBinaryString(currVal));
                labHex.setText(Integer.toHexString(currVal));
                labOct.setText(Integer.toOctalString(currVal));
                labDec.setText(currVal + "");
            } else if (ope.equals("-")) {
                num2 = Double.parseDouble(jTextField1.getText());
                int currVal = (int) (num1 - num2);
                System.out.println(currVal);
                labBin.setText(Integer.toBinaryString(currVal));
                labHex.setText(Integer.toHexString(currVal));
                labOct.setText(Integer.toOctalString(currVal));
                labDec.setText(currVal + "");
            } else if (ope.equals("/")) {
                num2 = Double.parseDouble(jTextField1.getText());
                int currVal = (int) (num1 / num2);
                System.out.println(currVal);
                labBin.setText(Integer.toBinaryString(currVal));
                labHex.setText(Integer.toHexString(currVal));
                labOct.setText(Integer.toOctalString(currVal));
                labDec.setText(currVal + "");
            } else if (ope.equals("*")) {
                num2 = Double.parseDouble(jTextField1.getText());
                int currVal = (int) (num1 * num2);
                System.out.println(currVal);
                labBin.setText(Integer.toBinaryString(currVal));
                labHex.setText(Integer.toHexString(currVal));
                labOct.setText(Integer.toOctalString(currVal));
                labDec.setText(currVal + "");
            }
        } else if (state.equalsIgnoreCase("OCT")) {
            if (ope.equals("+")) {
                num2 = Double.parseDouble(jTextField1.getText());
                int val = (int) (num1 + num2);
                String octVal = Integer.toOctalString(val);
                jTextField1.setText(octVal);
                labBin.setText(Integer.toBinaryString(val));
                labHex.setText(Integer.toHexString(val));
                labOct.setText(Integer.toOctalString(val));
                labDec.setText(val + "");
            } else if (ope.equals("-")) {
                num2 = Double.parseDouble(jTextField1.getText());
                int val = (int) (num1 - num2);
                String octVal = Integer.toOctalString(val);
                jTextField1.setText(octVal);
                labBin.setText(Integer.toBinaryString(val));
                labHex.setText(Integer.toHexString(val));
                labOct.setText(Integer.toOctalString(val));
                labDec.setText(val + "");
            } else if (ope.equals("/")) {
                num2 = Double.parseDouble(jTextField1.getText());
                int val = (int) (num1 / num2);
                String octVal = Integer.toOctalString(val);
                jTextField1.setText(octVal);
                labBin.setText(Integer.toBinaryString(val));
                labHex.setText(Integer.toHexString(val));
                labOct.setText(Integer.toOctalString(val));
                labDec.setText(val + "");
            } else if (ope.equals("*")) {
                num2 = Double.parseDouble(jTextField1.getText());
                int val = (int) (num1 * num2);
                String octVal = Integer.toOctalString(val);
                jTextField1.setText(octVal);
                labBin.setText(Integer.toBinaryString(val));
                labHex.setText(Integer.toHexString(val));
                labOct.setText(Integer.toOctalString(val));
                labDec.setText(val + "");
            }
        } else if (state.equalsIgnoreCase("HEX")) {
            if (ope.equals("+")) {
                num2S = jTextField1.getText();
                int num1Hex = Integer.parseInt(num1S, 16);
                int num2Hex = Integer.parseInt(num2S, 16);
                int val = num1Hex + num2Hex;
                jTextField1.setText(val + "");
                labBin.setText(Integer.toBinaryString(val));
                labHex.setText(Integer.toHexString(val));
                labOct.setText(Integer.toOctalString(val));
                labDec.setText(val + "");
            } else if (ope.equals("-")) {
                num2S = jTextField1.getText();
                int num1Hex = Integer.parseInt(num1S, 16);
                int num2Hex = Integer.parseInt(num2S, 16);
                int val = num1Hex - num2Hex;
                jTextField1.setText(val + "");
                labBin.setText(Integer.toBinaryString(val));
                labHex.setText(Integer.toHexString(val));
                labOct.setText(Integer.toOctalString(val));
                labDec.setText(val + "");
            } else if (ope.equals("/")) {
                num2S = jTextField1.getText();
                int num1Hex = Integer.parseInt(num1S, 16);
                int num2Hex = Integer.parseInt(num2S, 16);
                int val = num1Hex / num2Hex;
                jTextField1.setText(val + "");
                labBin.setText(Integer.toBinaryString(val));
                labHex.setText(Integer.toHexString(val));
                labOct.setText(Integer.toOctalString(val));
                labDec.setText(val + "");
            } else if (ope.equals("*")) {
                num2S = jTextField1.getText();
                int num1Hex = Integer.parseInt(num1S, 16);
                int num2Hex = Integer.parseInt(num2S, 16);
                int val = num1Hex * num2Hex;
                jTextField1.setText(val + "");
                labBin.setText(Integer.toBinaryString(val));
                labHex.setText(Integer.toHexString(val));
                labOct.setText(Integer.toOctalString(val));
                labDec.setText(val + "");
            }
        } else if (state.equalsIgnoreCase("DEC")) {
            if (ope.equals("+")) {
                num2 = Double.parseDouble(jTextField1.getText());
                double val = num1 + num2;
                jTextField1.setText(val + "");
                labBin.setText(Integer.toBinaryString((int) val));
                labHex.setText(Integer.toHexString((int) val));
                labOct.setText(Integer.toOctalString((int) val));
                labDec.setText(val + "");
            } else if (ope.equals("-")) {
                num2 = Double.parseDouble(jTextField1.getText());
                double val = num1 - num2;
                jTextField1.setText(val + "");
                labBin.setText(Integer.toBinaryString((int) val));
                labHex.setText(Integer.toHexString((int) val));
                labOct.setText(Integer.toOctalString((int) val));
                labDec.setText(val + "");
            } else if (ope.equals("/")) {
                num2 = Double.parseDouble(jTextField1.getText());
                double val = num1 / num2;
                jTextField1.setText(val + "");
                labBin.setText(Integer.toBinaryString((int) val));
                labHex.setText(Integer.toHexString((int) val));
                labOct.setText(Integer.toOctalString((int) val));
                labDec.setText(val + "");
            } else if (ope.equals("*")) {
                num2 = Double.parseDouble(jTextField1.getText());
                double val = num1 * num2;
                jTextField1.setText(val + "");
                labBin.setText(Integer.toBinaryString((int) val));
                labHex.setText(Integer.toHexString((int) val));
                labOct.setText(Integer.toOctalString((int) val));
                labDec.setText(val + "");
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdvanceCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvanceCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvanceCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvanceCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdvanceCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBin;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnClreat;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDec;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnHex;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnOct;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btnmul;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labBin;
    private javax.swing.JLabel labDec;
    private javax.swing.JLabel labHex;
    private javax.swing.JLabel labOct;
    // End of variables declaration//GEN-END:variables
}
