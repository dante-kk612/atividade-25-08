public class Veiculo {
    String marca;
    String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void descricao() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

class Carro extends Veiculo {
    int portas;
    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }
    @Override
    public void descricao() {
        System.out.println("Tipo: Carro, Marca: " + marca + ", Modelo: " + modelo + ", Portas: " + portas);
    }
}


class Caminhao extends Veiculo {
    double capacidadeTon;

    public Caminhao(String marca, String modelo, double capacidadeTon) {
        super(marca, modelo);
        this.capacidadeTon = capacidadeTon;
    }
    @Override
    public void descricao() {
        System.out.println("Tipo: Caminhão, Marca: " + marca + ", Modelo: " + modelo + ", Capacidade: " + capacidadeTon + " toneladas");
    }
}