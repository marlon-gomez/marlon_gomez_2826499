package co.edu.sena.soy.oop;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scr = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        double nuemro4 = 0;

        Data data = new Data();

        int opcion = 0;
        while (opcion != 99) { //menu
            System.out.println("|------------------------------------------|");
            System.out.println("Miselanea de OOP");
            System.out.println("|------------------------------------------|");
            System.out.println("1. Operadores");
            System.out.println("2. Condicionales");
            System.out.println("3. Ciclos");
            System.out.println("99. Salir");

            System.out.println("Ingrese una opcion:");
            opcion = scr.nextInt();


                
           
            if (opcion == 1) {//operadores
                while (opcion != 9) {
                    System.out.println("|------------------------------------------|");
                    System.out.println("Categoria operadores");
                    System.out.println("|------------------------------------------|");
                    System.out.println("1. Calcular área triangulo");
                    System.out.println("2. Sumar dos numeros");
                    System.out.println("3. Elevar un número cuadrado");
                    System.out.println("4. Conversión de moneda");
                    System.out.println("5. Área y perimetro cuadrado");
                    System.out.println("6. Área y volúmen de un cilindro");
                    System.out.println("7. Área y longitud de un circulo");
                    System.out.println("8. Promedio");
                    System.out.println("9. Regresar");
    
                    System.out.println("Ingrese una opcion:");
                    opcion = scr.nextInt(); 
                    
                    if (opcion == 1) {
                        System.out.println("|------------------------------------------|");
                        System.out.println("1. Calcular área triangulo");
                        System.out.println("|------------------------------------------|");
                        System.out.println("Ingrese base");
                        numero1 = scr.nextDouble();
                        System.out.println("Ingrese altura");
                        numero2 = scr.nextDouble();
                        
                        System.out.println("El área del triangulo es:" + data.areatriangulo(numero1, numero2));
                    } else if (opcion == 2) {
                        System.out.println("|------------------------------------------|");
                        System.out.println("2. Sumar dos numeros");
                        System.out.println("|------------------------------------------|");
                        System.out.println("ingrese número");
                        numero1 = scr.nextDouble();
                        System.out.println("ingrese número");
                        numero2 = scr.nextDouble();
    
                        System.out.println("El resultado es:" + data.sumarnumeros(numero1, numero2));
                    } else if (opcion == 3) {
                        System.out.println("|------------------------------------------|");
                        System.out.println("3. Elevar un nuemro al cuadrado");
                        System.out.println("|------------------------------------------|");
                        System.out.println("ingrese número");
                        numero1 = scr.nextDouble();
    
                        System.out.println("la potencia del nuemro ingresado es:" + data.potencia(numero1));
                    } else if (opcion == 4) {
                        System.out.println("|------------------------------------------|");
                        System.out.println("4. conversor de moneda");
                        System.out.println("|------------------------------------------|");
                        System.out.println("ingrese el monto en euros:");
                        numero1 = scr.nextDouble();
    
                        System.out.println("El valor en dolares es: " + data.conversormoneda(numero1));                    
                    } else if (opcion == 5) {
                        System.out.println("|------------------------------------------|");
                        System.out.println("5. Área y perimetro cuadrado");
                        System.out.println("|------------------------------------------|");
                        System.out.println("ingrese lado del cuadrado: ");
                        numero2 = scr.nextDouble();
    
                        System.out.println("El área del cuadrado es: " + data.areacuadrado(numero2) + " " + "El perimetro del cuadrado es: " + data.perimetrocuadrado(numero2));
                    } else if (opcion == 6) {
                        System.out.println("|------------------------------------------|");
                        System.out.println("6. Área y volúmen de un cilindro");
                        System.out.println("|------------------------------------------|");
                        System.out.println("ingrese el radio: ");
                        numero1 = scr.nextDouble();
                        System.out.println("ingrese la altura: ");
                        numero2 = scr.nextDouble();
    
                        System.out.println("El área del cilindro es: " + data.areacilindro(numero1, numero2) + " " + "El volumen del cilindro es:" + data.volumencilindro(numero1, numero2));
                    } else if (opcion == 7) {
                        System.out.println("|------------------------------------------|");
                        System.out.println("7. Área y longitud de un circulo");
                        System.out.println("|------------------------------------------|");
                        System.out.println("ingrese el radio: ");
                        numero1 = scr.nextDouble();
    
                        System.out.println("El area del circulo es: " + data.areacirculo(numero1) + " " + "La longitud del circulo es: " + data.longitudcirculo(numero1));
                    } else if (opcion == 8) {
                        System.out.println("|------------------------------------------|");
                        System.out.println("8. Promedio");
                        System.out.println("|------------------------------------------|");
                        System.out.println("ingrese un numero: ");
                        numero1 = scr.nextDouble();
                        System.out.println("ingrese un numero: ");
                        numero2 = scr.nextDouble();
                        System.out.println("ingrese un numero: ");
                        numero3 = scr.nextDouble();
    
                        System.out.println("El promedio es:" + data.promedio(numero1, numero2, numero3));
                    } else if (opcion == 9) {
                        System.out.println("Regresando");
                    }{//regresar
                        
                    }{//promedio
                        
                    }{//area y longitud
                        
                    }{//arae y volumen
                        
                    }{//area y perimetro
                        
                    } {// conversor de moneda
                        
                    }{//elevar un nuemro al cuadrado
                        
                    }{ //sumar dos numeros
                        
                    }//areatriangulo
                }

            } else if (opcion == 2) {//condicionales
                System.out.println("condicionales");
                
            } else if (opcion == 3) { //ciclos
                System.out.println("ciclos");
            } else if (opcion == 99) { //salir
                System.out.println("salir del sistema");
            }{ //salida
                
            }{ //ciclos
                
            }{ //condicionales
                
            } //operadores
        } //menu
    }//metodo
} //clase
