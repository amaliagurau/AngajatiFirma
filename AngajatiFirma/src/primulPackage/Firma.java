package primulPackage;
import java.util.ArrayList;
import java.util.List;

public class Firma {
	private List<Angajat> angajati = new ArrayList<>();
	
    public List<Angajat> getAngajati() {
        return angajati;
    }

	public void setAngajati(List<Angajat> angajati) {
		this.angajati = angajati;
	}
    
    public boolean angajeaza(Angajat angajat) {
    	if(this.salarFix) {
			return new AngajatSalarFix(nume, salarFix);
		}
		else return new AngajatOra(nume, salarOra);
    }
    
    public double salariuMediu() {
		return 0;
    }
}