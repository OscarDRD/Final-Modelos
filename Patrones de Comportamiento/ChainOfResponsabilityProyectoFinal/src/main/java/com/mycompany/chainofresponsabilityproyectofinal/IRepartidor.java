package com.mycompany.chainofresponsabilityproyectofinal;
public interface IRepartidor {
    public void setNext(IRepartidor repartidor);
    public IRepartidor getNext();
    public void entregarPaquete (String ciudad);
    
}
