package exceptionmulticatch;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String str) {
        isEmptyString(str);
        boolean[] booleans = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                throw new IllegalArgumentException("binaryString not valid");
            }
            booleans[i] = str.charAt(i) == '1' ? true : false;
        }
        return booleans;
    }

    public String booleanArrayToBinaryString(boolean[] bools) {
        isEmptyArray(bools);
        StringBuilder sb = new StringBuilder();
        for (boolean item: bools) {
            sb.append(item == true ? "1" : "0");
        }
        return sb.toString();
    }

    private void isEmptyString(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("binaryString null");
        }
    }

    private void isEmptyArray(boolean[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("binaryString null");
        }
    }
}
