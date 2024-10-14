/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 *
 * @author moises
 */

public abstract class Figuras {

public float area;
public float perimetro;

public abstract float area();
public abstract float perimetro();


    public Figuras(float area, float perimetro) {
     this.area = area;
     this.perimetro = perimetro;
    }


    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
}
/*
cuadrado jj = new cuadrado (lado, lado2, lado3, altura, base, area, perimetro, radio);
 jj.lado = sc.nextInt();
 System.out.print("escriba su altura  ");
jj.altura = sc.nextInt();
System.out.print("escriba su altura  ");
jj.base = sc.nextInt();


.altura= 23;
a.base= 23;
a.lado= 32;

 System.out.print(a);
System.out.print(jj.getAltura());

 }
*/
   



 

 




