/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.ModelProdutos;

/**
 *
 * @author Andre Franklin
 */
public class frm_produto extends javax.swing.JFrame {
    
    ArrayList<ModelProdutos> listarModelProdutos = new ArrayList<>();
    ControllerProdutos controllerProdutos = new  ControllerProdutos();

    /**
     * Creates new form frm_produto
     */
    public frm_produto() {
        initComponents();
        //carregarProdutos();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        txt_cod_prod = new javax.swing.JTextField();
        txt_nome_prod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_estoque_prod = new javax.swing.JTextField();
        txt_valor_pro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produto = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txt_nome_prod1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_cancelar_pro = new javax.swing.JButton();
        btn_excluir_prod = new javax.swing.JButton();
        btn_alterar_prod = new javax.swing.JButton();
        btn_novo_prod = new javax.swing.JButton();
        btn_salvar_prod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setText("Código");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 60, 17);

        txt_cod_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_prodActionPerformed(evt);
            }
        });
        jPanel1.add(txt_cod_prod);
        txt_cod_prod.setBounds(10, 30, 80, 30);
        jPanel1.add(txt_nome_prod);
        txt_nome_prod.setBounds(100, 30, 470, 30);

        jLabel5.setText("Nome");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 10, 70, 20);

        jLabel6.setText("Estoque");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 70, 100, 20);
        jPanel1.add(txt_estoque_prod);
        txt_estoque_prod.setBounds(10, 90, 220, 30);
        jPanel1.add(txt_valor_pro);
        txt_valor_pro.setBounds(400, 90, 170, 30);

        jLabel2.setText("Valor");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 70, 60, 20);

        tb_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Estoque", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_produto);
        if (tb_produto.getColumnModel().getColumnCount() > 0) {
            tb_produto.getColumnModel().getColumn(1).setMinWidth(300);
            tb_produto.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 200, 560, 150);

        jLabel7.setText("Pesquisar");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 130, 60, 20);
        jPanel1.add(txt_nome_prod1);
        txt_nome_prod1.setBounds(10, 150, 440, 30);

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\PROGRAMAS - DESENVOLVIMENTO\\ICONES botoes de sistemas\\png\\16x16\\consultar.png")); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 150, 110, 30);

        btn_cancelar_pro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/remove.png"))); // NOI18N
        btn_cancelar_pro.setText("Cancelar");
        btn_cancelar_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_proActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar_pro);
        btn_cancelar_pro.setBounds(10, 370, 103, 40);

        btn_excluir_prod.setIcon(new javax.swing.ImageIcon("D:\\PROGRAMAS - DESENVOLVIMENTO\\ICONES botoes de sistemas\\png\\24x24\\application_remove.png")); // NOI18N
        btn_excluir_prod.setText("Excluir");
        jPanel1.add(btn_excluir_prod);
        btn_excluir_prod.setBounds(120, 370, 110, 40);

        btn_alterar_prod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/cad-editar.png"))); // NOI18N
        btn_alterar_prod.setText("Alterar");
        jPanel1.add(btn_alterar_prod);
        btn_alterar_prod.setBounds(350, 370, 110, 40);

        btn_novo_prod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/cad-adicionar.png"))); // NOI18N
        btn_novo_prod.setText("Novo");
        btn_novo_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novo_prodActionPerformed(evt);
            }
        });
        jPanel1.add(btn_novo_prod);
        btn_novo_prod.setBounds(240, 370, 100, 40);

        btn_salvar_prod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/accept.png"))); // NOI18N
        btn_salvar_prod.setText("Salvar");
        jPanel1.add(btn_salvar_prod);
        btn_salvar_prod.setBounds(470, 370, 100, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 420);

        setBounds(0, 0, 598, 456);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cod_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_prodActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_cancelar_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_proActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_proActionPerformed

    private void btn_novo_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novo_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_novo_prodActionPerformed

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
            java.util.logging.Logger.getLogger(frm_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_produto().setVisible(true);
            }
        });
    }
    /**
     * Preenche a tabela de produtos com os produtos cadastrados no banco.
     */
    private void carregarProdutos(){
    listarModelProdutos = controllerProdutos.retornarListaProdutoController();
    DefaultTableModel modelo = (DefaultTableModel) tb_produto.getModel();
    modelo.setNumRows(0);
    // Inserir produtos na tabela produtos
    int cont = listarModelProdutos.size();       
    for (int i = 0; i < cont; i++){
            
            modelo.addRow(new Object[]{
            listarModelProdutos.get(i).getId_produtos(),
            listarModelProdutos.get(i).getNome_prod(),         
            listarModelProdutos.get(i).getEstoque_prod(),
            listarModelProdutos.get(i).getValor_prod()            
            });  
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar_prod;
    private javax.swing.JButton btn_cancelar_pro;
    private javax.swing.JButton btn_excluir_prod;
    private javax.swing.JButton btn_novo_prod;
    private javax.swing.JButton btn_salvar_prod;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_produto;
    private javax.swing.JTextField txt_cod_prod;
    private javax.swing.JTextField txt_estoque_prod;
    private javax.swing.JTextField txt_nome_prod;
    private javax.swing.JTextField txt_nome_prod1;
    private javax.swing.JTextField txt_valor_pro;
    // End of variables declaration//GEN-END:variables
}