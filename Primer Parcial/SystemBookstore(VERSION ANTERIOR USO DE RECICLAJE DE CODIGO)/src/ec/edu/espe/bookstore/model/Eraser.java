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
public class Eraser {
    private String material;
    private String type;
    private String brand;

    @Override
    public String toString() {
        return "Eraser{" + "material=" + material + ", type=" + type + ", brand=" + brand + '}';
    }

    public Eraser(String material, String type, String brand) {
        this.material = material;
        this.type = type;
        this.brand = brand;
    }
    
    private void beBought(){
    }
    public void beSold(){
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
