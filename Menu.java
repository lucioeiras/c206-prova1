import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {
    Faculdade faculdade = new Faculdade();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual o nome da faculdade?");
    faculdade.nome = scanner.nextLine();

    System.out.println("Qual o CNPJ?");
    faculdade.CNPJ = scanner.nextLine();

    System.out.println("Qual o nome do curso?");
    faculdade.curso.nome = scanner.nextLine();

    System.out.println("Qual a sigla?");
    faculdade.curso.sigla = scanner.nextLine();

    System.out.println("======== MENU ========");
    System.out.println("1) Adicionar aluno");
    System.out.println("2) Mostrar informações");
    System.out.println("3) Alunos acima da P5");
    System.out.println("4) Média de aprovação");
    System.out.println("5) SAIR");

    int option = scanner.nextInt();
    scanner.nextLine();

    while (option != 5){
      switch (option) {
        case 1:
          Aluno novoAluno = new Aluno();

          System.out.println("Qual o nome do aluno?");
          novoAluno.nome = scanner.nextLine();

          System.out.println("Qual a idade?");
          novoAluno.idade = scanner.nextInt();

          scanner.nextLine();

          System.out.println("Qual a matricula?");
          novoAluno.matricula = scanner.nextLine();

          System.out.println("Qual o periodo?");
          novoAluno.periodo = scanner.nextInt();
  
          System.out.println("Ele foi aprovado?");
          novoAluno.aprovado = scanner.nextBoolean();
  
          faculdade.addAluno(novoAluno);
        break;
  
        case 2:
          faculdade.mostraInfo();
        break;
  
        case 3:
          System.out.println(faculdade.alunoSuperiorP5());
        break;
  
        case 4:
          System.out.println(faculdade.mediaAprovacao());
        break;
      }

      System.out.println("======== MENU ========");
      System.out.println("1) Adicionar aluno");
      System.out.println("2) Mostrar informações");
      System.out.println("3) Alunos acima da P5");
      System.out.println("4) Média de aprovação");
      System.out.println("5) SAIR");

      option = scanner.nextInt();
      scanner.nextLine();
    }

    scanner.close();
  }
}