public abstract  class conta implements Iconta {

        
        protected static final int AGENCIA_PADRAO = 1;
        protected static int  SEQUENCIAL = 1;
        

   
        protected int  agencia;
        protected int numero;
        public double saldo;
        protected cliente cliente;
        //atributo list
        

        
        public conta (cliente cliente) {
          this.agencia = conta.AGENCIA_PADRAO;
          this.numero =  conta.SEQUENCIAL++;
          this.cliente = cliente;
        } 
        @Override
        public void sacar (double valor) {
         this.saldo -= valor;
       }
        @Override
        public void depositar (double valor){
            this.saldo += valor;

       }
        @Override
        public void transferir (double valor , conta contaDestino){
           this.sacar(valor);
           contaDestino.depositar(valor);

       }
             
        public int getAgencia(){
            return agencia;
        }
        public int getNumero(){
            return numero;
        }
        public  double getSaldo(){
            return saldo;
         }
         

        protected void imprimirInfosComuns(){
            System.out.println(String.format("Titular:%s", this.cliente.getNome()));
            System.out.println(String.format("Agencia:%d", this.agencia));
            System.out.println(String.format("Numero:  %d", this.numero));
            System.out.println(String.format("Saldo: %.2f" , this.saldo));
         
      }

   
   }
            
          
        


