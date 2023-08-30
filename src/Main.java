import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static operation.Ui.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            intro();
            selectMenu();
            int select = Integer.parseInt(br.readLine());
            PaymentMethod.extracted(br, select);
        }
    }
}