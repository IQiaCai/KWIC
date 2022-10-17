package d2;

public class Main2 {
    public static void main(String[] args) {
        Input input = new Input();
        input.input("src/main/resources/data.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("src/main/resources/output.txt");

    }
}
