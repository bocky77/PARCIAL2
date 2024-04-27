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
public class Sport extends Moto{
    String  motor,potencia,tanque ;

    public Sport(String motor, String potencia, String tanque, String placa, int modelo, int cilindraje) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }

    public String getMotor() {
        return motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getTanque() {
        return tanque;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    
    public String motorGarantia() {
        if (motor.equals("4T")) {
            JOptionPane.showMessageDialog(null,"La garantía de la moto es por 2 años");
            
        } else if (motor.equals("monocilindrico")) {
           JOptionPane.showMessageDialog(null,"La garantía de la moto es por 1 años");
        } else {
            return "Tipo de motor no reconocido";
        }
        return null;
    }
    
}
