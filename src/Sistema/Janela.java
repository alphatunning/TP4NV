package Sistema;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela extends javax.swing.JFrame {

    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    /**
     * Creates new form Janela
     */
    public Janela() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        OK = new javax.swing.JButton();
        CALCULAR = new javax.swing.JButton();
        PESQUISAR = new javax.swing.JButton();
        CANCELAR = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        txnome = new javax.swing.JTextField();
        txendereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        check_empresa = new javax.swing.JCheckBox();
        Empresa = new javax.swing.JLabel();
        Salario = new javax.swing.JLabel();
        txsalario = new javax.swing.JTextField();
        Documento = new javax.swing.JLabel();
        txdocumento = new javax.swing.JTextField();
        txfaturamento = new javax.swing.JTextField();
        lbfaturamento = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        CALCULAR.setText("Calcular");
        CALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALCULARActionPerformed(evt);
            }
        });

        PESQUISAR.setText("Pesquisar");
        PESQUISAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PESQUISARActionPerformed(evt);
            }
        });

        CANCELAR.setText("Cancelar");
        CANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELARActionPerformed(evt);
            }
        });

        Nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nome.setText("Nome:");

        Endereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Endereco.setText("Endereço:");

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel3.setText("Cadastro de Pessoas");

        check_empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_empresaActionPerformed(evt);
            }
        });

        Empresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Empresa.setText("É empresa?");

        Salario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Salario.setText("Salário:");

        Documento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Documento.setText("Documento:");

        txfaturamento.setEnabled(false);
        txfaturamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfaturamentoActionPerformed(evt);
            }
        });

        lbfaturamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbfaturamento.setText("Faturamento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(CALCULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(PESQUISAR)
                            .addGap(18, 18, 18)
                            .addComponent(CANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Salario)
                                        .addComponent(Empresa)
                                        .addComponent(Documento))
                                    .addGap(6, 6, 6))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lbfaturamento)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(check_empresa))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txfaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txnome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Nome))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Endereco)
                        .addGap(326, 326, 326)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txnome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Endereco))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Documento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Empresa)
                    .addComponent(check_empresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbfaturamento))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK)
                    .addComponent(CALCULAR)
                    .addComponent(PESQUISAR)
                    .addComponent(CANCELAR))
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu1.add(Sair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");

        Sobre.setText("Sobre");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        jMenu2.add(Sobre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpaCampos() {
        txnome.setText("");
        txendereco.setText("");
        txdocumento.setText("");
        txsalario.setText("");
        check_empresa.setSelected(false);
    }

    public void imprimeDados(Pessoa p) {
        if (p instanceof PF) {
            JOptionPane.showMessageDialog(null, "      Dados da Pessoa Física\n Nome: " + p.getNome() + "\n Endereço: " + p.getEndereco() + "\n Documento: " + p.getDocumento() + "\n Salário: " + p.getSalario());
        } else {
            JOptionPane.showMessageDialog(null, "      Dados da Pessoa Jurídica\n Nome: " + p.getNome() + "\n Endereço: " + p.getEndereco() + "\n Documento: " + p.getDocumento() + "\n Faturamento: " + p.getFaturamento());
        }
    }

    public void ValidaNumero(JTextField Numero) {
        float valor;
        if (Numero.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo deve ser preenchido");
        } else {
            try {
                valor = Float.parseFloat(Numero.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Esse Campo só aceita números", "Informação", JOptionPane.INFORMATION_MESSAGE);
                Numero.grabFocus();
            }
        }
    }

    public void ValidaString(JTextField palavra) {
        Pattern pattern = Pattern.compile("/^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$/");

        if (palavra.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo deve ser preenchido");
        }
        if (pattern.matcher(palavra.getText()).matches()) {
            JOptionPane.showMessageDialog(null, "Esse Campo só aceita Strings");
        }

    }

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed

        ValidaString(txnome);
        ValidaString(txendereco);
        ValidaString(txdocumento);
        if (check_empresa.isSelected()) {
            txsalario.setText("");
            ValidaNumero(txfaturamento);
        } else {
            ValidaNumero(txsalario);
        }

        if (check_empresa.isSelected()) {
            pessoas.add(new PJ(txnome.getText(), txendereco.getText(), txdocumento.getText(), Double.parseDouble(txfaturamento.getText()), "123"));
        } else if (!check_empresa.isSelected()) {
            pessoas.add(new PF(txnome.getText(), txendereco.getText(), txdocumento.getText(), Double.parseDouble(txsalario.getText()), "124"));
        }
        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.");
        for (Pessoa p : pessoas) {
            imprimeDados(p);
        }
        limpaCampos();
    }//GEN-LAST:event_OKActionPerformed

    private void CALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALCULARActionPerformed

        for (Pessoa p : pessoas) {
            if (p instanceof PF) {
                Double imposto = ((PF) p).calculaImposto(p.getSalario());
                JOptionPane.showMessageDialog(null, "O imposto calculado sobre a Pessoa Física de nome " + p.getNome() + "é " + imposto + ".");
            } else {
                Double impostoFaturamento = ((PJ) p).calculaImposto(p.getFaturamento());
                JOptionPane.showMessageDialog(null, "O imposto sobre o faturamento calculado sobre a Pessoa Jurídica de nome " + p.getNome() + "é " + impostoFaturamento + ".");
            }
            limpaCampos();
        }

    }//GEN-LAST:event_CALCULARActionPerformed

    private void PESQUISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PESQUISARActionPerformed
       Pesquisa p = new Pesquisa();
       p.setVisible(true);
          
        
    }//GEN-LAST:event_PESQUISARActionPerformed

    private void CANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELARActionPerformed
        limpaCampos();
    }//GEN-LAST:event_CANCELARActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        JOptionPane.showMessageDialog(null, "Dupla: Bruno Meireles RA:113111499 \n            Alexander Lucas RA:111111111");

    }//GEN-LAST:event_SobreActionPerformed

    private void check_empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_empresaActionPerformed
        if (check_empresa.isSelected()) {
            txsalario.setText("");
            txsalario.setEnabled(false);
            txfaturamento.setEnabled(true);
        } else {
            txfaturamento.setText("");
            txsalario.setEnabled(true);
            txfaturamento.setEnabled(false);
        }
    }//GEN-LAST:event_check_empresaActionPerformed

    private void txfaturamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfaturamentoActionPerformed

    }//GEN-LAST:event_txfaturamentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CALCULAR;
    private javax.swing.JButton CANCELAR;
    private javax.swing.JLabel Documento;
    private javax.swing.JLabel Empresa;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Nome;
    private javax.swing.JButton OK;
    private javax.swing.JButton PESQUISAR;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JLabel Salario;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JCheckBox check_empresa;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbfaturamento;
    private javax.swing.JTextField txdocumento;
    private javax.swing.JTextField txendereco;
    private javax.swing.JTextField txfaturamento;
    private javax.swing.JTextField txnome;
    private javax.swing.JTextField txsalario;
    // End of variables declaration//GEN-END:variables

}
