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
public class Pencil {
    private String typeOfMine;

    @Override
    public String toString() {
        return "Pensil{" + "model=" + getTypeOfMine() + '}';
    }

    
    public Pencil(String model) {
        this.typeOfMine = model;
    }
    
    private void beBought(){
    }
    public void beSold(){
    }

    /**
     * @return the model
     */
    public String gettypeOfMine() {
        return getTypeOfMine();
    }

    /**
     * @param model the model to set
     */
    public void setType(String model) {
        this.setTypeOfMine(model);
    }

    /**
     * @return the typeOfMine
     */
    public String getTypeOfMine() {
        return typeOfMine;
    }

    /**
     * @param typeOfMine the typeOfMine to set
     */
    public void setTypeOfMine(String typeOfMine) {
        this.typeOfMine = typeOfMine;
    }

}
