public interface EstadoLivro {
     void emprestar(Livro livro, Usuario usuario);

     void devolver(Livro livro, Usuario usuario);

     void reservar(Livro livro, Usuario usuario);

     void enviarParaReparo(Livro livro);

     void concluirReparo(Livro livro);

}