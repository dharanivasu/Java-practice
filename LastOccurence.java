import java.util.Scanner;

public class LastOccurence {
	
  public void LastOcc(){
  Scanner sc=new Scanner(System.in);
	
		String lastCharStr;
		int i = 0;
    int lIndex = -1;
		
	

		System.out.print(" Enter String to find Last Occurrence :");
		lastCharStr = sc.nextLine();
		
		System.out.print("Enter the Last Character to Find :");
		int ls = sc.next().charAt(0);
		
		while(i < lastCharStr.length())
		{
			if(lastCharStr.charAt(i) ==  ls) {
				lIndex = i;
			}
			i++;
		}
		if(lIndex == -1) {
			System.out.println("Not found");
		}
		else {
			System.out.format("The Last Character Occurrence of %c at %d position", ls, lIndex);
		}
  }
  public static void main(String args[]){
    LastOccurence lo=new LastOccurence();
    lo.LastOcc();
    
  }

}