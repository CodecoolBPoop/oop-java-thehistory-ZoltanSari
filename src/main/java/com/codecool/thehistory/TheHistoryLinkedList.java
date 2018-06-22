package com.codecool.thehistory;

import java.util.*;

public class TheHistoryLinkedList implements TheHistory {
    /**
     * This implementation should use a String LinkedList so don't change that!
     */
    private List<String> wordsLinkedList = new LinkedList<>();

    @Override
    public void add(String text) {
        wordsLinkedList = Arrays.asList(text.split(" "));
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        List<String> newWordsLinkedList = new LinkedList<>();
        for (String aWordsLinkedList : wordsLinkedList) {
            if (!aWordsLinkedList.equals(wordToBeRemoved)) {
                newWordsLinkedList.add(aWordsLinkedList);
            }
        }
        wordsLinkedList =newWordsLinkedList;
    }

    @Override
    public int size() {
        return wordsLinkedList.size();
    }

    @Override
    public void clear() {
        wordsLinkedList = new ArrayList<>();
    }

    @Override
    public void replaceOneWord(String from, String to) {
        /*for(int i = 0; i < wordsLinkedList.size(); i++) {
            if(wordsLinkedList.get(i).equals(from)) {
                wordsLinkedList.set(i, to);
            }
        }*/

    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsLinkedList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

}
