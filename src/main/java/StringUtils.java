public class StringUtils {

    public String palindromeCreator(String str) throws IllegalArgumentException {
        if (str.length() == 0) {
            throw new IllegalArgumentException("String shouldn't be empty");
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if (str.equals(sb.toString())) {
            return str;
        }
        return str + sb;
    }

    public String spacesDestroyer(String str) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("String shouldn't be empty");
        }
        return str.replaceAll("\s", "");
    }
}
