/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4.Designer;

/**
 *
 * @author somsa
 */
public class QueueFullException extends RuntimeException
{
  public QueueFullException(String err)
  { super(err); }
}
