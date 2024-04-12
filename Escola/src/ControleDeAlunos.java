
import java.util.Scanner;

public class ControleDeAlunos {
    public static void main(String[] args) {
        final int MAX_ALUNOS = 20;
        Pilha PE_1 = new Pilha(MAX_ALUNOS);
        Pilha PE_2 = new Pilha(MAX_ALUNOS);
        Scanner scanner = new Scanner(System.in);
        Aluno aluno;

        System.out.println("Cadastro de Alunos");
        System.out.println("------------------");

        for (int i = 0; i < MAX_ALUNOS; i++) {
            aluno = new Aluno();
            System.out.println("Aluno " + (i + 1));
            System.out.print("Nome: ");
            aluno.nome = scanner.nextLine();
            System.out.print("Matricula: ");
            aluno.matricula = scanner.nextLine();
            System.out.print("Sexo (M/F): ");
            aluno.sexo = scanner.nextLine();

            if (aluno.sexo.equals("M")) {
                PE_2.push(aluno);
            } else if (aluno.sexo.equals("F")) {
                PE_1.push(aluno);
            } else {
                System.out.println("Sexo inválido!");
                i--; // Volta uma iteração para repetir a entrada do mesmo aluno
            }
        }

        System.out.println("\nAlunos Cadastrados:");
        System.out.println("--------------------");
        System.out.println("Alunos do sexo masculino (PE_2):");
        while (!PE_1.isEmpty()) {
            aluno = PE_1.pop();
            System.out.println("Nome: " + aluno.nome + ", Matricula: " + aluno.matricula + ", Sexo: " + aluno.sexo);
        }

        System.out.println("\nAlunos do sexo feminino (PE_1):");
        while (!PE_2.isEmpty()) {
            aluno = PE_2.pop();
            System.out.println("Nome: " + aluno.nome + ", Matricula: " + aluno.matricula + ", Sexo: " + aluno.sexo);
        }

        PE_1.destroy();
        PE_2.destroy();
        scanner.close();
    }
}