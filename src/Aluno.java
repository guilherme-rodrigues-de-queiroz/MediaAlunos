public class Aluno extends Pessoa {
    private double nota1, nota2, media;

    // constructor
    public Aluno(String nome, String bairro, double nota1, double nota2){
        super(nome, bairro); // usado para herdar do Pessoa.java
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1(){
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setMedia(double Media) {
        this.media = media;
    }

    public String verificarAprovacao(){
        if(this.media >= 7){
            return "aprovado";
        } else {
            return "reprovado";
        }
    }

    public double calcularMedia(){
        this.media = (this.nota1 + this.nota2) / 2;
        return this.media;
    }
}
