package Bagian_8;

public class Utama {
    public static void main(String[] args) {
        Percobaan o=new Percobaan();
        o.methodA();
        try
        {
            o.methodB();
        }
        catch(Exception e)
        {
            System.out.println("Error di Method B");
        }
        finally
        {
            System.out.println("ini selalu di cetak");
        }
    }
}
