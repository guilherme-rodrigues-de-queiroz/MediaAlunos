public class Main {
    public static void main(String[] args) {
        // criando objeto
        Aluno aluno1 = new Aluno("Guilherme", "Zona Leste", 10.0, 7.4);

        aluno1.calcularMedia();

        System.out.println("O aluno " + aluno1.getNome() + " foi " + aluno1.verificarAprovacao() + " com média de: " + aluno1.calcularMedia());
    }
}
