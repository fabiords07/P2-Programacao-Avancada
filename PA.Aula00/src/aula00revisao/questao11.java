package aula00revisao;

public class questao11 {
    public enum Estado {
        APAGADA, ACESA, MEIA_LUZ
    }
    
    private Estado estado;
    private int watts;
    
    public questao11() {
        this.estado = Estado.APAGADA;
        this.watts = 0;
    }
    
    public questao11(Estado estadoInicial, int watts) {
        this.estado = estadoInicial;
        this.watts = watts;
    }
    
    public void acende() {
        this.estado = Estado.ACESA;
    }
    
    public void apaga() {
        this.estado = Estado.APAGADA;
    }
    
    public void meiaLuz() {
        this.estado = Estado.MEIA_LUZ;
    }
    
    public void mostraEstado() {
        System.out.println("A lâmpada está " + estado);
    }
    
    public boolean estaLigada() {
        return estado != Estado.APAGADA;
    }
    
    public boolean ehEconomica() {
        return watts < 40;
    }
}