package aula5;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    ////////////////////////
   
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void estado () {
        System.out.println("---------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("Status " + this.isStatus());
      
    }
    
    public void abriConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if ( tipo.equals("CC")) {
           this.setSaldo(50);
        } else if (tipo.equals("CP")) {
            this.setSaldo(150);
        } 
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
            System.out.println("Conta fechada");
        }
    }
    
    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado");
        } else {
            System.out.println("ERRO NO DEPOSITO");
        }
    }

    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado");
            } else {
                System.out.println("saldo é insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar");
        }

    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.isStatus()) {
            if (saldo > v) {
                this.setSaldo(this.getSaldo() - v);
            }
        }
    }

////////////////////////

       // Getter e Setter para numConta
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }



    // Getter e Setter para tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    // Getter e Setter para dono
    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }


    // Getter e Setter para saldo
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    // Getter e Setter para status
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
