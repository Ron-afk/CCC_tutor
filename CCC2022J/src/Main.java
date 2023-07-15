import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
//        int j1 = J1();
        int j2 = J2();
    }

    public static int J1() throws Exception{
        // get user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());

        int total = 8 * R + 3 * S;
        int result = total - 28;
        System.out.println(result);
        return result;
    }

    public static int J2() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        boolean isGold = true;
        int result = 0;
        for(int i = 0; i < count; i++){
            int p = Integer.parseInt(br.readLine());
            int f = Integer.parseInt(br.readLine());
            result += p*5-f*3>40 ? 1 : 0;
            isGold = isGold? p*5-f*3>40 : false;
        }
        System.out.println(result + (isGold?"+":""));
        return result;
    }
}
