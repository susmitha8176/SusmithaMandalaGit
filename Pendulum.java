import java.util.Scanner;

public class Pendulum {

    static void pendulumarrangement(int arr[], int n) 
    { 
    	int temp1;
    	for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp1;
                }
            }
        }
       int temp[] = new int[n]; 
        int mid = (n-1)/2;  
        int j = 1, i = 1; 
        temp[mid] = arr[0]; 
        for (i = 1; i <= mid; i++) 
        { 
            temp[mid+i] = arr[j++]; 
            temp[mid-i] = arr[j++]; 
        } 
        
        if (n%2 == 0){ 
            temp[mid+i] = arr[j]; 
        }
       
        System.out.println("Pendulum arrangement:"); 
        for (i = 0 ; i < n; i++) {
            System.out.print(temp[i] + " "); 
        }
       
    } 
      
    public static void main(String[] arrrgs)  
    {  
       Scanner sc = new Scanner(System.in);
       System.out.println("enter length of array");
       int n = sc.nextInt();
       int arr[] = new int[100];
       System.out.println("enter the element into array");
       for(int i = 0; i < n; i++){
    	   arr[i] = sc.nextInt();
       }
        pendulumarrangement(arr, n); 
    } 
} 
