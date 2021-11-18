package Kata5.main;

import Kata5.model.*;
import Kata5.view.*;
import java.util.ArrayList;
import java.util.List;

public class Kata5 {
    public static void main(String[] args){
        //executeEmailVersion();
        executeDBVersion();
    }
    
    private static void executeEmailVersion(){
        String fileName = "email.txt";
        List<Mail> mailList = MailListReader.input(fileName);
        Histogram<String> histogram = MailHistogramBuilder.controller((ArrayList)mailList);
        HistogramDisplay.output(histogram);
    }

    private static void executeDBVersion(){
        String fileName = "email.txt";
        MailListReaderDB mlrdb = new MailListReaderDB(fileName);
        List<String> mailList = mlrdb.getList();       
        
        Histogram<String> histogram = MailHistogramBuilder.controller((ArrayList)mailList);
        
        HistogramDisplay.output(histogram);
    }
}
