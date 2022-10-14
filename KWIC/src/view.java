import d1.Main1;
import d2.Main2;
import d3.Main3;
import d4.Main4;

import java.io.IOException;
import java.util.Scanner;

public class view {
    public static void main(String[] args) throws IOException {
        System.out.println("选择方法：");
        System.out.println("1.主程序-子程序 2.面向对象 3.事件系统 4.管道过滤");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t==1) {
            Main1.main(null);
        }else if(t==2){
            Main2.main(null);
        }else if (t==3){
            Main3.main(null);
        }else if(t==4){
            Main4.main(null);
        }
    }
}
