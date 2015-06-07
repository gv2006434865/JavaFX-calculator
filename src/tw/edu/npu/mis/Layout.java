/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import tw.edu.npu.mis.Model.Operator;

/**
 *
 * @author STP
 */
public class Layout extends javax.swing.JFrame {

    Model mModel = new Model();

    /**
     * Creates new form NewJFrame
     */
    public Layout() {
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
        LProcess = new javax.swing.JLabel();
        LSum = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnMc = new javax.swing.JButton();
        BtnMs = new javax.swing.JButton();
        BtnMless = new javax.swing.JButton();
        BtnDiviX = new javax.swing.JButton();
        BtnMadd = new javax.swing.JButton();
        BtnPercent = new javax.swing.JButton();
        BtnMr = new javax.swing.JButton();
        BtnSqrt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BtnCE = new javax.swing.JButton();
        BtnNum8 = new javax.swing.JButton();
        BtnNum9 = new javax.swing.JButton();
        BtnDivided = new javax.swing.JButton();
        BtnNum7 = new javax.swing.JButton();
        BtnMultiply = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        BtnNum4 = new javax.swing.JButton();
        BtnNum1 = new javax.swing.JButton();
        BtnNum5 = new javax.swing.JButton();
        BtnNum2 = new javax.swing.JButton();
        BtnNum6 = new javax.swing.JButton();
        BtnNum3 = new javax.swing.JButton();
        BtnMinus = new javax.swing.JButton();
        BtnPlus = new javax.swing.JButton();
        BtnPorM = new javax.swing.JButton();
        BtnNum0 = new javax.swing.JButton();
        BtnDot = new javax.swing.JButton();
        BtnEquals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        LProcess.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        LSum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LSum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LProcess, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LSum, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        BtnMc.setText("MC");
        BtnMc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMcActionPerformed(evt);
            }
        });

        BtnMs.setText("MS");
        BtnMs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMsActionPerformed(evt);
            }
        });

        BtnMless.setText("M-");
        BtnMless.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMlessActionPerformed(evt);
            }
        });

        BtnDiviX.setText("1/x");
        BtnDiviX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiviXActionPerformed(evt);
            }
        });

        BtnMadd.setText("M+");
        BtnMadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMaddActionPerformed(evt);
            }
        });

        BtnPercent.setText("%");
        BtnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPercentActionPerformed(evt);
            }
        });

        BtnMr.setText("MR");
        BtnMr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMrActionPerformed(evt);
            }
        });

        BtnSqrt.setText("√");
        BtnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSqrtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnMc, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMs, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnMr, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnMadd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnMless, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDiviX, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnMc, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnMr, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnMadd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnMless, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnMs, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnDiviX, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        BtnCE.setText("CE");

        BtnNum8.setText("8");
        BtnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum8ActionPerformed(evt);
            }
        });

        BtnNum9.setText("9");
        BtnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum9ActionPerformed(evt);
            }
        });

        BtnDivided.setText("/");
        BtnDivided.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDividedActionPerformed(evt);
            }
        });

        BtnNum7.setText("7");
        BtnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum7ActionPerformed(evt);
            }
        });

        BtnMultiply.setText("*");
        BtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplyActionPerformed(evt);
            }
        });

        BtnBack.setText("←");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnClear.setText("C");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        BtnNum4.setText("4");
        BtnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum4ActionPerformed(evt);
            }
        });

        BtnNum1.setText("1");
        BtnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum1ActionPerformed(evt);
            }
        });

        BtnNum5.setText("5");
        BtnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum5ActionPerformed(evt);
            }
        });

        BtnNum2.setText("2");
        BtnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum2ActionPerformed(evt);
            }
        });

        BtnNum6.setText("6");
        BtnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum6ActionPerformed(evt);
            }
        });

        BtnNum3.setText("3");
        BtnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum3ActionPerformed(evt);
            }
        });

        BtnMinus.setText("-");
        BtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinusActionPerformed(evt);
            }
        });

        BtnPlus.setText("+");
        BtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlusActionPerformed(evt);
            }
        });

        BtnPorM.setText("±");
        BtnPorM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPorMActionPerformed(evt);
            }
        });

        BtnNum0.setText("0");
        BtnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum0ActionPerformed(evt);
            }
        });

        BtnDot.setText("•");
        BtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDotActionPerformed(evt);
            }
        });

        BtnEquals.setText("=");
        BtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqualsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(BtnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnDivided, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(BtnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(BtnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BtnPorM, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnDivided, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnPorM, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum0ActionPerformed
        mModel.appendDigit(0);
    }//GEN-LAST:event_BtnNum0ActionPerformed

    private void BtnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum1ActionPerformed
        mModel.appendDigit(1);
    }//GEN-LAST:event_BtnNum1ActionPerformed

    private void BtnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum2ActionPerformed
        mModel.appendDigit(2);
    }//GEN-LAST:event_BtnNum2ActionPerformed

    private void BtnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum3ActionPerformed
        mModel.appendDigit(3);
    }//GEN-LAST:event_BtnNum3ActionPerformed

    private void BtnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum4ActionPerformed
        mModel.appendDigit(4);
    }//GEN-LAST:event_BtnNum4ActionPerformed

    private void BtnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum5ActionPerformed
        mModel.appendDigit(5);
    }//GEN-LAST:event_BtnNum5ActionPerformed

    private void BtnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum6ActionPerformed
        mModel.appendDigit(6);
    }//GEN-LAST:event_BtnNum6ActionPerformed

    private void BtnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum7ActionPerformed
        mModel.appendDigit(7);
    }//GEN-LAST:event_BtnNum7ActionPerformed

    private void BtnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum8ActionPerformed
        mModel.appendDigit(8);
    }//GEN-LAST:event_BtnNum8ActionPerformed

    private void BtnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum9ActionPerformed
        mModel.appendDigit(9);
    }//GEN-LAST:event_BtnNum9ActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        mModel.performOperation(Operator.CLEAR);
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        mModel.performOperation(Operator.BACKSPACE);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnDividedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDividedActionPerformed
        mModel.performOperation(Operator.OVER);
    }//GEN-LAST:event_BtnDividedActionPerformed

    private void BtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplyActionPerformed
        mModel.performOperation(Operator.TIMES);
    }//GEN-LAST:event_BtnMultiplyActionPerformed

    private void BtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMinusActionPerformed
        mModel.performOperation(Operator.MINUS);
    }//GEN-LAST:event_BtnMinusActionPerformed

    private void BtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlusActionPerformed
        mModel.performOperation(Operator.PLUS);
    }//GEN-LAST:event_BtnPlusActionPerformed

    private void BtnPorMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPorMActionPerformed
        mModel.performOperation(Operator.PLUS_MINUS);
    }//GEN-LAST:event_BtnPorMActionPerformed

    private void BtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDotActionPerformed
        mModel.appendDot();
    }//GEN-LAST:event_BtnDotActionPerformed

    private void BtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqualsActionPerformed
        mModel.performOperation(Operator.EQUAL);
    }//GEN-LAST:event_BtnEqualsActionPerformed

    private void BtnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSqrtActionPerformed
        mModel.performOperation(Operator.SQRT);
    }//GEN-LAST:event_BtnSqrtActionPerformed

    private void BtnMcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMcActionPerformed
        mModel.performOperation(Operator.MEM_CLEAR);
    }//GEN-LAST:event_BtnMcActionPerformed

    private void BtnMrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMrActionPerformed
        mModel.performOperation(Operator.MEM_RECALL);
    }//GEN-LAST:event_BtnMrActionPerformed

    private void BtnMaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMaddActionPerformed
        mModel.performOperation(Operator.MEM_PLUS);
    }//GEN-LAST:event_BtnMaddActionPerformed

    private void BtnMlessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMlessActionPerformed
        mModel.performOperation(Operator.MEM_MINUS);
    }//GEN-LAST:event_BtnMlessActionPerformed

    private void BtnMsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMsActionPerformed
        mModel.performOperation(Operator.MEM_SET);
    }//GEN-LAST:event_BtnMsActionPerformed

    private void BtnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPercentActionPerformed
        mModel.performOperation(Operator.PERCENT);
    }//GEN-LAST:event_BtnPercentActionPerformed

    private void BtnDiviXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiviXActionPerformed
        mModel.performOperation(Operator.RECIPROCAL);
    }//GEN-LAST:event_BtnDiviXActionPerformed

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
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Layout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnCE;
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnDiviX;
    private javax.swing.JButton BtnDivided;
    private javax.swing.JButton BtnDot;
    private javax.swing.JButton BtnEquals;
    private javax.swing.JButton BtnMadd;
    private javax.swing.JButton BtnMc;
    private javax.swing.JButton BtnMinus;
    private javax.swing.JButton BtnMless;
    private javax.swing.JButton BtnMr;
    private javax.swing.JButton BtnMs;
    private javax.swing.JButton BtnMultiply;
    private javax.swing.JButton BtnNum0;
    private javax.swing.JButton BtnNum1;
    private javax.swing.JButton BtnNum2;
    private javax.swing.JButton BtnNum3;
    private javax.swing.JButton BtnNum4;
    private javax.swing.JButton BtnNum5;
    private javax.swing.JButton BtnNum6;
    private javax.swing.JButton BtnNum7;
    private javax.swing.JButton BtnNum8;
    private javax.swing.JButton BtnNum9;
    private javax.swing.JButton BtnPercent;
    private javax.swing.JButton BtnPlus;
    private javax.swing.JButton BtnPorM;
    private javax.swing.JButton BtnSqrt;
    private javax.swing.JLabel LProcess;
    private javax.swing.JLabel LSum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
