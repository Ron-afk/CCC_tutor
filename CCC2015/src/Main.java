import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception{
        J3();
    }

    public static void J3() throws Exception{
        // get input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output = "";

        // loop through string
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            output += J3helper(c);
        }
        System.out.println(output);
    }

    private static String J3helper(char c) {
        switch(c) {
            case 'b':
                return "bac";
            case 'c':
                return "bac";
            case 'd':
                return "bac";
            case 'f':
                return "bac";
            default:
                return Character.toString(c);
        }
    }

    public static void J4() {
        HashMap<Integer, ArrayList<Integer>> timeStamp = new HashMap<>();
        int n =0;

    }
}
