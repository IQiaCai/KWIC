package d2;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Shift {
    private ArrayList<String> needLine = new ArrayList<>();
    private ArrayList<String> lineTxt = new ArrayList<>();
    public Shift(ArrayList<String> lineTxt){
        this.lineTxt=lineTxt;
    }
    public ArrayList<String> getNeedLine(){
        return needLine;
    }
    public void shift(){
        Iterator<String> it=lineTxt.iterator();
        while (it.hasNext()){
            String[] token= it.next().split(" ");
            LinkedList<String> list=new LinkedList<>(Arrays.asList(token));
            int i=0,len=list.size();
            while(i<len){
                i++;
                String str= StringUtils.join(list," ");
                needLine.add(str);
                list.addLast(list.removeFirst());
            }
        }
    }
}
