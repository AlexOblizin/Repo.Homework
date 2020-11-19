public class Loader {

    public static void main(String[] args) {

        int n = 9;

        String[][] matrix = new String[n][n];

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {

                if (y == x || y == n - 1 - x) {
                    matrix[x][y] = "x";
                } else {
                    matrix[x][y] = " ";
                }
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(matrix[x][y]);
            }
            System.out.println();
        }
    }
}
