package d1;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.*;

public class Main1 {
    private ArrayList<String> lineTxt = new ArrayList<>();
    private ArrayList<String> needLine = new ArrayList<>();
    public static void main(String[] args) {
        Main1 kwic=new Main1();
        kwic.input("KWIC/src/data.txt");
        kwic.shift();
        kwic.sort();
    }

    public void input(String path){
        try (
                Reader fr=new FileReader(path);
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

    public void shift(){
        Iterator<String> it=lineTxt.iterator();
        while (it.hasNext()){
            String[] token= it.next().split(" ");
            LinkedList<String> list=new LinkedList<>(Arrays.asList(token));
            int i=0,len=list.size();
            while(i<len){
                i++;
                String str=StringUtils.join(list," ");
                needLine.add(str);
                list.addLast(list.removeFirst());
            }
        }
    }

    public void sort(){
        String[] array = needLine.stream().toArray(String[]::new);
        //忽略大小写排序
        Arrays.sort(array,String.CASE_INSENSITIVE_ORDER);
        for (String str : array) {
            System.out.println(str);
        }
    }
}
