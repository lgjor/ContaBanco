/**
 * A classe ContaTerminal é a classe principal que inicia o aplicativo de conta bancária.
 */
public class ContaTerminal {
     /**
     * O método principal que cria uma instância da classe Conta, lê os dados da conta
     * do usuário e imprime as informações da conta no console.
     *
     * @param args Os argumentos da linha de comando (não utilizados neste aplicativo).
     * @throws Exception Se ocorrer um erro durante a leitura dos dados da conta.
     */
    /**
     * Construtor padrão da classe ContaTerminal.
     * Inicializa uma nova instância da classe.
     */
    public Conta criarConta() {
        // Inicializações padrão, se necessário.
        Conta conta = new Conta();       
        return conta;
    }

     public static void main(String[] args) throws Exception {
        ContaTerminal contaTerminal = new ContaTerminal();
        Conta conta = contaTerminal.criarConta();
        conta.LeDadosDaConta();
        conta.imprimirConta(conta);
    }
}

