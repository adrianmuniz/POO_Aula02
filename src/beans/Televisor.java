package beans;

public class Televisor {
	private int canal;
	private int volume;
	private boolean ligado;
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (canal < 1 && canal > 10) {
			System.out.println("O Canal não existe");
		} else {
		this.canal = canal;
		}
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if (volume > 10) {
			System.out.println("Volume já está no maximo");
		} else if (volume < 0) {
			System.out.println("Não é possivel diminuir mais o volume!");
		} else {
		this.volume = volume;
		}
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		if (ligado) {
			System.out.println("A televisão já está ligada");
		}
		this.ligado = ligado;
	}
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void reduzirVolume() {
		volume--;
	}
	
	public void subirCanal() {
		canal++;
	}
	
	public void descerCanal() {
		canal++;
	}
	
	public void ligarTelevisor() {
		ligado = true;
	}
	
	public void desligarTelevisor() {
		ligado = false;
	}
	
	public String mostrarStatus() {
		return "Canal: " + canal + " - Volume: " + volume + " Ligado? " + ligado;
	}
}
