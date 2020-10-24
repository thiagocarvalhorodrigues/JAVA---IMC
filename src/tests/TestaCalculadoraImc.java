package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import control.CalculadoraImc;

public class TestaCalculadoraImc {

	@Test
	void calcularImcMasculinoMaior65BaixoPeso() {
		assertEquals("Baixo peso", CalculadoraImc.calcularImc(50, 1.75, 66, "Masculino"));
		assertNotEquals("Peso normal", CalculadoraImc.calcularImc(50, 1.75, 66, "Masculino"));
	}

	@Test
	void calcularImcMasculinoMaior65PesoNormal() {
		assertEquals("Peso normal", CalculadoraImc.calcularImc(70, 1.75, 66, "Masculino"));
	}

	@Test
	void calcularImcMasculinoMaior65Sobrepeso() {
		assertEquals("Sobrepeso", CalculadoraImc.calcularImc(85, 1.75, 66, "Masculino"));
	}

	@Test
	void calcularImcMasculinoMaior65ObesidadeI() {
		assertEquals("Obesidade grau I", CalculadoraImc.calcularImc(100, 1.75, 66, "Masculino"));
	}

	@Test
	void calcularImcMasculinoMaior65ObesidadeII() {
		assertEquals("Obesidade grau II", CalculadoraImc.calcularImc(110, 1.75, 66, "Masculino"));
	}

	@Test
	void calcularImcMasculinoMaior65ObesidadeIII() {
		assertEquals("Obesidade grau III (Obsidade móbida)", CalculadoraImc.calcularImc(130, 1.75, 66, "Masculino"));
	}

	/////////////////////////////////////////////////////////////////////////////

	@Test
	void calcularImcFemininoMaior65BaixoPeso() {
		assertEquals("Baixo peso", CalculadoraImc.calcularImc(50, 1.75, 66, "Feminino"));
	}

	@Test
	void calcularImcFemininoMaior65PesoNormal() {
		assertEquals("Peso normal", CalculadoraImc.calcularImc(70, 1.75, 66, "Feminino"));
	}

	@Test
	void calcularImcFemininoMaior65Sobrepeso() {
		assertEquals("Sobrepeso", CalculadoraImc.calcularImc(85, 1.75, 66, "Feminino"));
	}

	@Test
	void calcularImcFemininoMaior65ObesidadeI() {
		assertEquals("Obesidade grau I", CalculadoraImc.calcularImc(100, 1.75, 66, "Feminino"));
	}

	@Test
	void calcularImcFemininoMaior65ObesidadeII() {
		assertEquals("Obesidade grau II", CalculadoraImc.calcularImc(115, 1.75, 66, "Feminino"));
	}

	@Test
	void calcularImcFemininoMaior65ObesidadeIII() {
		assertEquals("Obesidade grau III (Obsidade móbida)", CalculadoraImc.calcularImc(130, 1.75, 66, "Feminino"));
	}

	/////////////////////////////////////////////////////////////////////////////

	@Test
	void calcularImcIdadeEntre20E65AnosBaixoPesoMuitoGrave() {
		assertEquals("Baixo peso muito grave", CalculadoraImc.calcularImc(35, 1.60, 33, "Feminino"));
	}

	@Test
	void calcularImcIdadeEntre20E65AnosBaixoPesoGrave() {
		assertEquals("Baixo peso grave", CalculadoraImc.calcularImc(43, 1.60, 33, "Feminino"));
	}

	@Test
	void calcularImcIdadeEntre20E65AnosBaixoPeso() {
		assertEquals("Baixo peso", CalculadoraImc.calcularImc(45, 1.60, 33, "Feminino"));
	}

	@Test
	void calcularImcIdadeEntre20E65PesoNormal() {
		assertEquals("Peso normal", CalculadoraImc.calcularImc(50, 1.60, 33, "Feminino"));
	}

	@Test
	void calcularImcIdadeEntre20E65Sobrepeso() {
		assertEquals("Sobrepeso", CalculadoraImc.calcularImc(70, 1.60, 33, "Feminino"));
	}

	@Test
	void calcularImcIdadeEntre20E65ObesidadeI() {
		assertEquals("Obesidade grau I", CalculadoraImc.calcularImc(85, 1.60, 33, "Feminino"));
	}

	@Test
	void calcularImcIdadeEntre20E65ObesidadeII() {
		assertEquals("Obesidade grau II", CalculadoraImc.calcularImc(100, 1.60, 33, "Feminino"));
	}

	@Test
	void calcularImcIdadeEntre20E65ObesidadeIII() {
		assertEquals("Obesidade grau III (Obsidade móbida)", CalculadoraImc.calcularImc(115, 1.60, 33, "Feminino"));
	}

/////////////////////////////////////////////////////////////////////////////

	@Test
	void calcularImcFemininoMenorde20AnosBaixoPeso() {
		assertEquals("Baixo peso", CalculadoraImc.calcularImc(10, 1.05, 5, "Feminino"));
	}

	@Test
	void calcularImcFemininoMenorde20AnosPesoNormal() {
		assertEquals("Peso normal", CalculadoraImc.calcularImc(15, 1.05, 5, "Feminino"));
	}

	@Test
	void calcularImcFemininoMenorde20AnosSobrepeso() {
		assertEquals("Sobrepeso", CalculadoraImc.calcularImc(20, 1.05, 5, "Feminino"));
	}

	@Test
	void calcularImcFemininoMenorde20AnosObesidade() {
		assertEquals("Obesidade", CalculadoraImc.calcularImc(25, 1.05, 5, "Feminino"));
	}

/////////////////////////////////////////////////////////////////////////////

	@Test
	void calcularImcMasculinoMenorde20AnosBaixoPeso() {
		assertEquals("Baixo peso", CalculadoraImc.calcularImc(10, 1.05, 5, "Masculino"));
	}

	@Test
	void calcularImcMasculinoMenorde20AnosPesoNormal() {
		assertEquals("Peso normal", CalculadoraImc.calcularImc(15, 1.05, 5, "Masculino"));
	}

	@Test
	void calcularImcMasculinoMenorde20AnosSobrepeso() {
		assertEquals("Sobrepeso", CalculadoraImc.calcularImc(19, 1.05, 5, "Masculino"));
	}

	@Test
	void calcularImcMasculinoMenorde20AnosObesidade() {
		assertEquals("Obesidade", CalculadoraImc.calcularImc(25, 1.05, 5, "Masculino"));
	}
}
