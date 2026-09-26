import java.util.Scanner;
public class VerificadordeSenha{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
       final int senhacorreta = 123456;
        int tentativas = 3;

        while  (tentativas > 0) {
            System.out.println("Digite a Senha");
            int senha = sc.nextInt();

            if (senha == senhacorreta) {
                System.out.println("Acesso Liberado ");
                break;
            } else {

                tentativas = tentativas - 1;
                if(tentativas > 0) {
                    System.out.println("Acesso negado");
                    System.out.println("Tentativas Restantes " + tentativas);
                } else {
                    System.out.println("Bloqueado ");
                }
            }

        }
    }
}