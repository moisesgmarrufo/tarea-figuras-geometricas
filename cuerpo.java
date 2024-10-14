/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.util.*;

public class cuerpo  {
JFrame pantalla =new JFrame("sistema"); 

JLabel etiqueta = new JLabel("coloque aca que figura desea utilizar");    
JLabel etialtura = new JLabel("coloque aca la altura");
JLabel etibase = new JLabel("coloque aca base");
JLabel eti = new JLabel("coloque aca sus lados");

JTextField deseo = new JTextField ();

JTextField valor1 = new JTextField ();
JTextField valor2 = new JTextField ();
JTextField valor3 = new JTextField ();
JTextField valor4 = new JTextField ();
JTextField valor5 = new JTextField ();
JTextField valor6 = new JTextField ();

JPanel panel = new JPanel();

JButton bt1n = new JButton("siguiente");
JButton bt3n = new JButton("perimetro");
JButton bt2n = new JButton("salir");
 
Object botonpressed = new Object();
  
String figura = new String();
int base;
int altura;
int area;

int lado;
int lado2;
int lado3;

float perimetro;

   private void consulta() {
        figura = deseo.getText();
       switch(figura){
           case "cuadrado" :
         cuadrado();
           break;
  
           case "triangulo":
           triangulo();
           break;
    
           case "circulo":
            circulo();   
           break;
               
           default:
             JOptionPane.showMessageDialog(null,"colocar la figura geometrica correctamente escrita");
             
                     }
    }

ActionListener oyeboton = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       botonpressed = e.getSource();

       if(botonpressed.equals(bt1n)){
        consulta();
       
       }else{ 
                   }
      if(botonpressed.equals(bt2n)){
          System.exit(0);
      }
      
 
    }
 
};


public cuerpo(){
                bt1n.addActionListener(oyeboton);
                bt1n.setBounds(10, 200, 100, 40);
                panel.add(bt1n);
                
                bt2n.addActionListener(oyeboton);
                bt2n.setBounds(100, 200, 100, 40);
                panel.add(bt2n);
   
           
panel.setLayout(null);           
etiqueta.setBounds(10, 10, 300, 40);
panel.add(etiqueta);
deseo.setBounds(10, 50, 100, 20);
 
panel.add(deseo);
pantalla.setVisible(true);
pantalla.setSize(400, 400);
pantalla.add(panel);
pantalla.setDefaultCloseOperation(1);
 
}
    public static void main(String[] args) {
  SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
      new cuerpo();    
    
      }
  });
    }

   
    
    
private void cuadrado() {
        ocultar();
valor2.setVisible(false);      

base = Integer.parseInt(valor1.getText());



int i= 0;
   
do {
area = base* base;
perimetro= base * 4;
    } while(i != 0);
etialtura.setVisible(false);

eti.setText("su perimetro es  "+base);
etibase.setText("el area es "+area);

    }

private void triangulo() {
         ocultar();   
 
etialtura.setBounds(150,30,150,20);
panel.add(etialtura);
etibase.setBounds(10,30,100,20);
panel.add(etibase);

valor3.setVisible(true);
valor4.setVisible(true);
valor5.setVisible(true);


  
lado = Integer.parseInt(valor3.getText());
lado2 = Integer.parseInt(valor4.getText());
lado3 = Integer.parseInt(valor5.getText());

base = Integer.parseInt(valor1.getText());
   

altura = Integer.parseInt(valor2.getText());


 
           





int i= 0;
   
do {
area = base* altura /2;
etiqueta.setText("el area es "+area);
perimetro= lado2+lado+lado3;

    } while(i != 0);
etialtura.setVisible(false);
etibase.setVisible(false);
etiqueta.setVisible(true);
  
}

private void circulo() {

    ocultar();

    valor2.setVisible(false);      
    base = Integer.parseInt(valor1.getText());
    
    
     int i= 0;  

 
do {

area = base ^ 2;
etibase.setText("el area es " + area);
perimetro= (float) (base * 2 *  3.1416);


    } while(i != 0);  



etialtura.setVisible(false);


    }


   
    
    private void ocultar() {
bt1n.setText("calcular");

eti.setBounds(120, 100, 150, 40);
panel.add(eti);

valor3.setBounds(200, 150, 100, 20);
panel.add(valor3); 


valor1.setBounds(10, 50, 100, 20);
panel.add(valor1); 

valor2.setBounds(150, 50, 100, 20);
panel.add(valor2);

valor4.setBounds(100, 150, 100, 20);
panel.add(valor4);

valor5.setBounds(10, 150, 100, 20);
panel.add(valor5);  


deseo.setVisible(false);
etiqueta.setVisible(false);
valor3.setVisible(false);
valor4.setVisible(false);
valor5.setVisible(false);

    }
}   



