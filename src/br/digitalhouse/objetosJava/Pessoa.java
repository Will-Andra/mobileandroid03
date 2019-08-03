package br.digitalhouse.objetosJava;

public class Pessoa {

    private String nomePessoa;

    //Construtor Específico
    public Pessoa (String novoNome){
            nomePessoa = novoNome;

    }

    // get
    public String getNomePessoa(){
        return nomePessoa;

    }

    // set
    public void setnomePessoa(String novoNome){
        nomePessoa = novoNome;
    }



}
