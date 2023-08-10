/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catalogocuenta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class ArchivoPrueba {
    
    public void GuardarDatos (String nroCta,String Desc_cta, String NivelCta, String CtaPadre, String sBton, String cmbxG) throws IOException
	{
            try
            {
		FileWriter F1=new FileWriter("C:archivo1.txt", true);
		PrintWriter pw=new PrintWriter(F1);
		pw.println(nroCta + ", " + Desc_cta + ", " + sBton + ", " + NivelCta + ", "+ CtaPadre + ", "+ cmbxG);
		pw.close();
                
            } catch  (Exception ex) {
		  JOptionPane.showMessageDialog(null,"Error al grabar Archivo " + ex);
                }
	    
        } // fin metodo GuardarDatos
	
    public void Modificar(String LineaAntigua,String nuevalinea)
        {
   
            File fNuevo= new File("C:archivo2.txt");
            File fAntiguo= new File("C:archivo1.txt");
            String aCadena=LineaAntigua;
            String nCadena=nuevalinea;
        
            // Declaro un nuevo buffer de lectura
            BufferedReader br;
            try
                {
                    if(fAntiguo.exists())
                      {
                        br = new BufferedReader(new FileReader(fAntiguo));

                        String linea;

                        while((linea=br.readLine()) != null)
                          {
                            if(linea.equals(aCadena))
                               {
                                  Escribir(fNuevo,nCadena);
                               }
                            else
                               {
                                  Escribir(fNuevo,linea);
                                }
                           } // fin while

                        // Cierro el buffer de lectura
                        br.close();

                       
                        String nAntiguo = fAntiguo.getName();
                        // Borro el fichero antiguo
                        borrar(fAntiguo);
                        //Renombro el fichero auxiliar con el nombre del fichero antiguo
                        fNuevo.renameTo(fAntiguo);
                    }
                    else
                    {
                        System.out.println("El Fichero no Existe");
                    }

                } // fin try
                catch(Exception e)
                    {
                        System.out.println(e);
                    }
        } // fin metodo Modificar


    void Escribir(File fFichero,String cadena)
        {
           // Declaramos un buffer de escritura
           BufferedWriter bw;

           try
            {
               if(!fFichero.exists())
                 {
                    fFichero.createNewFile();
                 }

               bw = new BufferedWriter(new FileWriter(fFichero,true));
               bw.write(cadena+"\r\n");
               bw.close();

            }// fin try
            catch(Exception e)
             {
               System.out.println(e);
             }

        } // fin metodo Escribir


    void borrar (File Ffichero)
        {
           try
            {
               // Comprovamos si el fichero existe  de ser así procedemos a borrar el archivo
               if(Ffichero.exists())
                 {
                    Ffichero.delete();
                    System.out.println("Ficherro Borrado");
                 }

            } // fin try
            catch(Exception e)
             {
                System.out.println(e);
             }
        } // fin metodo Borrar
    
    
    
}
