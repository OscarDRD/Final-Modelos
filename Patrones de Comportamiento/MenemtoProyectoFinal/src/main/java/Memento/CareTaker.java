package Memento;

import java.util.HashMap;

public class CareTaker {
  //Donde se guardan los datos del cliente como Mementos
  HashMap<String, Memento> estados = new HashMap<String, Memento>();
  
  //Añade memento
  public void addMemento(Memento m){
    this.estados.put(m.getId(), m);
  }
  //Busca memento por el index y lo retorna
  public Memento getMemento(String index){
    return estados.get(index);
  }    
}
