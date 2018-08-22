import java.util.Date;
import java.util.Date;

public class Knjiga {
	
	private int brKnjige;
	private String ime;
	private boolean izdata;
	private Date datum;
	

	public Knjiga() {
	}
	
	public Knjiga(int brKnjige,String ime,boolean izdata) {
		

		this.brKnjige = brKnjige;
		this.ime = ime;
	    this.izdata=izdata;

}
	public Knjiga(int brKnjige,String ime) {
		this.brKnjige = brKnjige;
		this.ime = ime;
		
	}
	public int getBrRacuna() {
		return brKnjige;
	}

	public void setBrKnjige(int brKnjige) {
		this.brKnjige= brKnjige;
	}
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public boolean getIzdata() {
		return izdata;
	}

	public void setIzdata(boolean izdata) {
		this.izdata = izdata;
	}


 public Date getDatum() {
		return datum;
	}

	public void setDatumPosudnjivanja(Date datum) {
		this.datum = datum;
	}

	@Override
	public String toString() {
		return "Knjiga [brojKnjige=" + brKnjige + ", imeKnjige=" + ime+ ", status=" + izdata
				+ ", datumPosudnjivanja=" + datum + "]";
	}

}
 

	



