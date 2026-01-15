package sorting_algorithms;




import java.util.*;

public class  MergeSortBookPrices {
	
    public static void mergeSortBooks(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSortBooks(arr, left, mid);
            mergeSortBooks(arr, mid + 1, right);
            mergeSort(arr, left, mid, right);
        }
    }

private static void mergeSort(int[] arr,int left,int mid,int right) {
        int n1 = mid-left+1;
        int n2 =right-mid;

        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];

        System.arraycopy(arr,left,leftarr,0,n1);
        System.arraycopy(arr,mid+1, rightarr,0,n2);

        int i =0,j=0,k=left;
        while (i <n1 &&j<n2) {
            if (leftarr[i] <= rightarr[j]) {
                arr[k++] = leftarr[i++];
            } else {
                arr[k++] = rightarr[j++];
            }
        }
        while (i<n1) arr[k++] = leftarr[i++];
        while (j<n2) arr[k++] = rightarr[j++];
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter no of books");
        int n=sc.nextInt();
        
        int[] books = new int[n];

        System.out.println("enter book prices: ");
        for (int i = 0; i < 5; i++) {
            books[i] = sc.nextInt();
        }
        
        mergeSortBooks(books, 0, books.length - 1);
        System.out.println(Arrays.toString(books));
        
    }
}
