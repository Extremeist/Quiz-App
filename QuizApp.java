/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance.lab;
import java.util.Scanner;

/**
 *
 * @author porte
 */
public class QuizApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        Quiz q1= new Quiz();
        q1.setQuestionText("Who is the best Student in the world");
        q1.setCorrectAnswer("Lloyd");
        q1.setMark(4);
        
        System.out.println(q1.getQuestionText());
        String answer1 = Reader.nextLine();
        System.out.println("You have answered "+ answer1);
        System.out.println("The correct answer is 'Lloyd'."+ "This question is worth "+ q1.getMark() + " marks");
                
        
        multipleChoice q2 = new multipleChoice("What is his favourite snack?","Girls","Women","Bacon",5);
        System.out.println(q2.getQuestionText() + " " + q2.getOptionA() + " " +q2.getOptionB() + " " + q2.getOptionC());
        String answer2 = Reader.nextLine();
        System.out.println("You have answered "+ answer2);
        System.out.println("The correct answer is 'Women'."+ "This question is worth "+ q2.getMark() + " marks");
        
        EssayQuestion q3 = new EssayQuestion("Write about Lloyds Love life ", 1000, 20);
        System.out.println(q3.getEssayQuestion()+"This needs"+q3.getWordCount()+"words");
        String answer3 = Reader.nextLine();
        System.out.println("You have answered "+ answer3);
        System.out.println("The correct answer is 'He has none'."+ "This question is worth "+ q3.getMark() + " marks");
                
    }    
        
}




















































































































































































































































































// My inspirational music https://www.youtube.com/watch?v=dQw4w9WgXcQ