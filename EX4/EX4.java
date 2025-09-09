
import com.mycompany.ex4.Alimento;


public class FrostedFlakesKelloggs {
    public static void main(String[] args) {
        PessoaVisitante visitante = new PessoaVisitante("Tony, o Tigre", 65, "Mascote");
        Bringuedo brinquedo = new Bringuedo("Tigre de Pelúcia", 1, "Novo");
        Alimento cereal = new Alimento("Frosted Flakes", "Cereal Matinal", 120);
        
        System.out.println("=== AÇÃO NO SUPERMERCADO ===");
        visitante.andar();
        visitante.falar();
        visitante.comprar();
        
        System.out.println("\n=== INTERAÇÃO COM BRINQUEDO ===");
        brinquedo.verificarCapacidade();
        brinquedo.ativar();
        brinquedo.desativar();
        
        System.out.println("\n=== EXPERIÊNCIA COM CEREAL ===");
        cereal.exibirInfoNutricional();
        cereal.servir();
        cereal.consumir();
        
        System.out.println("\n=== DETALHES DO PACKAGING ===");
        System.out.println(visitante);
        System.out.println(brinquedo);
        System.out.println(cereal);
        
        System.out.println("\n=== PROMOÇÃO FROSTED FLAKES ===");
        System.out.println("Pacote especial com: " + cereal.getNome());
        System.out.println("Inclui brinquedo: " + brinquedo.getTipo());
        System.out.println("Com a visita especial de: " + visitante.getNome());
        
        System.out.println("\n=== CENA COMPLETA ===");
        visitante.andar();
        visitante.falar();
        cereal.servir();
        cereal.consumir();
        brinquedo.ativar();
        visitante.falar();
    }
}