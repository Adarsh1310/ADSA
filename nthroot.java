//Adarsh_Srivastava_AI20MTECH14008
import java.util.*;
class Main {
  public static double powerofnumber(double a,long b)
  { 
    long mid=0;
    double t=0;
    double temp=0;
    if(b==1)
    {
      return a;
    }
    else
    {
      mid=(int)b/2;
      t=powerofnumber(a,mid);
      temp=t*t;
      if(b%2==0)
      return temp;
      else
      return a*temp;
    }

  }
  public static double nthpower(long a,long b)
  { double power=0;
     double value=0;
      long mid=0;
    long d = 0; long e = a;
      while(d<=e)
      {
        mid=(d+e)/2;
        power=powerofnumber(mid,b);
        if((long)power<=a && (long)powerofnumber(mid+1,b)>a)
        {
          return mid;
        }
        else if ((long)power < a) 
            { 
                d = mid + 1; 
                
            } 
        else  
                e = mid-1; 
        }
      return 0;
    }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int input=sc.nextInt();
    long power=0;
    long n[]=new long[input];
    long k[]=new long[input];
    for(int i=0;i<input;i++)
    {
      n[i]=sc.nextLong();
      k[i]=sc.nextLong();
    }
    for(int i=0;i<input;i++)
    { 
      System.out.println((int)nthpower(n[i],k[i]));
    }
  }
}

