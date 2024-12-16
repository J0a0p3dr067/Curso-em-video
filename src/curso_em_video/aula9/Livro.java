package curso_em_video.aula9;

import curso_em_video.aula10.Pessoa;

public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPag, pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = leitor;
        this.aberto =false;
        this.pagAtual = 0;
    }
    

        
    public String detalhe() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", totPag=" + totPag + ", pagAtual=" + pagAtual
                + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + 
                ", Idade: " + leitor.getIdade() + 
                ", Sexo: " + leitor.getSexo() +"]";
    }



    




    




    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPag() {
        return totPag;
    }
    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
      
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }



    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }



    @Override
    public void abrir() {
        this.aberto = true;
    }



    @Override
    public void fechar() {
      this.aberto = false;
    }



    @Override
    public void folhear(int p) {
       if (p > this.totPag) {
           this.pagAtual = 0;
    }else {
    this.pagAtual = p; }
    }



    @Override
    public void avançarPag() {
        this.pagAtual++;
      
    }



    @Override
    public void voltarPag() {
       this.pagAtual--;
    }





    
    
}
