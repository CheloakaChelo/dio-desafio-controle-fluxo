import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero para parametro");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo numero como parametro");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }else{
            for (int x = parametroUm; x <= parametroDois; x++){
                System.out.println("Contagem numero: "+ x);
            }
        }

        
    }

}
