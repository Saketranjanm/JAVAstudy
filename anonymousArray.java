class add
{   int res = 0;
         public int addc(int a[]){
            for (int i : a) {
                res = res + i;
            }
            return res;
         }
}

public class anonymousArray {
    public static void main(String[] args) {
           add a = new add();
        System.out.println( a.addc(new int [] {2,3,4,5}));
    }
}
