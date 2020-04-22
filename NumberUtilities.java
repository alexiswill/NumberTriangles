public class NumberUtilities {




        public static String getRange(int stop) {

            String r = "";

            for (int x = 0; x < stop; x++ ) {
                r = r + x;

            }

            return r;

        }



        public static String getRange(int start, int stop) {
            String r = "";
            for (int x = start; x < stop; x++){
                r = r + x;
            }

            return r;

        }





        public static String getRange(int start, int stop, int step) {
            String r = "";
            for(int x = start; x < stop; x = x + step){
                r = r + x;
            }

            return r;

        }



        public static String getEvenNumbers(int start, int stop) {
            String r = "";
            for (int x = start; x < stop; x ++){
                if (x % 2 == 0)
                r = r + x;
            }

            return r;

        }





        public static String getOddNumbers(int start, int stop) {
            String r = "";
            for(int x = start; x < stop; x++){
                if(x % 2  == 1)
                r= r + x;
            }

            return r;

        }





        public static String getExponentiations(int start, int stop, int exponent) {
            String r = "";
            for(int x = start; x <= stop; x++ ){
                r = r + (int)(Math.pow(x, exponent));
            }

            return r;

        }

    }

