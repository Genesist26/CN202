/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob3;

/**
 *
 * @author Salee
 */
public class QueueEmptyException extends RuntimeException{
    public QueueEmptyException(String err)
    {
        super(err);
    }
}
