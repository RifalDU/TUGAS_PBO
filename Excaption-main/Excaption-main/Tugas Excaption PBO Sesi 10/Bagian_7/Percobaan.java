package Bagian_7;

public class Percobaan {
    public static void main(String[] args) {
        try
        {
            throw new Exception("Here's my Excaption");
        }
        catch(Exception e)
        {
            System.out.println("Caught Excaption");
            System.out.println("e.getMessage():"+e.getMessage());
            System.out.println("e.toString():"+e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}