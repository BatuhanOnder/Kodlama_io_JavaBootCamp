package Lesson_1;

public class LoopStructures {
    private String[] words;

    public LoopStructures() {
        this.words = new String[]{"The", "coding", "so", "fun"};
    }

    public void ForLoop(){
        for (int i = 0; i<words.length; i++){
            System.out.println(words[i]);
        }
    }

    public void ForEachLoop(){
        for(String word : words){
            System.out.println(word);
        }
    }

    public void WhileLoop(){
        int i = words.length-1;
        while (i < 0){
            System.out.println(words[i]);
            i--;
        }
    }

    public void DoWhileLoop(){
        int i = words.length-1;
        do{
            System.out.println(words[i]);
            i--;
        }while (i < 0);
    }

}
