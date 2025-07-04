package Bagian_6;

public class Percobaan {
    static void demo()
    {
        NullPointerException t;
        t=new NullPointerException("coba Throw");
        throw t;
        // Baris ini tidak lagi dikerjakan
    }

    public static void main(String[] args) {
        try
        {
            demo();System.out.println("selesai");
        }
        catch(NullPointerException e)
        {
            System.out.println("Ada pesan error: " +e);
        }
    }
}