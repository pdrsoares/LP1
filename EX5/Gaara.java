
public class Gaara {
    private int nivelAreia;
    private int chakra;
    private String localProtegido;
    
    public Gaara() {}
    
    public Gaara(int nivelAreia, int chakra, String localProtegido) {
        this.nivelAreia = nivelAreia;
        this.chakra = chakra;
        this.localProtegido = localProtegido;
    }
    
    public int getNivelAreia() {
        return nivelAreia;
    }
    
    public void setNivelAreia(int nivelAreia) {
        this.nivelAreia = nivelAreia;
    }
    
    public int getChakra() {
        return chakra;
    }
    
    public void setChakra(int chakra) {
        this.chakra = chakra;
    }
    
    public String getLocalProtegido() {
        return localProtegido;
    }
    
    public void setLocalProtegido(String localProtegido) {
        this.localProtegido = localProtegido;
    }
    
    public void erguerArmadura() {
        System.out.println("Gaara ergue armadura de areia! Nível de proteção: " + nivelAreia);
        System.out.println("Área protegida: " + localProtegido);
    }
    
    public void bloquear() {
        System.out.println("Gaara bloqueia ataque com escudo de areia! Defesa: " + (nivelAreia * 10));
    }
    
    public void contraAtacar() {
        System.out.println("Gaara contra-ataca com areia! Poder: " + (nivelAreia * chakra / 100));
        chakra -= 50;
        System.out.println("Chakra restante: " + chakra);
    }
    
    public void selamentoDaAreia() {
        System.out.println("Gaara usa Selamento da Areia: Prisão de Areia!");
    }
    
    @Override
    public String toString() {
        return "Gaara{" +
                "nivelAreia=" + nivelAreia +
                ", chakra=" + chakra +
                ", localProtegido='" + localProtegido + '\'' +
                '}';
    }
}