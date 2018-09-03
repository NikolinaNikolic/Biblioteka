import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteka {
	
	ArrayList<Racun> lista = new ArrayList<Racun>();
	ArrayList<Knjiga>lista1=new ArrayList<Knjiga>();
	

	public void kreirajRacun(int brRacuna,String ime, int posudjene) {
	Racun racun=new Racun(brRacuna,ime,posudjene);
		boolean kreiraj=true;
	
	for(Racun obj:lista)  {
		if( obj.getBrRacuna()==brRacuna) {
			kreiraj=false;
	    System.out.println("Racun vec postoji");  
	 }  
	}
	if(brRacuna<0) {
		kreiraj=false;
		System.out.println("Broj racuna mora biti pozitivan");
		
	}
	if(kreiraj=true) {
		
		lista.add(racun);
		System.out.println("Kreirali ste racun");
	}}
	

	
	public void kreirajKnjigu(int brKnjige,String ime) {
	Knjiga knjiga=new Knjiga(brKnjige,ime);
		boolean kreiraj=true;
	
	for(Knjiga obj:lista1)  {
		if( obj.getBrKnjige()==brKnjige) {
			kreiraj=false;
	    System.out.println("Knjiga vec postoji");  
	 }  
	}
	if(brKnjige<0) {
		kreiraj=false;
		System.out.println("Broj racuna mora biti pozitivan");
		
	}
	if(kreiraj=true) {
		
		lista1.add(knjiga);
		System.out.println("Kreirali ste knjigu");
	}}
	
	
	

	public void posudjivanje (int brRacuna, int brKnjige) {
		boolean validnoPodizanje = false;
		boolean validanRacun = false;
		int index = 0;
		for (Knjiga e : lista1) {
			if (e.getBrKnjige() == brKnjige) {
				validnoPodizanje = true;
				if (e.izdavanje()) {
					validnoPodizanje = false;
					System.out.println("Knjiga je vec izdata.");
				}
				for (Racun r : lista) {
					if (r.getBrRacuna() == brRacuna && r.getBrKnjige() < 3) {
						validanRacun = true;
					}
				}
			}
		}
		if (validanRacun && validnoPodizanje) {
			java.util.Date datumPosudjivanja = new java.util.Date();
			for (Knjiga e : lista1) {
				if (e.getBrKnjige() == brKnjige) {
					e.setIzdata(true);
					e.setDatumPosudnjivanja(datumPosudjivanja);
				}
			}
			for (Racun e : lista) {
				if (e.getBrRacuna() == brRacuna) {
					e.setBrKnjige(e.getBrKnjige() + 1);
					index = lista.indexOf(e);
				}
			}
			System.out.println("Knjiga uspijesno izdata korisniku "+lista.get(index).getIme());
		} else {
			System.out.println("Knjiga se ne može izdati.");
		}
	}

	
	
	public void vracanje(int brRacuna, int brKnjiga) {
		boolean validnoVracanje = false;
		boolean validanRacun = false;

		for (Knjiga e : lista1) {
			if (e.getBrKnjige() == brKnjiga) {
				validnoVracanje = true;
				if (!e.izdavanje()) {
					validnoVracanje = false;
					System.out.println("Knjiga nije izdata korisniku.");
				}
				for (Racun r : lista) {
					if (r.getBrRacuna() == brRacuna) {
						validanRacun = true;
					}
				}
			}
		}
		if (validanRacun && validnoVracanje) {
			for (Knjiga e : lista1) {
				if (e.getBrKnjige() == brKnjiga) {
					e.setIzdata(false);
				}
			}
			for (Racun e : lista) {
				if (e.getBrRacuna() == brRacuna) {
					e.setBrKnjige(e.getBrKnjige() - 1);
				}
			}
			System.out.println("Knjiga uspijesno vracena");
		} else {
			System.out.println("Pogresan unos.");
		}
	}

	public void informacijeRacun() {
		for (Racun e : lista) {
			System.out.println("Broj racuna: " + e.getBrRacuna());
			System.out.println("Ime: " + e.getIme());
			System.out.println("Broj knjiga: " + e.getBrKnjige());
		}
	}

	public void informacijeKnjige() {
		for (Knjiga e : lista1) {
			System.out.println("Broj knjige: " + e.getBrKnjige());
			System.out.println("Ime knjige: " + e.getIme());
			if (e.izdavanje()) {
				System.out.println("Knjiga izdata " + e.getDatum());
			} else {
				System.out.println("Knjiga nije izdata.");
			}
		}
	}
}
	
	


