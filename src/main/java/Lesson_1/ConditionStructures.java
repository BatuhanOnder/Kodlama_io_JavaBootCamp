package Lesson_1;

import java.util.Random;

public class ConditionStructures {

    private int randomNumber;

    public ConditionStructures() {
        this.randomNumber = -15 + new Random().nextInt(31);
    }

    public void NegativeOrPositiveConditionExampleWithIfElse(){

        System.out.print("Random number: " + this.randomNumber + "=> ");
        if (this.randomNumber < 0){
            System.out.println("Negative");
            return;
        }

        if (this.randomNumber > 0){
            System.out.println("Positive");
            return;
        }
        System.out.println("Zero");
    }

    public void NegativeOrPositiveConditionExampleWithSwitch(){
        switch (this.randomNumber){
            case 0:
                System.out.println("Its zero.");
                break;
            case 1:
                System.out.println("It s positive number 1.");
                break;
            case -1:
                System.out.println("Its negative number 1.");
                break;
            default:
                System.out.println("Unknown size.");
        }
    }
}
