package lab3;

import java.util.Arrays;

/**
 * Representação de uma agenda de contatos.
 * 
 * @author Lucas Alves Vigolvino
 */
public class Agenda {
	/**
	 * Lista de todos os contatos cadastrados.
	 */
	private Contato[] contatos = new Contato[100];
	/**
	 * Quantidade contatos cadastrados.
	 */
	private int count = 0;
	/**
	 * Retorna uma boolean dizendo se a posição esolhida é válida ou não.
	 * 
	 * @param posicao a posicao do contato a ser testada
	 * @return o resultado do teste, true ou false
	 */
	public boolean testaPosicao(Integer posicao) {
		if(1 > posicao || posicao > 100) {
			return false;
		} else {
			return true;
		}
	}
	/**
	 * Adiciona um novo contato a agenda.
	 * 
	 * @param posicao a posição do contato na lista de contatos
	 * @param nome o nome do contato
	 * @param sobrenome o sobrenome do contato
	 * @param telefone o telefone do contato
	 */
	public void adicionaContato(Integer posicao, String nome, String sobrenome, String telefone) {
		if(this.contatos[posicao - 1] == null) {
			this.count++;
		}
		this.contatos[posicao - 1] = new Contato(nome, sobrenome, telefone);
	}
	/**
	 * Retorna a String que representa um contato, ou que não há contato cadastrado na posição escolhida.
	 * A representação segue o formato "\n" + "Nome do contato " + "Sobrenome do contato - Telefone do contato".
	 * 
	 * @param posicao a posição do contato escolhido
	 * @return a representação em String do contato escolhido, ou a declaração que a posição escolhida é um null
	 */
	public String exibirContato(Integer posicao) {
		if(this.contatos[posicao - 1] != null) {
			return this.contatos[posicao -  1].formatacaoContato();
		} else {
			return "POSIÇÃO INVÁLIDA!\n";
		}
	}
	/**
	 * Retorna a String que representa a agenda.
	 * A representação segue o formato "Posição do contato - Nome do contato" + "Sobrenome do contato" + "\n".
	 * Para cada contato pertencente a agenda.
	 * 
	 * @return a representação em String de uma agenda
	 */
	@Override
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
	/**
	 * Retorna a impressão digital da agenda, em relação a sua lista de contatos.
	 * 
	 * @return a impressão digital da agenda
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(contatos);
		return result;
	}
	/**
	 * Retorna a boolean dizendo se uma agenda é igual a outra.
	 * Nesse caso se as duas possuem os mesmos contatos nas mesmas posições.
	 * 
	 * @param outraAgenda a agenda a ser comparada
	 * @return o resultado do teste, true ou false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (!Arrays.equals(contatos, other.contatos))
			return false;
		return true;
	}
}
