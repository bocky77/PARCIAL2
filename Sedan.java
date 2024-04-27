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
public class Sedan extends Vehiculo {
    double motor;
    boolean frenos;

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
      if (frenos) {
         JOptionPane.showMessageDialog(null, "El automóvil  tiene frenos ABS");
            return true;
        } else {
             JOptionPane.showMessageDialog(null, "El automóvil no tiene frenos ABS");
            return false;
    }}
}
