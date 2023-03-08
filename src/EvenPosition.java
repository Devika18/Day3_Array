public class EvenPosition {
    public static void main(String[] args) {
        int [] a = new int [] {10,20,30,40,50};
        System.out.println("Elements of array present on even position are: ");

        //Initializing for loop through the array by increamenting value of i by 2
        for(int i=1;i<a.length;i=i+2)
        {
            System.out.println(a[i]);
        }
    }
}
