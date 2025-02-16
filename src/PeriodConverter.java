/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xan
 */
import java.math.BigDecimal;

public class PeriodConverter {
    
    public BigDecimal convert(String periodLabel){
        
        float convertedValue=0;
       
        switch(periodLabel){
            
            case "Daily (365)":
                
                convertedValue = 365;
                
                break;
                
            case "Daily (366)":
                
                convertedValue = 366;
                
                break;
                
            case "Weekly":
                
                convertedValue = 52;
                
                break;
                
            case "Biweekly":
                
                convertedValue = 26;
                
                break;
                
            case "Semimonthly":
                
                convertedValue = 24;
                
                break;
                
            case "Monthly":
                
                convertedValue = 12;
                
                break;
                
            case "Bimonthly":
                
                convertedValue = 6;
                
                break;
                
            case "Quarterly":
                
                convertedValue = 4;
                
                break;
                
            case "Semiannually":
                
                convertedValue = 2;
                
                break;
        
            default://Annually
                
                convertedValue = 1;
                
                break;
            
        }
        
        return new BigDecimal(String.valueOf(convertedValue));
        
    }
    
}
