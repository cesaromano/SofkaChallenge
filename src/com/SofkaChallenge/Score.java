package com.SofkaChallenge;

public class Score {

    //Attributes

    float score = 0;

    //Constructor

    public Score() {
        this.score = score;
    }

    //Methods

    public void increaseScore(){
        //Increase the score when the user enter a correct answer
        if (score == 0){
            this.setScore(1000);
        } else {
            this.setScore(getScore() * 5);
        }
    }

    //getters and setters


    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    //toString method


    @Override
    public String toString() {
        return "Score{" +
                "score=" + score +
                '}';
    }
}
