package Kata5.view;

import Kata5.model.Histogram;
import Kata5.model.Mail;
import java.util.List;

public class MailHistogramBuilder {
    
    public static Histogram<String> controller(List<Mail> list){
        return build(list);
    }

    private static Histogram<String> build(List<Mail> list){
        Histogram<String> histogram= new Histogram<>();
        
        for(Mail mail : list) {histogram.increment(mail.getDomain());}
        
        return histogram;
    }
}
