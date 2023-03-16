/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.proyecalculador;

/**
 *
 * @author User
 */
public class Calculator {
       float x;
    float y;

    public Calculator() {
    }

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    float add(){
        return (x+y);
    }
    
    float resta(){
        return (x-y);
    }
    
    float producto(){
        return (x*y);
    }
    
    float division(){
        if (y==0) 
            return (0);
        else
            return (x/y);
    }
}
