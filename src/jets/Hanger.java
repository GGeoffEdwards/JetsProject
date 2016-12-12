package jets;

public class Hanger {
	Jet[] jets = new Jet[10];

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}

	public Jet[] createJets() {

		jets[0] = new Jet("F-16", 1.5, 2622, 15_000_000);
		jets[1] = new Jet("F-22", 1.25, 1840, 150_000_000);
		jets[2] = new Jet("F-5", 1.37, 870, 2_100_000);
		jets[3] = new Jet("F-14", mPHtoMach(1544), 1840, 38_000_000);
		jets[4] = new Jet("F-15", mPHtoMach(1570), 2500, 28_000_000);
		jets[5] = null;
		return jets;
	}

	public double mPHtoMach(double mPH) {
		double mach;
		mach = (mPH * .0013);
		return mach;
	}
	
}
