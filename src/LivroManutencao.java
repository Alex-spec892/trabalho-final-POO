public class LivroManutencao implements EstadoLivro {
    @Override
    public void emprestar(Livro livro, Usuario usuario) {
        System.out.println("Livro em manunteção. Indisponivel para emprestimo");
        livro.definirEstado(livro.getManutencao());
    }

    @Override
    public void devolver(Livro livro, Usuario usuario) {
        System.out.println("Livro em manutenção!");
        livro.definirEstado(livro.getManutencao());
    }

    @Override
    public void reservar(Livro livro,  Usuario usuario) {
        System.out.println("Livro em manunteção. Indisponivel para reserva");
        livro.definirEstado(livro.getManutencao());
    }
    @Override
    public void enviarParaReparo(Livro livro) {
        System.out.println("Livro enviado para o reparo");
        livro.definirEstado(livro.getManutencao());
    }
    @Override
    public void concluirReparo(Livro livro){
        System.out.println("Reparo concluido! Livro disponivel novamente");
        livro.definirEstado(livro.getDisponivel());
    }
}
