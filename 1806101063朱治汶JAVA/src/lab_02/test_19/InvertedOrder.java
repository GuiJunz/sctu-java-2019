package lab_02.test_19;

public class InvertedOrder {


    public static void main(String[] args) {
        String a = "HellWord";
        String b = "";
        for (int i = 0; i <a.length() ; i++) {

            int c = a.length()-i-1;

            if (a.charAt(c)<=96){
                b =b + (char) (a.charAt(c)+32);
            }
            else
                b = b + (char)(a.charAt(c)-32);

            System.out.println(b);
        }
    }

}
