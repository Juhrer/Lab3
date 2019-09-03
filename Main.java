package lab3;

import java.util.Scanner;

/**
 * Menu que interage diretamente com o usuário.
 * Recebendo entradas e imprimindo saídas.
 * 
 * @author Lucas Alves Vigolvino
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String comando, nome, sobrenome, telefone;
		Integer posicao;
		Agenda agenda = new Agenda();
		while(true) {
			System.out.print("(C)adastrar Contato\n(L)istar Contatos\n(E)xibir Contato\n(S)air\n\nOpção> ");
			comando = sc.nextLine();
		if(!comando.equalsIgnoreCase("S") && !comando.equalsIgnoreCase("C") && !comando.equalsIgnoreCase("E") && !comando.equalsIgnoreCase("L")) {
			System.out.println("OPÇÃO INVÁLIDA!\n");
			}else if(comando.equalsIgnoreCase("S")) {
				break;
			} else if(comando.equalsIgnoreCase("C")) {
				System.out.print("\nPosição: ");
				try {
					posicao = Integer.parseInt(sc.nextLine());
				} catch(Exception e) {
					posicao = -1;
				}
				if(agenda.testaPosicao(posicao)) {
					System.out.print("Nome: ");
					nome = sc.nextLine();
					System.out.print("Sobrenome: ");
					sobrenome = sc.nextLine();
					System.out.print("Telefone: ");
					telefone = sc.nextLine();
					agenda.adicionaContato(posicao, nome, sobrenome, telefone);
					System.out.println("CADASTRO REALIZADO!\n");
				} else {
					System.out.println("POSIÇÃO INVÁLIDA!\n");
				}
			}else if(comando.equalsIgnoreCase("L")) {
				System.out.println("\n" + agenda + "\n");
			}else {
				System.out.print("Contato> ");
				posicao = Integer.parseInt(sc.nextLine());	
				System.out.println(agenda.exibirContato(posicao));
			}
		}
		sc.close();
	}
}
