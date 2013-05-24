class TestaIntegral {

	public static void main(String[] args) {

		Funcao f = new Funcao();

		for (int i=1; i<100; i++)
			System.out.println("\nValor apr.: "+Integral.resolve(f,-1,0,i));

		System.out.println("Valor real: "+(Math.PI/4));

	}

}
