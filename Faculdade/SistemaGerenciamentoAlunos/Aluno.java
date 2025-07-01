package Faculdade.SistemaGerenciamentoAlunos;

class Aluno extends Pessoa {
    private String matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int idade, String matricula, double nota1, double nota2) {
        super(nome, idade);
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + calcularMedia());
    }
}
