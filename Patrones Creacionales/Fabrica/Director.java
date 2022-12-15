package fabrica;

public class Director {
    private HamburguesaBuilder builder;
    
    public void buildHamburguesa(){
        builder.crearHamb();
        builder.buildPan();
        builder.buildCarne();
        builder.buildSalsas();
        builder.buildAdiciones();
    }
    
    public void setBuilder(HamburguesaBuilder builder){
        this.builder = builder;
    }
    
    public Hamburguesa getHamburguesa(){
        return builder.getHamb();
    }
}
