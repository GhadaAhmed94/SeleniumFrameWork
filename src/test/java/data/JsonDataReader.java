package data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader{
	
public String firstname,lastname,email,password;
public void JsonReader() throws FileNotFoundException, IOException, ParseException
{
	String filepath=System.getProperty("user.dir"+"/taf/src/test/java/data/JsonDataReader.java");
	
	File srcFile=new File(filepath);
	JSONParser parser=new JSONParser();
	
		JSONArray jArray=(JSONArray)parser.parse(new FileReader(srcFile));

for(Object jsonObj: jArray)
{
	JSONObject person=(JSONObject)jsonObj;
	firstname=person.getString("firstname");
	System.out.println(firstname);
	
	lastname=person.getString("lastname");
	System.out.println(lastname);
	
	email=person.getString("email");
	
	System.out.println(email);
	
	password =person.getString("password");
	System.out.println(password);
			
}
}
}
