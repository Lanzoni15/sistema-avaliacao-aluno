import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a 1º nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a 2º nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a 3º nota:");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        aluno.calcularMedia();

    }
}
