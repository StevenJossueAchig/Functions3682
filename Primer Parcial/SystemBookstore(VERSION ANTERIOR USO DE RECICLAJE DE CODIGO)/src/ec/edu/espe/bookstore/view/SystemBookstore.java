/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.view;

import ec.edu.espe.bookstore.model.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class SystemBookstore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int option;
        Archive archive = new Archive();
        while(!exit){
            try{
                System.out.println("\n ----- Bookstore sales system ---- \n");
                System.out.println("1. Buy Material.");               
                System.out.println("2. Sell Object.");
                System.out.println("3. Print product");
                System.out.println("0. leave.");
                System.out.println("Choose a Option: ");
                option = scan.nextInt();
                switch(option){
                    case 1:
                        System.out.println("\n ----- Buy a Material ---- \n");
                        System.out.println("1. Book.");
                        System.out.println("2. Dictionary.");
                        System.out.println("3. Eraser.");
                        System.out.println("4. Markers.");
                        System.out.println("5. Notebook.");
                        System.out.println("6. Pen.");
                        System.out.println("7. Pencil.");
                        System.out.println("8. Rule.");
                        System.out.println("0. Return.");
                        System.out.println("Choose a Object: ");
                        option = scan.nextInt();
                        switch(option){
                            case 1:{
                                String title;
                                String editorial;
                                String autor;
                                int nElements;
                                System.out.println("Enter how many books do you want to enter?: ");
                                nElements = scan.nextInt();
                                Book books[] = new Book[nElements];
                                for(int i = 0; i < nElements; i++){
                                    System.out.println("\nEnter the data of the Book "+ (i+1) + "\n");
                                    System.out.println("Enter the title of Book: ");
                                    title = scan.nextLine();
                                    System.out.println("Enter the editorial of Book: ");
                                    editorial = scan.nextLine();
                                    System.out.println("Enter the autor of Book: ");
                                    autor = scan.nextLine();
                                    books[i] = new Book(title, editorial, autor);
                                    archive.writeBook(new Book(title, editorial, autor));
                                }
                                for(int i = 0; i<nElements; i++){
                                    System.out.println("\n-All books-");
                                    System.out.println("\nEditorial of Book " + (i+1) + ": "+books[i].getEditorial()+"\nTitle of Book " + (i+1) + ": "+books[i].getTitle()+"\nAutor of Book " + (i+1) + ": "+books[i].getAutor());
                                    }
                                break;
                            }
                            case 2:
                                String typeOfDictionary;
                                int nElements;
                                System.out.println("Enter how many dictionaries do you want to enter?: ");
                                nElements = scan.nextInt();
                                Dictionary dictionaries[] = new Dictionary[nElements];
                                for(int i = 0; i < nElements; i++){
                                    System.out.println("\nEnter the type Of Dictionary "+ (i+1) + "\n");
                                    typeOfDictionary = scan.nextLine();
                                    dictionaries[i] = new Dictionary(typeOfDictionary);
                                }
                                
                                break;
                            case 3:
                                String material;
                                String type;
                                String brand;
                                System.out.println("Enter how many erasers do you want to enter?: ");
                                nElements = scan.nextInt();
                                Eraser erasers[] = new Eraser[nElements];
                                for(int i = 0; i < nElements; i++){
                                    System.out.println("\nEnter the data Of Eraser "+ (i+1) + "\n");
                                    System.out.println("\nEnter the material Of Eraser "+ (i+1) + "\n");
                                    material = scan.nextLine();
                                    System.out.println("\nEnter the type Of Eraser "+ (i+1) + "\n");
                                    type = scan.nextLine();
                                    System.out.println("\nEnter the brand Of Eraser "+ (i+1) + "\n");
                                    brand = scan.nextLine();
                                    erasers[i] = new Eraser(material, type, brand);
                                }
                                break;
                            case 4:
                                String color;
                                String trademark;
                                System.out.println("Enter how many markers do you want to enter?: ");
                                nElements = scan.nextInt();
                                Marker markers[] = new Marker[nElements];
                                for(int i = 0; i < nElements; i++){
                                    System.out.println("\nEnter the data Of Marker "+ (i+1) + "\n");
                                    System.out.println("\nEnter the color Of Marker "+ (i+1) + "\n");
                                    color = scan.nextLine();
                                    System.out.println("\nEnter the brand Of Marker "+ (i+1) + "\n");
                                    trademark = scan.nextLine();
                                    markers[i] = new Marker(color, trademark);
                                }
                                break;                                      
                            case 5:
                                String model;
                                int numberOfPages;
                                System.out.println("Enter how many notebooks do you want to enter?: ");
                                nElements = scan.nextInt();
                                Notebook notebooks[] = new Notebook[nElements];
                                for(int i = 0; i < nElements; i++){
                                    System.out.println("\nEnter the data Of Notebook "+ (i+1) + "\n");
                                    System.out.println("\nEnter the model of Notebook "+ (i+1) + "\n");
                                    model = scan.nextLine();
                                    System.out.println("\nEnter the number of pages of the notebook "+ (i+1) + "\n");
                                    numberOfPages = scan.nextInt();
                                    notebooks[i] = new Notebook(model, numberOfPages);
                                }
                                break;                               
                            case 6:
                                String coloration;
                                String quiality;
                                System.out.println("Enter how many pens do you want to enter?: ");
                                nElements = scan.nextInt();
                                Pen pens[] = new Pen[nElements];
                                for(int i = 0; i < nElements; i++){
                                    System.out.println("\nEnter the data Of Pen "+ (i+1) + "\n");
                                    System.out.println("\nEnter the color of pen "+ (i+1) + "\n");
                                    coloration = scan.nextLine();
                                    System.out.println("\nEnter the number of quiality of pen "+ (i+1) + "\n");
                                    quiality = scan.nextLine();
                                    pens[i] = new Pen(coloration, quiality);
                                }
                                break;
                            case 7:
                                String typeOfMine;
                                System.out.println("Enter how many pencils do you want to enter?: ");
                                nElements = scan.nextInt();
                                Pencil pencils[] = new Pencil[nElements];
                                for(int i = 0; i < nElements; i++){
                                    System.out.println("\nEnter the data Of Pencil "+ (i+1) + "\n");
                                    System.out.println("\nEnter the type of mine of pencil "+ (i+1) + "\n");
                                    typeOfMine = scan.nextLine();
                                    pencils[i] = new Pencil(typeOfMine);
                                }
                                break;
                            case 8:
                                String clasification;
                                String size;
                                System.out.println("Enter how many rules do you want to enter?: ");
                                nElements = scan.nextInt();
                                Rule rules[] = new Rule[nElements];
                                for(int i = 0; i < nElements; i++){
                                    System.out.println("\nEnter the data Of rule "+ (i+1) + "\n");
                                    System.out.println("\nEnter the type of rule "+ (i+1) + "\n");
                                    clasification = scan.nextLine();
                                    System.out.println("\nEnter the size of rule "+ (i+1) + "\n");
                                    size = scan.nextLine();
                                    rules[i] = new Rule(clasification, size);
                                }
                                break;
                            case 0:
                                exit = true;
                                break;
                            default:
                                System.out.println("\nThe option incorretct try new");
                                break;
                            }
                    case 2:
                        System.out.println("-- Sell product -- ");
                        System.out.println("1. Book.");
                        System.out.println("2. Dictionary.");
                        System.out.println("3. Eraser.");
                        System.out.println("4. Markers.");
                        System.out.println("5. Notebook.");
                        System.out.println("6. Pen.");
                        System.out.println("7. Pencil.");
                        System.out.println("8. Rule.");
                        System.out.println("Choose a Object: ");
                        option = scan.nextInt();
                        break;
                    case 3:
                        System.out.println("-- Print Product -- ");
                        System.out.println("1. Book.");
                        System.out.println("2. Dictionary.");
                        System.out.println("3. Eraser.");
                        System.out.println("4. Markers.");
                        System.out.println("5. Notebook.");
                        System.out.println("6. Pen.");
                        System.out.println("7. Pencil.");
                        System.out.println("8. Rule.");
                        System.out.println("Choose a Object: ");
                        option = scan.nextInt();
                        switch(option){
                            case 1:
                                break;
                            case 2:
                                
                                break;
                            case 3:
                                
                                break;
                            case 4:
                                
                                break;
                            case 5:
                                
                                break;
                            case 6:
                                
                                break;
                            case 7:
                                
                                break;                                
                            case 8:
                                
                                break;                                
                        }
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("\nThe option incorretct try new");
                }
            }catch(InputMismatchException except){
                System.out.println("\nShould enter a number");
                scan.next();
            }
        }
        System.out.println("\nEnd menu, thanks for use my program Good Bay :)");
    }
}