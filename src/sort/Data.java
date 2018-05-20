package sort;

public class Data {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static int[] getUnsortedArray(int size) {
        System.out.printf("%-40s", "GENERATING DATA...");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size + 1);
        }
        System.out.println(ANSI_GREEN + "DONE!" + ANSI_RESET);
        return array;
    }

}
