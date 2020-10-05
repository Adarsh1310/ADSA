
//Adarsh_Srivastava_AI20MTECH14008
import java.util.*;

class Main {
  private static int mergepro(int[] input, int left, int mid, int right) {
    int count = 0;
    int c = 0;
    int larray[] = new int[mid - left + 1];
    int rarray[] = new int[right - mid];
    for (int j = left; j < mid + 1; j++)
      larray[c++] = input[j];
    c = 0;
    for (int j = mid + 1; j < right + 1; j++)
      rarray[c++] = input[j];

    int i = 0, j = 0, k = left;
    while (i < larray.length && j < rarray.length) {
      if (larray[i] <= rarray[j])
        input[k++] = larray[i++];
      else {
        input[k++] = rarray[j++];
        count += (mid + 1) - (left + i);
      }
    }
    for (int d = 0; i < larray.length; i++)
      input[k++] = larray[d++];
    for (int p = 0; i < rarray.length; i++)
      input[k++] = rarray[p++];
    return count;
  }

  private static int inversions(int[] input, int left, int right)

  {
    int totalcount = 0;

    if (left >= right)
      return 0;
    else {
      int leftcount = 0;
      int rightcount = 0;
      int mergecount = 0;
      int mid = (int) ((left + right) / 2);
      leftcount += inversions(input, left, mid);
      rightcount += inversions(input, mid + 1, right);
      mergecount += mergepro(input, left, mid, right);
      totalcount += mergecount + leftcount + rightcount;
    }
    return totalcount;
  }
  public static void main(String[] args) 
    { 
      Scanner sc=new Scanner(System.in);
      int length=sc.nextInt();
 int arr[]=new int[length];
 for(int i=0;i<length;i++)
 arr[i]=sc.nextInt();
      System.out.println(inversions(arr, 0, length-1)); 
    }
}
