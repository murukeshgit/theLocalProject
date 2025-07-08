package org.test.methodoverriding;

public class RbiBank extends StateBank{
	private void fixed() {
		System.out.println("fixed is 50%");
	}
	@Override
	public void savings() {
		super.savings();
		System.out.println("savings is 80%");
	} 
		public static void main(String[] args) {
			RbiBank c = new RbiBank();
			c.fixed();
			c.savings();
			c.deposite();
		}

}
