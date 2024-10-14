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
public class cuadrado extends Figuras {
private int lado;
    public cuadrado(int lado, float area, float perimetro) {
        super(area, perimetro);

        this.lado = lado;
        
        this.area = area;
        this.perimetro = perimetro;
        
    }

    @Override
    public float area() {
       
      area = lado * lado;
       return super.getArea(); 
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public float perimetro() {
        perimetro = lado * 4;
        return super.getPerimetro();
        
    }
    
}
