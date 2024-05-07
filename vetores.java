public class vetores {
    public static void main(String[] args) {
        int[] x = {8, 7, 1};
        int[] y = {7, -1, 8};

        for (int elemento_x : x) {
            for (int elemento_y : y) {
                if (elemento_x == elemento_y) {
                    System.out.println("Elemento em x: " + elemento_x + " é igual ao elemento em y: " + elemento_y);
                }
            }
        }
    }
}