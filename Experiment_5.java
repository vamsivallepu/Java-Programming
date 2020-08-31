import java.util.*;
class Experiment_5 {
    static int binarySearch(String[] arr, String x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res = x.compareTo(arr[m]); 
            if (res == 0) 
                return m;
            if (res > 0) 
                l = m + 1; 
            else
                r = m - 1; 
        }
        return -1; 
    } 
    public static void main(String []args) 
    { 
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String str=inp.nextLine();
        String[] ar = str.split(" ");
        for (int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i].compareToIgnoreCase(ar[j])>0){
                    String temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        // for(int i=0;i<ar.length;i++){
        //     System.out.println(ar[i]);
        // }
        System.out.println("Enter a word to search :");
        String x = inp.nextLine(); 
        int result = binarySearch(ar, x); 
  
        if (result == -1) 
            System.out.println("Given word not present in sentence"); 
        else
            System.out.println("Given word found at "
                              + "index " + result + " in sorted array of words in given sentence"); 
    } 
}


