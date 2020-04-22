public class TableUtilities {

    public static String getSmallMultiplicationTable() {
        String r = "";
        for (int n = 1; n <= 5; n++){
            for (int w = 1; w <= 5; w++) {
                r = r + String.format("%3d |", w * n);
            }
        r = r + "\n";
    }

    return r;

    }



    public static String getLargeMultiplicationTable() {
        String r = "";
        for (int n = 1; n <= 10; n++) {
            for (int w = 1; w <= 10; w++) {
                r = r + String.format("%3d |", w * n);
            }
            r = r + "\n";
        }

        return r;
    }


    public static String getMultiplicationTable(int tableSize) {
        String r = "";
        for(int n = 1; n <= tableSize; n++){
            for(int w = 1; w <= tableSize; w++){
                r = r + String.format("%3d |", w * n);

            }
            r = r + "\n";
        }
        return r;

    }

}
