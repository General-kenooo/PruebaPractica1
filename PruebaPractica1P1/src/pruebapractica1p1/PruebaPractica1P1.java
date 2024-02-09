/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapractica1p1;

import java.util.Scanner;

public class PruebaPractica1P1 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true){
            System.out.println("Bienvenido a la clase");
            System.out.println("1)Repetir mi nombre");
            System.out.println("2)Sub menu de mensajes");
            System.out.println("3) Salir");
            System.out.println("Elija una de estas opciones");
            int op = entrada.nextInt();
            
            switch (op){
                case 1->{
                    System.out.println("Bienvenido a repetir tu nombre");
                    System.out.println("Ingrese su nombre: ");
                    int cantRepetir = entrada.nextInt();
                    entrada.nextLine();
                    String nombrePersona = entrada.nextLine();
                    
                    for (int i = 0; i < cantRepetir; i++) {
                        System.out.println("Hola mi nombre es "+nombrePersona+"y miren mi prueba!");
                        
                    }
                    
                    
                }
                case 2->{
                    int SubMenu;
                    do{
                        System.out.println("Bienvenido a SubMenu: ");
                    System.out.println("Bienvenido");
                        System.out.println("Despedida");
                        System.out.println("Salir del SubMenu");
                        
                        System.out.println("Ingrese su opcion: ");
                        SubMenu = entrada.nextInt();
                        
                        switch (SubMenu){
                            case 1:
                                System.out.println("Ingrese un msg de eleccion");
                                String palabra = entrada.nextLine();
                                System.out.println("Bienvenido"+palabra);
                                break;
                            case 2:
                                System.out.println("Hasta luego, gracias por usar mi programa :)");
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Opcion no valida, seleccione una opcion valida");
                                
                                
                        }
                    }while(SubMenu !=3);
                    
                    
                }
            
            }
    }
  }
    
}
