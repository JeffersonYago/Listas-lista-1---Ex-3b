package controller;
import model.Lista;
public class ManiController {

	public ManiController() {
		super();
	}
	
	public void carregaLista(Lista<Integer> lista) throws Exception {
		lista.addFirst(3);
		lista.addLast(5);
		lista.addLast(18);
		lista.addLast(12);
		lista.addLast(9);
		lista.addLast(7);
		lista.addLast(6);
		lista.addLast(2);
		lista.addLast(13);
		lista.addLast(4);
		lista.addLast(16);
		manipulaLista(lista);
	}
	
	private void manipulaLista(Lista<Integer> lista) throws Exception {
		int cont = 0;
		int tamanho = lista.size();
		int[] vet = new int[tamanho];
		while(tamanho-1 >= 0) {
			vet[cont] = lista.get(tamanho-1);
			tamanho--;
			lista.removeLast();
			cont++;
		}
		for(int i:vet) {
			lista.add(i,tamanho);
			tamanho++;
		}
		for(int i = 0; i<tamanho; i++) {
			System.out.println(lista.get(i));
		}
		}
	}