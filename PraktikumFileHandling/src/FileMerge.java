import java.io.*;

public class FileMerge {
    public static void main(String[] args) {
        String file1 = "src\\file1.txt";
        String file2 = "src\\file2.txt";
        String mergedFile = "CombineData.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile));
             BufferedReader br1 = new BufferedReader(new FileReader(file1));
             BufferedReader br2 = new BufferedReader(new FileReader(file2))) {

            String line;
            while ((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            while ((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("File berhasil digabungkan ke " + mergedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
