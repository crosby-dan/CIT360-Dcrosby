/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.TestController;
/**
 *
 * @author sirri
 */
public class Multiplication implements doMath {
        public Double execute(Double input1, Double input2){
        Double multiplication = input1 * input2;
        return multiplication;
    }
}
