package builderhamburguesa;

public class PolloBuilder extends HamburguesaBuilder{

    @Override
    public void buildPan() {
        hamburguesa.setPan("pan con ajonjoli");
    }

    @Override
    public void buildSalsas() {
        hamburguesa.setSalsas("salsa BBQ, mayonesa");
    }

    @Override
    public void buildCarne() {
        hamburguesa.setCarne("pechuga de pollo");
    }

    @Override
    public void buildAdiciones() {
        hamburguesa.setAdiciones("lechuga, tomate");
    }
    
}
