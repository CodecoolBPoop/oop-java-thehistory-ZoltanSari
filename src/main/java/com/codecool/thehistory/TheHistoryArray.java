package com.codecool.thehistory;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TheHistoryArray implements TheHistory {

    /**
     * This implementation should use a String array so don't change that!
     */
    private String[] wordsArray = new String[0];

    @Override
    public void add(String text) {
        wordsArray = text.split(" ");

    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        int count = 0;

        for (String aWordsArray : wordsArray) {
            if (aWordsArray.equals(wordToBeRemoved)) {
                count++;
            }
        }

        String[] newWordsArray = new String[wordsArray.length - count];

        for(int i = 0, j = 0; i < wordsArray.length; i++) {
            if(wordsArray[i].equals(wordToBeRemoved)) {
                j++;
            }
            else {
                newWordsArray[i - j] = wordsArray[i];
            }
        }
        wordsArray = newWordsArray;

    }

    @Override
    public int size() {

        return wordsArray.length;
    }

    @Override
    public void clear() {
        wordsArray = new String[0];
    }

    @Override
    public void replaceOneWord(String from, String to) {
        for(int i = 0; i < wordsArray.length; i++) {
            if(wordsArray[i].equals(from)) {
                wordsArray[i] = to;
            }
        }

    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
