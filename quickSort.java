/* quick Sort ^_^
*
* @ author Moghazy 
*
*/
public class quickSort { 
    
    int partition(int arr[], int low, int high){ 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++){  
            if (arr[j] < pivot){ 
                i++;  
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            }
        } 
   
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
 
        return i+1; 
    } 
  
    void sort(int arr[], int low, int high){ 
        if (low < high){
         int pi = partition(arr, low, high); 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        }
    }  
  
    void Print(int arr[]){ 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    public static void main(String args[]) { 
        int arr[] = { 5, 4, 3, 6, 2, 1, 0 };
        quickSort test = new quickSort();
        int n = arr.length;
        test.sort(arr, 0, n-1);
        test.Print(arr);
    }
}
