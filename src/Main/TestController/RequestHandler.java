/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.TestController;
import java.util.HashMap;
/**
 *
 * @author sirri
 */
public class RequestHandler {
    public static HashMap<String, doMath> key = new HashMap<String,doMath>();
    public static Double handleOperator(String operator, Double input1, Double input2){
        key.put("+", new Addition());
        key.put("-", new Subtraction());
        key.put("*", new Multiplication());
        key.put("/", new Division());
        key.put("%", new Modulo());
        key.put("^", new Power());
        
        doMath request = key.get(operator);
        return request.execute(input1, input2);
    }
}
