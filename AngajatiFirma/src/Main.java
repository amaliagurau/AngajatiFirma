import primulPackage.Angajat;
import primulPackage.AngajatSalarFix;
import primulPackage.Firma;
import primulPackage.AngajatOra;

public class Main {

	public static void main(String[] args) {
		
		Angajat angSalFix1 = new AngajatSalarFix("John", 1000);
        Angajat angSalFix2 = new AngajatSalarFix("Sarah", 1300);

        Angajat angSalOra1 = new AngajatOra("Jessica", 10,500);
        Angajat angSalOra2 = new AngajatOra("Mark", 12,300);

        Firma firma = new Firma();
        firma.angajeaza(angSalFix1);
        firma.angajeaza(angSalFix2);
        firma.angajeaza(angSalOra1);
        firma.angajeaza(angSalOra2);
        firma.angajeaza(angSalOra2);
	}

}
