package com.openbootcamp.ejercicio1;

public class Ejercicio_3
{
    public static void main(String[] args) {
        //Se asignan los nombres al array.
        String[] names={"Jose","Maria","Luis"};

        //Se crea la variable concatenar para almcenar los valores de la concatenacion.
        String concatenar="";

        //se crea el ciclo ForEach
        for(String name: names){
            //Se iguala y se almacena.
            concatenar += name +" ";
        }

        System.out.println(concatenar);
    }



}
