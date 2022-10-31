
public class ShapeMaker {
    /**
     * Returns a string that looks like a square with sides of size "size". If size = 5, the square looks like this:
     * <p>
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
     *
     * @param size length of side
     * @return a string that looks like the shape above when printed
     */
    public static String PrintSquare(int size) {
        String str = "";
        for (int o = size; o > 0; o--) {
            for (int i = size; i > 0; i--) {
                str += "*" + " ";
            }
            str += "\n";
        }
        return str;
    }

    /**
     * Returns a string that looks like a rectangle with sides of size "length" and "width. If length = 5, width = 4 the rectangle looks like this:
     * <p>
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
     *
     * @param length the width of the rectangle
     * @param height the height of the rectangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRectangle(int length, int height) {
        String str = "";
        for (int o = height; o > 0; o--) {
            for (int i = length; i > 0; i--) {
                str += "*" + " ";
            }
            str += "\n";
        }
        return str;
    }


    /**
     * Returns a string that looks like a right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * <p>
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRightTriangle(int height) {
        String str = "";
        for (int o = height; o > 0; o--) {
            int c = o;
           for (int i= (c-1);i<height;i++){
                str+="*" + " ";
            }
            str += "\n";
        }
        return str;
}

    /**
     * Returns a string that looks like an inverted right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     * * * * *
     *     * * * *
     *     * * *
     *     * *
     *     *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintInvertedRightTriangle(int height)
    {
        String str = "";
        for (int o = height; o > 0; o--) {
            int c = o;
            for (int i=c;i>0;i--){
                str+="*" + " ";
            }
            str += "\n";
        }
        return str;
    }

    /**
     * Returns a string that looks like a backwards right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */

    public static String PrintBackwardsRightTriangle(int height) {
        /**String str = "";
        int w = height;
        while (w > 0) {
            {
                for (int i = w; i>0;i--){
                str+=" ";}

                for (int j = (w - 1); j < height; j++) {
                    str += "*" + " ";
                }
                str += "\n";
            }
            w--;
        }
        return str;
    }*/
        String str = "";
        for (int i =0; i<height; i++){
            for (int j = 1; j<height-i; j++){
                str+=" ";}
            for (int k = 0; k<=i;k++){
                str+= "*" + " ";}
            str += "\n";
        }
        return str;
    }
    /**
     * Returns a string that looks like an equilateral triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *         *
     *        * *
     *       * * *
     *      * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
*/
    public static String PrintEquilateralTriangle(int height)
    {
        {
            String str = "";

            for (int o = height; o > 0; o--) {
                int c = o;
                for (int m = o-1; m>0;m--){
                    str+=" ";
                }
                for (int j= (c-1);j<height;j++){
                    str+="*" + " ";
                }
                str += "\n";
            }
            return str;
        }
    }
}
