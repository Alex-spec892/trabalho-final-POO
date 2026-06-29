public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Pessoa usuario1 = new Usuario("Pedro Cardoso", "12344213");

        Livro livroEscolhido = biblioteca.buscarPorTitulo("Dom Casmurro");

        if(livroEscolhido != null){
            usuario1.interagirComBiblioteca("emprestar", livroEscolhido);

            Usuario userObj = (Usuario) usuario1;
            System.out.println("Livro em mãos do " + userObj.getNome() + ": " + userObj.getMatricula());

            //devolvendo o livro
            usuario1.interagirComBiblioteca("devolver", livroEscolhido);

        }
    }
}
