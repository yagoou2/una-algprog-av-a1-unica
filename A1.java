import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nivelAcesso, nivelSigilo;

        System.out.println("=== Sistema Sentinela ===");
        System.out.print("Insira o nome do profissional: ");
        String nome = sc.nextLine();
        System.out.print("Insira o cargo ocupado por este profissional: ");
        String cargo = sc.nextLine();
        System.out.print("Insira o nivel de acesso deste profissional: ");
        do{
        nivelAcesso = sc.nextInt();
        if(nivelAcesso>10 || nivelAcesso<0){
            System.out.println("Erro: Nível de acesso invalido, insira novamente: ");
        }
        }while(nivelAcesso>10||nivelAcesso<0);
        System.out.print("Insira o nivel de sigilo da área que este profissional deseja acessar: ");
        do{
        nivelSigilo = sc.nextInt();
        if(nivelSigilo>10 || nivelSigilo<0){
            System.out.println("Erro: Nível de sigilo invalido, insira novamente:");
        }
        }while(nivelSigilo>10 || nivelAcesso<0);

        if (nivelAcesso>=nivelSigilo){
            System.out.println(nome+" ("+cargo+") - ACESSO PERMITIDO. Saldo de autoridade: "+(nivelAcesso-nivelSigilo));;
        } else{
            System.out.println("ALERTA: Tentativa de acesso indevida detectada!");
            System.out.println(nome+" ("+cargo+") - ACESSO NEGADO.");

        }

    }
}
