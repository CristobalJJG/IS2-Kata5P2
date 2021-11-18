package Kata5.main;

import Kata5.model.Histogram;
import Kata5.model.Mail;
import Kata5.view.HistogramDisplay;
import Kata5.view.MailHistogramBuilder;
import Kata5.view.MailListReader;
import java.util.List;

public class Kata5 {
    public static void main(String[] args){
        execute();
    }
    
    private static void execute(){
        String fileName = "email.txt";
        List<Mail> mailList = MailListReader.input(fileName);
        Histogram<String> histogram = MailHistogramBuilder.controller(mailList);
        HistogramDisplay.output(histogram);
    }

}
