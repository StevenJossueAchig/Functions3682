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
public class Pen {
    private String coloration;
    private String quiality;

    public Pen(String color, String quiality) {
        this.coloration = color;
        this.quiality = quiality;
    }

    @Override
    public String toString() {
        return "Pen{" + "color=" + coloration + ", quiality=" + quiality + '}';
    }

    
    private void beBought(){
    }
    public void beSold(){
    }

    /**
     * @return the color
     */
    public String getColoration() {
        return coloration;
    }

    /**
     * @param color the color to set
     */
    public void setColoration(String color) {
        this.coloration = color;
    }

    /**
     * @return the quiality
     */
    public String getQuiality() {
        return quiality;
    }

    /**
     * @param quiality the quiality to set
     */
    public void setQuiality(String quiality) {
        this.quiality = quiality;
    }

}
