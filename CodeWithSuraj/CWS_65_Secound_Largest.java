package CodeWithSuraj;

public class CWS_65_Secound_Largest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int  i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
           else if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("max :"+max);
        System.out.println("s max :"+smax);
    }
}
