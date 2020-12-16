
package Interfaz;
import javax.swing.JOptionPane;
import operaciones2.Operaciones2;


public class ControlOperaciones extends javax.swing.JFrame {

    public ControlOperaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    Operaciones2 op = new Operaciones2();
    
    public void metodoSuma(){
        int num1 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese numero1"));
        int num2 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese numero2"));
        int auxf = op.suma(num1, num2);
        lbMensaje.setText("La respuesta calculada de la "+""+bnsuma.getText()+" es "+String.valueOf(auxf));
        
    }
    
    public void metodoResta(){
        int num1 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese numero1"));
        int num2 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese numero2"));
        int auxf = op.resta(num1, num2);
        lbMensaje.setText("La respuesta calculada de la "+""+bnResta.getText()+" es "+String.valueOf(auxf));
    }
    
    public void metodoMultiplicar(){
        int num1 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese numero1"));
        int num2 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese numero2"));
        int auxf = op.multiplicacion(num1, num2);
        lbMensaje.setText("La respuesta calculada de la "+""+bnMultiplicar.getText()+" es "+String.valueOf(auxf));
    }
    
    public void metodoDivision(){
        double num1 = Double.valueOf(JOptionPane.showInputDialog("Ingrese numero1"));
        double num2 = Double.valueOf(JOptionPane.showInputDialog("Ingrese numero2"));
        double auxf = op.division(num1, num2);
        lbMensaje.setText("La respuesta calculada de la "+""+bndividir.getText()+" es "+String.valueOf(auxf));
    }

    public void metodoRaiz(){
        int num1 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese numero"));
        int auxf = op.raiz(num1);
        lbMensaje.setText("La respuesta calculada de la "+""+bnRaiz.getText()+" es "+String.valueOf(auxf));
    }
    
    public void metodoFactorial(){
       int auxf = op.ifactorial();
       lbMensaje.setText("La respuesta calculada del "+""+bnFactorial.getText()+" es "+String.valueOf(auxf));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bnResta = new javax.swing.JButton();
        bnsuma = new javax.swing.JButton();
        bnMultiplicar = new javax.swing.JButton();
        bndividir = new javax.swing.JButton();
        bnRaiz = new javax.swing.JButton();
        bnFactorial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bnResta.setText("RESTA");
        bnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnRestaActionPerformed(evt);
            }
        });

        bnsuma.setText("SUMAR");
        bnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnsumaActionPerformed(evt);
            }
        });

        bnMultiplicar.setText("MULTIPLICACION");
        bnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnMultiplicarActionPerformed(evt);
            }
        });

        bndividir.setText("DIVISION");
        bndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bndividirActionPerformed(evt);
            }
        });

        bnRaiz.setText("RAIZ");
        bnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnRaizActionPerformed(evt);
            }
        });

        bnFactorial.setText("FACTORIAL");
        bnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnFactorialActionPerformed(evt);
            }
        });

        jLabel1.setText("SELECCIONE LA OPERACION A REALIZAR");

        lbMensaje.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bnsuma)
                            .addComponent(bnResta))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bndividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnFactorial)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnsuma)
                    .addComponent(bnMultiplicar)
                    .addComponent(bnRaiz))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnFactorial)
                    .addComponent(bndividir)
                    .addComponent(bnResta))
                .addGap(26, 26, 26)
                .addComponent(lbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnFactorialActionPerformed
        metodoFactorial();
    }//GEN-LAST:event_bnFactorialActionPerformed

    private void bnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnsumaActionPerformed
        metodoSuma();
    }//GEN-LAST:event_bnsumaActionPerformed

    private void bnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnRestaActionPerformed
        metodoResta();
    }//GEN-LAST:event_bnRestaActionPerformed

    private void bnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnMultiplicarActionPerformed
        metodoMultiplicar();
    }//GEN-LAST:event_bnMultiplicarActionPerformed

    private void bndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bndividirActionPerformed
        metodoDivision();
    }//GEN-LAST:event_bndividirActionPerformed

    private void bnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnRaizActionPerformed
        metodoRaiz();
    }//GEN-LAST:event_bnRaizActionPerformed

    public static void main(String args[]) {
 

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlOperaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnFactorial;
    private javax.swing.JButton bnMultiplicar;
    private javax.swing.JButton bnRaiz;
    private javax.swing.JButton bnResta;
    private javax.swing.JButton bndividir;
    private javax.swing.JButton bnsuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbMensaje;
    // End of variables declaration//GEN-END:variables
}
