package Kata5.view;

import Kata5.model.Histogram;
import Kata5.model.Mail;
import java.util.ArrayList;
import java.util.List;

public class MailHistogramBuilder {
    
    public static Histogram<String> controller(List<Object> list){
        return build(list);
    }

    private static Histogram<String> build(List<Object> list){
        Histogram<String> histogram= new Histogram<>();
        if(list.get(0) instanceof Mail){
            ArrayList<Mail> aux = (ArrayList) list;
            for(Mail mail : aux) { histogram.increment(mail.getDomain()); }
        }else{
            ArrayList<String> aux = (ArrayList) list;
            for(String mail : aux) { histogram.increment(mail); }
        }
        return histogram;
    }
}
