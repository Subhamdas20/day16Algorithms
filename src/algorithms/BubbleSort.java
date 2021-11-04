package algorithms;

public class BubbleSort <T extends Comparable<T>>{
    /*
     * PERFORMS BUBBLE SORT
     * */
    private void bubbleSort(T value[]) {
        for(int i=0;i<value.length-1;i++){

            for(int j = 0 ; j<value.length-1;j++ ){
                if(value[j].compareTo(value[j+1])>0){
                    T temp = value[j+1];
                    value[j+1]=value[j];
                    value[j]=temp;
                }
            }
        }
        System.out.println("Sorted order is : ");
        for(T a:value){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        Integer []value = {5,2,8,46,98,9,7};
        BubbleSort<Integer> sort = new BubbleSort<>();
        sort.bubbleSort(value);
    }
}
