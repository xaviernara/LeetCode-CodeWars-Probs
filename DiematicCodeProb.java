// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
import java.util.Date;
import java.text.*;


class DiematicCodeProb {
    public String solution(String S){
 
        String[] array = S.replace("\n", ",").split(",");
        
        
        //System.out.println(S);
        
        //String photoExtension = "";
        //String cityName = "";
        
        //int count = 0;
        
        String temp = "";
        
        String pattern = "yyyy-mm-dd hh:mm:ss";
        
        TreeMap<String, Date> map = new TreeMap<>();
        //TreeMap<String, String> map = new TreeMap<>();
        
        List<String> list = new ArrayList<>();
        
        
        
        Date date;
        //new SimpleDateFormat(pattern).parse();
        //Arrays.sort(array);
        //System.out.println("array:" + Arrays.toString(array));
        
        for(int i = 0; i<array.length;i++){
            
            if(i == 0 || i % 3 == 0){
                
                temp = array[i+1]; 
                
                //array[i].substring(array[i].indexOf(".")+1) removes everything before "."
                array[i] = temp+ "." + array[i].substring(array[i].indexOf(".")+1);
                
               list.add(array[i]);
                /*
                 if(!map.containsKey(array[i]) ){
                        //date = new SimpleDateFormat(pattern).parse(array[i+2]);
                        //map.put(array[i], array[i+2]);
                        map.put(array[i], array[i+2]);
                    }
                
                
                
                /*
                try{
                    //System.out.println("inside");
                    if(!map.containsKey(array[i]) ){
                        date = new SimpleDateFormat(pattern).parse(array[i+2]);
                        map.put(array[i], date);
                    }
                }catch(ParseException ex){
                    
                    ex.printStackTrace();
                }
                */
                
                //System.out.println(array[i]);
            }

        }
        
        
        //return "array:" + Arrays.toString(array);
        /*
        System.out.println(map.toString());
        int count = 1;
        
        Set<String> set = map.keySet();
        
        for(String s: set){
            
            
            s.replace(".", Integer.toString(count)+"." );
            
            count++;
            
        }
        */
        
        System.out.println(list.toString());
        
        return list.toString();
        
        
        
        
          
        }
        
}

/*
class SortByDate implements Comparable<Date>{
            
    
    public int compareTo(Date d1, Date d2){
        
        if(d1 == null || d2 == null) return 0;
        
        return d1.compareTo(d2);
        
    }    
            
}

*/