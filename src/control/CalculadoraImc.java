package control;

public class CalculadoraImc {

	public static String calcularImc(double peso, double altura, int idade, String sexo) {

		double imc = peso / Math.pow(altura, 2);

		if (idade >= 20 && idade <= 65) {

//			System.out.println("IMC:" + imc);

			if (imc < 16) {
				return "Baixo peso muito grave";
			} else if (imc >= 16 && imc <= 16.99) {
				return "Baixo peso grave";
			} else if (imc >= 17 && imc <= 18.99) {
				return "Baixo peso";
			} else if (imc >= 18.50 && imc <= 24.99) {
				return "Peso normal";
			} else if (imc >= 25 && imc <= 29.99) {
				return "Sobrepeso";
			} else if (imc >= 30 && imc <= 34.99) {
				return "Obesidade grau I";
			} else if (imc >= 35 && imc <= 39.99) {
				return "Obesidade grau II";
			} else if (imc >= 40) {
				return "Obesidade grau III (Obsidade móbida)";
			}

		} else if (sexo == "Feminino" && idade > 65) {

//			System.out.println("IMC Feminino acima de 65 anos: " + imc);

			if (imc < 21.9) {
				return "Baixo peso";
			} else if (imc >= 22 && imc <= 27) {
				return "Peso normal";
			} else if (imc >= 27.1 && imc <= 32) {
				return "Sobrepeso";
			} else if (imc >= 32.1 && imc <= 37) {
				return "Obesidade grau I";
			} else if (imc >= 37.1 && imc <= 41.99) {
				return "Obesidade grau II";
			} else if (imc >= 42) {
				return "Obesidade grau III (Obsidade móbida)";
			}

		} else if (sexo == "Masculino" && idade > 65) {

//			System.out.println("IMC Masculino acima de 65 anos:" + imc);

			if (imc < 21.9) {
				return "Baixo peso";
			} else if (imc >= 22 && imc <= 27) {
				return "Peso normal";
			} else if (imc >= 27.1 && imc <= 30) {
				return "Sobrepeso";
			} else if (imc >= 30.1 && imc <= 35) {
				return "Obesidade grau I";
			} else if (imc >= 35.1 && imc <= 39.99) {
				return "Obesidade grau II";
			} else if (imc >= 40) {
				return "Obesidade grau III (Obsidade móbida)";
			}

		} else if (sexo == "Feminino" && idade < 20) {

//			System.out.println("IMC Menores de 20 anos Feminino: " + imc);

			if (imc < 12.8) {
				return "Baixo peso";
			} else if (imc >= 12.8 && imc < 17) {
				return "Peso normal";
			} else if (imc >= 17 && imc < 18.6) {
				return "Sobrepeso";
			} else if (imc >= 18.6) {
				return "Obesidade";
			}

		} else if (sexo == "Masculino" && idade < 20) {

//			System.out.println("IMC Menores de 20 anos Marculino: " + imc);

			if (imc < 13) {
				return "Baixo peso";
			} else if (imc >= 13 && imc < 16.7) {
				return "Peso normal";
			} else if (imc >= 16.7 && imc < 18.1) {
				return "Sobrepeso";
			} else if (imc >= 18.1) {
				return "Obesidade";
			}
		}
		return "Informações inválidas.";

	}

	public static void main(String[] args) {

		String resultado;

		resultado = calcularImc(74, 1.70, 33, "Masculino");

		System.out.println(resultado);

	}

}
