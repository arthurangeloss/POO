package Aula04;

public class contaCorrente extends cONTA{
    private double limite;

    public contaCorrente(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double consultaSaldoTotal(){
        return getSaldo()+getLimite();
    }
}
