public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("busque um livro");
        Livro livroEscolhido = biblioteca.buscarPorTitulo("Dom Casmurro");

        if(livroEscolhido != null){
            System.out.println("Estado inicial:" + livroEscolhido.getEstadoAtual().getClass().getSimpleName());

            livroEscolhido.emprestar();
            livroEscolhido.reservar();
            livroEscolhido.devolver();

        }
    }
}
