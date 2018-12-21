package IntermediateInheritance;

public class CorporateTraining extends Training {

	public CorporateTraining(String subject, int fees) {
		super(subject,fees);
	}
	
	@Override
	public int getOrderValue() {
		int days=4;
		int trainingcharges=(fees * days);
		return trainingcharges;
	}
	
	
}
