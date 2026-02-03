import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonToCsvConversion{

    public static void main(String args[]) throws Exception{

        String jsonData=new String(Files.readAllBytes(Paths.get(students_json.json)))
            JSONArray jsonArray=new JSONArray(jsonData);

            FileWriter fw=new FileWriter("students_new.csv");
            fw.write("ID,Name,Age\n");

            for(int i=0;i<jsonArray.length();i++){
                JSONObject obj=jsonArray.getJSONObject(i);
                fw.write(
                    obj.getInt("id")+","+
                    obj.getString("name")+","+
                    obj.getInt("age")+"\n"
                );
            }
            fw.close();
            System.out.println("json converted to csv");
        }
    }
