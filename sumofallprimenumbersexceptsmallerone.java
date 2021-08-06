import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prime{
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    public static int sumoflist(ArrayList<Integer> l){
        int sum = 0;
        for(int i = 0; i < l.size(); i++)
            sum += l.get(i);
        return sum;
    }
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter number of elements to be entered");
    int len=sc.nextInt();
    int[] a=new int[len];
    System.out.println("Enter the elements");
    for(int i=0;i<len;i++)
    {
        a[i]=sc.nextInt();
    }

    ArrayList<Integer> d=new ArrayList<Integer>();
    for(int i=0;i<a.length;i++){
if (isPrime(a[i]))
{
    d.add(a[i]);
}
    }
    Collections.sort(d); 
    if(d.size()>1)
    d.remove(0);
        System.out.println(sumoflist(d));
        sc.close();
    }
}
//author chandhru R
