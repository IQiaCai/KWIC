package d2;

public class Main2 {
    public static void main(String[] args) {
        Input in=new Input();
        in.input();
        Shift sh=new Shift(in.getLineTxt());
        sh.shift();
        Sort so=new Sort(sh.getNeedLine());
        so.sort();
    }
}
