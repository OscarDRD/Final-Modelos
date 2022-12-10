package Memento;

import Vista.InOut;

public class TestMemento {
    static InOut ventana = new InOut();
    public static void main(String[] args) {

        CareTaker carateker = new CareTaker();
        Cliente cliente = new Cliente();
        
        //Pedir datos del cliente
        String id=ventana.pedirString("Identificación del Cliente: ");
        cliente.setNombre(ventana.pedirString("Nombre del Cliente: "));
        cliente.setDireccion(ventana.pedirString("Direccion del Cliente: "));
        cliente.setTelefono(ventana.pedirString("Telefono del Cliente: "));
        cliente.setIdentificacion(id);
         
        //Guarda datos del cliente
        carateker.addMemento(cliente.saveToMemento());

        cliente.setNombre("Juan Diaz");
        cliente.setDireccion("Carrera 20 Sur #48B-31");
        cliente.setTelefono("3456985163");
        cliente.setIdentificacion("23655489");
        
        //Guarda datos del cliente
        carateker.addMemento(cliente.saveToMemento());
        
        //Busca Clientes por id y guarda los datos en m1 y m2
        Memento m1 = carateker.getMemento(id);
        Memento m2 = carateker.getMemento("23655489");
        
        //Muestra datos
        ventana.mostrarResultados("Lista de Clientes \n1.Cliente: "+m1.getId()+"\n Nombre: "+m1.getNombre()+"\n Direccion: "+m1.getDireccion()+"\n Telefono: "+m1.getTelefono()
                                  +"\n\n2.Cliente: "+m2.getId()+"\n Nombre: "+m2.getNombre()+"\n Direccion: "+m2.getDireccion()+"\n Telefono: "+m2.getTelefono());
    }
}
