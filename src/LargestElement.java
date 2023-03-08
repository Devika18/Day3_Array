public class LargestElement {
    public static void main(String[] args) {
        int [] array = new int [] {1,20,12,54,45,90,24,60};

        //Initializing max with 1st element of array
        int max = array[0];

        //Using for loop
        for(int i=0;i<array.length;i++)
        {
            //Comparing array elements with max
            if(array[i]>max)
                max=array[i];
        }
        System.out.println("Largest element present in the array is: "+ max);
    }
}
