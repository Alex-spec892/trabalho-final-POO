public class LivroEmprestado implements EstadoLivro {
    @Override
    public void emprestar(Livro livro) {
        System.out.println("Erro: Livro já emprestado!");
        livro.definirEstado(livro.getEmprestado());
    }
    @Override
    public void devolver(Livro livro) {
        System.out.println("Livro devolvido com sucesso!");
        livro.definirEstado(livro.getDisponivel());

    }
    @Override
    public void reservar(Livro livro) {
        System.out.println("Livro emprestado no momento!");
        livro.definirEstado(livro.getEmprestado());
    }

    @Override
    public void enviarParaReparo(Livro livro) {
        System.out.println("O livro precisa estar disponivel para ser enviado para o reparo");
        livro.definirEstado(livro.getEmprestado());
    }
    @Override
    public void concluirReparo(Livro livro){
        System.out.println("Ação indisponivel");
        livro.definirEstado(livro.getDisponivel());

    }
}
