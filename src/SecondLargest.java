public class SecondLargest {
    public static void main(String[] args) {
        int temp, size;

        //Initializing an array
        int [] a = new int [] {20,15,60,45,90,35,80};

        //Initialize array size
        size = a.length;

        for(int i=0;i<size;i++)           //Use to hold the element
        {
            for(int j=i+1;j<size;j++)    //Use to compare with the rest of elements
            {
                //Checking and doing swap
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Second largest element is: "+ a[size-2]);

    }
}
