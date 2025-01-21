package curso_em_video.aula14;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssitido;


    public void viuMaisUm() {
        totAssitido++;
    }




    
    public Gafanhoto(String nome, String sexo, int idade, String login, int totAssitido) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssitido = 0;
    }





    public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
    }


    public int isTotAssitido() {
        return totAssitido;
    }


    public void setTotAssitido(int totAssitido) {
        this.totAssitido = totAssitido;
    }


    
}
