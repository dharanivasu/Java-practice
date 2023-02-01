class Number1
{
    public static void main(String[] args)
    {
        int i = 1, result = 0, n = 10;

        while (i <= n)
        {
           
            result += i;
           
            i += 1;
        }

        System.out.println("Sum of series:" + result);
    }
}