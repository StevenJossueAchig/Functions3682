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
public class Notebook {
    private String model;
    private int numberOfPages;

    @Override
    public String toString() {
        return "Notebook{" + "model=" + model + ", numberOfPages=" + numberOfPages + '}';
    }

    public Notebook(String model, int numberOfPages) {
        this.model = model;
        this.numberOfPages = numberOfPages;
    }

    
    private void beBought(){
    }
    public void beSold(){
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the numberOfPages
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * @param numberOfPages the numberOfPages to set
     */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
