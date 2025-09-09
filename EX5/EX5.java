public class RockLeeVsGaara {
    public static void main(String[] args) {
        RockLee rockLee = new RockLee(50, 80, 5);
        Gaara gaara = new Gaara(90, 1000, "Corpo Inteiro");
        ArenaChunin arena = new ArenaChunin("Estádio dos Exames Chunin", 5000, "Preliminares");
        
        System.out.println("=== ROCK LEE VS GAARA - LINKIN PARK ===");
        System.out.println("Preparando o combate épico...\n");
        
        arena.iniciarCombate();
        
        System.out.println("\n=== PRIMEIRA FASE ===");
        gaara.erguerArmadura();
        rockLee.atacar();
        gaara.bloquear();
        
        System.out.println("\n=== SEGUNDA FASE ===");
        rockLee.retirarPesos();
        rockLee.socar();
        gaara.contraAtacar();
        
        System.out.println("\n=== FASE DECISIVA ===");
        arena.atualizarFase("Combate Intenso");
        rockLee.abrirPortoes(1);
        rockLee.atacar();
        gaara.selamentoDaAreia();
        
        System.out.println("\n=== CLÍMAX ===");
        rockLee.abrirPortoes(5);
        System.out.println("Rock Lee abre múltiplos portões! Poder máximo!");
        
        arena.interromper();
        
        System.out.println("\n=== ESTADO FINAL DOS COMBATENTES ===");
        System.out.println(rockLee);
        System.out.println(gaara);
        System.out.println(arena);
        
        arena.anunciarVencedor("Gaara");
        
        System.out.println("\n=== LINKIN PARK - IN THE END ===");
        System.out.println("I tried so hard and got so far...");
        System.out.println("But in the end, it doesn't even matter...");
    }
}