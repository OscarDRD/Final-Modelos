package com.mycompany.strategyproyectofinal;

public class EntragaComida implements MetodoEntrega {
    private String instrucciones;
    @Override
    public void recoger() {
        instrucciones="Recoger en el restaurante.";
    }

    @Override
    public void metodoTransporte() {
        instrucciones+="\nSe puede transportar en bicicleta o motocicleta preferiblemente.";
    }

    @Override
    public void cuidados() {
        instrucciones+="\nTransportar cuidadosamente y de forma rapida.";
    }

    @Override
    public void entregar() {
        instrucciones+="\nEntregar en el domicilio inicado.";
    }
    
    @Override
    public String getInstrucciones(){
        return this.instrucciones;
    }
}
