package IntermediateInheritance;

public class PublicTraining extends Training
{
	public PublicTraining(String subject, int fees) {
		super(subject,fees);
	}
	
	
	@Override
	public int getOrderValue() {
		int participants = 50;
		int trainingcharges=(fees*participants);
		return trainingcharges;
	}
	
	

}
