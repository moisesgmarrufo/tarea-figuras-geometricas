/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author moises
 */
public class main{
 public static void main(String[] args ) {
int lado; 
float area = 0;
float perimetro= 0;
int radio;
int lado2;
int lado3;
int altura;
int base;

String figura;
Scanner sc = new Scanner(System.in);

System.out.print("escriba su figura deseada ");

 figura = sc.nextLine();
 
try{
    
   
    
       switch(figura){
           case "cuadrado" :
                System.out.print("escriba su lado  "); 
lado= sc.nextInt();

cuadrado a = new cuadrado(lado,area,perimetro);
System.out.println( "su area es "+ a.area());
System.out.println("su perimetro es " + a.perimetro());

           break;
  
           case "triangulo":
System.out.print("escriba su lado  "); 
lado= sc.nextInt();
System.out.print("escriba su lado2  "); 
lado2= sc.nextInt();
System.out.print("escriba su lado3  "); 
lado3= sc.nextInt();
System.out.print("escriba su altura  "); 
altura= sc.nextInt();
System.out.print("escriba su base  "); 
base= sc.nextInt();
                   
triangulo f = new triangulo(0, 0, lado, lado2 , lado3, altura,  base);
System.out.println( "su area es "+ f.area());
System.out.println("su perimetro es " + f.perimetro());    
           break;
    
           case "circulo":
               
 System.out.print("escriba su radio");              
radio = sc.nextInt();
circulo s = new circulo(perimetro,area,radio);
System.out.println("su area es "+ s.area());
System.out.println("su perimetro es " + s.perimetro());   
           break;
               
           default:
             JOptionPane.showMessageDialog(null,"colocar la figura geometrica correctamente escrita");
                
                     }
}catch(Exception e){
    System.out.print( "su error es " + e);
}

    }
}





