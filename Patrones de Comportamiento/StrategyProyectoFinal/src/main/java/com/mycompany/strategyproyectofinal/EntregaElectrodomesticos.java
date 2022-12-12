package com.mycompany.strategyproyectofinal;

public class EntregaElectrodomesticos implements MetodoEntrega {
    private String instrucciones;
    @Override
    public void recoger() {
        instrucciones+="Recoger en el almacen o bodega indicada";
    }

    @Override
    public void metodoTransporte() {
        instrucciones+="\nTransportar en un camion";
    }

    @Override
    public void cuidados() {
        instrucciones+="\nTransportar cuidadosamente con el electrodomestico bien asegurado";
    }

    @Override
    public void entregar() {
        instrucciones+="\nEntregar en el domicilio indicado";
    }
    
    @Override
    public String getInstrucciones(){
        return instrucciones;
    }
}
