public class ContaTerminal {
    public static void main(String[] args) {
        // Primeiro conjunto de valores
        double saldo = 25;
        double valorSolicitado = 18;

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldo);

        // Segundo conjunto de valores
        saldo = 15;
        valorSolicitado = 22;

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldo);
    }
}
