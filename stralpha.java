public class stralpha {
    public static void main(String[] args) {
        String s = "saketranjan";
        char temp = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j <chars.length; j++) {
                if (chars[j] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
            }
            
            }
            
        }System.out.println(chars);
    }
    
}
