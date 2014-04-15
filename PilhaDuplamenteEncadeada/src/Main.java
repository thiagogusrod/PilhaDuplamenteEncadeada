
import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String args[]){
        PilhaDupla pde = new PilhaDupla();
        
        String menu = "1 - Empilhar\n"
                + "2 - Desempilhar\n"
                + "3 - mostrar Inicio ao Fim\n"
                + "4 - mostrar Fim ao Inicio\n"
                + "5 - sair";
        int op = 0;
        int valor;
        while(op != 4){
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(op){
                case 1:
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
                    if(valor > 0){
                    pde.adicionaInicio(valor);
                    }else{
                        System.out.println("Valor invalido");
                    }
                break;
                case 2:
                    valor = pde.removeInicio();
                    System.out.println("O valor "+valor+" foi removido com sucesso");
                break;     
                case 3:
                    pde.mostraInicioFim();
                break;
                case 4:
                    pde.mostraFimInicio();
                break;
                case 5:
                break;
                default:
                    System.out.println("Opcao invalida");
                break;
            }
        }
        
    }
}
