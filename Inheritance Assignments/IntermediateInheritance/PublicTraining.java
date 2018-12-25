package IntermediateInheritance;

public class PublicTraining extends Training
{
	private int participants;
	public PublicTraining(String subject, int fees,int participants) {
		super(subject,fees);
		this.participants=participants;
	}
	
	
	@Override
	public int getOrderValue() {
		int trainingcharges=(fees*participants);
		return trainingcharges;
	}
	
	

}
