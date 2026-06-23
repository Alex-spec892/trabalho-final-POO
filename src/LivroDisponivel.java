public  class LivroDisponivel implements EstadoLivro {
    @Override
    public void emprestar(Livro livro) {
        System.out.println("livro emprestado com sucesso!");
        livro.definirEstado(livro.getEmprestado());
    }
    @Override
    public void reservar(Livro livro) {
        System.out.println("livro reservado com sucesso!");
        livro.definirEstado(livro.getReservado());
    }

    @Override
    public void devolver(Livro livro) {
        System.out.println("Erro: o livro ja está na prateleira!");
        livro.definirEstado(livro.getDisponivel());

    }

    @Override
    public void enviarParaReparo(Livro livro) {
        System.out.println("Livro enviado para o reparo!");
        livro.definirEstado(livro.getManutencao());
    }
    @Override
    public void concluirReparo(Livro livro){
        System.out.println("Ação indisponivel");
        livro.definirEstado(livro.getDisponivel());

    }
}
