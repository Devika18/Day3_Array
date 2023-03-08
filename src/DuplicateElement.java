public class DuplicateElement {
    public static void main(String[] args) {
        int [] a = new int [] {1,3,2,4,2,5,7,6,2,3,4};
        System.out.println("Duplicate element of an array: ");

        //Using for loop to search duplicate element
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                    System.out.println(a[j]);
            }
        }
    }
}
