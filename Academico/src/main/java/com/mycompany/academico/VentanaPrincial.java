
package com.mycompany.academico;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class VentanaPrincial extends javax.swing.JFrame {
   
    int sizeMenores = 0;
    int sizeMayores = 0;
    int sizeAdultosMayores = 0;
    
    int arrayMenores[];
    int arrayMayores[];
    int arrayAdultosMayores[];
    int im = 0;
    int ima = 0;
    int iam = 0;

    public VentanaPrincial() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        search = new javax.swing.JButton();
        size = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("SISTEMA ACADÉMICO");

        create.setText("Crear");
        create.setEnabled(false);
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        search.setText("Consultar");
        search.setEnabled(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        size.setText("Tamaños");
        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(create)
                        .addGap(55, 55, 55)
                        .addComponent(search)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(140, Short.MAX_VALUE)
                        .addComponent(tittle)))
                .addGap(39, 39, 39)
                .addComponent(size)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittle)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create)
                    .addComponent(search)
                    .addComponent(size))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed

        int age = validateValue(JOptionPane.showInputDialog(rootPane, "Ingrese su edad en números enteros y sin espacios"));
       
        if (age < 18) {
            JOptionPane.showMessageDialog(rootPane, "Usted es menor de edad");
            if (im == sizeMenores) {
                JOptionPane.showMessageDialog(rootPane, "no hay espacio para almacenar");
            } else {
                arrayMenores[im] = age;
                im++;
            }
        } else if (age >= 18 && age < 65) {
            JOptionPane.showMessageDialog(rootPane, "Usted es mayor de edad");
            if (ima == sizeMayores) {
                JOptionPane.showMessageDialog(rootPane, "no hay espacio para almacenar");
            } else {
                arrayMayores[ima] = age;
                ima++;
            }
        } else if (age >= 65) {
            JOptionPane.showMessageDialog(rootPane, "Usted es adulto mayor");
            if (iam == sizeAdultosMayores) {
                JOptionPane.showMessageDialog(rootPane, "no hay espacio para almacenar");
            } else {
                arrayAdultosMayores[iam] = age;
                iam++;
            }
        }
        search.setEnabled(true);
    }//GEN-LAST:event_createActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        JOptionPane.showMessageDialog(rootPane, "menores almacenados: " + Arrays.toString(arrayMenores) + " \nAdultos almacenados: " + Arrays.toString(arrayMayores) + " \nAdultos mayores almacenados: " + Arrays.toString(arrayAdultosMayores));
    }//GEN-LAST:event_searchActionPerformed

    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
         sizeMenores = validateValue(JOptionPane.showInputDialog(rootPane, "Ingrese el tamaño del arreglo de menores en números enteros y sin espacios"));
         sizeMenores = validateValue(JOptionPane.showInputDialog(rootPane, "Ingrese el tamaño del arreglo de mayores en números enteros y sin espacios"));
         sizeMenores = validateValue(JOptionPane.showInputDialog(rootPane, "Ingrese el tamaño del arreglo de adultos mayores en números enteros y sin espacios"));
         arrayMenores = new int[sizeMenores];
         arrayMayores = new int[sizeMayores];
         arrayAdultosMayores = new int[sizeAdultosMayores];
         
         create.setEnabled(true);
         
         
    }//GEN-LAST:event_sizeActionPerformed

    public static void main(String args[]) {
       
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincial().setVisible(true);
        });
    }

    
     public int validateValue(String str) {
        while (isNumeric(str)==false) {
            str = JOptionPane.showInputDialog(rootPane, "¡Error!, el programa solo acepta números enteros y sin espacios, por favor ingrese un valor válido.");
        }
        return Integer.parseInt(str);
    }
    
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton create;
    private javax.swing.JButton search;
    private javax.swing.JButton size;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
