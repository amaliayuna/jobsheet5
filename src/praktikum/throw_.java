/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Amalia Yuna
 */
public class throw_ {
    public static void main(String[] args) {
        try
        {
            throw new Exception("kesalahan terjadi");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
