import java.util.*;
public class testnew
{
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        
        map.put("sony",new ArrayList<>());
        map.put("xbox",new ArrayList<>());
        map.put("nintendo",new ArrayList<>());
        map.put("atari",new ArrayList<>());
        map.put("sega",new ArrayList<>());
        
        addToMap(map, "nintendo", "mario");
        
        System.out.println("Please enter the game you wish to add.");
        //gets input from the user 
        String h =  c.next();
        System.out.println("Please type in the list you want to add you game to");
        String i = c.next();
        
        
        addToMap(map,i,h);
        System.out.println(map);
    
    }
    
    static void addToMap(HashMap<String,ArrayList<String>> map, String key, String object)
    {
       ArrayList<String>  list=  map.get(key);
       if(list==null)
        list = new ArrayList<>();
    
        list.add(object);
        
        map.put(key,list);
        
    }
}