//source: https://www.rgagnon.com/javadetails/java-0077.html

package game;

import java.io.*;
import java.util.*;

public class FileUtils {
	
	public static List<String> readTextFromJar(String s) {
	    InputStream is = null;
	    BufferedReader br = null;
	    String line;
	    ArrayList<String> list = new ArrayList<String>();

	    try { 
	      is = FileUtils.class.getResourceAsStream(s);
	      br = new BufferedReader(new InputStreamReader(is));
	      while (null != (line = br.readLine())) {
	         list.add(line);
	      }
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	    finally {
	      try {
	        if (br != null) br.close();
	        if (is != null) is.close();
	      }
	      catch (IOException e) {
	        e.printStackTrace();
	      }
	    }
	    return list;
	}
}
