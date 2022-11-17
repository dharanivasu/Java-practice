import java.util.Scanner;
//create a main class2
public class TwoDimentionalArray {

//Define the main method
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the rows and column");
      //Declare the variables
      int n1=s.nextInt();
      int n2=s.nextInt();
      int i,j;
      //Take number of rows and columns from user in two-dimensional array
      int a[][]=new int[n1][n2];
      //looping the variables to enter the values.
      for( i=0;i<n1;i++){
         for( j=0;j<n2;j++){
            //asking to enter the array values.
            System.out.print("Enter arr " + "[ " + i + " ]" + "[ " + j + " ] : ");
            a[i][j]=s.nextInt();
         }
      }
      int max=a[0][0];
      int index1=0,index2=0;
      //assume first element is largest and use for loop to compare the largest element with all the reamaining elements
      for( i=0;i<n1;i++){
         for( j=0;j<n2;j++){
            //Calcualte the maximum element based on index poistion
            if(a[i][j]>max){
               max=a[i][j];
               //declaring index position of max value to index varaible to store the index positi
               
              index1=i;
              index2=j;
            }
            

         }
         
      }
  //Print result

       System.out.print("Largest element in array is  " +max+ " arr " + "[ " + index1 + " ]" + "[ " + index2 + " ]  ");
       
   }
}