package org.test.runtime;

public class Arts extends Education {
			private void bsc() {
				System.out.println("my bsc mark is 54%");
			}
			private void bed() {
				System.out.println("my bEd mark is 76%");
			}
			@Override
			public void ug() {
				System.out.println("my graduation mark 8.64");
			}
			@Override
			public void pg() {
				System.out.println("Mba mark is 92%");
			}
			public static void main(String[] args) {
				Arts a = new Arts();
				a.bsc();
				a.bed();
				a.ug();
				a.pg();
			}
			
}
