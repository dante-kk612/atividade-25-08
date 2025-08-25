import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford", "Focus", 4);
        Caminhao caminhao1 = new Caminhao("Volvo", "FH 540", 25.0);

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro1);
        veiculos.add(caminhao1);

        for (Veiculo v : veiculos) {
            v.descricao();
        }
    }
}