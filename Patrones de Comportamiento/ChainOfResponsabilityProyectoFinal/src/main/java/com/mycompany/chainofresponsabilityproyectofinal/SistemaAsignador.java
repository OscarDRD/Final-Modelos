package com.mycompany.chainofresponsabilityproyectofinal;

public class SistemaAsignador implements IRepartidor{
    private IRepartidor next;
    
    @Override
    public IRepartidor getNext(){
        return next;
    }
    
    @Override
    public void entregarPaquete(String ciudad){
        RepartidorBogota bogota = new RepartidorBogota();
        this.setNext(bogota);
        
        RepartidorMedellin medellin = new RepartidorMedellin();
        bogota.setNext(medellin);
        
        RepartidorCali cali = new RepartidorCali();
        medellin.setNext(cali);
        
        next.entregarPaquete(ciudad);
    }
    
    @Override
    public void setNext(IRepartidor repartidor){
        next=repartidor;
    }
}
