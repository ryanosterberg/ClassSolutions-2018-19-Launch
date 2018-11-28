package oOP;

public class Cat {

	private double age;
	private double sleep;

	public Cat() {
		age = 7;
		sleep = 8;
	}

	public void setAge(double xAge) {
		age = xAge;
	}

	public void setSleep(double xSleep) {
		sleep = xSleep;
	}

	public void birthday(double setAge)
	{
		age += 1;
	}
	
	public void sleepMore(double setSleep)
	{
		sleep += 1;
	}
	
	public void sleepLess(double setSleep)
	{
		sleep -= 1;
	}
	
	public double getAge()
	{
		return age;
	}
	
	public double getSleep()
	{
		return sleep;
	}
	
	
	
	
	
}
