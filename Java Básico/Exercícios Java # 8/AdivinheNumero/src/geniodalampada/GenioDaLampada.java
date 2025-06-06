/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package geniodalampada;

import java.awt.Font;

/**
 *
 * @author magal
 */
public class GenioDaLampada extends javax.swing.JFrame {

    /**
     * Creates new form GenioDaLampada
     */
    public GenioDaLampada() {
        initComponents();
        lblFrase.setVisible(false);
        lblBemVindo.setVisible(true);
        lblBemVindo.setText("<html>Tente acertar o nº de <strong>1 a 5</strong> que pensei e poderá fazer 3 desejos.</html>");
        //<strong> e </strong> servem para deixar em negrito aquilo que está entre eles.
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtValor = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFrase = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPalpite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtValor.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtValor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        txtValor.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 70, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chute um número de 1 a 5.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/geniodalampada/imagem/genio jafar.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("FRASE");
        lblFrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 110));

        lblBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBemVindo.setText("Mensagem inicial");
        lblBemVindo.setToolTipText("");
        lblBemVindo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/geniodalampada/imagem/balao de fala.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, -1));

        jLabel5.setText("VALOR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        btnPalpite.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPalpite.setForeground(new java.awt.Color(0, 255, 0));
        btnPalpite.setText("PALPITE");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        // TODO add your handling code here:
        
        /*
        *para mim essa é a pior parte até agora, pois é tanta informação para
        *fazer uma coisa simples. Mas esse trecho de número "93" funciona asisim :
        *criei uma variável do tipo inteiro para receber o conteúdo do controle 
        *giratório "txtValor" para esse controle uso o comando ".getValue()" depois
        *converto-o para String usando ".toSting()" porém uma variável numérica não
        *pode receber um valor caractere, então coloco entre parênteses e uso 
        *"Interger.parseInt" para acabar com a incompatibilidade de tipos
        *tem uma aula só de incompatibilidade de tipos 
        */
        double random = 1 + Math.random() * (6-1);//Classe Math para numeros aleatórios
        //tive que tirar o (5-1) e deixar somente 5 ou por 6 no lugar de 5 porque do 1º modo excluia a possibilidade de sair o numeral 5
        /* Essa parte deu para quebrar a cabeça tbm porque não tinha usado a classe
        random antes.*/
        int ran = (int) random;// É IMPORTANTE USAR TIPE CAST PARA NÃO TER PROBLEMAS veja mais no caderno aula 7
        int valor = Integer.parseInt(txtValor.getValue().toString());//atribuindo conteudo do controle a variável
        String frase = (valor == ran) ? "<html>Você acertou ! Mas, sobre os desejos... era binks <strong>(:</strong></html>" : "<html> Você errou ! Pensei no nº " + ran + "</html>";
        
        lblFrase.setFont(new Font("Arial Black",Font.PLAIN,16));
        lblFrase.setText(frase);
        
        lblBemVindo.setVisible(false);
        lblFrase.setVisible(true);
        /*CONSEGUI FAZR SOZINHO,SEGUI O PROFESSOR SÓ EM ALGUMAS ESTRUTURAS DO PROJETO
        E COPIEI ALGUNS NOMES DAS VARIÁVEIS.*/
        //Consegui chegar a proposta pedida pelo professor, pórem vi a resolução e incrmentei com comandos <html> e </html>; <strong> e </strong>
        
    }//GEN-LAST:event_btnPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(GenioDaLampada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenioDaLampada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenioDaLampada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenioDaLampada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenioDaLampada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtValor;
    // End of variables declaration//GEN-END:variables
}
