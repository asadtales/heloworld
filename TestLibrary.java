/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java;

/**
 *
 * @author cups
 */
class Book {

    /**
     * @param args the command line arguments
     */
    
        String kodeBuku;
        String judulBuku;
        int hargaBuku;
        String status;

        void setStatus(Book x){
            x.status="Borrowed";
        }
        // TODO code application logic here
        
        
    
}


public class TestLibrary{
    public static void main(String[] args) {
        Book data = new Book();
        Library lib = new Library();
        data.kodeBuku="A01";
        data.judulBuku="bilogi";
        data.hargaBuku=12500;
        data.status="";
        
        data.setStatus(data);
        lib.trackBook(data);
        
    }
}

class Library{
    //Book temp = new TestLibrary();
    void trackBook(Book temp){    
        System.out.println(temp.kodeBuku); 
        System.out.println(temp.judulBuku);
        System.out.println(temp.hargaBuku);
        System.out.println(temp.status);
    }
}
