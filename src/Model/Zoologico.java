package Model;

public class Zoologico {

    String nome;
    Habitat habitat;
    Habitat habitat2;
    Habitat habitat3;

    public Zoologico(String nome,Habitat habitat,Habitat habitat2,Habitat habitat3 ) {
        this.nome = nome;
        this.habitat = habitat;
        this.habitat2 = habitat2;
        this.habitat3 = habitat3;
    }

    public String getNome() {
        return nome;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public Habitat getHabitat2() {
        return habitat2;
    }

    public Habitat getHabitat3() {
        return habitat3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public void setHabitat2(Habitat habitat2) {
        this.habitat2 = habitat2;
    }

    public void setHabitat3(Habitat habitat3) {
        this.habitat3 = habitat3;
    }

    @Override
    public String toString() {
        return "\nZoologico [" +
                "Nome: " + nome + " | Habitats: " + habitat + habitat2 + habitat3 + "]";
    }
}
