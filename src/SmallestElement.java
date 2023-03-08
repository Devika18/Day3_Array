public class SmallestElement {
    public static void main(String[] args) {
        int [] array = new int [] {1,20,12,54,45,90,24,60};

        //Initializing min with 1st element of array
        int min = array[0];

        //Using for loop
        for(int i=0;i<array.length;i++)
        {
            //Comparing array elements with min
            if(array[i]<min)
                min=array[i];
        }
        System.out.println("Smallest element present in the array is: "+ min);
    }
}
