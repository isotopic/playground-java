/*******************************************************************/
/** ACH2001 - Introducao a Programacao                            **/
/** EACH-USP - Primeiro Semestre de 2013                          **/
/** T.NN - <Professor>                                            **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/**                                                               **/
/** Carlos Guilherme Spinola Cruz   nusp 4903387                  **/
/**                                                               **/
/** 15/05/2013                                                    **/
/*******************************************************************/

class Integral {
	/**
		Retorna a área sob a curva definida pela função f, entre os pontos
		a e b, pela regra dos trapézios, aproximando-a a n trapézios.
		
		O método retorna -1 caso n não seja maior ou igual a 1.
	*/

	static double resolve(Funcao f, double a, double b, int n) {

		//Consistências
		if (n<1) return -1;
		if (b<=a) return 0;

		//Area resultante (será o retorno final do método, contendo a soma das N áreas fracionadas)
		double S = 0;

		//Altura* de cada fração  (*apesar de ser chamado de altura, corresponde a um segmento no eixo x para cada fração da área total)
		double h = (b - a)/n;

		//i representa cada incremento de fração (total n frações). As bases (menor e maior) em cada fração são representadas por f.valor(i*h) e f.valor((i+1)*h) 
		for(int i=0; i<n ; i++){

			//Incrementa S com área desta fração específica: (base menor + base maior)*h dividido por 2
			S += ((f.valor(i*h) + f.valor((i+1)*h))*h)/2;

		}

		return S;

	}
}
