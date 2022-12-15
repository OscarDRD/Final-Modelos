package prototipo;

public class Menu implements Prototipo {
    private String bebidas;
    private String combos;
    private String postres;
    
    public Menu(){
        bebidas =  "GASEOSA PERSONAL          $3.500"
                   + "\nGASEOSA 1.5L              $5.700"
                   + "\nLIMONADA                  $4.000\n";
        
        combos =   "COMBO POP CORN            $15.900"
                   + "\nCOMBO CASERO              $21.900"
                   + "\nCOMBO HOT WINGS           $19.900"
                   + "\nCOMBO TWISTER             $18.500\n";
        
        postres =  "SUNDAE FRUTOS ROJOS           $5.500"
                 + "\nSUNDAE AREQUIPE               $5.500"
                 + "\nSUNDAE OREO                   $7.500"
                 + "\nFRESAS CON CREMA              $4.900\n";
    }
    
    
    public void setBebidas(String bebidas){
        this.bebidas = bebidas;
    }
    
    public void setCombos(String combos){
        this.combos = combos;
    }
    
    public void setPostres(String postres){
        this.postres = postres;
    }

    public String getLista(){
        return bebidas+combos+postres;
    }
    
    @Override
    public Prototipo clonar() {
        return new Menu();
    }    
}
