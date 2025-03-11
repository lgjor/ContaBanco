import java.util.Scanner;

public class Conta {
    String nome;
    int agencia;
    int numeroDaConta;
    double saldo;

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

    public void imprimirConta(Conta conta) {
        System.out.println( "Olá "+ conta.nome +
                            ", obrigado por criar uma conta em nosso banco, sua agência é "+ String.valueOf(conta.agencia) +
                            ", conta "+String.valueOf(conta.numeroDaConta) +
                            " e seu saldo "+ String.valueOf(conta.saldo) +
                            " já está disponível para saque."); 
    }
}
