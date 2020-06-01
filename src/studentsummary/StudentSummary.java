/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsummary;

/**
 *
 * @author Peter
 */
public class StudentSummary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] subjectnames = {
          "History","English","Maths","Algebra","Science","Physics"  
        };
        
        double[][] subjectgrades = {
            {87.6,89.1,93.0,78.5},
            {65.8,71.2,88.6,75.0},
            {55.9,88.1,77.6,22.1},
            {98.0,94.5,96.4,97.1},
            {79.9,88.6,81.9,71.3},            
            {68.4,73.4,44.9,99.2}
        };
        
        
        System.out.println("End-of-year transcript:");
        for( int i = 0; i<subjectgrades.length; i++ ){
            
            double subjectAvg = 0;
            double subjectTotal = 0;
            char subjectAvgLetter = 0;
            
            for ( double subjectResult : subjectgrades[i] ){
                subjectTotal += subjectResult;
            }
            
            subjectAvg = (double) Math.round( 
                    ( subjectTotal / subjectgrades[i].length ) * 100) / 100;
            // subjectAvg = subjectTotal / subjectgrades[i].length;
            
            if ( subjectAvg >=80 ){
                subjectAvgLetter = 'A';
            }else if ( subjectAvg >=70 ){
                subjectAvgLetter = 'B';
            }else if ( subjectAvg >=60 ){
                subjectAvgLetter = 'C';
            }else if ( subjectAvg >=50 ){
                subjectAvgLetter = 'D';
            }else {
                subjectAvgLetter = 'F';
            }
            
            System.out.println( subjectnames[i] + ": grades (" + 
                    subjectgrades[i][0] + "%," +
                    subjectgrades[i][1] + "%," +
                    subjectgrades[i][2] + "%," +                          
                    subjectgrades[i][3] + "%" +      
                    ") " + "- average grade (" +
                    subjectAvg + "% - " + subjectAvgLetter + ")");
        }
    }
    
}
