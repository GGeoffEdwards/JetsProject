package jets;

public class Barracks {

	Pilot[] pilots = new Pilot[10];
	
	public Pilot[] createPilots() {

		pilots[0] = new Pilot("John", "Scott");
		pilots[1] = new Pilot("Dave", "Smith");
		pilots[2] = new Pilot("Harry", "Potter");
		pilots[3] = new Pilot("Bob", "Wells");
		pilots[4] = new Pilot("Brett", "Jackson");
		pilots[5] = null;
		return pilots;
	}	

	public Pilot[] getPilots() {
		return pilots;
	}

	public void setJets(Pilot[] pilots) {
		this.pilots = pilots;
	}
	
}
