package com.cesde;

import java.util.Scanner;

public class Ejercicios {

    public String ejercicio1(int num1, int num2) {
        if (num1 > num2) {
            return "El número mayor es: " + num1;

        } else if (num2 > num1) {
            return "El número mayor es: " + num2;
        } else {
            return "Los dos números son iguales.";
        }

    }

    public String ejercicio2(double calificacion) {
        // Implementar solución
        if (calificacion >= 3.5) {
            return "¡Felicidades! Usted ha aprobado el examen.";

        } else if (calificacion < 3.5) {
            return "Lo siento, usted ha reprobado el examen.";

        }
        return "";
    }

    public double ejercicio3(double precio) {
        // Implementar solución
        if (precio >= 50000) {
            double descuento = precio * 0.1;
            return precio - descuento;

        } else if (precio < 50000) {
            return precio;

        }

        return 0;

    }

    public String ejercicio4(int tipoFigura, double ladoCuadrado, double baseTriangulo, double alturaTriangulo,
            double radioCirculo) {
        // Implementar solución
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un tipo de figura");
        int figura = sc.nextInt();
        switch (figura) {
            case (1):
            System.out.println ("el area de la figura es:" + ladoCuadrado * ladoCuadrado);

                break;
            case (2):
               System.out.println ("el area de la figura es:" + (baseTriangulo * alturaTriangulo) / 2);
                break;

            case (3):

            System.out.println ("el area de la figura es:" + Math.PI * radioCirculo * radioCirculo);
                break;

            default:
            System.out.println( "tipo de figura no valida");

        }

       return " " ;

    }

    public int ejercicio5(int num1, int num2, int num3) {
        // Implementar solución
        if (num1 < num2 && num1 < num3) {
            return num1;
        }  else if ( num2 < num1 && num2 < num3) {
                return num2;
            }   else {
                    return num3 ;

                }

            

       
        
    }

    @Override
    public String toString() {
        return "Ejercicios []";
    }
}




