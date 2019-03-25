/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author Admin
 */
public class NoSuchCustomerException extends Exception
{
    public NoSuchCustomerException(String message)
    {
        super(message);
    }
}
