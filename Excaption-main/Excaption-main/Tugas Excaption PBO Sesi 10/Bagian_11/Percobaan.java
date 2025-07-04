package Bagian_11;

public class Percobaan extends Throwable {
    public Percobaan (String s)
    {
        super(s);
    }
    public static void main(String[] args) {
        int position = 1;
        try
        {
            if(position>0)
            throw new Percobaan("position" + position);
        }
        catch(Percobaan e)
        {
            System.out.println("Range error " +e.getMessage());
        }
        System.out.println("this is last program.");
    }
}
