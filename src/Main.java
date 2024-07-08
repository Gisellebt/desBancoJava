
public class Main {
    public static void main(String[] args) {

        cliente maria = new cliente();
        maria.setNome("Maria");

        conta cc = new contaCorrente(maria);
        conta poupanca = new contaPoupanca(maria);
        
         cc.depositar(100);
         cc.transferir(100,poupanca);
        
         
         cc.imprimirExtrato();
         poupanca.imprimirExtrato();
   
          
    }
}

