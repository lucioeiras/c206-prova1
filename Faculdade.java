public class Faculdade {
  String nome;
  String CNPJ;
  Aluno[] alunos = new Aluno[50];

  Curso curso = new Curso();

  public void addAluno(Aluno novoAluno) {
    alunos[alunos.length - 1] = novoAluno;
    this.curso.alunoMatriculado();
  }

  public float mediaAprovacao() {
    float alunosAprovados = 0;

    for (Aluno aluno : alunos) {
      if (aluno != null && aluno.aprovado) {
        alunosAprovados++;
      }
    }

    return alunosAprovados / alunos.length;
  }

  public int alunoSuperiorP5() {
    int alunosSuperiorP5 = 0;

    for (Aluno aluno : alunos) {
      if (aluno != null && aluno.periodo >= 5) {
        alunosSuperiorP5++;
      }
    }

    return alunosSuperiorP5;
  }

  public void mostraInfo() {
    System.out.println("Nome: " + this.nome);
    System.out.println("CNPJ: " + this.CNPJ);

    System.out.println();

    System.out.println("Curso: " + this.curso.nome);
    System.out.println("Sigla: " + this.curso.sigla);

    System.out.println();

    for (Aluno aluno : alunos) {
      if (aluno != null) {
        aluno.mostraInfo();
        System.out.println();
      }
    }
  }
}
