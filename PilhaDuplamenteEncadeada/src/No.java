import javax.swing.*;

public class No{
   
    public int dados;
    public No prox;
    public No ant;
   

//CONSTRUTOR
        No(int capacidade){
            dados = capacidade;
            ant = null;
            prox = null;
            
        }
}