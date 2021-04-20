public class q4 {
    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 5, 2, 2, 4 } };

        int sum = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                sum += arr[i][j];
                count++;
            }
        }
        double average = sum / count;
        System.out.println(sum);
        System.out.println(average);

    }
}
