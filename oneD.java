
    public class oneD{
    public static void main(String[] args) {
        // int a[][] = new int[4][4];
        //jagged array
        int[][] a={{3,4,5},{5,6,7,8},{3,4,5,6},{33,67,89}};
        for (int i = 0; i < 4; i++) {
            for (int j =0; j<a[i].length; j++) {
            System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}