package builderhamburguesa;

public class SencillaBuilder extends HamburguesaBuilder {

    @Override
    public void buildPan() {
        hamburguesa.setPan("pan con ajonjoli");
    }

    @Override
    public void buildSalsas() {
        hamburguesa.setSalsas("salsa de tomate, mayonesa");
    }

    @Override
    public void buildCarne() {
        hamburguesa.setCarne("carne de res");
    }

    @Override
    public void buildAdiciones() {
        hamburguesa.setAdiciones("lechuga, tomate");
    }   
}
