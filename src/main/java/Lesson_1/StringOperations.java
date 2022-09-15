package Lesson_1;

import java.util.Arrays;

public class StringOperations {
    private String word;

    public StringOperations() {
        this.word = "Hello World!";
    }

    public void SomeOperations(){
        System.out.println(word.length());
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.charAt(1));
        System.out.println(word.concat(" So you too. "));
        System.out.println(word.equals("Not equal this text."));
        System.out.println(word.trim());
        System.out.println(word.split(" ").length);
        System.out.println(word.split(" ")[0]);
        System.out.println(Arrays.toString(word.split(" ")));
    }
}
