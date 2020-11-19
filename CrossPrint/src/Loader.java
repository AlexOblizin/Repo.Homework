public class Loader {
    public static void main(String[] args) {
        char[][] cross =
        {
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'X', ' ', ' ', ' ', ' ', ' ', 'X'},
            {' ', ' ', 'X', ' ', ' ', ' ', 'X', ' '},
            {' ', ' ', ' ', 'X', ' ', 'X', ' ', ' '},
            {' ', ' ', ' ', ' ', 'X', ' ', ' ', ' '},
            {' ', ' ', ' ', 'X', ' ', 'X', ' ', ' '},
            {' ', ' ', 'X', ' ', ' ', ' ', 'X', ' '},
            {' ', 'X', ' ', ' ', ' ', ' ', ' ', 'X'},

        };
        int i,j;
        for (i = 0; i < cross.length; i++){
            System.out.println(cross[i]);
            for (j = 1; j < cross[i].length; j++){
                System.out.println(cross[j]);

            }
            if (j == cross.length) {
                break;
            }
        }
    }
}
