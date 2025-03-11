public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();       
        conta.LeDadosDaConta();
        conta.imprimirConta(conta);
    }
}

