package Bagian_3;

public class Tambahan {
       public static void main(String[] args) {
        int bil=10;
        try
        {
            System.out.println(bil/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("terjadi aritmatika error");
        }
        catch(Exception e)
        {
            System.out.println("ini menhandle error yang terjadi");
        }
    }
}