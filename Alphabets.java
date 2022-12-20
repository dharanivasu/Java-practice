// 7. Write a JAVA program to print all alphabets from a to z. - using while loop 
class Alphabets
{
   
    public static void computeValue()
    {
        
        char ch= 'a';
        
        while(ch<='z')
        {
            System.out.print(ch+" ");
            ch+=1;
        }
    }
    public static void main(String args[])
    {
        computeValue();
    }
}