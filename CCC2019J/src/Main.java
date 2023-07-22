import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        J2();
    }

    public static void J2() throws Exception{
        // user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] result = new String[N];

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
//            System.out.println(line);
            String[] array = line.split(" ");
//            System.out.println(array[0]);
//            System.out.println(array[1]);
            int t = Integer.parseInt(array[0]);
            String toPrint = repeat(array[1], t);
//            System.out.println(toPrint);
            result[i] = toPrint;
        }
        for(int i = 0; i < N; i++){
            System.out.println(result[i]);
        }

    }

    public static String repeat(String s, int n) {
        String result = s;
        for(int i = 1; i < n; i++){
            result += s;
        }
        return result;
    }
}
