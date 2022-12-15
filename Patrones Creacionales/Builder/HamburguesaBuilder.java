package builderHamburguesa;

public abstract class HamburguesaBuilder {
    protected  Hamburguesa hamburguesa ; 
    
    public Hamburguesa getHamb(){
        return hamburguesa;
    }
    
    public void crearHamb(){
        hamburguesa = new Hamburguesa();
    }
    
    public abstract void buildPan();
    public abstract void buildSalsas();
    public abstract void buildAdiciones();
    public abstract void buildCarne();
    
}
