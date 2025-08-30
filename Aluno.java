public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private String status;

    // CONSTRUTOR
    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // GETTERS
    public String getStatus() {
        return status;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    // METODOS

    private double media = (nota1 + nota2 + nota3) / 3;

    public void calcularMedia() {

        if (media >= 7) {
            status = "Aprovado";
            System.out.println("Você está: " + status);
        } else if (media >= 5 && media < 7) {
            status = "Recuperação";
            System.out.println("Você está: " + status);
        } else {
            status = "Reprovado";
            System.out.println("Você está: " + status);

        }
    }
}
