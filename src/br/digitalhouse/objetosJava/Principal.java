package br.digitalhouse.objetosJava;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class Principal {

    //método principal
    public static void main(String[] args) {
        Animal animalMamifero;
        animalMamifero = new Animal ("Bidu"); // poderia ser escrito Animal animalMamifero - new Animal();
        // Se eu não colocar parâmetro ele vai chamar o contrutor padrão

        System.out.println(animalMamifero.getNomeAnimal());
        System.out.println(animalMamifero.cor);

        Animal animalDomestico = new Animal();

        animalDomestico.setNomeAnimal("Ted");
        System.out.println(animalDomestico.getNomeAnimal());

        System.out.println("*****************************************");
        Pessoa pessoaJovem = new Pessoa("Erika");
        System.out.println(pessoaJovem.getNomePessoa());

        animalDomestico.setDonoAnimal (pessoaJovem);

        System.out.println(animalDomestico.getDonoAnimal().getNomePessoa());

        Pessoa pessoaIdosa = new Pessoa ("Clotilde");

        animalDomestico.setDonoAnimal(pessoaIdosa);

    }
}