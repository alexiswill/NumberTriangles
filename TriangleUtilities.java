public class TriangleUtilities {



    public static String getRow(int numberOfStars) {
    String r = "";
        for (int x = 0; x < numberOfStars; x++ ) {
            r = r + "*";

        }


        return r;

    }



    public static String getTriangle(int numberOfRows) {
        String r = "";
        for (int x = 1; x <= numberOfRows; x++ ) {
            r = r + getRow(x);
            r = r + "\n";

        }

        return r;

    }





    public static String getSmallTriangle() {

        return getTriangle(4);

    }



    public static String getLargeTriangle() {

        return getTriangle(9);

    }

}
