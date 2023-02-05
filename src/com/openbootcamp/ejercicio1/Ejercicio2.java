package com.openbootcamp.ejercicio1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println("Ingrese el precio sin IVA");
        //Se crea captura de datos
        Scanner scanner = new Scanner(System.in);
        double precio= scanner.nextDouble();


        System.out.println(getPricewithTAX(precio));
    }

     static double getPricewithTAX(double Price) {
        //El Salvador - IVA - Impuesto de Valor Añadido 13.00%
         int IVA=13;
         //Cantidad en IVA
         double CantidadIVA= (Price*IVA)/100;

         //Precio con IVA
         double total=Price+CantidadIVA;

         return total;
    }
}
