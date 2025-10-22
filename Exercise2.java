// Search for an element in a given list of elements using binary search mechanism.

import java.util.Scanner;
class Exercise2 {
    public static void main(String[] args) {
        int arr[] = new int[50]; //initialing array
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elemnents in array :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //assining values into array
        }
        System.out.print("Enter the search Element :");
        int key = sc.nextInt();
        int beg = 0;
        int end = n - 1;  //initiating begining and ending
        int a = 0;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid); // value found
                a = 1;
                break;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        if (a == 0  ){
            System.out.println("the key value is not in array" );
        }
    }
}


// * Sort for an element in a given list of elements using bubble sort.
import java.util.Scanner;
class Exercise2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        for (int i =0 ; i< n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0;i <n ;i++){
            for(int j = 0; j < n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i =0 ;i < n ;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

}

class Exercise2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HelloWorld");

        // Delete characters from index 2 to 5 (exclusive)
        sb.delete(2, 5);
        System.out.println("After delete(2,5): " + sb);

        // Delete one character at index 3
        sb.deleteCharAt(3);
        System.out.println("After deleteCharAt(3): " + sb);
    }
}


