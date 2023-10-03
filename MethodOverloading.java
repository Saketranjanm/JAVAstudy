class adds{
        public int  add(int n1,int n2){
            int res = n1 +n2;
            return res;
        }

        public int  add(int n1,int n2,int n3){
            int res = n1 +n2+ n3;
            return res;
        }

        public int  add(int n1,int n2,int n3,int n4){
            int res = n1 +n2+ n3 +n4;
            return res;
        }
}

public class MethodOverloading {
    public static void main(String[] args) {
        adds a = new adds();
        System.out.println(a.add(3,4));
        System.out.println(a.add(4,5,6));
        System.out.println(a.add(23,45,67,8));
    }
}
