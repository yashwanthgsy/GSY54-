package hbmdemo;

public class Cheque extends Payment{
	 
	private String ChequeType;
 
	public String getChequeType() {
		return ChequeType;
	}
 
	public void setChequeType(String chequeType) {
		ChequeType = chequeType;
		System.out.println("cheque");
	}
 
}