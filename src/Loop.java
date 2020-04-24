
public class Loop {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//2
		
		boolean isHotOutside =  true;
		boolean isWeekday = true;
		boolean hasMoneyinPocket = true;
		
		//3
		
		double costOfMilk = 3;
		double moneyInWallet = 5;
		int thirstLevel = 3;
		
		//4a
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyinPocket;
		System.out.println(shouldBuyIcecream);

		//4b
		
		boolean willGoSwimming =isHotOutside && !isWeekday;
		System.out.println(willGoSwimming);
		
		//4c
		
		boolean isAGoodDay = isHotOutside && hasMoneyinPocket && !isWeekday;
		System.out.println(isAGoodDay);
		
		//4d
		
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (costOfMilk*2);
		System.out.println(willBuyMilk);
		
		//5a
		System.out.println("-------5a-------");
		int x=0;
		while (x <= 100) {
		if (x %2 ==0) {
			System.out.println(x);
		}
			x++;
			
		}
			
		//5b
		System.out.println("-------5b---------");
		int y=100;
		while (y >=0) {
		 System.out.println(y);
		 y-=3;
		 
		}
		
		
		//5c
		System.out.println("--------5c--------");
		
		for (int i=1; i<=100; i +=2) {
			System.out.println(i);
		}
		
		//5d
		System.out.println("-------5d--------");
		for (int i=0; i<=100; i++) {
			if (i % 3 == 0 && i % 5 !=0) {
				System.out.println("Hello");
			}
			else if (i % 5==0 && i % 3 !=0) {
				System.out.println("World");
			}  
			else if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("Hello World");
			} else System.out.println(i);
		
		
		
		}
		
		
	}

}
