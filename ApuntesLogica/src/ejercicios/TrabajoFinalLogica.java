/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zacgl
 */
public class TrabajoFinalLogica {
    
    static ArrayList<String> usuario = new ArrayList<String>();
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        user();
        
        login();
        
    }
    
    public static void user (){
        
        System.out.println("Ingrese su nombre: ");
        String name = sc.nextLine();
        usuario.add(name);
        
        System.out.println(" \n Ingrese un correo electronico: ");
        String email = sc.nextLine();
        usuario.add(email);
        
        System.out.println(" \n Ingrese una contraseña: ");
        String passw = sc.nextLine();
        usuario.add(passw);
        
    }
    
    public static void login(){
        
        System.out.println(" \n Por favor inicie sesion: ");
        
        System.out.println(" \n Ingrese el correo registrado: ");
        String emailUser = sc.nextLine();
        
        System.out.println(" \n Ingrese la contraseña registrada: ");
        String passwUser = sc.nextLine();
        
        if(usuario.get(1).equals(emailUser) && usuario.get(2).equals(passwUser)){
            
            System.out.println("\n Hola " + usuario.get(0) + ", Bienvenido al programa de gestion de nombres");
            
            question();
            
        }else{
            System.out.println("\n Correo o contraseña incorrectos, por favor verifique sus datos");
        }
        
    }
    
    public static void question(){
        
        System.out.println("Desea iniciar el programa? (s/n): ");
        String answerUser = sc.nextLine();
        
        switch(answerUser){
            
            case "s":
                System.out.println("Perfecto, empecemos!");
                program();
                break;
                
            case "n":
                System.out.println("Hasta luego!");
                break;
                
            default:
                System.out.println("Ingresa una opcion valida");
        }
        
    }
    
    public static void program(){
        
        ArrayList<String> names2 = new ArrayList<>();
        Scanner sc2 = new Scanner(System.in);
        
        boolean continuar = true;
        int contador = 1;
        
        while(continuar){
            
            System.out.print("Ingrese un nombre: ");
            String nombre = sc2.nextLine();
            names2.add(nombre);

            System.out.print("¿Desea agregar otro nombre? (s/n): ");
            String respuesta = sc2.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }

            contador++;
            
        }
        
        System.out.println("Listado de nombres: ");
        
        for (int i = 0; i < names2.size(); i++) {
            System.out.println("Nombre " + (i + 1) + ": " + names2.get(i));
        }
        
        System.out.println("Hasta luego");
        
    }
    
}
