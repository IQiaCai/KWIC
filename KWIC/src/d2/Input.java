package d2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

public class Input {
    private ArrayList<String> lineTxt = new ArrayList<>();
    public ArrayList<String> getLineTxt(){
        return lineTxt;
    }
    public void input(){
        try (
                Reader fr=new FileReader("KWIC/src/data.txt");
                BufferedReader bf=new BufferedReader(fr);
        ){
            String line;
            while ((line=bf.readLine())!=null){
                lineTxt.add(line);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
