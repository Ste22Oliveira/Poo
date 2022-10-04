/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaintroduçao;

import javax.swing.JOptionPane;

/**
 *
 * @author 0044725
 */
public class AulaIntroduçao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double x=0, acumulador=0 , media=0;
      String texto=null;
      System.out.println("Inicio main");
      JOptionPane.showMessageDialog(null,"Inicio do pragrama");
        double contador = 0;
      do{
      texto=JOptionPane.showInputDialog("Digite o valor de x:");
      x=Double.parseDouble(texto);
        if(x>=0){
        contador=contador+1 ;
        acumulador=acumulador+x;
        }
        else{
           JOtionPane.showMessageDialog(null,"Fim da sequencia");
          
        }
      }while(x>=0);
      JOptionPane.showMessageDialog(null, "Contador="+contador);
      JOptionPane.showMessageDialog(null, "Acumulador="+acumulador);
      JOptionPane.showMessageDialog(null, "Média="+(acumulador/contador));
      JOptionPane.showMessageDialog(null, "Fim do pragrama) 
}
    
}
