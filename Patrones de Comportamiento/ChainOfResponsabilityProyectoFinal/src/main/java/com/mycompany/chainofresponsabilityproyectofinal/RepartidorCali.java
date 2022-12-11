package com.mycompany.chainofresponsabilityproyectofinal;

import Vista.InOut;
import java.util.Random;

public class RepartidorCali implements IRepartidor {
    private IRepartidor next;
    private final InOut ventana = new InOut();
    private final String[] repartidores ={"Alberto Leon", "Roberto Carlos Perez", "Mateo Cruz", "Arturo Vidal"};
    
    @Override
    public IRepartidor getNext(){
        return next;
    }
    
    @Override
    public void entregarPaquete(String ciudad){
        if(ciudad.equals("Cali")){
            Random random = new Random();
            ventana.mostrarResultados("El pedido fue asignado a: "+repartidores[random.nextInt(repartidores.length)]);
        }else{
            ventana.mostrarResultados("No tenemos cobertura en la ciudad de: "+ciudad);
        }
    }
    
    @Override
    public void setNext(IRepartidor repartidor){
        next=repartidor;
    }
}
