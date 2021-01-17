package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import classe.Orange;
import classe.Panier;

public class PanierTest {

	private ArrayList<Orange> panier, panier1, panier2, panier3;
	private Panier p1, p2, p3, p4;
	
	@Before
	public void init() throws Exception {
		panier = new ArrayList<Orange>();
		panier1 = new ArrayList<Orange>(); 
		panier2 = new ArrayList<Orange>();
		panier3 = new ArrayList<Orange>();
		
		p1 = new Panier(panier, 10);
		p2 = new Panier(panier1, 10);
		p3 = new Panier(panier2, 5);
		p4 = new Panier(panier3, 10);
		
		p1.ajouter(new Orange(0.80, "France"));
		p1.ajouter(new Orange(0.80, "Espagne"));
		p1.ajouter(new Orange(0.90, "Floride"));
		
		p2.ajouter(new Orange(0.80, "France"));
		p2.ajouter(new Orange(0.80, "Espagne"));
		p2.ajouter(new Orange(0.90, "Floride"));
		
		p3.ajouter(new Orange(0.80, "France"));
		p3.ajouter(new Orange(0.80, "Espagne"));
		
	}
	
	@Test
	public void test() {
		assertEquals(false,p1.estPlein());
		assertEquals(true,p4.estVide());
		assertEquals(false,p1.equals(p3));
		assertEquals(true,p1.equals(p2));
	}

}
