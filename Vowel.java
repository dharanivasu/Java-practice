import java.util.Scanner;
class Vowel {

    public static void main(String[] args) {
      Scanner Sc=new Scanner(System.in);
      System.out.println("Enter a alphabet");
      char ch=Sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println("its a vowel");
        else 
            System.out.println(" its a consonant");
    

    }
}

          

//Write a JAVA program to input basiJAVAsalary of an employee and calculate its Gross     salary according to following:


   //BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%


  // BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%


   //BasiJAVASalary > 20000 : HRA = 30%, DA = 95%