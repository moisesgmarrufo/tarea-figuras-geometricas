/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author moises
 */
public class circulo extends Figuras{
private int radio;

    public circulo(float area, float perimetro, int radio) {
        super(area, perimetro);
        this.radio= radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

  

    @Override
    public float area() {
     int q = radio*radio;  
     
   //  Math.PI
       area = (float)(q  *  3.1416);
     return super.getArea();
        
    }

    @Override
    public float perimetro() {
        
        
     perimetro= (float) (radio * 2 *  3.1416);   
        
    return super.getPerimetro();
        
    }
    
}
