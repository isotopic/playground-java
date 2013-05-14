/*******************************************************************/
/** ACH2001 - Introducao a Programacao                            **/
/** EACH-USP - Primeiro Semestre de 2013                          **/
/** T.NN - <Professor>                                            **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/**                                                               **/
/** <Nome>  <nusp>                                                **/
/**                                                               **/
/** <data de entrega>                                             **/
/*******************************************************************/

class Integral {
	/**
		Retorna a área sob a curva definida pela função f, entre os pontos
		a e b, pela regra dos trapézios, aproximando-a a n trapézios.
		
		O método retorna -1 caso n não seja maior ou igual a 1.
	*/
	static double resolve(Funcao f, double a, double b, int n) {
		if (n<1) return -1;

		return f.valor(30);

		//calcular integral aqui

		double fracaoH = (b - a)/n;
		

	}
}
