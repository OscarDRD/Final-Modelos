package fabrica;

public abstract class HamburguesaBuilder {
    protected Hamburguesa hamburguesa;
    
    public Hamburguesa getHamb(){
        return hamburguesa;
    }
    
    public void crearHamb(){
        hamburguesa = new Hamburguesa();
    }
    
    public abstract void buildPan();
    public abstract void buildSalsas();
    public abstract void buildCarne();
    public abstract void buildAdiciones();
    
}
