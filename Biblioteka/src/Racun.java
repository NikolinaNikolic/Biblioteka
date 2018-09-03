
public class Racun {
	
	private int brRacuna;
	private String ime;
	private double posudjene;
	private int brKnjige;
	

	public Racun() {
	}
	
	public Racun(int brRacuna,String ime) {
		

		this.brRacuna = brRacuna;
		this.ime = ime;
	 //   this.posudjene=posudjene;

}
	
	public Racun(int brRacuna, String ime, int brKnjige) {
		this(brKnjige, ime);
		this.brKnjige = brKnjige;
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

	public int getBrKnjige() {
		return brKnjige;
	}

	public void setBrKnjige(int brKnjige) {
		this.brKnjige = brKnjige;
	}

	

	}



	




