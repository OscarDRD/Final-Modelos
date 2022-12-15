package fabrica;

public class FabricaHamb extends Fabrica{
    private Director director;
    private HamburguesaBuilder sencilla;
    private HamburguesaBuilder vegetariana;
    private Hamburguesa hamburguesa;
    
    public FabricaHamb(){
        director = new Director();
        sencilla = new SencillaBuilder();
        vegetariana = new VegetarianaBuilder();
    }

    @Override
    public Hamburguesa getHamb(String hamburguesa) {
        switch(hamburguesa){
            case "sencilla":
                director.setBuilder(sencilla);
                director.buildHamburguesa();
            case "vegetariana":
                director.setBuilder(vegetariana);
                director.buildHamburguesa();
                return director.getHamburguesa();
            default:
                return new Hamburguesa();
        }
    }
    
}
