import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Write the demical number(positive,integer): ");
		String demical = keyboard.nextLine();
		Double temp = Double.parseDouble(demical);
		
		while((temp <= 0) || ((temp%1) > 0)) {
			if((temp <= 0) || ((temp%1) > 0))
				System.out.println("Wrong input!!!");
			
			System.out.print("Write the demical number(positive,integer): ");
			demical = keyboard.nextLine();
			temp = Double.parseDouble(demical);
		}
		
		int num = Integer.parseInt(demical);
		String bin = Integer.toBinaryString(num);
		
		String tempVar = "";
		if(((bin.length())%7)>0) {
			for(int y=0;y<7-((bin.length())%7);y++) 
				tempVar = tempVar + "0";
			tempVar = tempVar + bin;
		}
		
		String finalVar = "";
		char arr[] = tempVar.toCharArray();
		boolean flag = true;
		for(int i=tempVar.length() - 1;i>=0;i--) {
			finalVar = arr[i] + finalVar;
			if(i%7 == 0) {
				if(flag) {
					finalVar = "1" + finalVar;
					flag = false;
				}else
					finalVar = "0" + finalVar;
			}
		}
		
		System.out.println("Variable byte code for "+demical+" is: "+finalVar);
		keyboard.close();
	}
}
