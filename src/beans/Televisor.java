package beans;

public class Televisor {
	private int canal;
	private int volume;
	private boolean ligado;
	public int getCanal() {
		return canal;
	}
	private void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
		
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void aumentarVolume() {
		if (volume < 10) {
			volume++;
		}
	}
	
	public void reduzirVolume() {
		volume--;
	}
	
	public void subirCanal() {
		if (canal > 16) {
			System.out.println("O canal não existe!");
		} else {
			canal++;
		}
	}
	
	public void descerCanal() {
		if (canal < 1) {
			System.out.println("O Canal não existe!");
		} else {
			canal--;
		}
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
