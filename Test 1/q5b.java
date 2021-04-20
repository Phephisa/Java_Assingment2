import java.io.FileWriter;

public class q5b {
    public static void main(String[] args) throws Exception {

        FileWriter myWriter = new FileWriter("marks.csv");
        myWriter.write("the work");
        myWriter.close();
    }
}
