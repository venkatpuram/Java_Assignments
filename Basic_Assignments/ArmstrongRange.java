public class ArmstrongRange {

	public static void main(String[] args) 
	{
		int  num,number, temp, total = 0;
        for(num=100;num<=999;num++)
        {
        	number = num;
        	while (number != 0)
        	{
        		temp = number % 10;
        		total = total + temp*temp*temp;
        		number = number/10;
        	}

        	if(total == num)
        	{
        		System.out.println("the armstrong numbers are: " +num);
        	}
        	total=0;
        }
	}
}