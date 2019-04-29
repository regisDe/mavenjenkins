package fr.afcepf.al33.jenkins.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.afcepf.al33.jenkins.Calculateur;

public class CalculateurTest {
	
	private static Calculateur calcul = null;
	
	@BeforeAll
	public static void init() {
		calcul = new Calculateur();
	}

	@Test
	public void addTest() {
		assertEquals(42, calcul.add(2, 40), "Pb sur add");
	}

	@Test
	public void multTest() {
		assertEquals(42, calcul.mult(6, 7), "Pb sur mult");
	}

	@Test
	public void divTest() {
		assertEquals(42, calcul.div(84, 2), "Pb sur div");
	}

}
