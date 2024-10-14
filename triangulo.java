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
public class triangulo extends Figuras {
protected int lado;
protected int lado2;
protected int lado3;

protected int altura;
protected int base;
    public triangulo(float area, float perimetro,int lado,int lado2 ,int lado3, int altura, int base) {
        super(area, perimetro);
        
       this.lado= lado;
         this.lado2= lado2;
           this.lado3= lado3;
             this.base= base;
               this.altura= altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    @Override
    public float area() {
    
   area= base* altura /2;     
        
    return super.getArea();
       
    }

    @Override
    public float perimetro() {
        
   perimetro =   lado+ lado2+ lado3;
        
        
    return super.getPerimetro();
        
    }
    
}
