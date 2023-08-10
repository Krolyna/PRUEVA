/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.catalogocuenta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author User
 */
public class CuentaContable extends javax.swing.JFrame {

    boolean crear = false;
    public static String Santigualinea="";
    
    public CuentaContable() {
        initComponents();
       
         ButtonGroup btonG=new ButtonGroup();
           btonG.add(btonGeneral);
           btonG.add(btonDetalle);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btonGrupo = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LbNro_cta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNro_cta = new javax.swing.JTextField();
        txtDescrip_cta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbxGrupo_cta = new javax.swing.JComboBox<>();
        txtNivel_cta = new javax.swing.JTextField();
        txtCuenta_Padre = new javax.swing.JTextField();
        btonGuardar = new javax.swing.JButton();
        btonLimpiar = new javax.swing.JButton();
        btonDetalle = new javax.swing.JRadioButton();
        btonGeneral = new javax.swing.JRadioButton();
        btonCerrar = new javax.swing.JButton();
        Status = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setName("FONDO"); // NOI18N
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbNro_cta.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        LbNro_cta.setText("N° Cuenta");
        jPanel1.add(LbNro_cta, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 89, -1, -1));

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel2.setText("Desc. de cuenta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 142, -1, -1));

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel3.setText("Tipo Cuenta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 182, -1, -1));

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel4.setText("Nivel Cuenta");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 224, -1, -1));

        txtNro_cta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNro_ctaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNro_cta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 88, 221, -1));
        jPanel1.add(txtDescrip_cta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 142, 221, 20));

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel5.setText("Cuenta Padre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 271, -1, -1));

        jLabel6.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel6.setText("Grupo Cuenta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 311, -1, -1));

        cmbxGrupo_cta.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        cmbxGrupo_cta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Pasivo", "Capital", "Ingresos", "Costos", "Gastos" }));
        jPanel1.add(cmbxGrupo_cta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 221, -1));
        jPanel1.add(txtNivel_cta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 223, 221, -1));
        jPanel1.add(txtCuenta_Padre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 221, -1));

        btonGuardar.setBackground(new java.awt.Color(204, 204, 255));
        btonGuardar.setFont(new java.awt.Font("DialogInput", 3, 14)); // NOI18N
        btonGuardar.setText("Guardar");
        btonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 378, 90, 36));

        btonLimpiar.setBackground(new java.awt.Color(204, 204, 255));
        btonLimpiar.setFont(new java.awt.Font("DialogInput", 3, 14)); // NOI18N
        btonLimpiar.setText("Limpiar");
        btonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 378, 90, 36));

        btonDetalle.setBackground(new java.awt.Color(255, 255, 255));
        btonGrupo.add(btonDetalle);
        btonDetalle.setFont(new java.awt.Font("DialogInput", 3, 14)); // NOI18N
        btonDetalle.setText("Detalle");
        jPanel1.add(btonDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 180, -1, -1));

        btonGeneral.setBackground(new java.awt.Color(255, 255, 255));
        btonGrupo.add(btonGeneral);
        btonGeneral.setFont(new java.awt.Font("DialogInput", 3, 14)); // NOI18N
        btonGeneral.setText("General");
        jPanel1.add(btonGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 180, -1, -1));

        btonCerrar.setBackground(new java.awt.Color(204, 204, 255));
        btonCerrar.setFont(new java.awt.Font("DialogInput", 3, 14)); // NOI18N
        btonCerrar.setText("Cerrar");
        btonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 378, 90, 36));
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 426, 86, 11));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Light", 2, 24)); // NOI18N
        jLabel1.setText("Catalago Cuenta Contable");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 28, -1, -1));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 580, 470));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 747, 444));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNro_ctaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNro_ctaActionPerformed
        int nro_Cta; 
        int nivel_cta;
        int ctaP;
        
        nro_Cta=Integer.parseInt(txtNro_cta.getText());
        nivel_cta= Integer.parseInt(txtNivel_cta.getText());
        ctaP= Integer.parseInt(txtCuenta_Padre.getText());
        
        boolean encontrado= false;
        
        Scanner s;
      
        try{
            
        File f = new File("C: archivo1.txt");
        s = new Scanner (f);
        
        if(!f.exists())
            {
              f.createNewFile();
            }
        else 
        {
          while (s.hasNextLine() && !encontrado)
          {
              String linea = s.nextLine();
              Scanner s1 = new Scanner (linea);
              
              s1.useDelimiter("\\\\s*;\\\\s*");
              
              try 
              {
                  if (nro_Cta == Integer.parseInt(s1.next()))
                  {
                      txtNro_cta.setText(s1.next());
                      txtDescrip_cta.setText(s1.next());
                      txtNivel_cta.setText(s1.next());
                      txtCuenta_Padre.setText(s1.next());
                      encontrado = true;
                      crear=true;
                      
                      Santigualinea=(txtNro_cta.getText() + " ; " + txtDescrip_cta.getText()+ " ; " +txtNivel_cta.getText() + "; "+ txtCuenta_Padre.getText());
                      Status.setText("Modificando...");     
                  }
                  
                  else 
                    {
                        btonCerrar.setText("Este registro no existe");
                        txtNro_cta.setText("");
                        encontrado = false;
                        crear = false;
                        Status.setText("Creando");
                    }
                  
              }
            catch (Exception e1)
                 {
                   JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e1);
                   e1.printStackTrace();
                 }
          
          } // fin del while
          
        }
        s.close();
                
        } //fin Try 
        catch(FileNotFoundException e1)  
        {
          JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e1);
           e1.printStackTrace();
        }
        catch (IOException e1)
             {
              e1.printStackTrace();
             } 
    }//GEN-LAST:event_txtNro_ctaActionPerformed

    private void btonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonLimpiarActionPerformed
        txtNro_cta.setText("");
        txtDescrip_cta.setText("");
        txtNivel_cta.setText("");
        txtCuenta_Padre.setText("");   
    }//GEN-LAST:event_btonLimpiarActionPerformed

    private void btonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btonCerrarActionPerformed

    private void btonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonGuardarActionPerformed
       
        String nroCta= "";
        String desc_Cta="";
        String Snuevalinea="";
        boolean Tipo_cta = true;
        String Nivel_cta= "";
        String Cta_Padre= "";
        String Grupo_cta= "";
        
        //Variables local para almacenar la opcion seleccionada del boton
        String selecBton= "";
        String selectCmbx = cmbxGrupo_cta.getSelectedItem().toString();
        
        ArchivoPrueba MA =new ArchivoPrueba();
        nroCta = txtNro_cta.getText();
        desc_Cta=txtDescrip_cta.getText();
        Nivel_cta= txtNivel_cta.getText();
        Cta_Padre=txtCuenta_Padre.getText();
 
          // selecciona la opcion del boton
             JRadioButton[] btonG ={btonDetalle, btonGeneral};
         
                        for(int i=0;i<btonG.length;i++)
                        {
                           if(btonG[i].isSelected())
                           {
                            selecBton=btonG[i].getText();
                           } 
                           
                        } // fin del for 
                        
            //Seleccion del cmbx (activo, pasivo, etc)
            
            cmbxGrupo_cta.addItem("");
            
        
        try{
             if (crear == false )
                {
                    MA.GuardarDatos(nroCta, desc_Cta, Nivel_cta, Cta_Padre, selecBton, selectCmbx);
                }
             else 
             {
                 Snuevalinea=(nroCta + ", " + desc_Cta + ", " + selecBton + ", " + Nivel_cta + ", " + Cta_Padre + ", "+ selectCmbx );
                 MA.Modificar(Santigualinea, Snuevalinea);
             }
                txtNro_cta.setText("");
                txtDescrip_cta.setText("");
                txtNivel_cta.setText("");
                txtCuenta_Padre.setText(""); 
                Status.setText("");
                  
           }
           catch(IOException e1)
           {
            e1.printStackTrace();
           }  
    }//GEN-LAST:event_btonGuardarActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuentaContable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbNro_cta;
    private javax.swing.JLabel Status;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btonCerrar;
    private javax.swing.JRadioButton btonDetalle;
    private javax.swing.JRadioButton btonGeneral;
    private javax.swing.ButtonGroup btonGrupo;
    private javax.swing.JButton btonGuardar;
    private javax.swing.JButton btonLimpiar;
    private javax.swing.JComboBox<String> cmbxGrupo_cta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCuenta_Padre;
    private javax.swing.JTextField txtDescrip_cta;
    private javax.swing.JTextField txtNivel_cta;
    private javax.swing.JTextField txtNro_cta;
    // End of variables declaration//GEN-END:variables
}
