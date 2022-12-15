package builderhamburguesa;

public class VegetarianaBuilder extends HamburguesaBuilder{

    @Override
    public void buildPan() {
        hamburguesa.setPan("pan con ajonjoli");
    }

    @Override
    public void buildSalsas() {
        hamburguesa.setSalsas("mayonesa");
    }

    @Override
    public void buildCarne() {
        hamburguesa.setCarne("carne vegetariana");
    }

    @Override
    public void buildAdiciones() {
        hamburguesa.setAdiciones("lechuga, tomate, champiñones, queso");
    }
  
}
