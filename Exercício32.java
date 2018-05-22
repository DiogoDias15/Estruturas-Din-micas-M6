
package exercício32;
import java.util.Scanner;
import java.util.LinkedList;
import javax.swing.JOptionPane;
public class Exercício32 {
private static LinkedList<String> recados;
    public static void main(String[] args) {
    recados =new LinkedList <String>();
    Scanner dados= new Scanner(System.in);
    int menu;
    String inserir;
    String escolha;
    do{
    System.out.print("..:Bloco de Notas:.."
    +"\n(1) Adicionar Recado \n"
    +"(2) Visiualizar Recado \n"
    +"(3) Remover Recado\n"
    +"(0) Sair do programa \n"
    +"\nInsira a opção que deseja: ");  
    menu= dados.nextInt();
    switch(menu){
        case 1:
            System.out.println();
            inserir = JOptionPane.showInputDialog("Inserir Linha");
            recados.add(inserir);
            System.out.println(recados);
            System.out.println();
         break;
        case 2:
            System.out.println();
            System.out.println(recados);
            System.out.println();
         break;
        case 3:
            System.out.println();
            System.out.println("Têm a certeza que quer remover a primeira linha? (Sim/Não)");
            escolha = dados.next();
            if (escolha.equals("Sim")){
               System.out.println();
               System.out.println("A primeira linha foi removida com sucesso!");
               recados.removeFirst();
               System.out.println();
            }else{
                System.out.println();
                System.out.println("Voltou ao Menu");
                System.out.println();
            }
            break;
        case 0:
            System.out.println();
            System.out.print("Adeus!");
            System.exit (0);
            
            }
    }while (true);
    
    }
    
    }
    

