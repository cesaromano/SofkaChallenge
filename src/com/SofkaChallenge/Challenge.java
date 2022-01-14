package com.SofkaChallenge;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        Levels exampleL = new Levels();

        Score exampleS = new Score();

        System.out.println("---------------------------------------------------------------------------\n");
        System.out.println("Welcome to TriviaSoft, choose the correct answer and make a lot of money\n");

        while(true){

            System.out.println("---------------------------------------------------------------------------\n");

            int level = exampleL.getCurrentLevel();
            Random random = new Random();

            int rand1 = random.nextInt(5);
            int rand2 = random.nextInt(5);

            Questions exampleQ = new Questions(rand1, level);
            Answers exampleA = new Answers(rand1, level, rand2);

            if (level == 1){
                System.out.println("                        LEVEL 1 (1.000 USD)\n");
                System.out.println(exampleQ.getQ()+"\n");
                System.out.println(exampleA.showAnswers()+"\n");
                Scanner input = new Scanner(System.in);
                System.out.println("Choose the correct answer, write '0', '1', '2' or '3'");
                System.out.println("Or just write '4' if you want to quit \n");

                int userAnswer = input.nextInt();

                if(userAnswer == 4) {
                    System.out.println("You coward!");
                    break;
                }

                if(exampleA.testAnswer(userAnswer)){
                    exampleS.increaseScore();
                } else{
                    System.out.println("What a shame you fail :(");
                    System.out.println("But don't give up, try again!");
                    break;
                }

                System.out.println("Congratulations! now you have "+exampleS.getScore()+" USD");

                exampleL.levelUp();

            } else if (exampleL.getCurrentLevel() == 2){
                System.out.println("                        LEVEL 2 (5.000 USD)\n");
                System.out.println(exampleQ.getQ()+"\n");
                System.out.println(exampleA.showAnswers()+"\n");
                Scanner input = new Scanner(System.in);
                System.out.println("Choose the correct answer, write '0', '1', '2' or '3'");
                System.out.println("Or just write '4' if you want to quit \n");

                int userAnswer = input.nextInt();

                if(userAnswer == 4) {
                    System.out.println("You coward!");
                    break;
                }

                if(exampleA.testAnswer(userAnswer)){
                    exampleS.increaseScore();
                } else{
                    System.out.println("What a shame you fail :(");
                    System.out.println("But don't give up, try again!");
                    break;
                }

                System.out.println("Oh yeah! now you have "+exampleS.getScore()+" USD");

                exampleL.levelUp();
            } else if (exampleL.getCurrentLevel() == 3){
                System.out.println("                        LEVEL 3 (25.000 USD)\n");
                System.out.println(exampleQ.getQ()+"\n");
                System.out.println(exampleA.showAnswers()+"\n");
                Scanner input = new Scanner(System.in);
                System.out.println("Choose the correct answer, write '0', '1', '2' or '3'");
                System.out.println("Or just write '4' if you want to quit \n");

                int userAnswer = input.nextInt();

                if(userAnswer == 4) {
                    System.out.println("You coward!");
                    break;
                }

                if(exampleA.testAnswer(userAnswer)){
                    exampleS.increaseScore();
                } else{
                    System.out.println("What a shame you fail :(");
                    System.out.println("But don't give up, try again!");
                    break;
                }

                System.out.println("I can't believe it! now you have "+exampleS.getScore()+" USD");

                exampleL.levelUp();
            } else if (exampleL.getCurrentLevel() == 4){
                System.out.println("                        LEVEL 4 (125.000 USD)\n");
                System.out.println(exampleQ.getQ()+"\n");
                System.out.println(exampleA.showAnswers()+"\n");
                Scanner input = new Scanner(System.in);
                System.out.println("Choose the correct answer, write '0', '1', '2' or '3'");
                System.out.println("Or just write '4' if you want to quit \n");

                int userAnswer = input.nextInt();

                if(userAnswer == 4) {
                    System.out.println("You coward!");
                    break;
                }

                if(exampleA.testAnswer(userAnswer)){
                    exampleS.increaseScore();
                } else{
                    System.out.println("What a shame you fail :(");
                    System.out.println("But don't give up, try again!");
                    break;
                }

                System.out.println("Insane! now you have "+exampleS.getScore()+" USD");

                exampleL.levelUp();
            } else {
                System.out.println("                        LEVEL 5 (625.000 USD)\n");
                System.out.println(exampleQ.getQ()+"\n");
                System.out.println(exampleA.showAnswers()+"\n");
                //System.out.println(exampleA.getCorrectAnsw());
                Scanner input = new Scanner(System.in);
                System.out.println("Choose the correct answer, write '0', '1', '2' or '3'");
                System.out.println("Or just write '4' if you want to quit \n");

                int userAnswer = input.nextInt();

                if(userAnswer == 4) {
                    System.out.println("You coward!");
                    break;
                }

                if(exampleA.testAnswer(userAnswer)){
                    exampleS.increaseScore();
                } else{
                    System.out.println("What a shame you fail :(");
                    System.out.println("But don't give up, try again!");
                    break;
                }

                System.out.println("Congratulations you win the big one ");
                System.out.println("$$$"+exampleS.getScore()+" USD$$$");

                break;
            }
        }

    }
}
