package lab3;

public class Contato {
	private String nome, sobrenome, telefone;
	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	public boolean equals(Contato outroContato) {
		return this.nome == outroContato.nome && this.sobrenome == outroContato.sobrenome;
	}
	public String formatacaoContato() {
		return "\n" + nome + " " + sobrenome + " - " + telefone + "\n";
	}
	public String toString() {
		return " - " + nome + " " + sobrenome;
	}
}