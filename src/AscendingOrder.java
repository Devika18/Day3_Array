public class AscendingOrder {
    public static void main(String[] args) {

        //Initializing array
        int [] array = new int [] {2,5,1,6,8,4,3,10,7,9};
        int temp=0;

        //Displaying original array
        System.out.println("Original array elements are: ");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }

        //Sorting array in ascending order
        for(int i=0;i<array.length;i++)            //Use to hold the element
        {
            for(int j=i+1;j<array.length;j++)     //Use to compare with rest of elements
            {
                if(array[i]>array[j])             //Check and swap
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println();
        //Displaying array elements after sorting
        System.out.println("Ascending order array elements are: ");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
