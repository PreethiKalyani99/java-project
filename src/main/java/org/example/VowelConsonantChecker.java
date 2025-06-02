package org.example;

public class VowelConsonantChecker {
    private static final String VOWELS = "aeiou";

    public String checkVowelOrConsonant (char ch) {
        if(!Character.isLetter(ch)){
            return "Invalid input";
        }

        ch = Character.toLowerCase(ch);

        if(VOWELS.indexOf(ch) == -1) {
            return "Consonant";
        }
        return "Vowel";
    }
}
