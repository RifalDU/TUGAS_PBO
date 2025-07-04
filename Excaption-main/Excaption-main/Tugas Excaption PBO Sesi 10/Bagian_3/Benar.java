package Bagian_3;

public class Benar {
    public static void main(String[] args) {
        int bil=10;
        try
        {
            System.out.println(bil/0);
        }
        catch(Exception e)
        {
            System.out.println("ini menghandle error yang terjadi");
        }
    }
}