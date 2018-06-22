package com.codecool.thehistory;

import java.util.*;

public class TheHistoryArrayList implements TheHistory {
    /**
     * This implementation should use a String ArrayList so don't change that!
     */
    private List<String> wordsArrayList = new ArrayList<>();

    @Override
    public void add(String text) {
        wordsArrayList = Arrays.asList(text.split(" "));
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        List<String> newWordsArray = new ArrayList<>();


        for (String aWordsArrayList : wordsArrayList) {
            if (!aWordsArrayList.equals(wordToBeRemoved)) {
                newWordsArray.add(aWordsArrayList);
            }
        }
        wordsArrayList = newWordsArray;




    }
    @Override
    public int size() {

        return wordsArrayList.size();
    }

    @Override
    public void clear() {
        wordsArrayList = new ArrayList<>();
    }

    @Override
    public void replaceOneWord(String from, String to) {
        for(int i = 0; i < wordsArrayList.size(); i++) {
            if(wordsArrayList.get(i).equals(from)) {
                wordsArrayList.set(i, to);
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
        for (String word : wordsArrayList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

}
