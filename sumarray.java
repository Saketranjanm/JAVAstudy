public class sumarray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int res = 0;
        for (int i : a) {
            res = res + i;
        }
        System.out.println("sum"+ ":" +res);
    }
}
