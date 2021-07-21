/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class Dictionary {
    private String typeOfDictionary;

    @Override
    public String toString() {
        return "Dictionary{" + "typeOfDictionary=" + typeOfDictionary + '}';
    }

    public Dictionary(String typeOfDictionary) {
        this.typeOfDictionary = typeOfDictionary;
    }

    /**
     * @return the typeOfDictionary
     */
    public String getTypeOfDictionary() {
        return typeOfDictionary;
    }

    /**
     * @param typeOfDictionary the typeOfDictionary to set
     */
    public void setTypeOfDictionary(String typeOfDictionary) {
        this.typeOfDictionary = typeOfDictionary;
    }

    
}
