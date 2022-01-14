package com.SofkaChallenge;

import java.util.ArrayList;

public class Questions {

    //Attributes
    private ArrayList<String> level1 = new ArrayList<>();
    private ArrayList<String> level2 = new ArrayList<>();
    private ArrayList<String> level3 = new ArrayList<>();
    private ArrayList<String> level4 = new ArrayList<>();
    private ArrayList<String> level5 = new ArrayList<>();
    private int randNumb;
    private String question;
    private int level;

    //Constructor

    public Questions(int randNumb, int level) {
        //level1 questions
        this.level1.add("A person with well-developed abdominal muscles is said to have a what?");
        this.level1.add("Which two words traditionally appear onscreen at the termination of a feature film?");
        this.level1.add("A magnet would most likely attract which of the following?");
        this.level1.add("Which of these names is not in the title of a Shakespeare play?");
        this.level1.add("Where did Scotch whisky originate?");

        //level2 questions
        this.level2.add("Name the person who replaced Ozzy Osbourne as Black Sabbath ‘s lead singer?");
        this.level2.add("To consider a band as a Big Band what is the minimum number of musicians to be needed?");
        this.level2.add("The last act at the Woodstock was done by?");
        this.level2.add("The number of strings on a Ukulele is?");
        this.level2.add("The first hispanic to be inducted into the Rock and Roll Hall of Fame is whom?");

        //level3 questions
        this.level3.add("What country produces the most potatoes?");
        this.level3.add("Which grade of olive oil is considered the best?");
        this.level3.add("In the drink called a zombie, what is the main alcoholic ingredient?");
        this.level3.add("Which of the following is not a favorable adjective when discussing wine?");
        this.level3.add("Europeans first learned of chocolate from whom?");

        //level4 questions
        this.level4.add("What's the average length of an erect penis?");
        this.level4.add("If you had to describe the shape of the clitoris, what object would you compare it to?");
        this.level4.add("What percent of penises worldwide are circumcised?");
        this.level4.add("Approximately how many nerve endings does the clitoris have?");
        this.level4.add("Natural vaginal lubricant contains a substance called squalene, which is also found in the liver of which animal?");

        //level5 questions
        this.level5.add("Who coined the term 'philosophy'?");
        this.level5.add("Where was philosophy first specialized?");
        this.level5.add("What is logic?");
        this.level5.add("The study of the philosophical tradition of the western world is:");
        this.level5.add("The study of goodness, right and wrong, justice, beauty, moral and virtue is:");

        this.randNumb = randNumb;
        this.level = level;
    }

    //Methods

    public String getQ(){
        //Deliver a random question according to the user level
        switch (level){
            case (1):
                this.setQuestion(getLevel1().get(this.randNumb));
            break;

            case (2):
                this.setQuestion(getLevel2().get(this.randNumb));
                break;

            case (3):
                this.setQuestion(getLevel3().get(this.randNumb));
                break;

            case (4):
                this.setQuestion(getLevel4().get(this.randNumb));
                break;

            case (5):
                this.setQuestion(getLevel5().get(this.randNumb));
                break;
        }

        return this.question;
    }

    //Getters and setters


    public ArrayList<String> getLevel1() {
        return level1;
    }

    public ArrayList<String> getLevel2() {
        return level2;
    }

    public ArrayList<String> getLevel3() {
        return level3;
    }

    public ArrayList<String> getLevel4() {
        return level4;
    }

    public ArrayList<String> getLevel5() {
        return level5;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    //toString method

    @Override
    public String toString() {
        return "Questions{" +
                "level1=" + level1 +
                ", level2=" + level2 +
                ", level3=" + level3 +
                ", level4=" + level4 +
                ", level5=" + level5 +
                '}';
    }
}
