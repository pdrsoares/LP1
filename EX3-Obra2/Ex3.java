
public class TrackBrawl {
    public static void main(String[] args) {
        CenaBriga cena = new CenaBriga("Trilhos de trem", "Lutadores profissionais", 2002);
        Trem trem = new Trem("Locomotiva", "Aço", "Em movimento");
        Fotografia foto = new Fotografia("Colagem com material reciclado", "150x200cm", true);
        
        cena.lutar();
        trem.descarrilhar();
        foto.fotografar();
        
        System.out.println("\nDetalhes da obra 'Track Brawl':");
        System.out.println(cena);
        System.out.println(trem);
        System.out.println(foto);
        
        System.out.println("\n--- Recriando a obra 'Track Brawl' ---");
        System.out.println("Cena de briga em " + cena.getCenario() + " com " + 
                          trem.getMaterial() + " usando técnica " + foto.getTecnica());
        
        System.out.println("\nProcesso criativo:");
        System.out.println("1. " + cena.getAtores() + " posicionados nos " + cena.getCenario());
        System.out.println("2. Trem de " + trem.getMaterial() + " no estado: " + trem.getEstado());
        System.out.println("3. Fotografia " + (foto.isAssinada() ? "assinada" : "não assinada") + 
                          " com dimensões " + foto.getDimensoes());
    }
}