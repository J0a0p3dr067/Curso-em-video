package curso_em_video.aula05;

import java.lang.reflect.Constructor;

public class ContaBanco {
   
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


///////////////////////////////
/// 
    public void abriConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo.equals("CC")) {
            this.saldo = 50;
        } else if (tipo.equals("CP")) {
            this.saldo = 150;
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinehiro");
        }  else if (saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
        }
    }

    public void depositar(float v) {
        if (status = true) {
            saldo = saldo + v;
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float v) {
        if (status == true) {
            if (saldo > v) {
                saldo = saldo - v;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("IMpossivel sacar");
        }
    }

    public void pagarMensal() {

    }


//////////////////////////////

    public ContaBanco(float saldo,boolean status) {
    this.saldo = 0;
    this.status = false;
    }


    
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public float getSalto() {
        return saldo;
    }
    public void setSalto(float salto) {
        this.saldo = salto;
    }

   
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }


    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}