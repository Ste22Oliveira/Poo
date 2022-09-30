/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author 0044725
 */
public class Ponto {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    public void incrementarCoordenadas(int deltaX, int deltaY){
        x=x+deltaX;
        y=y+deltaY;
    }
    public void imprimirCoordenadas(){
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    public void zerarCoordenadas(){
        x=0;
        y=0;
    }
    
        
    
}
