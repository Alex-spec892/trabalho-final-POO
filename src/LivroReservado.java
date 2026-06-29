public class LivroReservado implements EstadoLivro {
    @Override
    public void emprestar(Livro livro, Usuario usuario) {
        System.out.println("Livro indisponivel no momento.");
        livro.definirEstado(livro.getReservado());

    }
    @Override
    public void devolver(Livro livro, Usuario usuario) {
        System.out.println("Livro voltou para a prateleira.");
        livro.definirEstado(livro.getDisponivel());
    }

    @Override
    public void reservar(Livro livro, Usuario usuario) {
        System.out.println("livro reservado com sucesso!");
        livro.definirEstado(livro.getReservado());
    }

    @Override
    public void enviarParaReparo(Livro livro) {
        System.out.println("Não é possivel enviar o livro para a manutenção.");
        livro.definirEstado(livro.getReservado());
    }
    @Override
    public void concluirReparo(Livro livro){
        System.out.println("Ação indisponivel");
        livro.definirEstado(livro.getDisponivel());

    }

}
