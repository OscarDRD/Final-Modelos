package com.mycompany.chainofresponsabilityproyectofinal;

import Vista.InOut;

public class ChainOfResponsabilityProyectoFinal {
    public static void main(String[] args) {
        final InOut ventana=new InOut();
        SistemaAsignador sistema = new SistemaAsignador();
        sistema.entregarPaquete(ventana.pedirString("Ciudad del servicio:"));
    }
}
