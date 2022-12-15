package builderhamburguesa;

public class Hamburguesa {
    private String pan = "";
    private String salsas = "";
    private String carne = "";
    private String adiciones = "";
    
    public void setPan(String pan){
        this.pan = pan;
    }
    
    public void setSalsas(String salsas){
        this.salsas = salsas;
    }
    
    public void setCarne(String carne){
        this.carne = carne;
    }
    
    public void setAdiciones(String adiciones){
        this.adiciones = adiciones;
    }
    
    public String getDetalles(){
        return pan+", "+salsas+", "+carne+", "+adiciones;
    }
}
