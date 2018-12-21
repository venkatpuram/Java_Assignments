package IntermediateInheritance;

public abstract class Training {

	private int Id;
	private String subject;
	protected int fees;
	private int increment=0;
	{
		Id=101;
		increment++;
		Id=Id+increment;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
	public Training()
	{
		
	}

	public Training(String subject, int fees) {
		this.subject=subject;
		this.fees=fees;
	}
	
	public abstract int getOrderValue();

}
