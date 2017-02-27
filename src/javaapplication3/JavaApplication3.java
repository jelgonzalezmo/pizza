/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Estudiante
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pizza primera=new Pizza("pollo",10,10.39);
       Pizza segunda=new Pizza("jamon",15,12.39);
       java.util.Scanner teclado=new java.util.Scanner(System.in);


String ingredientes;
int  tamano;
double precio;       
Pizza [] pizzas = new Pizza[2];
for (int i =0;i<2; i++){
System.out.println("ingrese ingrediente"+(i+1));
ingredientes=teclado.next();
System.out.println("ingrese tamano"+(i+1));
tamano=teclado.nextInt();
System.out.println("ingrese el precio de la pizza" +(i+1));
precio=teclado.nextDouble();
pizzas [i]=new Pizza( ingredientes,tamano,precio);    
}
for(Pizza pizza:pizzas){
System.out.println(pizza);
}  
    }}
  