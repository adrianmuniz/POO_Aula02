package implementacao;

import beans.Televisor;

public class ExecutarTelevisor {

	public static void main(String[] args) {
		Televisor tv = new Televisor();
		
		System.out.println(tv.mostrarStatus());

		tv.setLigado(true);
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.subirCanal();
		tv.subirCanal();
		System.out.println(tv.mostrarStatus());
		tv.subirCanal();
		tv.subirCanal();
		tv.aumentarVolume();
		tv.aumentarVolume();
	}

}
