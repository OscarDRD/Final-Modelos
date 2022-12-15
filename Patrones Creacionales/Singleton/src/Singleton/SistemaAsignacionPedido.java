package Singleton;

public class SistemaAsignacionPedido{
    private static SistemaAsignacionPedido instance;
    private String nomEmpresa;
    private SistemaAsignacionPedido(){}
    public String getNomEmpresa() {
        return nomEmpresa;
    }
    public static SistemaAsignacionPedido getInstance() {
        if(instance==null){
            instance = new SistemaAsignacionPedido();
        }
        return instance;
    }
    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }
}
