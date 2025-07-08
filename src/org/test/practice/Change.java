package org.test.practice;

public class Change extends Simple{
		@Override
		public void deposit() {
			System.out.println("deposit is 35%");
		}
		@Override
		public void saving() {
			System.out.println("saving amount has change 65%");
		}
	
			public static void main(String[] args) {
				Change c = new Change();
				c.deposit();
				c.saving();
				
			}
}
