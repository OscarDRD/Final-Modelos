package com.mycompany.chainofresponsabilityproyectofinal;

import Vista.InOut;
import java.util.Random;

public class RepartidorBogota implements IRepartidor{
    private IRepartidor next;
    private final InOut ventana = new InOut();
    private final String[] repartidores ={"Leonel Messi", "Cristiano Ronaldo"};
    
    @Override
    public IRepartidor getNext(){
        return next;
    }
    
    @Override
    public void entregarPaquete(String ciudad){
        if(ciudad.equals("Bogota")){
            Random random = new Random();
            ventana.mostrarResultados("El pedido fue asignado a: "+repartidores[random.nextInt(repartidores.length)]);
        }else{
            next.entregarPaquete(ciudad);
        }
    }
    
    @Override
    public void setNext(IRepartidor repartidor){
        next=repartidor;
    }
    
    
}
