public class Livro{
    private EstadoLivro disponivel;
    private EstadoLivro emprestado;
    private EstadoLivro reservado;
    private EstadoLivro manutencao;
    private EstadoLivro estadoAtual;
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = new LivroDisponivel();
        this.emprestado = new LivroEmprestado();
        this.reservado = new LivroReservado();
        this.manutencao = new LivroManutencao();

        this.estadoAtual = this.disponivel;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    //metodo para mudar o estado
    public void definirEstado(EstadoLivro novoEstado) {
        this.estadoAtual = novoEstado;
    }

    //this é usado para referenciar qual livro em questão está sendo alterado o estado
    public void emprestar(Usuario usuario) {
        estadoAtual.emprestar(this, usuario);
    }

    public void devolver(Usuario usuario) {
        estadoAtual.devolver(this, usuario);
    }

    public void reservar(Usuario usuario) {
        estadoAtual.reservar(this, usuario);
    }

    public void enviarParaReparo() {
        estadoAtual.enviarParaReparo(this);
    }
    public void concluirReparo() {
        estadoAtual.concluirReparo(this);
    }

    //gets usados para definição do estado
    public EstadoLivro getDisponivel() {
        return disponivel;
    }

    public EstadoLivro getEmprestado() {
        return emprestado;
    }

    public EstadoLivro getReservado() {
        return reservado;
    }

    public EstadoLivro getManutencao() {
        return manutencao;
    }

    public EstadoLivro getEstadoAtual() {
        return estadoAtual;
    }
}
