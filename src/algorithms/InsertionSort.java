package algorithms;
public class InsertionSort <T extends Comparable<T>>{
    /*
    * PERFORMS INSERTION SORT
    * */
    public void insertionSort(T value[]){
        T temp;
        int j;
        for(int i=1;i<value.length;i++){
            temp = value[i];
            j=i-1;
            while (j>=0 && value[j].compareTo(temp)>0){
                value[j+1] = value[j];
                value[j]=temp;
                j--;
            }
            value[j+1] = temp;
        }
        System.out.print("Sorted order is :");
        for (int k = 0 ; k<value.length;k++){
            System.out.print(value[k]+" ");
        }
    }
    public static void main(String[] args) {
        String[] country = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France",
                            "Netherlands", "Italy", "Germany"};

        InsertionSort <String> sort = new InsertionSort<>();
       sort.insertionSort(country);
    }
}

