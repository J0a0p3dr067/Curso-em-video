package curso_em_video.aula9;

import curso_em_video.aula10.Pessoa;

public class mainPessoa {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        

        


        l[0] = new Livro("java", "Gustavo", 210,p[0]);
        l[1] = new Livro("Poo", "Joao", 320, p[1]);
        l[2] = new Livro("Java avançado", "jose", 413, p[0]);

        System.out.println(l[2].detalhe());
    }
}
