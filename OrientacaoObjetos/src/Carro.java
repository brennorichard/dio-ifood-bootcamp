import java.util.Scanner;

class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Construtor
    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void getCapacidade(int CapacidadeTanque) {
        this.capacidadeTanque = CapacidadeTanque;
    }

    int setCapacidade(int capacidadeTanque) {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

    public char[] getCapacidade() {
        return null;
    }

}