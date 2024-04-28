package main;

import controller.ManiController;
import model.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		Lista<Integer> lista = new Lista<>();
		ManiController manic = new ManiController();
		manic.carregaLista(lista);

	}

}
