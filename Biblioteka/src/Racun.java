
public class Racun {
	
	private int brRacuna;
	private String ime;
	private double posudjene;
	

	public Racun() {
	}
	
	public Racun(int brRacuna,String ime,int posudjene) {
		

		this.brRacuna = brRacuna;
		this.ime = ime;
	    this.posudjene=posudjene;

}
	public int getBrRacuna() {
		return brRacuna;
	}

	public void setBrRacuna(int brRacuna) {
		this.brRacuna= brRacuna;
	}
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getPosudjene() {
		return posudjene;
	}

	public void setPosudjene(int posudjene) {
		this.posudjene = posudjene;
	}



	}




