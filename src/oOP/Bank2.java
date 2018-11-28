package oOP;

public class Bank2 {

	private double money;
	private double rate;
	private int acountNumber=738928;

	public Bank2() {
		money = 0.0;
		rate = 0.10;
	}

	public Bank2(double m, double r) {
		money = m;
		rate = r;
	}

	public void setMoney(double xMoney) {
		money = xMoney;
	}

	public void setRate(double xRate) {
		rate = xRate;
	}

	public void deposit(double yMoney)
	{
		money += yMoney;
	}
	
	public void withdraw(double yMoney)
	{
		money -= yMoney;
	}
	
	public void interestAdd()
	{
		double addMoney = (money * rate);
		money += addMoney;
	}
	
	public void cost(double xCost)
	{
		double cost = xCost;
		money -= cost;
	}
	
	public double getMoney()
	{
		return money;
	}
	
	public double getRate()
	{
		return rate;
	}
	
	public int getAcount()
	{
		return acountNumber;
	}
	
	
}
