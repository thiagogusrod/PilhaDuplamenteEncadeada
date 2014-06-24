//TESTEGITHUB

public class PilhaDupla {
    No topo,base;
    //public int topo;
    
    PilhaDupla() {
        topo = null;
        base = null;
        
    }

    public void adicionaInicio(int e){
        No novo = new No(e);
        if(topo == null){
            //topo++;
            topo = novo;
            base = novo;
            System.out.println("Adicionado com sucesso: " + novo.dados);
        }else{
           
            novo.prox = topo;
            topo.ant = novo;
            topo = novo;
                  
            System.out.println("Adicionado com sucesso: " + novo.dados);
        }
    }
    
       public int removeInicio(){
        int resp = 1;
        if(topo == null){
            System.out.println("Erro! Pilha Vazia.");
        }else{
            if(topo.prox == null){
                resp = topo.dados;
                topo = null;
                fim = null;
                
            }else{
                resp = topo.dados;
                topo = topo.prox;
                topo.ant = null;
            }
        }
        return resp;
    }
        
         public void mostraInicioFim(){
        if(topo == null){
            System.out.println("Erro! Lista vazia.");
        }else{
            No aux = topo;
            while(aux != null){
                System.out.println("- " + aux.dados);
                aux = aux.prox;
            }
        }
    }
         public void mostraFimInicio(){
        if(topo == null){
            System.out.println("Erro! Lista vazia.");
        }else{
            No aux = fim;
            while(aux != null){
                System.out.println("- " + aux.dados);
                aux = aux.ant;
            }
        }
    }
}
    
 
