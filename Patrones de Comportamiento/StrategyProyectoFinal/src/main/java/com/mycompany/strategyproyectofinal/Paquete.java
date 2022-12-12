package com.mycompany.strategyproyectofinal;

public class Paquete {
    private MetodoEntrega metodoEntrega;

    public MetodoEntrega getMetodoEntrega() {
        return metodoEntrega;
    }

    public void setMetodoEntrega(MetodoEntrega metodoEntrega) {
        this.metodoEntrega = metodoEntrega;
    }
    
    public String entregar(){
        this.metodoEntrega.recoger();
        this.metodoEntrega.metodoTransporte();
        this.metodoEntrega.cuidados();
        this.metodoEntrega.entregar();
        return this.metodoEntrega.getInstrucciones();
    }

    
}
