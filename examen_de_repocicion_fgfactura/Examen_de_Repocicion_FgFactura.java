package com.mycompany.examen_de_repocicion_fgfactura;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen_de_Repocicion_FgFactura {

    public static void main(String[] args) {
        Factura();
    }

    public static void Factura() {
        double sub;
        double imp;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Producto> compras = new ArrayList();
        System.out.println("      Bienvenido al carrito de compras.   ");
        while (true) {
            System.out.println("Seleccion la opcion que desea\n1 Agregar un producto al carrito de compras\n2 Pagar \n3 Salir.");
            int caso = entrada.nextInt();
            switch (caso) {
                case 1:
                    entrada = new Scanner(System.in);
                    System.out.println("Ingrese el nombre:");
                    String nom = entrada.nextLine();
                    entrada = new Scanner(System.in);
                    System.out.println("Ingrese la cantidad que lleva: ");
                    int cant = entrada.nextInt();
                    entrada = new Scanner(System.in);
                    System.out.println("Ingrse en Precio del producto: ");
                    double precio = entrada.nextInt();
                    Producto calc = new Producto();
                    sub = calc.SubTotal(cant, precio);
                    imp = calc.ISV(sub);
                    double total = sub + imp;
                    Producto obj = new Producto(cant, precio, nom, imp, sub, total);
                    compras.add(obj);

                    break;
                case 2:
                    System.out.println("          FACTURA DE COMPRA         ");
                    System.out.println("       Gracias Por Utilizar mi programa.");
                    calc = new Producto();
                    double gran = 0;
                    for (Producto factura : compras) {
                        System.out.println(factura);
                        System.out.println("");
                    }
                    for (int i = 0; i < compras.size(); i++) {
                        calc = new Producto();
                        calc = compras.get(i);
                        gran = calc.getTotal() + gran;
                    }
                    System.out.println("GRAN TOTAL: "+ gran); 
                    System.exit(0);
                    break;

                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida: intente de nuevo");
                    break;

            }

        }
    }

}

/*
Parte teorica
¿Qué es la instanciación? (1 %)
Es un proceso donde se revisan los valores dados y se les asigna el tipo de valor como int a los datos en un codigo
 ¿Cuál es la diferencia entre una clase y un objeto? (1%)
Que la clase esta conformada por objetos dentro de ella
 ¿Mencione y explique el por qué se producen y como abordar/solucionar
los errores indexOutOfBounds y NullPointerException? (2%).
Estos errores ocrren cuando el programa intenta accdeder a datos que no estan a su alcance o cuando 
se sale de parametros establecidos 
la mejor manera para solucionar esto es revisar donde el codigo se va fuera de los parametros que se estabecieron
o cambiando los parametros en si para acomodar mejor el codigo
 ¿Qué es un error lógico? (1%)
es un error causado por un descudo del programador cunado el codigo hace lo que se el pide
pero no es lo que el programador espera lo opuesto a un error de sintaxis
*/