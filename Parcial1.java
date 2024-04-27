
package com.mycompany.parcial1;

import javax.swing.JOptionPane;

public class Parcial1 {

    public static void main(String[] args) {
      int opcion = Integer.parseInt(JOptionPane.showInputDialog("CONCESIONARIO CAUCANA DE VEHÍCULOS S.A\n"+
         "REGISTRO DE VEHÍCULOS VENDIDOS"+"\n"+
                        "1.Registro de automóviles"+"\n"+
                        "2.Registro de motos"+"\n"+
                        "3.Vendedor"+"\n"+
                        "4.Salir"));
   
    switch (opcion){
        case 1-> {
            JOptionPane.showMessageDialog(null, "Registrando automóvil...");
        String placa= JOptionPane.showInputDialog("ingrese placa del vehiculo");
        int modelo= Integer.parseInt(JOptionPane.showInputDialog("ingresar modelo"));
        double precio= Double.parseDouble(JOptionPane.showInputDialog("ingresar precio del vehiculo"));
        Vehiculo nuevoAutomovil=new Vehiculo(placa,modelo,precio);
        JOptionPane.showMessageDialog(null, "la placa del automovil es: "+nuevoAutomovil.placa+"\n"
                                       +" el modelo es: "+nuevoAutomovil.modelo+"\n"+
                                        "su precio es: "+nuevoAutomovil.precio);
    
    
    break;
            }
        case 2->{
            JOptionPane.showMessageDialog(null, "Registrando moto...");
         String placa= JOptionPane.showInputDialog("ingresar la placa de la moto");
            int modelo = Integer.parseInt(JOptionPane.showInputDialog("ingrese el modelo"));
            int cilindraje= Integer.parseInt(JOptionPane.showInputDialog("ingrese cilindraje"));
    
    
    String motor= JOptionPane.showInputDialog("ingrese motor: pude ser 4t O monocilindrico");
    String potencia= JOptionPane.showInputDialog("ingresar la potencia ");
    String tanque = JOptionPane.showInputDialog("ingresar tanque ");
    Sport r1=new Sport(motor,potencia,tanque,placa,modelo,cilindraje);
    r1.motorGarantia();
    JOptionPane.showMessageDialog(null, "motor:"+r1.getMotor()+"\n"+
                                    "potencia: "+r1.getPotencia()+"\n"+
                                    "tanque  "+r1.getTanque()+"\n"+
                                        "placa: "+r1.getPlaca()+"\n"+
                                        "modelo: "+r1.getModelo()+"\n"+
                                         "cilindraje: "+r1.getCilindraje());
    }
        case 3->{
        JOptionPane.showMessageDialog(null, "andres angucho");
        break;
        }
        case 4->{
       JOptionPane.showMessageDialog(null,"saliendo del programa");
        
        
        }
    }

    
   
   
    
    
    
    
    
    
    
    
    
    
}
}


    
                       
