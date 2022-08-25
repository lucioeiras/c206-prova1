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

    for (int i = 0; i < alunos.length; i++) {
      if (alunos[i].aprovado) {
        alunosAprovados++;
      }
    }

    return alunosAprovados / alunos.length;
  }

  public int alunoSuperiorP5() {
    int alunosSuperiorP5 = 0;

    for (int i = 0; i < alunos.length; i++) {
      if (alunos[i].periodo >= 5) {
        alunosSuperiorP5++;
      }
    }

    return alunosSuperiorP5;
  }

  public void mostraInfo() {
    System.out.println("Nome: " + this.nome);
    System.out.println("CNPJ: " + this.CNPJ);

    for (Aluno aluno : alunos) {
      aluno.mostraInfo();
    }
  }
}
