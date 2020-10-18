/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Karla
 */
public class Triangulo extends Figuras {
    private float base;
    private float altura;
    
    public Triangulo (float base, float altura ) {
        
        
        
        this.base=base;
        this.altura=altura;  
        
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    
    @Override
    public float CalcularArea(){
        float area;
        area= (base*altura/2);
        return area;
        
    }
    @Override
    public float CalcularPerimetro(){
        float perimetro;
        perimetro=(base*3);
        return perimetro;
    }
}
