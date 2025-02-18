/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amina Kombo
 * 
 * SI=P*R*T
 */
import java.math.BigDecimal;

public class SimpleInterestCalculator {
    
    public BigDecimal calculateInterest(BigDecimal principal, BigDecimal rate, BigDecimal time){
        
        BigDecimal interest = new BigDecimal(String.valueOf(principal));
        
        rate = rate.divide(new BigDecimal("100"),4, BigDecimal.ROUND_HALF_EVEN);
        
        interest = interest.multiply(rate);
        
        interest = interest.multiply(time);
        
        return interest;
        
    }
    
}
