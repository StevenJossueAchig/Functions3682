/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 *         Alison Caiza
 *         Jeremy Cadena
 *         Kevin Asmal
 */
public class Book {
    public String title;
    public String editorial;
    public String autor;

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", editorial=" + editorial + ", autor=" + autor + '}';
    }
    
    public Book() {
    title = "";
    editorial = "";    
    autor = "";
    }
    
    public Book(String title, String editorial, String autor) {
        this.title = title;
        this.editorial = editorial;
        this.autor = autor;
    }
    
    private void beBought(){
    }
    public void beSold(){
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
