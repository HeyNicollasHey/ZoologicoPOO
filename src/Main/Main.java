package Main;

import Model.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Habitat terrestre = new Habitat(3);

        Terrestres leao = new Terrestres(true,true,true,
                "Leao","Panthera leo", "Carnivora", 190,
                30,false);

        Terrestres girafa = new Terrestres(true,true,false,
                "Girafa", "Giraffa", "Herbivora",1200,35,
                true);

        Terrestres pangolin = new Terrestres(true,false,true,"Pangolin",
                "Smutsia temminckii","Insetivoros",33,36,
                true);

        terrestre.setListaDeAnimais(0,leao);
        terrestre.setListaDeAnimais(1,girafa);
        terrestre.setListaDeAnimais(2,pangolin);

        Habitat aquaticos = new Habitat(3);

        Aquaticos carpa = new Aquaticos("Carpa","Cyprinus carpio","Onivora",
                28,10,false,true,
                false,true);

        Aquaticos peixeboi = new Aquaticos("Peixe-boi","Trichechus","Herbivora",
                29,1700,true,false,
                false, false);

        Aquaticos boto = new Aquaticos("Boto-cor-de-rosa","Inia geoffrensis","Carnivora",
                30,160,true,false,
                true,true);

        aquaticos.setListaDeAnimais(0,carpa);
        aquaticos.setListaDeAnimais(1,peixeboi);
        aquaticos.setListaDeAnimais(2,boto);

        Habitat aereos = new Habitat(3);

        Aereos papagaio = new Aereos(true,true,true,"Papagaio,",
                "Psittacoidea","Onivora",5,30,false);

        Aereos morcego = new Aereos(false,false,false,"Morcego",
                "Chiroptera","Onivora",2,27,false);

        Aereos aguia = new Aereos(true,true,true,"Aguia-careca",
                "Haliaeetus leucocephalus","Carnivora",50,
                30,false);

        aereos.setListaDeAnimais(0,papagaio);
        aereos.setListaDeAnimais(1,morcego);
        aereos.setListaDeAnimais(2,aguia);

        Zoologico zoo = new Zoologico(
                "Zoo Catolica",terrestre,aquaticos,aereos);

        System.out.println(zoo);
    }
}
