package org.example.string;

public class StringOperations {
    private final String str;

    public StringOperations(String str) {
        this.str = str;
    }

    public String concatenate2Strings (String str1, String str2) {
        return str1 + " " + str2;
    }

    public String concatenateArrayOfString (String[] arr) {
        String[] fruits = new String[] {"apple", "orange", "mango", "grape"};

        StringBuilder newStr = new StringBuilder();

        for (String string: arr) {
            newStr.append(string);
        }

        return newStr.toString();
    }

    public int getSize () {
        return str.length();
    }

    public String getSubstring (int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex < 0  || startIndex > getSize() || endIndex > getSize() || startIndex > endIndex) throw new IndexOutOfBoundsException("Invalid start or end index");

        return str.substring(startIndex, endIndex);
    }

    public int searchString (String string) {
        return str.indexOf(string);
    }

    public boolean isEqual (String str1, String str2) {
        return str1.equals(str2);
    }

    public boolean isEqualIgnoreCase (String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    public boolean isStartsWith (String string) {
        return str.startsWith(string);  //  str.startsWith(string, startAtPosition);
    }

    public boolean isEndsWith (String string) {
        return str.endsWith(string);
    }

    public int compare2Strings (String str1, String str2) {
        return str1.compareTo(str2);
    }

    public String trim () {
        return str.trim();
    }

    public String replaceWith (String oldStr, String newStr) {
        return str.replace(oldStr, newStr);
    }

    public String replaceFirst (String oldStr, String newStr) {
        return str.replaceFirst(oldStr, newStr);
    }

    public String replaceAll (String oldStr, String newStr) {
        return str.replaceAll(oldStr, newStr);
    }

    public String[] split (String splitBy) {
        return str.split(splitBy);
    }

    public String convertNumberToString (int num) {
        return String.valueOf(num);
    }

    public String convertIntObjectToString (Integer num) {
        return num.toString();
    }

    public char getChar (int index) {
        if(index < 0 || index > getSize()) throw new IndexOutOfBoundsException("Invalid index");
        return str.charAt(index);
    }

    public String convertCase (String string, CaseType convertTo) {
        return convertTo == CaseType.UPPER ? string.toUpperCase() : string.toLowerCase();
    }

    public String formatString (String string) {
        String input = "Random string: %s";

        return input.formatted(string);
    }
}
