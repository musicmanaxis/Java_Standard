package Ex6;

public class Ex6_12 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("Sum=" + sumArr(arr));

    }

    public static void sortArr(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            System.out.println("i->"+i+"번째:");
            for(int j=0;j<arr.length-1-i;j++){
                System.out.print("j->"+j+"번째:");
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;

                    printArr(arr);
                }
            }
        }

    }
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i : arr)
            System.out.print(i + ",");

        System.out.println("]");
    }

    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
             sum += arr[i];
        return sum;
    }

}
