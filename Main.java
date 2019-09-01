package lab3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String comando, nome, sobrenome, telefone;
		Integer posicao;
		Agenda agenda = new Agenda();
		while(true) {
			System.out.print("(C)adastrar Contato\n(L)istar Contatos\n(E)xibir Contato\n(S)air\n\nOp��o> ");
			comando = sc.nextLine();
		if(!comando.equalsIgnoreCase("S") && !comando.equalsIgnoreCase("C") && !comando.equalsIgnoreCase("E") && !comando.equalsIgnoreCase("L")) {
			System.out.println("OP��O INV�LIDA!\n");
			}else if(comando.equalsIgnoreCase("S")) {
				break;
			} else if(comando.equalsIgnoreCase("C")) {
				System.out.print("\nPosi��o: ");
				try {
					posicao = Integer.parseInt(sc.nextLine());
				} catch(Exception e) {
					posicao = -1;
				}
				if(1 > posicao || posicao > 100) {
					System.out.println("POSI��O INV�LIDA!\n");
				} else {
					System.out.print("Nome: ");
					nome = sc.nextLine();
					System.out.print("Sobrenome: ");
					sobrenome = sc.nextLine();
					System.out.print("Telefone: ");
					telefone = sc.nextLine();
					agenda.adicionaContato(posicao, nome, sobrenome, telefone);
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