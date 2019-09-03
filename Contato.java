package lab3;

/**
 * Representação de um contato.
 * Todo contato tem um nome, um sobrenome, e um telefone.
 * 
 * @author Lucas Alves Vigolvino
 */
public class Contato {
	/**
	 * Nome, sobrenome e telefone do contato.
	 */
	private String nome, sobrenome, telefone;
	/**
	 * Constrói um contato a partir do seu nome, sobrenome e telefone.
	 * 
	 * @param nome o nome do contato
	 * @param sobrenome o sobrenome do contato
	 * @param telefone o telefone do contato
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	/**
	 * Retorna a impressão digital do contato, em relação oa seu nome e sobrenome.
	 * 
	 * @return a impressão digital do contato
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		return result;
	}
