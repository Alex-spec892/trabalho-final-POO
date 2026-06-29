public abstract class Pessoa {
    private String nome;
    private int idade;
    private int cpf;
    private String matricula;

    public Pessoa(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract void interagirComBiblioteca(String acao, Livro livro);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
