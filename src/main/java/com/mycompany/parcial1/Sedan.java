
package com.mycompany.parcial1;

public class Sedan extends Automovil{
 public double motor;
 public boolean frenos;

    public Sedan(double motor, boolean frenos, String placa, int modelo, double precio) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
    }

    public double getMotor() {
        return motor;
    }

    public boolean isFrenos() {
        return frenos;
    }

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
 public boolean frenosABS(){
 if(frenos){System.out.println("“El automóvil tiene frenos ABS");}
 else{System.out.println("El automóvil no tiene frenos ABS");}
 return false;
 }
}
