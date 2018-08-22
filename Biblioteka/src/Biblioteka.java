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
	

	
	public void kreirajKnjigu(int brRacuna,String ime) {
	Knjiga knjiga=new Knjiga(brRacuna,ime);
		boolean kreiraj=true;
	
	for(Knjiga obj:lista1)  {
		if( obj.getBrRacuna()==brRacuna) {
			kreiraj=false;
	    System.out.println("Knjiga vec postoji");  
	 }  
	}
	if(brRacuna<0) {
		kreiraj=false;
		System.out.println("Broj racuna mora biti pozitivan");
		
	}
	if(kreiraj=true) {
		
		lista1.add(knjiga);
		System.out.println("Kreirali ste knjigu");
	}}
	
	
	
	
	
	

}
