package aula05questao05parte01;

class VeiculoCarro implements VeiculoIF {
    private boolean portasAbertas;

    @Override
    public void ligar() {
        System.out.println("Ligando o carro");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o carro");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro");
    }

    @Override
    public void frear() {
        System.out.println("Freando o carro");
    }

    public boolean isPortasAbertas() {
        return portasAbertas;
    }

    public void setPortasAbertas(boolean portasAbertas) {
        this.portasAbertas = portasAbertas;
    }
}