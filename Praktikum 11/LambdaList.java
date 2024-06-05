import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] srgs) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        mahasiswaList.forEach((name) -> System.out.println(name));
    }
}