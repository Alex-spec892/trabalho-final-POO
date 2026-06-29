import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca(){
        this.livros = new ArrayList<>();

        Livro l1 = new Livro("Dom Casmurro","Machado de Assis" );
        Livro l2 = new Livro("A Batalha do Apocalipse", "Eduardo sophor");
        Livro l3 = new Livro("O Pequeno Principe", "Antoine de Saint-Exupéry");
        livros.add(l1);
        livros.add(l2);
    }

    public Livro buscarPorTitulo(String titulo){
        for(Livro livro : this.livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        System.out.println("Livro não encontrado");
        return null;
    }

}
