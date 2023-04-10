package persistence;

public class Provider {
	private Integer ID;
	private String NAME;
	private String ADDRESS;
	private String PHONE;

	public Provider() {
	}

	public Provider(Integer iD, String nAME, String aDDRESS, String pHONE) {
		ID = iD;
		NAME = nAME;
		ADDRESS = aDDRESS;
		PHONE = pHONE;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}

	@Override
	public String toString() {
		return "Provider [ID=" + ID + ", NAME=" + NAME + ", ADDRESS=" + ADDRESS + ", PHONE=" + PHONE + "]";
	}

}
