/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopa;

import java.util.Scanner;

/**
 *
 * @author Juan Diego Pachón
 */
public class solucion{
    private int cantidadLetras;
    private char[][] sopaletras;
    private StringBuffer horisontalAumento,horinsontalDecremento,verticalAumento,verticalDecremento;
    private String palabras[], encontradas[];
    private Scanner entrada;
    private int tamañoFila;
    private int tamañoColumna;
    private boolean seguir=true;
    
    public solucion() {
        
        do{
            entrada =new Scanner(System.in);      
            bienvenida();
            tomarDatos();
            tamañoSopa();
            llenadoSopa();
            continuar();
        }while(seguir);
    }
    
    /**
     * mensaje de bienveida
     */
    
    private void bienvenida() {
        boolean sequir=true;
        
            try {            
                System.out.println("Bienvinido");
                System.out.println("Por favor dijite la cantidad de palabras a dijitar");
                this.cantidadLetras = entrada.nextInt();
                palabras=new String[cantidadLetras];
                sequir=false;
            
            }catch(Exception ex){
                System.out.println("Error vuelva a intentar");
            }        
        
    }
    
    private void  tomarDatos(){
        int ba=1;
        try{
            for(int i=0;i<this.cantidadLetras;i++){
                System.out.println("digite la "+ba+" palabra");
                ba++;
                palabras[i]=entrada.next();
            }
        }catch(Exception ex){
            System.out.println("ERROR");
        }
        
    }
    
    private void tamañoSopa(){
        boolean seguir=true;
        if (this.cantidadLetras==0){
            System.out.println("");
        }else{
            Scanner entrada1 = new Scanner(System.in);
                try{
                    System.out.println("Por favor dijite el tamaño de la fila");
                    this.tamañoFila=entrada1.nextInt();
                    System.out.println("Por favor dijite el tamaño de la fila");
                    this.tamañoColumna=entrada1.nextInt();
                    this.sopaletras=new char[tamañoFila][tamañoColumna];
                    seguir=false;
                }catch(Exception ex){
                    System.out.println("Error de dijitacion");
                    System.out.println("--- Vuelva a intentar---");
                }
        }   
    }
    
    private void llenadoSopa(){
        
        boolean sequir=true;
        Scanner entradas = new Scanner(System.in);
        try {
            for (int i=0;i<this.tamañoFila;i++){
                for (int j=0;j<this.tamañoColumna;j++){
                    System.out.println("/////////////////////////");
                    System.out.println("se encuentra "+ i+" "+j);
                    System.out.println("Dijite la letra");
                    sopaletras[i][j]=entradas.next().charAt(0);;
                        //sequir= false;
                }                    
            }
        }catch(Exception ex){
            System.out.println("Erro de dijitacion");
        }
    }

    private void continuar() {
        Scanner entrada2=new Scanner(System.in);
        int numero=0;
        System.out.println("Desea cuntinuar");
        System.out.println("1. continuar");
        System.out.println("2. salir");
        numero=entrada2.nextInt();
        if(numero==2){
           this.seguir= false;     
        }
    }
}