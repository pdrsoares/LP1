
public class FaroesteCaboclo {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Centro-Oeste", 50000, "Brasília");
        Arma arma = new Arma("Revolver", 38, "Preta");
        Trabalho trabalho = new Trabalho(2500, "Vaqueiro", "Alimentação");
        
        cidade.viajar();
        arma.atirar();
        trabalho.trabalhar();
        
        System.out.println("\nDetalhes:");
        System.out.println(cidade);
        System.out.println(arma);
        System.out.println(trabalho);
    }
}