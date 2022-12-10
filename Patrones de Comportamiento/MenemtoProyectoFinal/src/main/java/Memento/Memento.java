package Memento;
public class Memento {
  //Objeto que va a "recordar" 
  public Cliente estado;
  //datos del objeto
  public String id, nombre, direccion, telefono;
  
  //Recibe el objeto 
  public Memento(Cliente cliente){
    this.estado=cliente;
    this.id=cliente.getIdentificacion();
    this.nombre=cliente.getNombre();
    this.direccion=cliente.getDireccion();
    this.telefono=cliente.getTelefono();
  }
  public Cliente getSavedState(){
    return this.estado;
  }
  public String getId(){
    return this.id;
  }
  public String getNombre(){
    return this.nombre;
  }
  public String getTelefono(){
    return this.telefono;
  }
  public String getDireccion(){
    return this.direccion;
  }
  
}
