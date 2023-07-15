import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
//        int j1 = J1();
        J2();
    }


    public static int J1() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int B = Integer.parseInt(br.readLine());
        int temp = B * 5 - 400;
        System.out.println(temp);
        if(temp > 100) {
            System.out.println("-1");
        } else if (temp == 100) {
            System.out.println("0");
        } else {
            System.out.printf("1");
        }
        return temp;
    }

    public static void J2() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        String name = "";
        for(int i = 0; i < n; i++) {
            String bider = br.readLine();
            int amount = Integer.parseInt(br.readLine());
            name = amount > max ? bider : name;
            max = amount > max ? amount : max;
        }
        System.out.println(name);
    }
}
