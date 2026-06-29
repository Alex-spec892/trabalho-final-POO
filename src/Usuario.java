public class Usuario extends Pessoa {
    private Livro livroEmprestado;

    public Usuario(String nome, String matricula) {
        super(nome, matricula);
        this.livroEmprestado = null;
    }

    @Override
    public void interagirComBiblioteca(String acao, Livro livro) {
        if (acao.equalsIgnoreCase("emprestar")) {
            livro.emprestar(this);
        } else if (acao.equalsIgnoreCase("devolver")) {
            livro.devolver(this);
        }
        else if (acao.equalsIgnoreCase("reservar")) {
            livro.reservar(this);
        }
    }

    public Livro getLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(Livro livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public boolean temLivroEmprestado() {
        return livroEmprestado != null;
    }
}
