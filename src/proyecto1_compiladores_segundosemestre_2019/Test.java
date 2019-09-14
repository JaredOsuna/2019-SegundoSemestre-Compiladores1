/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_compiladores_segundosemestre_2019;
import Nodos.NodoSintactico;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Eleazar Lopez <Universidad de San Carlos de Guatemala>
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public Test() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaCodigo = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaCodigo.setColumns(20);
        areaCodigo.setRows(5);
        jScrollPane1.setViewportView(areaCodigo);

        jTabbedPane1.addTab("tab1", jScrollPane1);

        jButton1.setText("HTML");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CSS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("UFE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String texto = areaCodigo.getText();
        if(!texto.isEmpty()){
            Analizadores.HTML.Analisis_Lexico lexico_html = new Analizadores.HTML.Analisis_Lexico(new BufferedReader(new StringReader(texto)));
            Analizadores.HTML.Analisis_Sintactico sintactico_html = new Analizadores.HTML.Analisis_Sintactico(lexico_html);
            try{
                sintactico_html.parse();
            } catch (Exception ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String texto = areaCodigo.getText();
        if(!texto.isEmpty()){
            Analizadores.CSS.Analisis_Lexico lexico_css = new Analizadores.CSS.Analisis_Lexico(new BufferedReader(new StringReader(texto)));
            Analizadores.CSS.Analisis_Sintactico sintactico_css = new Analizadores.CSS.Analisis_Sintactico(lexico_css);
            try{
                sintactico_css.parse();
            } catch (Exception ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String texto = areaCodigo.getText();
        if(!texto.isEmpty()){
            Analizadores.UFE.Analisis_Lexico lexico_ufe = new Analizadores.UFE.Analisis_Lexico(new BufferedReader(new StringReader(texto)));
            Analizadores.UFE.Analisis_Sintactico sintactico_ufe = new Analizadores.UFE.Analisis_Sintactico(lexico_ufe);
            try{
                sintactico_ufe.parse();
                Ejecutor ejecutor = new Ejecutor();
                ejecutor.Ejecutar(sintactico_ufe.padre);
                FileWriter archivo = null;
                PrintWriter pw = null;
                String cadena = graficarNodo(sintactico_ufe.padre);
                try{
                    archivo = new FileWriter("arbol.dot");
                    pw = new PrintWriter(archivo);
                    pw.println("digraph G{\nnode[shape=box];\nrankdir=UD;\n");
                    pw.println(cadena);
                    pw.println("\n}");
                    archivo.close();
                }catch (IOException e){}
                
                try{
                    String cmd = "dot -Tpng arbol.dot -o arbol.png";
                    Runtime.getRuntime().exec(cmd);
                }catch (IOException e){}
            } catch (Exception ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public String graficarNodo(NodoSintactico nodo){
        String cadena = "";
        for(NodoSintactico hijos: nodo.getHijos()){
            String nodoPadre = "";
            String nodoHijo = "";
            if(nodo.getValor() != null){
                nodoPadre = "\"" + nodo.getNumNodo() + "_" + nodo.getNombre() + "\"" + "[label = \"" + nodo.getValor() + "\"];";
            } else {
                nodoPadre = "\"" + nodo.getNumNodo() + "_" + nodo.getNombre() + "\"" + "[label = \"" + nodo.getNombre() + "\"];";
            }
            if(hijos.getValor() != null){
                nodoHijo = "\"" + hijos.getNumNodo() + "_" + hijos.getNombre() + "\"" + "[label = \"" + hijos.getValor() + "\"];";
            } else {
                nodoHijo = "\"" + hijos.getNumNodo() + "_" + hijos.getNombre() + "\"" + "[label = \"" + hijos.getNombre() + "\"];";
            }
            String apuntadorPadre = "\"" + nodo.getNumNodo() + "_" + nodo.getNombre() + "\"";
            String apuntadorHijo = "\"" + hijos.getNumNodo() + "_" + hijos.getNombre() + "\"";
            cadena += nodoPadre + "\n" + nodoHijo + "\n" + apuntadorPadre + "->" + apuntadorHijo + ";\n";
            cadena += graficarNodo(hijos);
        }
        return cadena;
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Test().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCodigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
