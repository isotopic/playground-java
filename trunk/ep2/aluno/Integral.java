/*******************************************************************/
/** ACH2001 - Introducao a Programacao                            **/
/** EACH-USP - Primeiro Semestre de 2013                          **/
/** T.NN - Norton Trevisan Roman                                  **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/**                                                               **/
/** Carlos Guilherme Spinola Cruz   nusp 4903387                  **/
/**                                                               **/
/** 15/05/2013                                                    **/
/*******************************************************************/

class Integral {

	static double resolve(Funcao f, double a, double b, int n) {

		//Consistência
		if (n<1) return -1;
		if (b<=a) return 0;

		//Area resultante a ser retornada, soma de todas as frações
		double s = 0;

		//Altura* de cada fração (segmento no eixo x)
		double h = (b - a)/n;

		//i representa cada incremento de fração de um total de n frações). 
		//As bases (menor e maior) em cada fração são representadas por f.valor(i*h) e f.valor((i+1)*h) 
		for(int i=0; i<n ; i++){

			//Incrementa S com área desta fração específica: (base menor + base maior)*h dividido por 2
			s += ((f.valor(i*h) + f.valor((i+1)*h))*h)/2;

		}

		return s;

	}

}
