package Kata5.view;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MailListReaderDB {
    List<String> list = new ArrayList<>();
    
    public MailListReaderDB(String filename){
        this.list = read(filename);
    }
    
    public List<String> getList(){
        return new ArrayList<>(list);
    }
    
    private List<String> read(String filename){
        //Regex sacada desde https://regexr.com/3e48o
        Pattern p = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        
        File fich = new File(filename);
        try (Scanner s = new Scanner(fich)) {
            String line;
            while (s.hasNextLine()) {
                line = s.nextLine();
                Matcher m = p.matcher(line);
                if(m.find()){list.add(line);}
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }		
        return list;
    }
}
