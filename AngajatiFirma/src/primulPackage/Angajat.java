package primulPackage;

import java.util.Objects;

public class Angajat {

	protected String nume;

	public Angajat(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nume);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Angajat other = (Angajat) obj;
		return Objects.equals(nume, other.nume);
	}

	@Override
	public String toString() {
		return "Angajat [nume=" + nume + "]";
	}
}
