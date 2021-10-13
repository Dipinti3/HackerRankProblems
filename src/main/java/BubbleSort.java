public class BubbleSort {
    public static void main(String[] args) {
        int a[]={3,19,0,4,66,-1};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void bubbleSort(int[] a) {
        boolean sorted=false;
        int temp;
        while(!sorted){
            sorted=true;
            for (int i = 0; i < a.length-1; i++) {
                if(a[i]>a[i+1]){
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    sorted=false;
                }
            }
        }
    }
}
