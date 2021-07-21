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
public class Rule {
    private String clasification;
    private String size;

    @Override
    public String toString() {
        return "Rule{" + "clasification=" + clasification + ", size=" + size + '}';
    }

    public Rule(String clasification, String size) {
        this.clasification = clasification;
        this.size = size;
    }
    
    private void beBought(){
    }
    public void beSold(){
    }    

    /**
     * @return the clasification
     */
    public String getClasification() {
        return clasification;
    }

    /**
     * @param clasification the clasification to set
     */
    public void setClasification(String clasification) {
        this.clasification = clasification;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
}
