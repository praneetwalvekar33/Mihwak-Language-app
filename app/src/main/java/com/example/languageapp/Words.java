package com.example.languageapp;

/**
 * Words class is used to store the miwok and english translation of a word
 */
public class Words {
    /**
     * Variables to store the miwok and english word
     */
    private String miwokWord, englishWord;

    /**
     * the constructor used to call the Words class while create the object
     * the miwok word passed to the constructor @param mWord
     * the english word passed to the constructor @param eWord
     */
    public Words(String mWord, String eWord){
        this.miwokWord = mWord;
        this.englishWord = eWord;
    }

    /**
     * getter method to get the value of the english word
     * @return englishWord
     */
    public String getEnglishWord(){
        return this.englishWord;
    }

    /**
     * getter method to return the value of the miwok word
     * @return miwokWord
     */
    public String getMiwokWord(){
        return this.miwokWord;
    }

}
