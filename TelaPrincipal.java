/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) (Univap)
 * Curso: Engenharia da Computação - Data de Entrega: 29/05/2023
 * Autor: Heloan José Jacinto Marinho
 * Autor: Pedro Henrique Serpa Bechelli
 *
 * Turma: 7UNA Disciplina: Algoritmos Estrutura de Dados - II
 * Projeto Final - E referente ao 2 - Bimestre
 * ***************************************************************************************/

import java.awt.BorderLayout;
import java.awt.Container;

public class TelaPrincipal extends javax.swing.JFrame {

    // Atributo que guarda a lista de jogadores.
    public static Ranking ranking = new Ranking();
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuNovoJogo = new javax.swing.JMenu();
        menuNovo = new javax.swing.JMenuItem();
        menuRanking = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuNovoJogo.setText("Jogo");
        menuNovoJogo.setName("menuNovoJogo"); // NOI18N

        menuNovo.setText("Novo");
        menuNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovoActionPerformed(evt);
            }
        });
        menuNovoJogo.add(menuNovo);

        menuRanking.setText("Ranking");
        menuRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRankingActionPerformed(evt);
            }
        });
        menuNovoJogo.add(menuRanking);

        jMenuBar1.add(menuNovoJogo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoActionPerformed
        TelaJogo jogo = new TelaJogo(); // Crie uma instância do painel Jogo
        Container contentPane = getContentPane(); // Obtenha o contêiner principal

        // Defina um novo layout para o contentPane
        contentPane.setLayout(new BorderLayout());

        // Remova todos os componentes existentes do contêiner
        contentPane.removeAll();
        TelaJogo._buttonList = new ListaLigadaDupla();

        // Adicione o painel Jogo ao contêiner no centro
        contentPane.add(jogo, BorderLayout.CENTER);

        // Revalide e redesenhe o contêiner
        contentPane.revalidate();
        contentPane.repaint();

        // Defina o painel Jogo como visível
        jogo.setVisible(true);
    }//GEN-LAST:event_menuNovoActionPerformed

    private void menuRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRankingActionPerformed
        TelaRanking ranking = new TelaRanking(); // Crie uma instância do painel Jogo
        Container contentPane = getContentPane(); // Obtenha o contêiner principal

        // Defina um novo layout para o contentPane
        contentPane.setLayout(new BorderLayout());

        // Remova todos os componentes existentes do contêiner
        contentPane.removeAll();

        // Adicione o painel Jogo ao contêiner no centro
        contentPane.add(ranking, BorderLayout.CENTER);

        // Revalide e redesenhe o contêiner
        contentPane.revalidate();
        contentPane.repaint();

        // Defina o painel Jogo como visível
        ranking.setVisible(true);
    }//GEN-LAST:event_menuRankingActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuNovo;
    private javax.swing.JMenu menuNovoJogo;
    private javax.swing.JMenuItem menuRanking;
    // End of variables declaration//GEN-END:variables
}