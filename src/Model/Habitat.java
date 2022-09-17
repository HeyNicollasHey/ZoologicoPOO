package Model;

public class Habitat {

    Animal[] listaDeAnimais;

    public Habitat(int capacidadeDoHabitat) {
        listaDeAnimais = new Animal[capacidadeDoHabitat];
    }

    public void getListaDeAnimais() {
        for (int i = 0; i < this.listaDeAnimais.length; i++) {
            System.out.println(listaDeAnimais[i]);
        }
    }
    public void setListaDeAnimais(int posicao, Animal animal) {
        this.listaDeAnimais[posicao] = animal;
    }

    @Override
    public String toString() {
        this.getListaDeAnimais();
        return " Habitats ";
    }
}
