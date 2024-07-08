
public class contaPoupanca extends conta {

      public contaPoupanca(cliente cliente){
          super (cliente);
  }

      @Override
      public void imprimirExtrato() {
        System.out.println("###Extrato conta poupança###");
        super.imprimirInfosComuns();
      // throw new UnsupportedOperationException("Not supported yet.");
    }
}

