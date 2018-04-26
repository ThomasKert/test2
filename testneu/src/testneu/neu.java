package testneu;

public class neu {

		public static void main (String[] args) {
			
			int Summe = 0;
			int kcalziel = 1400;
			int Eiweisziel = 70;
			int Carbsziel = 150;
			int Fettziel = 50;
			double ogrenze;
			double ugrenze;
			int a = (int)(Math.random() * 5);
			int b = (int)(Math.random() * 5);
			int c = (int)(Math.random() * 5);
			boolean Eiweischeck = false;
			boolean Fettcheck = false;
			boolean Carbscheck = false;
			
			int[] Frühstück = {100,200,300,400,500}; // kalorienwerte auswählen, gericht erst bei ausgabe berücksichtigen
				int EiweisFrühstück = 0;
				int FettFrühstück = 0;
				int CarbsFrühstück = 0;
			int[] Mittagessen = {150,250,350,450,550};
				int EiweisMittagessen = 0;
				int FettMittagessen = 0;
				int CarbsMittagessen = 0;
			int[] Abendessen = {125,225,325,425,525};
				int EiweisAbendessen = 0;
				int FettAbendessen = 0;
				int CarbsAbendessen = 0;
				
			ogrenze = kcalziel * 1.1;
			ogrenze = Math.round(ogrenze);
			ugrenze = kcalziel * 0.9;
			ugrenze = Math.round(ugrenze);
			
			System.out.println("Es werden Tagesernährungspläne mit " + ugrenze + " bis " + ogrenze + " kcal, erstellt!");
			
			while(Eiweischeck == false) {
				Summe = Frühstück[a] + Mittagessen [b] + Abendessen [c]; //kcalkontrolle
				a = (int)(Math.random() * 5);
				b = (int)(Math.random() * 5);
				c = (int)(Math.random() * 5);
				switch (a) {
				case 0: EiweisFrühstück = 21; CarbsFrühstück = 30; FettFrühstück = 15; break;
				case 1: EiweisFrühstück = 21; CarbsFrühstück = 30; FettFrühstück = 15; break;
				case 2: EiweisFrühstück = 21; CarbsFrühstück = 30; FettFrühstück = 15; break;
				case 3: EiweisFrühstück = 21; CarbsFrühstück = 30; FettFrühstück = 15; break;
				case 4: EiweisFrühstück = 20; CarbsFrühstück = 30; FettFrühstück = 15; break;
				}
				switch (b) {
				case 0: EiweisMittagessen = 41; CarbsMittagessen = 100; FettMittagessen = 20; break;
				case 1: EiweisMittagessen = 40; CarbsMittagessen = 100; FettMittagessen = 20; break;
				case 2: EiweisMittagessen = 41; CarbsMittagessen = 100; FettMittagessen = 20; break;
				case 3: EiweisMittagessen = 41; CarbsMittagessen = 100; FettMittagessen = 20; break;
				case 4: EiweisMittagessen = 41; CarbsMittagessen = 100; FettMittagessen = 20; break;
				}
				switch (c) {
				case 0: EiweisAbendessen = 11; CarbsAbendessen = 20; FettAbendessen = 15; break;
				case 1: EiweisAbendessen = 10; CarbsAbendessen = 20; FettAbendessen = 15; break;
				case 2: EiweisAbendessen = 11; CarbsAbendessen = 20; FettAbendessen = 15; break;
				case 3: EiweisAbendessen = 11; CarbsAbendessen = 20; FettAbendessen = 15; break;
				case 4: EiweisAbendessen = 11; CarbsAbendessen = 20; FettAbendessen = 15; break;
				}
				if(EiweisFrühstück + EiweisMittagessen + EiweisAbendessen == Eiweisziel) {
					Eiweischeck = true;			
				}
				else {
					Eiweischeck = false;
				}
			}
			System.out.println("Der heutige Speiseplan enthält " + Summe + " kcal!");
			
			switch(a) {
			case 0: System.out.println("Frühstück eins:"); break; 
			case 1: System.out.println("Frühstück zwei:"); break;
			case 2: System.out.println("Frühstück drei:"); break;
			case 3: System.out.println("Frühstück vier:"); break;
			case 4: System.out.println("Frühstück fünf:"); break;
			default: System.out.println("Nix gibts!"); EiweisFrühstück = 0;  break;
			}
		System.out.println("Eiweis: " + EiweisFrühstück + " Gramm");
			
			switch(b) {
			case 0: System.out.println("Mittagessen eins:"); break; 
			case 1: System.out.println("Mittagessen zwei:"); break;
			case 2: System.out.println("Mittagessen drei:"); break;
			case 3: System.out.println("Mittagessen vier:"); break;
			case 4: System.out.println("Mittagessen fünf:"); break;
			default: System.out.println("Nix gibts!"); EiweisMittagessen = 0;  break;
			}
		System.out.println("Eiweis: " + EiweisMittagessen + " Gramm");
		
			switch(c) {
			case 0: System.out.println("Abendessen eins:"); break; 
			case 1: System.out.println("Abendessen zwei:"); break;
			case 2: System.out.println("Abendessen drei:"); break;
			case 3: System.out.println("Abendessen vier:"); break;
			case 4: System.out.println("Abendessen fünf:"); break;
			default: System.out.println("Nix gibts!"); EiweisAbendessen = 0;  break;
			}
		System.out.println("Eiweis: " + EiweisAbendessen + " Gramm");
		}
}
