import java.util.Scanner;


public class Biblioteka_Test {
	public static void main(String[] args) {
		
		Biblioteka racun=new Biblioteka();
		Scanner unos=new Scanner(System.in);


		System.out.println("Izaberite broj:");
		System.out.println("Menu");
		System.out.println();
		System.out.println("1. Kreiranje racuna");
		System.out.println("2.Kreiranje knjige");
		System.out.println("3. Podizanje knjige");
		System.out.println("4. Vracanje knjige");
		System.out.println("5. Stanje racuna");

		System.out.println();
		    System.out.print("Unesite opciju koju zelite" );
		    System.out.println();

		  int  broj = unos.nextInt();
		  do {
	
				try {
					

				
				if (broj==1) {
				
			 System.out.println("Unesite broj racuna i ime korisnika biste kreirali racun");
				int brRacuna=unos.nextInt();
			System.out.println("Unesite ime ");
				String ime=unos.next();
				System.out.println("Unesite stanje na racunu ");
				int posudjene=unos.nextInt();
				racun.kreirajRacun(brRacuna, ime,posudjene);
			
				
				System.out.println("Unesite broj ponovo");
				broj=unos.nextInt();
				}	
			
			
		 if (broj==2) {
				
			 System.out.println("Unesite broj knjige i ime korisnika biste kreirali racun");
				int brRacuna=unos.nextInt();
			System.out.println("Unesite ime knjige");
				String ime=unos.next();
				
				racun.kreirajKnjigu(brRacuna, ime);
			
				
				System.out.println("Unesite broj ponovo");
				broj=unos.nextInt();
				}	
					
				if(broj==3) {
					
					
				}	
					
					
				if(broj==4) {
					
					
				}
				}
				catch (Exception e) {
					System.out.println("Pogresan unos pokusajte ponovo!");
				}
		  }
				while (broj<3);
		  
					
		/*		if(broj==5) {
				System.out.println("Informacije o korisniku");	
				racun.stanjeRacuna();
				System.out.println("Unesite broj ponovo");
				broj=unos.nextInt();
				}	
				}}
				
			*/	

	}

		  }

