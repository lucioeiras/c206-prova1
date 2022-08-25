public class Curso {
  String nome;
  String sigla;

  public void alunoMatriculado() {
    System.out.println("Aluno matriculado com sucesso!");
  }

  public void mostraInfo() {
    System.out.println("Curso: " + this.nome + " - " + this.sigla);
  }
}
