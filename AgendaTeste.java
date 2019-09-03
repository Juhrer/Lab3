import static org.junit.Assert.*;
import org.junit.jupiter.api.*;
import lab3.*;

class AgendaTeste {
	private Agenda agenda1, agenda2, agenda3;
	
	@BeforeEach
	public void criaAgenda() {
		agenda1 = new Agenda();
		agenda2 = new Agenda();
		agenda3 = new Agenda();
		agenda1.adicionaContato(2, "Lucas", "Alves", "12345-6789");
		agenda1.adicionaContato(3, "Aeiou", "Luarte", "9999-0000");
		agenda2.adicionaContato(2, "Lucas", "Alves", "9999-0000");
		agenda2.adicionaContato(3, "Aeiou", "Luarte", "12345-6789");
		agenda3.adicionaContato(2, "Lucas", "Alves", "9999-0000");
		agenda3.adicionaContato(3, "Aeiou", "Alves", "12345-6789");
		agenda3.adicionaContato(3, "Lucas", "Luarte", "9999-0000");
	}

	@Test
	void testHashCode() {
		assertEquals(true,agenda1.hashCode() == agenda2.hashCode());
		assertEquals(false,agenda2.hashCode() == agenda3.hashCode());
	}
	
	@Test
	void testTestaPosicao() {
		assertEquals(false,agenda1.testaPosicao(0));
		assertEquals(false,agenda1.testaPosicao(101));
		assertEquals(true,agenda1.testaPosicao(1));
		assertEquals(true,agenda1.testaPosicao(100));
	}

	@Test
	void testExibirContato() {
		assertEquals("\nLucas Alves - 9999-0000\n",agenda3.exibirContato(2));
		assertEquals("POSIÇÃO INVÁLIDA!\n",agenda3.exibirContato(4));
		assertEquals("\nLucas Luarte - 9999-0000\n",agenda3.exibirContato(3));
	}

	@Test
	void testToString() {
		assertEquals("2 - Lucas Alves\n3 - Aeiou Luarte",agenda1.toString());
		assertEquals("2 - Lucas Alves\n3 - Lucas Luarte",agenda3.toString());
	}

	@Test
	void testEqualsObject() {
		assertEquals(true,agenda1.equals(agenda2));
		assertEquals(false,agenda2.equals(agenda3));
	}

}
