
package com.mycompany.examen_de_repocicion_fgfactura;
/**
 *
 * @author Fernando_Jose
 */
public class Producto {
    public int cantidad;
    public double preciobase;
    public String Nombre;
    public double imp;
    public double sub;
    public double total;



    public double getTotal() {
        return total;
    }
    
    public Producto() {//contructos vacio
    }

    public Producto(int cantidad, double preciobase, String Nombre, double imp, double sub, double total) {//contructor cargado
        this.cantidad = cantidad;
        this.preciobase = preciobase;
        this.Nombre = Nombre;
        this.imp = imp;
        this.sub = sub;
        this.total =total;
    }

   
    
    public static double SubTotal(int cantidad, double preciobase){
        double sub = cantidad * preciobase;
        return sub;
    }
    public static double ISV(double sub){
        double imp = sub * 0.15;
        return imp;
    }
    
     @Override
    public String toString() {
        return Nombre + " cant: " + cantidad + "  Precio: " + preciobase
                + " SubTotal: " + sub + " ISV:" + imp + " Total: " + total ;

    }
}

