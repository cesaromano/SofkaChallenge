package com.SofkaChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Answers {

    //Attributes

    private ArrayList<ArrayList<String> > level1 =
            new ArrayList<ArrayList<String> >();
    private ArrayList<ArrayList<String> > level2 =
            new ArrayList<ArrayList<String> >();
    private ArrayList<ArrayList<String> > level3 =
            new ArrayList<ArrayList<String> >();
    private ArrayList<ArrayList<String> > level4 =
            new ArrayList<ArrayList<String> >();
    private ArrayList<ArrayList<String> > level5 =
            new ArrayList<ArrayList<String> >();

    private int randNumb;
    private int randNumb2;
    private String answers;
    private int level;
    private String correctAnsw;

    //Constructor

    public Answers(int randNumb, int level, int randNumb2) {
        //level1 answers
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Six-pack"); a1.add("One-pack"); a1.add("12-pack"); a1.add("Family-pack");
        this.level1.add(a1);

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("The End"); a2.add("The Conclusion"); a2.add("The Finish"); a2.add("The Pizza Rolls Are Done");
        this.level1.add(a2);

        ArrayList<String> a3 = new ArrayList<>();
        a3.add("Metal"); a3.add("Plastic"); a3.add("Wood"); a3.add("The wrong man");
        this.level1.add(a3);

        ArrayList<String> a4 = new ArrayList<>();
        a4.add("Darren"); a4.add("Hamlet"); a4.add("Romeo"); a4.add("Macbeth");
        this.level1.add(a4);

        ArrayList<String> a5 = new ArrayList<>();
        a5.add("Scotland"); a5.add("Ireland"); a5.add("Wales"); a5.add("The United States");
        this.level1.add(a5);

        //level2 answers
        ArrayList<String> b1 = new ArrayList<>();
        b1.add("Ronnie James Dio"); b1.add("Dokken"); b1.add("Judas Priest"); b1.add("Whitesnake");
        this.level2.add(b1);

        ArrayList<String> b2 = new ArrayList<>();
        b2.add("10"); b2.add("11"); b2.add("8"); b2.add("15");
        this.level2.add(b2);

        ArrayList<String> b3 = new ArrayList<>();
        b3.add("Jimi Hendrix"); b3.add("Kurt Cobain"); b3.add("Janis Joplin"); b3.add("Jim Morrison");
        this.level2.add(b3);

        ArrayList<String> b4 = new ArrayList<>();
        b4.add("4"); b4.add("8"); b4.add("6"); b4.add("3");
        this.level2.add(b4);

        ArrayList<String> b5 = new ArrayList<>();
        b5.add("Carlos Santana"); b5.add("Cindy Blackman"); b5.add("Rob Thomas"); b5.add("John Lee Hooker");
        this.level2.add(b5);

        //level3 answers
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("China"); c1.add("United States"); c1.add("Ireland"); c1.add("Russia");
        this.level3.add(c1);

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Extra virgin"); c2.add("Virgin"); c2.add("Pure virgin"); c2.add("Superfine virgin");
        this.level3.add(c2);

        ArrayList<String> c3 = new ArrayList<>();
        c3.add("Rum"); c3.add("Beer"); c3.add("Brandy"); c3.add("Whiskey");
        this.level3.add(c3);

        ArrayList<String> c4 = new ArrayList<>();
        c4.add("Fat"); c4.add("Flinty"); c4.add("Leggy"); c4.add("Vigorous");
        this.level3.add(c4);

        ArrayList<String> c5 = new ArrayList<>();
        c5.add("Aztecs"); c5.add("Africans"); c5.add("East Indians"); c5.add("Colombians");
        this.level3.add(c5);

        //level4 answers
        ArrayList<String> d1 = new ArrayList<>();
        d1.add("Between 5 and 7 inches"); d1.add("Between 3 and 5 inches"); d1.add("Between 8 and 9 inches"); d1.add("Between 12 and 16 inches");
        this.level4.add(d1);

        ArrayList<String> d2 = new ArrayList<>();
        d2.add("A wishbone"); d2.add("A button"); d2.add("An eraser"); d2.add("A coin");
        this.level4.add(d2);

        ArrayList<String> d3 = new ArrayList<>();
        d3.add("30%"); d3.add("50%"); d3.add("40%"); d3.add("10%");
        this.level4.add(d3);

        ArrayList<String> d4 = new ArrayList<>();
        d4.add("8,000"); d4.add("6,000"); d4.add("4,000"); d4.add("10,000");
        this.level4.add(d4);

        ArrayList<String> d5 = new ArrayList<>();
        d5.add("Shark"); d5.add("Snake"); d5.add("Monkey"); d5.add("Squid");
        this.level4.add(d5);

        //level5 answers
        ArrayList<String> e1 = new ArrayList<>();
        e1.add("Pythagoras"); e1.add("Socrates"); e1.add("Akalanka"); e1.add("Homer");
        this.level5.add(e1);

        ArrayList<String> e2 = new ArrayList<>();
        e2.add("Germany"); e2.add("Greece"); e2.add("Czech Republic"); e2.add("Argentina");
        this.level5.add(e2);

        ArrayList<String> e3 = new ArrayList<>();
        e3.add("A study of reasoning and argument"); e3.add("A study of the inevitability of events"); e3.add("A study of human sexuality"); e3.add("A study of human stupidity");
        this.level5.add(e3);

        ArrayList<String> e4 = new ArrayList<>();
        e4.add("Western philosophy"); e4.add("Political Philosophy"); e4.add("Logic Philosophy"); e4.add("European Philosophy");
        this.level5.add(e4);

        ArrayList<String> e5 = new ArrayList<>();
        e5.add("Moral Physiology"); e5.add("Logic Philosophy"); e5.add("Ethics Philosophy"); e5.add("Whatever Philosophy");
        this.level5.add(e5);

        this.randNumb = randNumb;
        this.level = level;
        this.randNumb2 = randNumb2;
    }

    //methods

    public String showAnswers(){
        //Show the answers to the question in a randomized way
        switch (level){
            case (1):
                this.setCorrectAnsw(getLevel1().get(randNumb).get(0));
                Collections.shuffle(level1.get(randNumb), new Random(randNumb2));
                this.setAnswers("0. "+getLevel1().get(randNumb).get(0)+"\n"+
                        "1. "+getLevel1().get(randNumb).get(1)+"\n"+
                        "2. "+getLevel1().get(randNumb).get(2)+"\n"+
                        "3. "+getLevel1().get(randNumb).get(3));
                break;

            case (2):
                this.setCorrectAnsw(getLevel2().get(randNumb).get(0));
                Collections.shuffle(level2.get(randNumb), new Random(randNumb2));
                this.setAnswers("0. "+getLevel2().get(randNumb).get(0)+"\n"+
                        "1. "+getLevel2().get(randNumb).get(1)+"\n"+
                        "2. "+getLevel2().get(randNumb).get(2)+"\n"+
                        "3. "+getLevel2().get(randNumb).get(3));
                break;

            case (3):
                this.setCorrectAnsw(getLevel3().get(randNumb).get(0));
                Collections.shuffle(level3.get(randNumb), new Random(randNumb2));
                this.setAnswers("0. "+getLevel3().get(randNumb).get(0)+"\n"+
                        "1. "+getLevel3().get(randNumb).get(1)+"\n"+
                        "2. "+getLevel3().get(randNumb).get(2)+"\n"+
                        "3. "+getLevel3().get(randNumb).get(3));
                break;

            case (4):
                this.setCorrectAnsw(getLevel4().get(randNumb).get(0));
                Collections.shuffle(level4.get(randNumb), new Random(randNumb2));
                this.setAnswers("0. "+getLevel4().get(randNumb).get(0)+"\n"+
                        "1. "+getLevel4().get(randNumb).get(1)+"\n"+
                        "2. "+getLevel4().get(randNumb).get(2)+"\n"+
                        "3. "+getLevel4().get(randNumb).get(3));
                break;

            case (5):
                this.setCorrectAnsw(getLevel5().get(randNumb).get(0));
                Collections.shuffle(level5.get(randNumb), new Random(randNumb2));
                this.setAnswers("0. "+getLevel5().get(randNumb).get(0)+"\n"+
                        "1. "+getLevel5().get(randNumb).get(1)+"\n"+
                        "2. "+getLevel5().get(randNumb).get(2)+"\n"+
                        "3. "+getLevel5().get(randNumb).get(3));
                break;
        }

        return this.answers;
    }

    public boolean testAnswer(int userAnsw){
        //Test the user answer
        if (level == 1){
            return getLevel1().get(randNumb).get(userAnsw).equals(correctAnsw);
        } else if (level == 2) {
            return getLevel2().get(randNumb).get(userAnsw).equals(correctAnsw);
        } else if (level == 3) {
            return getLevel3().get(randNumb).get(userAnsw).equals(correctAnsw);
        } else if (level == 4) {
            return getLevel4().get(randNumb).get(userAnsw).equals(correctAnsw);
        } else {
            return getLevel5().get(randNumb).get(userAnsw).equals(correctAnsw);
        }
    }

    //getters and setters

    public ArrayList<ArrayList<String>> getLevel1() {
        return level1;
    }

    public ArrayList<ArrayList<String>> getLevel2() {
        return level2;
    }

    public ArrayList<ArrayList<String>> getLevel3() {
        return level3;
    }

    public ArrayList<ArrayList<String>> getLevel4() {
        return level4;
    }

    public ArrayList<ArrayList<String>> getLevel5() {
        return level5;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public String getCorrectAnsw() {
        return correctAnsw;
    }

    public void setCorrectAnsw(String correctAnsw) {
        this.correctAnsw = correctAnsw;
    }

    //toString method


    @Override
    public String toString() {
        return "Answers{" +
                "level1=" + level1 +
                ", level2=" + level2 +
                ", level3=" + level3 +
                ", level4=" + level4 +
                ", level5=" + level5 +
                ", randNumb=" + randNumb +
                ", randNumb2=" + randNumb2 +
                ", answers='" + answers + '\'' +
                ", level=" + level +
                ", correctAnsw='" + correctAnsw + '\'' +
                '}';
    }
}
