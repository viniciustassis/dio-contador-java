import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        // Recebendo os parâmetros
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimindo a mensagem de erro
            System.out.println(exception.getMessage());
        }
        
        terminal.close();
    }

    // Método que realiza a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validando se parametroUm é maior que parametroDois
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calculando a quantidade de iterações
        int contagem = parametroDois - parametroUm;
        
        // Realizando o loop para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
