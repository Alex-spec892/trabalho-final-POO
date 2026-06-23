public interface EstadoLivro {
     void emprestar(Livro livro);

     void devolver(Livro livro);

     void reservar(Livro livro);

     void enviarParaReparo(Livro livro);

     void concluirReparo(Livro livro);
}