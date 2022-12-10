package Memento;
public class Cliente {
  private String nombre, direccion, telefono, identificacion;
  private Cliente aux;
  
  //Crea el memento para el cliente y lo retorna (1 por cliente)
  public Memento saveToMemento(){
    return new Memento(this);
  }
  
  public void restoreFromMemento(Memento m){
    this.aux=m.getSavedState();
  }

  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public void setDireccion(String direccion){
    this.direccion=direccion;
  }
  public void setTelefono(String telefono){
    this.telefono=telefono;
  }
  public void setIdentificacion(String identificacion){
    this.identificacion=identificacion;
  }
  public String getNombre(){
     return this.nombre;
  }
  public String getDireccion(){
     return this.direccion;
  }
  public String getTelefono(){
     return this.telefono;
  }
  public String getIdentificacion(){
     return this.identificacion;
  }   
}
