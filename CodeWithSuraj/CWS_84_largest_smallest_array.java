package CodeWithSuraj;

public class CWS_84_largest_smallest_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,44,55,33,222,90,-87};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }

        System.out.println("smallest "+smallest);
        System.out.println("Largest "+largest);
    }
}
