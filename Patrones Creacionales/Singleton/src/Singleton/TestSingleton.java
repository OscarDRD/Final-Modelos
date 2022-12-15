package Singleton;

import Vista.InOut;

public class TestSingleton {
    static InOut ventana = new InOut();
    public static void main(String[] args) {
        SistemaAsignacionPedido sAP= SistemaAsignacionPedido.getInstance();
        sAP.setNomEmpresa("Rappi");
        ventana.mostrarResultados("El nombre de la empresa es: "+sAP.getNomEmpresa());

        SistemaAsignacionPedido sAP1= SistemaAsignacionPedido.getInstance();
        ventana.mostrarResultados("Por segunda vez, el nombre de la empresa es: "+sAP1.getNomEmpresa());

        sAP1.setNomEmpresa("iFood");
        ventana.mostrarResultados("El nombre de la empresa cambio a: "+sAP1.getNomEmpresa());

    }
}
