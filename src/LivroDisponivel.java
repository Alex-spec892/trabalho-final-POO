public  class LivroDisponivel implements EstadoLivro {
    @Override
    public void emprestar(Livro livro, Usuario usuario) {
        if (usuario.temLivroEmprestado()) {
            System.out.println("Erro:" + usuario.getNome() + "já possui um livro emprestado!");
            return;
        }

        System.out.println("Livro " + livro.getTitulo() + " emprestado para "+usuario.getNome());

        usuario.setLivroEmprestado(livro);
        livro.definirEstado(livro.getEmprestado());

    }
    @Override
    public void reservar(Livro livro, Usuario usuario) {
        System.out.println("livro reservado com sucesso!");
        livro.definirEstado(livro.getReservado());
    }

    @Override
    public void devolver(Livro livro, Usuario usuario) {
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
