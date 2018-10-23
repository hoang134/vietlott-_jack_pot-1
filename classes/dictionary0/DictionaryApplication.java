/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary0;

import javax.swing.JOptionPane;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Việt Hoàng
 */
public class DictionaryApplication extends javax.swing.JFrame {

    int dem = 1;
    int dem2 = 1;
    int m = 1;
    String tu = "";
    String nghia = "";
    VoiceManager VM;
    Voice V;
    Dictionary d = new Dictionary();
    DictionaryManagement e = new DictionaryManagement();

    public DictionaryApplication() {
        initComponents();
        e.insertFromFile(d);
//        try (Scanner scan = new Scanner(new File("3000Tu tiếng anh thông dụng.txt"))) {
//            while (scan.hasNext()) {
//                String target = scan.next();
//                String explain = scan.nextLine();
//                Word words = new Word(target, explain);
//                d.hoang.add(words);
//            }
//        } catch (Exception e) {
//            System.err.println("getMessage():" + e.getMessage());
//
//        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Từ điển anh việt");
        setBackground(new java.awt.Color(153, 255, 0));
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Hướng dẫn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("                   Từ điển Anh-Việt");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setOpaque(true);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 255, 51));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary0/img/loa 2.jpg"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Thêm từ");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("Xóa từ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setText("Tra từ ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 0));
        jButton7.setText("Hiện tất cả các từ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextArea3.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(204, 0, 0));
        jTextArea3.setRows(5);
        jTextArea3.setText("Nhập từ");
        jTextArea3.setDisabledTextColor(new java.awt.Color(50, 50, 50));
        jTextArea3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jTextArea3AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(jTextArea3);

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 0));
        jButton8.setText("Sửa từ");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary0/img/loa.jpg"))); // NOI18N
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea2.setRows(5);
        jTextArea2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea5.setRows(5);
        jTextArea5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(jTextArea5);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("                  Các từ liên quan");
        jLabel2.setOpaque(true);

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 0, 0));
        jButton10.setText("Xuất dữ liệu");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary0/img/ảnh nền.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)
                        .addGap(150, 150, 150)
                        .addComponent(jButton8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addGap(86, 86, 86)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton10))
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton5)
                                .addComponent(jButton8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)))
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(rootPane, " Thực hiện theo hướng dẫn ở ô phía dưới \n LƯU Ý:chương trình sẽ phát âm theo từ bạn nhập \n designed by Huy Hoàng");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String Từ = jTextField1.getText();//lấy từ

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //tra tu
        int KT = 1;
        String tucantra;
        tucantra = jTextField1.getText().toLowerCase();
        jTextArea5.setText("");
        jTextArea2.setText("");

        for (int i = 0; i < d.hoang.size(); i++) {
            if (d.hoang.get(i).getWord_target().equalsIgnoreCase(tucantra)) {
                jTextArea5.append(d.hoang.get(i).getWord_target() + ':' + d.hoang.get(i).getWord_explain());
                KT++;
            }
        }
        //goi y tu
        int j = 0;

        for (int i = 0; i < d.hoang.size(); i++) {

            if (d.hoang.get(i).getWord_target().startsWith(tucantra)) {
                j++;
                jTextArea2.append(j + " " + d.hoang.get(i).getWord_target() + ":" + d.hoang.get(i).getWord_explain() + "\n");
            }
        }

        if (KT == 1) {
            jTextArea5.append("Khong tim thay tu.");

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //them tu

        jTextArea5.setText("");
        int kiemtra = 1;
        String a = jTextField1.getText();
        int k = d.hoang.size();
        for (int i = 0; i < k; i++) {
            if (d.hoang.get(i).getWord_target().equalsIgnoreCase(a)) {
                jTextArea5.append("từ đã tồn tại! bạn cần phải sửa từ");
                kiemtra = 0;

            }
        }
        if (kiemtra == 1) {
            if (a.equalsIgnoreCase("")) {
                jTextArea5.append("khong co tu de them\n");
            } else {

                if (dem == 1) {
                    tu = jTextField1.getText().toLowerCase();
                    jTextArea3.setText("");
                    jTextArea3.append("Nhập nghĩa của từ");
                    dem = 2;
                } else {
                    nghia = jTextField1.getText().toLowerCase();
                    jTextArea3.setText("");
                    jTextArea3.append("Nhập từ");
                    jTextArea5.append("thêm từ thành công");
                    Word words = new Word(tu, nghia);
                    d.hoang.add(words);
                    dem = 1;

                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // xóa từ

        jTextArea5.setText("");
        String tucanxoa;
        int test = 1;
//        System.out.println("nhap tu can xoa:");
        tucanxoa = jTextField1.getText().toLowerCase();
        for (int i = 0; i < d.hoang.size(); i++) {
            if (d.hoang.get(i).getWord_target().equalsIgnoreCase(tucanxoa)) {
                d.hoang.remove(d.hoang.get(i));
                jTextArea5.append("xoa thanh cong.");
                test++;
                jTextArea2.setText("");
            }
        }
        if (test == 1) {
            jTextArea5.append("khong tim thay tu can xoa.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        // Phát âm
        String T = jTextField1.getText();
        System.setProperty("mbrola.base", "mbrola");
        VM = VoiceManager.getInstance();
        V = VM.getVoice("mbrola_us1");
        V.allocate();
        V.speak(T);
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //hien cac tu

        jTextArea5.setText("");
        for (int i = 0; i < d.hoang.size(); i++) {
            int j = i + 1;
            jTextArea5.append(+j + " " + d.hoang.get(i).getWord_target() + ":" + d.hoang.get(i).getWord_explain() + "\n");

        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextArea3AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea3AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea3AncestorMoved

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
//        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked


    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //sửa từ
        jTextArea5.setText("");
        String tucansua;
        int kiemtra = 0;
        tucansua = jTextField1.getText().toLowerCase();
        for (int i = 0; i < d.hoang.size(); i++) {
            if (d.hoang.get(i).getWord_target().equalsIgnoreCase(tucansua) || dem2 == 2) {

                kiemtra++;
                m = i;
            }
        }
        if (kiemtra == 0) {
            jTextArea5.append("không tìm thấy từ cần sửa.");
        } else {
            if (dem2 == 1) {
                jTextArea3.setText("");
                d.hoang.remove(d.hoang.get(m));
                tu = jTextField1.getText().toLowerCase();
                jTextArea3.append("nghiã mới:");
                dem2 = 2;
            } else {
                nghia = jTextField1.getText().toLowerCase();

                Word words = new Word(tu, nghia);
                d.hoang.set(m, words);

                dem2 = 1;
                jTextArea5.append("sửa thành công.");
                jTextArea3.setText("");
                jTextArea2.setText("");
                jTextArea3.append("Nhập từ");
            }

        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked

    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        //phat am nam
        String T = jTextField1.getText();
        System.setProperty("mbrola.base", "mbrola");
        VM = VoiceManager.getInstance();
        V = VM.getVoice("mbrola_us2");
        V.allocate();
        V.speak(T);
//        String VOICENAME = "kevin16";
//        String T = jTextField1.getText();
//        Voice V;
//        VoiceManager VManager = VoiceManager.getInstance();
//        V = VManager.getVoice(VOICENAME);
//        V.allocate();
//        V.speak(T);

    }//GEN-LAST:event_jButton9MouseClicked

    private void jTextArea2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea2AncestorAdded


    }//GEN-LAST:event_jTextArea2AncestorAdded

    private void jTextArea5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea5AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea5AncestorAdded

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // suất ra file
        jTextArea5.setText("");
        File f = new File("Dictionarie2.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try (PrintWriter pr = new PrintWriter(f)) {
            BufferedWriter bf = new BufferedWriter(pr);
            for (int i = 0; i < d.hoang.size(); i++) {
                pr.println(d.hoang.get(i).getWord_target() + "\t" + d.hoang.get(i).getWord_explain());
            }
            jTextArea5.append("Xuất dữ liệu thành công");
        } catch (Exception e) {
            System.out.println("loi:" + e);
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
