package com.hervedarritchon.kata;

/**
 * Created with IntelliJ IDEA.
 * User: Hervé Darritchon
 * Date: 20/02/2014
 * Time: 22:11
 * To change this template use File | Settings | File Templates.
 */
public class Sheet {
    private String cellContent = "";

    public String get(String cellId) {
        return this.cellContent;
    }

    public void put(String cellId, String cellContent) {
        this.cellContent = cellContent;
    }
}
