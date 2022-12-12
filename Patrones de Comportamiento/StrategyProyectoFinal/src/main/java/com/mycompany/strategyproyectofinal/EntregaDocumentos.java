
package com.mycompany.strategyproyectofinal;

public class EntregaDocumentos implements MetodoEntrega {
    private String instrucciones;
    @Override
    public void recoger() {
        instrucciones+="Recoger en las oficinas inidcadas";
    }

    @Override
    public void metodoTransporte() {
        instrucciones+="\nSe puede transportar en bicicleta o motocicleta preferiblemente.";
    }

    @Override
    public void cuidados() {
        instrucciones+="\nTransportar con alta seguridad.";
    }

    @Override
    public void entregar() {
        instrucciones+="\nEntregar en el domicilio u oficinas indicadas";
    }
    
    @Override
    public String getInstrucciones(){
        return instrucciones;
    }
}
