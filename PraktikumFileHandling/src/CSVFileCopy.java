import java.io.*;

public class CSVFileCopy {
    public static void main(String[] args) {
        String sourceFile = "students.csv";
        String destFile = "students_copy.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File berhasil disalin ke " + destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
