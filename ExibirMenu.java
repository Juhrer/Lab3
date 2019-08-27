import java.util.Scanner;

public class Agenda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String comando;
		String nome;
		String sobrenome;
		int posicao;
		String telefone;
		String[] agenda = new String[100];
		while(true) {
			System.out.print("(C)adastrar Contato\n(L)istar Contatos\n(E)xibir Contato\n(S)air\n\nOpção>");
			comando = sc.nextLine();
		if(!comando.equals("S") && !comando.equals("C") && !comando.equals("E") && !comando.equals("L")) {
			System.out.println("\nOPÇÃO INVÁLIDA!\n");
			}else if(comando.equals("S")) {
				break;
			} else if(comando.equals("C")) {
				System.out.print("Posição: ");
				posicao = sc.nextInt();
				if(1 > posicao || posicao > 100) {
					System.out.println("\nPOSIÇÃO INVÁLIDA!\n");
				} else {
					System.out.print("\nNome: ");
					nome = sc.nextLine();
					System.out.print("\nSobrenome: ");
					sobrenome = sc.nextLine();
					System.out.print("\nTelefone: ");
					telefone = sc.nextLine();
					System.out.println("\nCADASTRO REALIZADO!\n");
					agenda[posicao - 1] = "\n" + nome + " " + sobrenome + " " + " - " + telefone + "\n";
				}
			}else if(comando.equals("L")) {
				
			}else if(comando.equals("E")) {
				System.out.print("Contato> ");
				posicao = sc.nextInt();
				if(agenda[posicao - 1] == null) {
					System.out.println("\nPOSIÇÃO INVÁLIDA!\n");
				}else {
					System.out.print("\n" + agenda[posicao - 1]);
				}
			}
		}
	}
}
