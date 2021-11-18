package Kata5.view;

import Kata5.model.Mail;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailListReader {

    public static List<Mail> input(String filename){
        return read(filename);
    }
  
    private static List<Mail> read(String filename){     
        
        List<Mail> list = new ArrayList<>();
        
        //Regex sacada desde https://regexr.com/3e48o
        Pattern p = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        
        File fich = new File(filename);
        try (Scanner s = new Scanner(fich)) {
            String line;
            while (s.hasNextLine()) {
                line = s.nextLine();
                Matcher m = p.matcher(line);
                if(m.find()){list.add(new Mail(line));}
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }		
        return list;
    }
}
