package atv;

public class RelogioDigital {
  
    private int horas;
    private int minutos;
    private int segundos;

    public RelogioDigital() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public RelogioDigital(int horas, int minutos, int segundos) {
        if (validarHora(horas, minutos, segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {

            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    private boolean validarHora(int horas, int minutos, int segundos) {
        return horas >= 0 && horas < 24 &&
               minutos >= 0 && minutos < 60 &&
               segundos >= 0 && segundos < 60;
    }

    
    public void exibirHorario24h() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    
    public void exibirHorario12h() {
        int horaFormatada = (horas % 12 == 0) ? 12 : horas % 12;
        String periodo = (horas >= 12) ? "PM" : "AM";
        System.out.printf("%02d:%02d:%02d %s\n", horaFormatada, minutos, segundos, periodo);
    }

    
    public void incrementarHora() {
        horas = (horas + 1) % 24; 
    }

    public void incrementarMinuto() {
        minutos = (minutos + 1) % 60; 
        if (minutos == 0) {
            incrementarHora();
        }
    }

    public void incrementarSegundo() {
        segundos = (segundos + 1) % 60; 
        if (segundos == 0) {
            incrementarMinuto(); 
        }
    }

    
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        }
    }
}
