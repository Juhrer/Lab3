package lab3;

public class Agenda {
	private Contato[] contatos = new Contato[100];
	private int count = 0;
	public void adicionaContato(Integer posicao, String nome, String sobrenome, String telefone) {
		if(this.contatos[posicao - 1] == null) {
			this.count++;
		}
		this.contatos[posicao - 1] = new Contato(nome, sobrenome, telefone);
	}
	public String exibirContato(Integer posicao) {
		if(this.contatos[posicao - 1] != null) {
			return this.contatos[posicao -  1].formatacaoContato();
		} else {
			return "POSIÇÃO INVÁLIDA!\n";
		}
	}
	public String toString() {
		int i2 = 0;
		String[] contatosCadastrados = new String[this.count];
		for(Integer i = 0; i < 100; i++) {
			if(this.contatos[i] != null){
				contatosCadastrados[i2] = i + 1 + this.contatos[i].toString();
				i2++;
			}
		}
		return String.join("\n", contatosCadastrados);
	}
	public boolean equals(Agenda outraAgenda) {
		return this.contatos == outraAgenda.contatos;
	}
}