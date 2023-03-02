/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycalculadora.proyectocalculadora;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Calculadora {
    private double  operando1;
    private double resultado;
    private String control;
    public int opcion;
    
    Scanner dato = new Scanner (System.in);
    
    /// Constructores
    
    public Calculadora(){
        
    }
    
    public Calculadora(double operando1){
        this.operando1 = operando1;
    }
    
    //Metodos 

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }
    
    

    public double getOperando1() {
        return operando1;
    }
    
    
    public void sumar (){
       
        do{
           System.out.println("lleva: "+resultado);
           operando1 = dato.nextDouble();
           resultado+=operando1;
           System.out.println("Resultado: " + resultado);
           
           System.out.println("Para seguir sumando oprima + de lo contrario escriba atras.");
           dato.nextLine();
           control = dato.nextLine();
        }
        while(!(control.equals("atras")));
    }
    
    public void restar(){
        System.out.println("lleva: "+resultado);
        do{
            operando1 = dato.nextDouble();
            resultado-=operando1; 
            System.out.println("Resultado: " + resultado);

            System.out.println("Para seguir restando oprima - de lo contrario escriba atras.");
            dato.nextLine();
            control = dato.nextLine(); 
        }
        while(!(control.equals("atras")));
    }
    
    public void multiplicar (){
        System.out.println("lleva: "+resultado);
        do{
            operando1 = dato.nextDouble();
            resultado*=operando1;
            System.out.println("Resultado: " + resultado);

            System.out.println("Para seguir multiplicando oprima * de lo contrario escriba atras.");
            dato.nextLine();
            control = dato.nextLine(); 
           
        }
        while(!(control.equals("atras")));
        
    }
    
    public void dividir (){
        System.out.println("lleva: "+resultado);
        do{
            operando1 = dato.nextDouble();
            if(operando1 == 0 || resultado==0){
                
                System.out.println("No se puede dividir por 0");
            }else{
               
                resultado/=operando1;
            }
            
            System.out.println("Resultado: " + resultado);

            System.out.println("Para seguir dividiendo oprima / de lo contrario escriba atras.");
            dato.nextLine();
            control = dato.nextLine(); 
           
        }
        while(!(control.equals("atras")));
        
    }
    
    public void modulo (){
        System.out.println("lleva: "+resultado);
        do{
            operando1 = dato.nextDouble();
            if(operando1 == 0 || resultado==0){
                
                System.out.println("No se puede dividir por 0");
            }else{
               
                resultado%=operando1;
            }
            
            System.out.println("Resultado: " + resultado);

            System.out.println("Para seguir dividiendo oprima % de lo contrario escriba atras.");
            dato.nextLine();
            control = dato.nextLine(); 
           
        }
        while(!(control.equals("atras")));
        
    }
    
    public void borrar(){
        resultado = 0;
    }
    
    public void menu(){
        System.out.println("Bienvenido, que operacion desea realizar? ");
        System.out.println("1.Sumar");
        System.out.println("2.Restar ");
        System.out.println("3.Multiplicar ");
        System.out.println("4.Dividir ");
        System.out.println("5.Modulo");
        System.out.println("6.Borrar dato");
        System.out.println("7.Salir");
       
        
    }
    
    public void iniciarApp(){
        
        
        do{
            
            menu();
            opcion = dato.nextInt();
            
            switch(opcion){
                case 1 :
                    System.out.println("Ingrese un numero: ");
                    sumar();
                    break;
                case 2 :
                    System.out.println("Ingrese solamente un numero: ");
                    restar();
                    break;
                case 3 :
                    System.out.println("Ingrese solamente un numero: ");
                    multiplicar();
                    break;
                case 4 :
                    System.out.println("Ingrese solamente un numero: ");
                    dividir();
                    break;
                case 5 :
                    System.out.println("Ingrese solamente un numero: ");
                    modulo();
                    break;
                case 6 :
                    System.out.println("Ingrese solamente un numero: ");
                    borrar();
                    break;
                case 7 :
                    System.out.println("HASTA LUEGO... ");
                    
            }
            
        }while((opcion!=7));
    }
}
    



