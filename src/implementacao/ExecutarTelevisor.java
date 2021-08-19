package implementacao;

import beans.Televisor;

public class ExecutarTelevisor {

	public static void main(String[] args) {
		Televisor tv = new Televisor();
			
		tv.subirCanal();
		tv.subirCanal();
		tv.subirCanal();
		System.out.println(tv.mostrarStatus());
		tv.subirCanal();
		tv.aumentarVolume();
		tv.aumentarVolume();
		System.out.println(tv.mostrarStatus());
		tv.aumentarVolume();
		tv.aumentarVolume();
		
		
	}

}
