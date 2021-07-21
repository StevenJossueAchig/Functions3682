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
public class Marker {
    private String color;
    private String trademark;

    @Override
    public String toString() {
        return "Markers{" + "color=" + color + ", brand=" + trademark + '}';
    }

    public Marker(String color, String brand) {
        this.color = color;
        this.trademark = brand;
    }
    
    private void beBought(){
    }
    public void beSold(){
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the brand
     */
    public String geTrademark() {
        return trademark;
    }

    /**
     * @param brand the brand to set
     */
    public void setTrademark(String brand) {
        this.trademark = brand;
    }
}
