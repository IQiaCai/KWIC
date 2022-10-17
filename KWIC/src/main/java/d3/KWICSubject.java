package d3;

public class KWICSubject extends d3.Subject {
    public void startKWIC(){
        for (int i = 0;i<4;i++){
            super.notifyOneObserver(i);
        }
    }
}
