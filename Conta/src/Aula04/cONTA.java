package Aula04;

public class cONTA {
    private int numero;
    private double saldo;

    public cONTA(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar (double valor){
        if (valor<=saldo)
        saldo = saldo - valor;
    }
    public void depositar(double valor){
        this.saldo=this.saldo + valor;
    }

}
