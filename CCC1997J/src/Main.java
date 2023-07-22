import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        J1();
    }

    public static void J1() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> result = new ArrayList<>();
        for(int j = 0; j < n; j++){
            int subCount = Integer.parseInt(br.readLine());
            int verCount = Integer.parseInt(br.readLine());
            int objCount = Integer.parseInt(br.readLine());

            String[] sub = new String[subCount];
            String[] ver = new String[verCount];
            String[] obj = new String[objCount];

            for(int i = 0; i< subCount; i++) {
                sub[i] = br.readLine();
            }
            for(int i = 0; i< verCount; i++) {
                ver[i] = br.readLine();
            }
            for(int i = 0; i< objCount; i++) {
                obj[i] = br.readLine();
            }

            for(String s : sub){
                for(String v : ver) {
                    for(String o : obj) {
                        String res = s + " " + v + " "+ o + ".";
                        result.add(res);
                    }
                }
            }
        }

        for(String s: result) {
            System.out.println(s);
        }
    }
}
