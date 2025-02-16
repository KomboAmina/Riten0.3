/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xan
 * A = P(1+r/n)^(nt)
 */
import java.math.BigDecimal;

public class CompoundInterestCalculator {
    
    public BigDecimal calculateInterest(BigDecimal principal, BigDecimal rate, BigDecimal time, BigDecimal period){
        
        BigDecimal interest = new BigDecimal(String.valueOf(principal));
        
        rate = rate.divide(new BigDecimal("100"), 4, BigDecimal.ROUND_HALF_EVEN);
        
        BigDecimal inBracket = new BigDecimal("0");
        
        inBracket = inBracket.add(new BigDecimal("1"));
        
        inBracket = inBracket.add(new BigDecimal(String.valueOf((rate.divide(period, 4, BigDecimal.ROUND_HALF_EVEN)))));
        
        BigDecimal outBracket = new BigDecimal(String.valueOf(period.multiply(time)));
        
        double complicated = Math.pow(Double.parseDouble(String.valueOf(inBracket)),
                Double.parseDouble(String.valueOf(outBracket)));
        
        interest = interest.multiply(new BigDecimal(String.valueOf(complicated)));
        
        return interest;
        
    }
    
}
