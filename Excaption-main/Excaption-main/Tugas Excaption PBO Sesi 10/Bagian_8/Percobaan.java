package Bagian_8;

import java.io.IOException;

public class Percobaan {
    public void methodA(){
        System.out.println("Method A");
    }
    public void methodB() throws IOException
    {
        System.out.println(20/0);
        System.out.println("Method B");
    }
}
