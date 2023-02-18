import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a placa do carro: ");
        String placa  = ler.nextLine();
        System.out.println("Digite o ano de fabricação do carro: ");
        int ano = ler.nextInt();


        //validar carro
        String estado; 
        if (ano < 2010){
            estado = "carro antigo";       
        }else if (ano >= 2011 && ano <= 2022){
            estado = "Carro Semi Novo";
        } else if (ano == 2023){
            estado = "Carro novo";
        }else {
             estado = "situação desconhecida";      
        }

        //Remover vogais
        placa = placa.replaceAll("[aeioAEIO8]","*");
        
        //Situação veiculo
        System.out.println("Placa do carro: " + placa);
        System.out.println("Estado do veiculo: " + estado);
        }
}
