/**
 * Campbell Class with 3 methods
 * First method converts Strings
 * Second method converts meters to centimeters
 * Third method removes all non-alpha characters from a string
 */
public class CampbellClass {
    // private constructor because apparently all utility classes need it?
    private CampbellClass (){
    }
    // First methods that converts primitive datatypes to String
    /**
     * Converts a integer to a String
     * @param a Takes in an interger to convert
     * @return the converted integer as a string
     */
    public static String convertString(int a){
        return Integer.toString(a);
    }
    /**
     * Converts a double to a String
     * @param b Takes in an double to convert
     * @return the converted double as a string
     */
    public static String convertString(double b) {
        return Double.toString (b);
    }
    /**
     * Converts a character to a String 
     * @param c Takes in a character to convert
     * @return the converted character as a string
     */
    public static String convertString(char c) {
        return Character.toString (c); 
    }
    /**
     * Converts a boolean to a String
     * @param d Takes in a boolean to convert
     * @return the converted boolean as a String
     */
    public static String convertString(boolean d) {
        return Boolean.toString(d);
    }
    // Second method that converts meters to centimeters
    /**
     * Converts meters given as an integer into centimeters as an integer
     * @param meters Takes in the meters to convert
     * @return the centimeter version
     */
    public static int convertMetersToCenti(int meters) {
        return meters*100;
    }
    /**
     * Converts meters given as an double into centimeters as an double
     * @param meters Takes in the meters to convert
     * @return the centimeter version
     */
    public static double convertMetersToCenti(double meters) {
        return meters*100.0;
    }

    // Third method that takes in a string and removes all non-letter characters.
    /**
     * Takes in a String and removes all non-letter characters
     * @param str Take in the String
     * @return returns the new string will only letter characters
     */
    public static String removeNonAlpha (String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                result += c;
            }
        }
        return result;
    }
    /**
     * Takes in a String and a boolean to return a new string will only letter characters in all uppercase or lowercase
     * @param str Takes in the String
     * @param uppercase Takes in the boolean
     * @return the new string with only letter characters as either all uppercase or all lowercase
     */
    public static String removeNonAlpha (String str, boolean uppercase) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                result += c;
            }
        }

        if (uppercase) {
            return result.toUpperCase();
        }
        else {
            return result.toLowerCase();
        }
    }
}