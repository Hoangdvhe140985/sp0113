/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Book;
import java.util.ArrayList;

/**
 *
 * @author MSI GF63
 */
public class Validate {

    public boolean checkString(String string) {
        return string.isEmpty();
    }

    public String formatString(String string) {
        return string.replace("\\s+", " ");
    }
    
    public boolean isExistCode(ArrayList<Book> books, String code){
        for (Book book : books) {
            if (book.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }
}
