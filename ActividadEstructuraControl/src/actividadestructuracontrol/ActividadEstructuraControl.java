package actividadestructuracontrol;

import java.util.Scanner;

public class ActividadEstructuraControl {

    public static void main(String[] args) {

        
            
        
        int n;
        Scanner teclado = new Scanner(System.in);
        do{
        System.out.println("Bienvenidos a las Estructuras de control");
        System.out.println("Eligue una opcion");
        System.out.println("1. Estructura if");
        System.out.println("2. Estructura else if");
        System.out.println("3. Estructura ciclo for");
        System.out.println("4. Estructura ciclo while");
        System.out.println("5. Estructura ciclo do while");
        System.out.println("6. Salir");
        n = teclado.nextInt();

        switch (n) {
            case 1:
                System.out.println("ESTRUCTURA IF");
                int n1;
                int n2;
                int n3;

                System.out.println("Bienvenido");
                System.out.println("ingrese un numero");
                n1 = teclado.nextInt();
                System.out.println("ingrese otro numero");
                n2 = teclado.nextInt();
                System.out.println("ingrese otro numero");
                n3 = teclado.nextInt();

                if (n1 > n2 && n2 > n3) {
                    System.out.println(n1 + "," + n2 + "," + n3);
                }
                break;

            case 2:
                System.out.println("ESTRUCTURA ELSE IF");
                int nu1;
                nu1 = teclado.nextInt();
                System.out.println("Bienvenido");
                System.out.println("ingrese un numero");
                if (nu1 == 0) {
                    System.out.println("Cero");
                } else if (nu1 == 1) {
                    System.out.println("Primero");
                } else {
                    System.out.println("INCORRECTO");
                }
                break;

            case 3:
                System.out.println("CICLO FOR");

                int num;
                int suma = 0;

                for (int i = 0; i < 15; i++) {

                    System.out.println("Ingrese un numero");
                    num = teclado.nextInt();
                    suma = n + suma;

                }
                System.out.println("La suma resultante es" + suma);
                break;

            case 4:
                System.out.println("CICLO WHILE");

                int w;
                System.out.println("Ingrese un numero");
                w = teclado.nextInt();

                while (w != 0) {
                    if (w > 0) {
                        System.out.println("Positivo");

                    } else {
                        System.out.println("Negativo");
                    }
                    System.out.println("Ingrese un numero");
                    w = teclado.nextByte();

                }

                break;

            case 5:
                System.out.println("CICLO DO WHILE");

                int d;

                do {

                    System.out.println("Ingrese un numero");
                    d = teclado.nextInt();

                } while (d != 0);
                break;
                
            case 6:
                System.out.println("SALIR");

            default:
                System.out.println("Opcion Incorrecta");
                break;
        }
        
    
        }while(n != 6);   
        }
        
    }


