package d2;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
    private ArrayList<String> needLine = new ArrayList<>();
    public Sort(ArrayList<String> needLine){
        this.needLine=needLine;
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
