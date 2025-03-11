import java.util.Scanner;
/**
 * A classe Conta representa uma conta bancária com informações como nome, agência,
 * número da conta e saldo.
 */
public class Conta {
    /** O nome do titular da conta. */
    String nome;
    /** O número da agência da conta. */
    int agencia;
     /** O número da conta. */
    int numeroDaConta;
    /** O saldo da conta. */
    double saldo;

    /**
     * Construtor padrão da classe Conta.
     * Inicializa uma nova instância da conta com valores padrão.
     */
    public Conta() {
        // Inicializações padrão, se necessário.
        this.nome = "";
        this.agencia = 0;
        this.numeroDaConta = 0;
        this.saldo = 0.0;
    }

    /**
     * Lê os dados da conta do usuário através do console.
     *
     * @return A instância da classe Conta com os dados lidos.
     */
    public Conta LeDadosDaConta() {
        Scanner leNovaConta = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = leNovaConta.next();
        this.agencia = lerAgencia(leNovaConta); // Usando o método de validação
        this.numeroDaConta = lerConta(leNovaConta); // Usando o método de validação 
        System.out.println("Digite o saldo: ");
        this.saldo = Double.parseDouble(leNovaConta.next());
        leNovaConta.close();
        return this;
    }

    private int lerAgencia(Scanner scanner) {
        int agencia;
        boolean agenciaValida = false;
        do {
            System.out.println("Digite o número da agência: ");
            String agenciaInput = scanner.next();
            try {
                agencia = Integer.parseInt(agenciaInput);
                if (validarAgencia(agencia)) {
                    agenciaValida = true;
                    return agencia;
                } else {
                    System.out.println("Número de agência inválido. Deve estar entre 1 e 9999.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        } while (!agenciaValida);
        return -1; // Nunca deve chegar aqui, mas necessário para compilação
    }

    private boolean validarAgencia(int agencia) {
        return agencia > 0 && agencia <= 9999;
    }

    private int lerConta(Scanner scanner) {
        int numeroDaConta;
        boolean contaValida = false;
        do {
            System.out.println("Digite o número da conta: ");
            String contaInput = scanner.next();
            try {
                numeroDaConta = Integer.parseInt(contaInput);
                if (validarAgencia(agencia)) {
                    contaValida = true;
                    return numeroDaConta;
                } else {
                    System.out.println("Número de agência inválido. Deve estar entre 1 e 999999.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        } while (!contaValida);
        return -1; // Nunca deve chegar aqui, mas necessário para compilação
    }

    private boolean validarConta(int numeroDaConta) {
        return numeroDaConta > 0 && numeroDaConta <= 999999;
    }
    /**
     * Método que imprime as informações da conta no console.
     *
     * @param conta A instância da classe Conta a ser impressa.
     */
    public void imprimirConta(Conta conta) {
        System.out.println( "Olá "+ conta.nome +
                            ", obrigado por criar uma conta em nosso banco, sua agência é "+ String.valueOf(conta.agencia) +
                            ", conta "+String.valueOf(conta.numeroDaConta) +
                            " e seu saldo "+ String.valueOf(conta.saldo) +
                            " já está disponível para saque."); 
    }
}
