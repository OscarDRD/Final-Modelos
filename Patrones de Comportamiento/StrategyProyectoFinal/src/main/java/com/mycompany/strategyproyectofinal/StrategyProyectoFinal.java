package com.mycompany.strategyproyectofinal;

import Vista.InOut;

public class StrategyProyectoFinal {

    public static void main(String[] args) {
        InOut ventana = new InOut();
        Paquete paquete = new Paquete();
        System.out.println("Hello World!");
        String m= ventana.pedirString("Paquete a entregar: ");
        if(m.equals("Comida")){
            paquete.setMetodoEntrega(new EntragaComida());
            ventana.mostrarResultados("Pasos: \n"+paquete.entregar());
        }else if(m.equals("Documentos")){
            paquete.setMetodoEntrega(new EntregaDocumentos());
            ventana.mostrarResultados("Pasos: \n"+paquete.entregar());
        }else if(m.equals("Electrodomesticos")){
            paquete.setMetodoEntrega(new EntregaElectrodomesticos());
            ventana.mostrarResultados("Pasos: \n"+paquete.entregar());
        }else{
           ventana.mostrarResultados("No es posible entregar este paquete");
        }
        
    }
}
