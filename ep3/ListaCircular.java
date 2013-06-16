class ListaCircular{

	Pessoa ultimo;

	void inicializa(){ 
		ultimo = null;
	}
	
	void insere(String nome) {
		/* insere no fim da lista */
		Pessoa novo = new Pessoa();
		novo.nome = nome;
		if(ultimo == null){
			/* se a lista esta vazia, o novo aponta para si mesmo */
			novo.proximo = novo;
			/* nesse caso ele eh o ultimo */
			ultimo = novo;
		}
		else {
			Pessoa primeiro = ultimo.proximo; 
			/* o novo eh inserido no fim */
			/* portanto ele deve apontar para o primeiro */
			novo.proximo = primeiro;
			/* e o ultimo deve apontar para ele */
			ultimo.proximo = novo;
			/* agora o novo passa a ser o ultimo */
			ultimo = novo;
		}
	}



	String sorteia(int n) {

		Pessoa backpointer = null;
		Pessoa sorteada = null;
		Pessoa pointer = ultimo.proximo;

		for(int i = 0; i <= n+1; i++){

			if(i==n-1){

				backpointer = ultimo = pointer;

			}else if(i==n+1){

				backpointer.proximo = pointer;

			}else if(i==n){

				sorteada = pointer;
			}

			pointer = pointer.proximo;

		}

		return sorteada.nome;

	}


}