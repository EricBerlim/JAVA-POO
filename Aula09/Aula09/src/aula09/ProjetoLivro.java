package aula09;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2]; //2 pessoas
        Livro[] l = new Livro[3]; //3 livros
        
        p[0] = new Pessoa("João", 22, "M"); //Primeira pessoa
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Java", "José Silva", 300, p[0]); //Primeiro livro
        l[1] = new Livro("POO", "Pedro Souza", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Janete Aguila", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        System.out.println(l[1].detalhes());
    }
}