/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * java program ReclamationProject it swaps the values of two strings.
 * @author yash
 */
public class ReclamationProject {
    /**
     * Main Function is the binder for the program.
     * @param args - for arguments
     */
    public static void main(final String[] args) {
        System.out.println(doit("My name is Yash", "My name is Yash Agarwal"));
    }

    /**
     * function that compares two strings and returns the common characters.
     * @param firstString contains the string to be compared
     * @param secondString contains the other string to be compared
     * @return - commonStringSegment returns the common characters
     */
    public static String doit(final String firstString, final String secondString) {
        String shortString = firstString;
        String longString = secondString;
        if (firstString.length() > secondString.length()) {
            shortString = secondString;
            longString = firstString;
        } else if (shortString.equals(longString)) {
            return shortString;
        }

        String commonStringSegment = "";
        for (int i = 0; i < shortString.length(); i++) {
            for (int j = shortString.length() - i; j > 0; j--) {
                for (int k = 0; k < longString.length() - j; k++) {
                    if (shortString.regionMatches(i, longString, k, j)
                            && j > commonStringSegment.length()) {
                        commonStringSegment = shortString.substring(i, i + j);
                    }
                }
            }
        }
        return commonStringSegment;
    }
}
