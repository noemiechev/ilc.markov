package cfranc.com;

public class Couple {
	
        //Attributs de la classe
	private String first;
	private String second;
	
        //Constructeur de la classe
	public Couple(String w1, String w2) {
		init(w1, w2);
	}

        //Initialise les attributs de la classe, fonction appell�e dans le constructeur
	public void init(String w1, String w2) {
		this.first = w1;
		this.second = w2;
	}
	
        //getter et setter des attributs First et Second
	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

        //Lance la fonction "hashCodeEclipse()" et retourne la valeur obtenue du hashCode du couple
	@Override
	public int hashCode() {
		return hashCodeEclipse();
	}

        //permet de retourner le hashCode en fonction des attributs
	int hashCodeEclipse() {
                // 31 = valeur choisi par pr�f�rence, pas par logique math�matique
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}
	
        //permet de comparer deux objets entre eux
        //Retourne true si ils sont �gaux, false si ils sont diff�rents
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Couple other = (Couple) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}

}
