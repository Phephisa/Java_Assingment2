import java.io.FileWriter;

public class q5c {
    public static void main(String[] args) throws Exception {
        FileWriter myWriter = new FileWriter("marks.csv");
        myWriter.write("\n 50");
        myWriter.close();
    }
}
