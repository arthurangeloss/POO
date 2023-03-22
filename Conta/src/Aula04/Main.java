package Aula04;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numero;
        double saldo, limite,rendimento;
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Banco:\n1>Conta Corrente\n2>Conta Poupança\n3>Sair\n"));
    switch (opcao){
        case 1:
            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:"));
            saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
            limite = Double.parseDouble(JOptionPane.showInputDialog("Limite:"));
            contaCorrente cc1 = new contaCorrente(numero,saldo,limite);
            JOptionPane.showMessageDialog(null,"SALDO:"+cc1.getSaldo()+"\nSaldo com o limite: "+cc1.consultaSaldoTotal(),"Conta Corrente",JOptionPane.INFORMATION_MESSAGE);
            break;
        case 2:
            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:"));
            saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
            rendimento = Double.parseDouble(JOptionPane.showInputDialog("Rendimento: "));
            contaPoupanca cp1 = new contaPoupanca(numero,saldo,rendimento);
            JOptionPane.showMessageDialog(null,"SALDO:"+cp1.getSaldo(),"Conta Poupança:" ,JOptionPane.INFORMATION_MESSAGE);

            break;
        case 3:
            break;
        default:
            JOptionPane.showMessageDialog(null,"Escolha invalida","ERRO",JOptionPane.ERROR);
    }






    }
}
