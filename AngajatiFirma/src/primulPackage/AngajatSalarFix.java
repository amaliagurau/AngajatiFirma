package primulPackage;

public class AngajatSalarFix extends Angajat {

	private double salarFix;

	public AngajatSalarFix(String nume, double salarFix) {
		super(nume);
		this.salarFix = salarFix;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public double getSalarFix() {
		return salarFix;
	}

	public void setSalarFix(double salarFix) {
		this.salarFix = salarFix;
	}
	
	public double calculSalar() {
		return salarFix;
	}
	
	public void schimbaSalarFix(double salarFixSchimbat) {
		this.salarFix = salarFixSchimbat;
	}

	@Override
	public String toString() {
		return "AngajatSalarFix [nume=" + nume + ", salarFix=" + salarFix + "]";
	}
}