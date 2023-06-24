
package concatenarnumero;

public class Concatenarnumerointerfaz extends javax.swing.JFrame {

    hija hija =new hija ("Osmar", "abc123", "azul");
   
    public Concatenarnumerointerfaz() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        resultado = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        concatenarletras = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        potencia = new javax.swing.JButton();
        primo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(204, 255, 204));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado.setBackground(new java.awt.Color(255, 255, 0));
        resultado.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resultado.setToolTipText("");
        header.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 490, 100));

        txt1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        header.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 120, 50));

        txt3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        header.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 100, 40));

        txt2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        header.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 100, 50));

        limpiar.setBackground(new java.awt.Color(255, 51, 51));
        limpiar.setText("limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        header.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 110, 30));

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setText("concatenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        header.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 120, -1));

        concatenarletras.setBackground(new java.awt.Color(102, 204, 255));
        concatenarletras.setText("concatenarletras");
        concatenarletras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concatenarletrasActionPerformed(evt);
            }
        });
        header.add(concatenarletras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        suma.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        suma.setText("Suma");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });
        header.add(suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        resta.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        resta.setText("resta");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        header.add(resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        potencia.setText("potencia");
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });
        header.add(potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        primo.setText("primo");
        primo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primoActionPerformed(evt);
            }
        });
        header.add(primo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
resultado.setText("");
txt1.setText("");
txt2.setText("");
txt3.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Esto sirve para trasladar de letras a numeros
double primernumero = Double.parseDouble (txt1.getText());
double segundonumero = Double.parseDouble (txt2.getText());
double tercernumero = Double.parseDouble (txt3.getText());

String concatenarNumero=String.valueOf(primernumero)+", " +String.valueOf(segundonumero)+", "+String.valueOf(tercernumero);
resultado.setText(concatenarNumero);

// esto es para que el resultado sea en letras
//String cuartonumero=txt1.getText();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void concatenarletrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concatenarletrasActionPerformed
     String text1=txt1.getText();
     String text2=txt2.getText();
     String text3=txt3.getText();
     String pera = text1+", "+text2+", "+text3;
     resultado.setText(pera);
    }//GEN-LAST:event_concatenarletrasActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
double num1 = Double.parseDouble(txt1.getText());
double num2 = Double.parseDouble (txt2.getText());
double num3 = Double.parseDouble (txt3.getText());

String sumarNumero = String.valueOf(num1+num2+num3);
resultado.setText(sumarNumero);
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
 double nume1 = Double.parseDouble(txt1.getText());
double nume2 = Double.parseDouble (txt2.getText());
double nume3 = Double.parseDouble (txt3.getText());

String restaNumero = String.valueOf(nume1-nume2-nume3);
resultado.setText(restaNumero);
    }//GEN-LAST:event_restaActionPerformed

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
double nume1 = Double.parseDouble(txt1.getText());
double nume2 = Double.parseDouble (txt2.getText());

double potencia=hija.calcularPotencia(nume1, nume2);
resultado.setText(String.valueOf(potencia));
    }//GEN-LAST:event_potenciaActionPerformed

    private void primoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primoActionPerformed
        double nume1 = Double.parseDouble(txt1.getText());
        boolean primo = hija.esPrimo((int) nume1);
        resultado.setText(String.valueOf(primo));
    }//GEN-LAST:event_primoActionPerformed

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton concatenarletras;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton potencia;
    private javax.swing.JButton primo;
    private javax.swing.JButton resta;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton suma;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
