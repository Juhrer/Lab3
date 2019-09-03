package lab3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String comando, nome, sobrenome, telefone;
		int posicao;
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
					posicao = sc.nextInt();
				if(1 > posicao || posicao > 100) {
					System.out.println("POSIÇÃO INVÁLIDA!\n");
				} else {
					System.out.print("Nome: ");
					nome = sc.nextLine();
					System.out.print("Sobrenome: ");
					sobrenome = sc.nextLine();
					System.out.print("Telefone: ");
					telefone = sc.nextLine();
					System.out.println("CADASTRO REALIZADO!\n");
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
