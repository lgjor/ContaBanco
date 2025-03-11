/**
 * A classe Conta representa uma conta bancária com informações como nome, agência,
 * número da conta e saldo.
 */
import java.util.Scanner;

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
     * Método que lê os dados da conta do usuário através do console.
     *
     * @return A instância da classe Conta com os dados lidos.
     */
    public Conta LeDadosDaConta() {
        Scanner leNovaConta = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = leNovaConta.next();
        System.out.println("Digite o número da agência: ");
        this.agencia = Integer.parseInt(leNovaConta.next());
        System.out.println("Digite o número da conta: ");
        this.numeroDaConta = Integer.parseInt(leNovaConta.next());
        System.out.println("Digite o saldo: ");
        this.saldo = Double.parseDouble(leNovaConta.next());
        leNovaConta.close();
        return this;
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
