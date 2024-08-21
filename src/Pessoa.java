public class Pessoa {
    private String nome;
    private String bairro;

    public Pessoa(String nome, String bairro){
        this.nome = nome;
        this.bairro = bairro;
    }

    // Constructor
    public String getNome(){
        return nome;
    }

    public String getBairro(){
        return bairro;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }
}
