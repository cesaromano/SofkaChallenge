package com.SofkaChallenge;

public class Levels {

    //Attributes

    int currentLevel = 1;

    //Constructor

    public Levels() {
        this.currentLevel = currentLevel;
    }

    //Methods

    public void levelUp(){
        //Increase the level when the user enter a correct answer
        this.setCurrentLevel(getCurrentLevel() + 1);
    }

    //getters and setters

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }


    //to String Method


    @Override
    public String toString() {
        return "Levels{" +
                "currentLevel=" + currentLevel +
                '}';
    }
}
