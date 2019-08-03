package br.digitalhouse.objetosJava;

//nome da classe
public class Animal {

    //atributos
    public String nomeAnimal;
    public String raca;
    public int idade;
    public String cor;
    private Pessoa donoAnimal;


    //Construtor Específico
    public Animal (String novoNomeAnimal) {
        nomeAnimal = novoNomeAnimal;
    }

    //Construtor Padrão
    public Animal(){

    }

    // Exemplo de get (get acessa)
    public String getNomeAnimal(){
        return nomeAnimal;
    }

    public int getIdade(){
        return idade;
    }

    public String getNomeRaca(){
        return raca;
    }

    public String getCor(){
        return cor;
    }

    public Pessoa getDonoAnimal(){
        return donoAnimal;
    }

    //set

    public void setNomeAnimal(String novoNomeAnimal){
        nomeAnimal = novoNomeAnimal;
    }

    public void setRaca (String novaRaca){
        raca = novaRaca;
    }

    public void setIdade(int novaIdade) {
        idade = novaIdade;
    }

    public void setCor(String novaCor){
        cor = novaCor;
    }

    public void setDonoAnimal(Pessoa novoDonoAnimal){
        donoAnimal = novoDonoAnimal;
    }
      //metodo
    public void brincar(){
        System.out.println("O animal está brincado");
    }

}
