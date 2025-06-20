/*
 * jdlgTesteTabelas.java
 *
 * Created on 11 de Dezembro de 2006, 11:16
 */

package br.ufjf.caed.exemplo.view;

/**
 * 
 * Exemplo do CAEd Framework.
 * 
 * @version $Id:$
 * @author <a href="mailto:aryjunior@gmail.com">Ary Junior</a>
 *
 * @dianaframework.view
 *  name="TesteTabelas"
 *  title="Teste com Tabelas"
 *  actions-package="br.ufjf.caed.exemplo.action.teste"
 *  collections-package="br.ufjf.caed.exemplo.model.teste"
 *
 */
public class jdlgTesteTabelas extends javax.swing.JDialog {
    
    /** Creates new form jdlgTesteTabelas */
    public jdlgTesteTabelas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblNaoPublicadas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblPublicadas = new javax.swing.JTable();
        jbtnAdicionar = new javax.swing.JButton();
        jbtnRemover = new javax.swing.JButton();
        jbtnFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jtblNaoPublicadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblNaoPublicadas);

        jtblPublicadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtblPublicadas);

        jbtnAdicionar.setText(">>");

        jbtnRemover.setText("<<");

        jbtnFechar.setText("Fechar");

        jLabel1.setText("Not\u00edcias n\u00e3o publicadas");

        jLabel2.setText("Not\u00edcias publicadas");

        jbtnSalvar.setText("Salvar");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(462, 462, 462)
                        .add(jbtnSalvar)
                        .add(24, 24, 24)
                        .add(jbtnFechar))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 271, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 22, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jbtnAdicionar)
                            .add(jbtnRemover))
                        .add(16, 16, 16)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 267, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane2, 0, 0, Short.MAX_VALUE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 177, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(42, 42, 42)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbtnSalvar)
                    .add(jbtnFechar))
                .add(28, 28, 28))
            .add(layout.createSequentialGroup()
                .add(59, 59, 59)
                .add(jbtnAdicionar)
                .add(47, 47, 47)
                .add(jbtnRemover)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jdlgTesteTabelas(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }

    /**
     *
     * @dianaframework.action
     *  name="AdicionarPublicada"
     *
     */
    public javax.swing.JButton getJbtnAdicionar() {
        return jbtnAdicionar;
    }

    /**
     *
     * @dianaframework.action
     *  name="closeView"
     *
     */
    public javax.swing.JButton getJbtnFechar() {
        return jbtnFechar;
    }

    /**
     *
     * @dianaframework.action
     *  name="RemoverPublicada"
     *
     */
    public javax.swing.JButton getJbtnRemover() {
        return jbtnRemover;
    }

    /**
     *
     * @dianaframework.action
     *  name="SalvarPublicadas"
     *
     */
    public javax.swing.JButton getJbtnSalvar() {
        return jbtnSalvar;
    }
    
    /**
     *
     * @dianaframework.table
     *  name="jtblNaoPublicadas"
     *  model="ColecaoNoticiasNaoPublicadas"
     *
     */
    public javax.swing.JTable getJtblNaoPublicadas() {
        return jtblNaoPublicadas;
    }
    
    /**
     *
     * @dianaframework.table
     *  name="jtblPublicadas"
     *  model="ColecaoNoticiasPublicadas"
     *
     */
    public javax.swing.JTable getJtblPublicadas() {
        return jtblPublicadas;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnAdicionar;
    private javax.swing.JButton jbtnFechar;
    private javax.swing.JButton jbtnRemover;
    private javax.swing.JButton jbtnSalvar;
    private javax.swing.JTable jtblNaoPublicadas;
    private javax.swing.JTable jtblPublicadas;
    // End of variables declaration//GEN-END:variables
    
}
