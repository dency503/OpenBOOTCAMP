package com.openbootcamp.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tipo de datos primitivos
        // ======================================
         /*En JavaScript, un primitive (valor primitivo, tipo de dato primitivo) son datos que no son un objeto y no tienen métodos. Hay 6 tipos de datos primitivos:
          string, number, bigint, boolean, undefined y symbol. También hay null, que aparentemente es primitivo, pero de hecho es un caso especial para cada
           Object: y cualquier tipo estructurado se deriva de null por la Cadena de prototipos.*/

        //Tipos numéricos enteros

        int var1 = 230;
        byte var3 = 107;
        long var2 = -230;
        short var4 = 20430;



        //Tipos numéricos en punto flotante

        float var5 = 02.31f;
        double var6 = -302.322d;

        //Booleanos y caracteres

        boolean var7 = true;
        char var8 = 'a';

        // Tipo de datos estructurados - clases
        // ======================================


        //Cadenas de caracteres


        String var9 = "Variable tipo String de ejemplo";

        //Vectores o arrays

        int[][] matriz;
        matriz = new int[1][2];

        matriz[0][1] = 290;

        System.out.println("1. Tipo de datos primitivos\n");

        System.out.println("Tipos numéricos enteros");
        System.out.println("=======================\n");
        System.out.println("Int: "+var1);
        System.out.println("Long: "+var2);
        System.out.println("Byte: "+var3);
        System.out.println("Short: "+var4);



        System.out.println();

        System.out.println("Tipos numéricos en flotante");
        System.out.println("=================================\n");
        System.out.println("Float: "+var5);
        System.out.println("Double: "+var6);

        System.out.println();

        System.out.println("Tipos caracteres y booleanos");
        System.out.println("============================\n");
        System.out.println("Booleano: "+var7);
        System.out.println("Char: "+var8);

        System.out.println();

        System.out.println("2. Tipo de datos estructurados --- clases\n");


        System.out.println("Cadenas de caracteres --- Vectores o arrays\n");
        System.out.println("=========================================");
        System.out.println("Cadena caracteres: "+var9);
        System.out.println("Array :"+matriz[0][1]);

        System.out.println();

    }
    }


