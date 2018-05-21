
package assinaturaslivro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Scanner;
public class AssinaturasLivro {
private static List <String> assinaturas;
	
public static void main(String[] args) {
assinaturas = new ArrayList <String>();
Scanner dados = new Scanner (System.in);
int menu;
String inserir;
do {
System.out.print("..:Assinaturas:.."
+"\n(1) Adicionar Assinaturas \n"
+"(2) Visualizar Assisnaturas \n"
+"(0) Sair do programa \n"
+"\nInsira a opção que deseja: ");
menu = dados.nextInt();
switch(menu) {
case 1: 
System.out.println();
inserir=JOptionPane.showInputDialog("Assinatura: ");
assinaturas.add(inserir);
System.out.println();
System.out.println(assinaturas);
System.out.println();
break;
case 2:
System.out.println();
System.out.println(assinaturas);
System.out.println();
break;
case 0:
System.exit(0);
					
}} while (true);
}}
