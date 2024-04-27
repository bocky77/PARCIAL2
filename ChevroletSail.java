/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ChevroletSail extends Sedan {
   public  String tanque ;
   public  boolean seguro;

    public ChevroletSail(String tanque, boolean seguro, double motor, boolean frenos, String placa, int modelo, double precio) {
        super(motor, frenos, placa, modelo, precio);
        this.tanque = tanque;
        this.seguro = seguro;
    }

    public String getTanque() {
        return tanque;
    }

    public boolean isSeguro() {
        return seguro;
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
    
    public boolean seguro(){
    
    if (seguro) {
            JOptionPane.showConfirmDialog(null, "El automóvil tiene seguro todo riesgo");
        } else {
          JOptionPane.showConfirmDialog(null, "El automóvil tiene no seguro todo riesgo");
        }
       return false;
    
    }
     public void precioSeguro() {
        if (precio > 50000000) {
            double valorSeguro = precio * 0.10;
            JOptionPane.showMessageDialog(null,"El valor del seguro es: " + valorSeguro );
            
        } else {
          JOptionPane.showMessageDialog(null, "No hay valor del seguro puesto que el valor del automóvil es menor a 50.000.000");
        }
    }
}
