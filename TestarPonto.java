/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testarponto;

import teste.Ponto;
/**
 *
 * @author 0044725
 */
public class TestarPonto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ponto p1 = new Ponto ();
        p1.setX(10);
        p1.setY(11);
        
        System.out.println("P1.x:"+p1.getX());
        System.out.println("P1.y:"+p1.getY());
        
        p1.imprimirCoordenadas();
        
        p1.zerarCoordenadas();
       
        
        //int w=p1.x;
        //Ponto p2 =new Ponto ();
    }
    
}
