public class Frequency {
    public static void main(String[] args) {

        //Initializing array
        int [] a = new int [] {1,2,5,2,6,7,3,1,5,4,3,7};

        //Storing frequency of element in another array named as f
        int [] f = new int [a.length];
        int visited = -1;
        for(int i=0;i<a.length;i++)
        {
            int c = 1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    c++;

                    //To avoid same element counting again
                    f[j] = visited;
                }
            }
            if(f[i] != visited)
                f[i] = c;
        }

        //Displays the frequency of each element present in array
        System.out.println("Element | Frequqncy");
        for(int i=0;i<f.length;i++)
        {
            if(f[i] != visited)
                System.out.println(" " +a[i]+ " | " + f[i]);
        }
    }
}
