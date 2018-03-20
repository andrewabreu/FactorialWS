package org.fact;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Andrew De Abreu Ruiz
 */
@WebService(serviceName = "Factorial")
public class Factorial {

    @WebMethod(operationName = "calculateFactorial")
    public int calculateFactorial(@WebParam(name = "n") int n) {
        if(n==0){
            return 1;
        }else{
            return n*calculateFactorial(n-1);
        }
    }
    
}
