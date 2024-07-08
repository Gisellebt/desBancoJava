import java.util.List;
public class banco {

       protected String nome;
       protected List<conta> contas;
      
       public String getNome(){
        return nome;
       }
       public void setNome(String nome){
        this.nome = nome;
       }
       public List<conta> getContas(){
         return contas;
       }
       public void Setcontas(List<conta> contas){
         this.contas = contas;
       }
        
    }
    

