package primulPackage;

public class AngajatOra extends Angajat {
	private int oreLucrate;
	private double salarOra;

	public AngajatOra(String nume, int oreLucrate, double salarOra) {
		super(nume);
		this.oreLucrate = oreLucrate;
		this.salarOra = salarOra;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getOreLucrate() {
		return oreLucrate;
	}

	public void setOreLucrate(int oreLucrate) {
		this.oreLucrate = oreLucrate;
	}

	public double getSalarOra() {
		return salarOra;
	}
	
	public double calculSalar() {
		return  oreLucrate * salarOra;
	}

	@Override
	public String toString() {
		return "AngajatOra [nume=" + nume + ", oreLucrate=" + oreLucrate + ", salarOra=" + salarOra + "]";
	}
}