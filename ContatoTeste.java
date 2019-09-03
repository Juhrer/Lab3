import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import lab3.*;

class ContatoTeste {
	private Contato contato1, contato2, contato3, contato4;
	
	@BeforeEach
	void CriaContato() {
		contato1 = new Contato("Lucas", "Alves", "12345-6789");
		contato2 = new Contato("Lucas", "Alves", "9999-0000");
		contato3 = new Contato("Aeiou", "Alves", "12345-6789");
		contato4 = new Contato("Lucas", "Luarte", "9999-0000");
	}

	@Test
	void testEqualsObject() {
		assertEquals(true,contato1.equals(contato2));
		assertEquals(false,contato1.equals(contato3));
		assertEquals(false,contato2.equals(contato4));
	}
	@Test
	void testHashCode() {
		assertEquals(true,contato1.hashCode() == contato2.hashCode());
		assertEquals(false,contato1.hashCode() == contato3.hashCode());
		assertEquals(false,contato2.hashCode() == contato4.hashCode());
	}

	@Test
	void testFormatacaoContato() {
		assertEquals("\nLucas Alves - 12345-6789\n", contato1.formatacaoContato());
		assertEquals("\nAeiou Alves - 12345-6789\n", contato3.formatacaoContato());
	}

	@Test
	void testToString() {
		assertEquals(" - Lucas Alves", contato1.toString());
		assertEquals(" - Aeiou Alves", contato3.toString());
	}

}
