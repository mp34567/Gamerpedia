//used API_PraticeEPA and stack overflow as base( will modify and expand latter)
import java.net.*;
import java.io.*;
public class redditExample
{
   
   
   public static void main(String[] args) throws IOException
   {
      String team;
      
      //
      
      //linking to website
      URL red = new URL("https://www.reddit.com/r/KamenRider/comments/8s64hv/discuss_new_to_kamen_ridershow_recommendation/");
      
      URLConnection it = red.openConnection();
      
      InputStreamReader dit = new InputStreamReader(it.getInputStream());
      BufferedReader gogo = new BufferedReader(dit);
      StringBuilder answer = new StringBuilder();
      
      //create while loop
      while((team = gogo.readLine()) != null)
      {
         answer.append(team + "\n");
      }
      
      gogo.close();
      
      //print out results
      System.out.println(answer);
      
   }
}