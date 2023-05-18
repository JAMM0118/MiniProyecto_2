/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.components;


import java.awt.Color;

import javax.swing.JOptionPane;

import models.Categorias;
import views.View;


/**
 *
 * @author DELL
 */
public class Insertar extends javax.swing.JPanel {


View vista;
models.Dulce dulce;

    public Insertar(View vista){
        this.vista = vista;
        dulce = new models.Dulce("", 0, "", null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        subtituloNombre = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        tituloinsertar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nombretxt1 = new javax.swing.JTextField();
        subtituloNombre1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        subtituloNombre2 = new javax.swing.JLabel();
        nombretxt2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        subtituloNombre3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Dulce = new javax.swing.JCheckBox();
        Dulce1 = new javax.swing.JCheckBox();
        Dulce2 = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(530, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(176, 47, 137));

        subtituloNombre.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        subtituloNombre.setForeground(new java.awt.Color(255, 255, 255));
        subtituloNombre.setText("Nombre");

        nombretxt.setBackground(new java.awt.Color(176, 47, 137));
        nombretxt.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        nombretxt.setForeground(new java.awt.Color(153, 153, 153));
        nombretxt.setText("Ingrese el nombre del dulce");
        nombretxt.setBorder(null);
        nombretxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombretxtMousePressed(evt);
            }
        });

        tituloinsertar.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        tituloinsertar.setForeground(new java.awt.Color(255, 255, 255));
        tituloinsertar.setText("Insertar dulces");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        nombretxt1.setBackground(new java.awt.Color(176, 47, 137));
        nombretxt1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        nombretxt1.setForeground(new java.awt.Color(153, 153, 153));
        nombretxt1.setText("Ingrese el precio del dulce");
        nombretxt1.setBorder(null);
        nombretxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombretxt1MousePressed(evt);
            }
        });

        subtituloNombre1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        subtituloNombre1.setForeground(new java.awt.Color(255, 255, 255));
        subtituloNombre1.setText("Descripcion");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        subtituloNombre2.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        subtituloNombre2.setForeground(new java.awt.Color(255, 255, 255));
        subtituloNombre2.setText("Precio");

        nombretxt2.setBackground(new java.awt.Color(176, 47, 137));
        nombretxt2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        nombretxt2.setForeground(new java.awt.Color(153, 153, 153));
        nombretxt2.setText("Ingrese la descripcion del dulce");
        nombretxt2.setBorder(null);
        nombretxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombretxt2MousePressed(evt);
            }
        });
    

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        subtituloNombre3.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        subtituloNombre3.setForeground(new java.awt.Color(255, 255, 255));
        subtituloNombre3.setText("Categoria");

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setText("Guardar datos");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);

            }
        });

        Dulce.setText("Dulce");
        Dulce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DulceActionPerformed(evt);
            }
        });

        Dulce1.setText("Acido");
        Dulce1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dulce1ActionPerformed(evt);
            }
        });

        Dulce2.setText("Sin azucar");
        Dulce2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dulce2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtituloNombre1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subtituloNombre)
                                    .addComponent(subtituloNombre2)))
                            .addComponent(subtituloNombre3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dulce)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombretxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombretxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dulce1)
                            .addComponent(Dulce2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(tituloinsertar)
                    .addContainerGap(153, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subtituloNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombretxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(subtituloNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombretxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(subtituloNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(subtituloNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Dulce)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Dulce1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dulce2)
                .addGap(79, 79, 79)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(tituloinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(482, Short.MAX_VALUE)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void nombretxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombretxtMousePressed
        if (nombretxt.getText().equals("Ingrese el nombre del dulce")){
            nombretxt.setText("");
            nombretxt.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_nombretxtMousePressed

    private void nombretxt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombretxt1MousePressed
        if (nombretxt1.getText().equals("Ingrese el precio del dulce")){
            nombretxt1.setText("");
            nombretxt1.setForeground(Color.black);
        }
    }//GEN-LAST:event_nombretxt1MousePressed
    private void nombretxt2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombretxt2MousePressed
        if (nombretxt2.getText().equals("Ingrese la descripcion del dulce")){
            nombretxt2.setText("");
            nombretxt2.setForeground(Color.black);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      if(nombretxt.getText().isEmpty() || nombretxt1.getText().isEmpty() || nombretxt2.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Todos los campos deben estar completos");
        return;
      }
      if(nombretxt.getText().equals("Ingrese el nombre del dulce") || nombretxt1.getText().equals("Ingrese el precio del dulce") || nombretxt2.getText().equals("Ingrese la descripcion del dulce")){
        JOptionPane.showMessageDialog(this,"Todos los campos deben estar completos");
        return;
      }
      if(!Dulce.isSelected() && !Dulce1.isSelected() && !Dulce2.isSelected()){
        JOptionPane.showMessageDialog(this,"Eliga una categoria");
        return;
      }
      
      try {
        int precio  = Integer.parseInt(nombretxt1.getText());
        dulce.setNombre(nombretxt.getText());
        dulce.setPrecio(precio);
        dulce.setDescripcion(nombretxt2.getText());
        
        Categorias categoria = Categorias.valueOf(categoriaSelect.toUpperCase());
        dulce.setCategoria(categoria);
        
        vista.setDulce(dulce);
        nombretxt.setText("");
        nombretxt1.setText("");
        nombretxt2.setText("");
        Dulce.setSelected(false);
        Dulce1.setSelected(false);
        Dulce2.setSelected(false);
        JOptionPane.showMessageDialog(this,"Dulce agregado\n"+dulce.toString());
        
      }catch (NumberFormatException e){
        JOptionPane.showMessageDialog(this,"El precio debe ser un numero valio :(");
      } catch (Exception e) {
        JOptionPane.showMessageDialog(this,"Algo salio mal :(");
        System.out.println(e.toString());
        return;
      }
    }

    private void DulceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DulceActionPerformed
        Dulce.setSelected(true);
        Dulce1.setSelected(false);
       Dulce2.setSelected(false);
       categoriaSelect = "DULCE";
    }//GEN-LAST:event_DulceActionPerformed

    private void Dulce1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dulce1ActionPerformed
        Dulce1.setSelected(true);
        Dulce.setSelected(false);
        Dulce2.setSelected(false);
        categoriaSelect = "ACIDO";

    }//GEN-LAST:event_Dulce1ActionPerformed

    private void Dulce2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dulce2ActionPerformed
        Dulce1.setSelected(false);
        Dulce.setSelected(false);
        Dulce2.setSelected(true);
        categoriaSelect = "SINAZUCAR";
    }//GEN-LAST:event_Dulce2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Dulce;
    private javax.swing.JCheckBox Dulce1;
    private javax.swing.JCheckBox Dulce2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField nombretxt1;
    private javax.swing.JTextField nombretxt2;
    private javax.swing.JLabel subtituloNombre;
    private javax.swing.JLabel subtituloNombre1;
    private javax.swing.JLabel subtituloNombre2;
    private javax.swing.JLabel subtituloNombre3;
    private javax.swing.JLabel tituloinsertar;
    private String categoriaSelect;
    // End of variables declaration//GEN-END:variables
}
