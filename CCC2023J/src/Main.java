import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception{
        // J1
//        int result = CCC23J1();
        // J2
        int result = J2();
        // J3
        // J4
        // J5
    }

    // +50 * package delivered
    // -10 * collision with an obstacle
    // +500 bonus if # of delivered > # of collisions
    // find the final score
    // 2 lines of inputs: # of delivered; # of collisions
    public static int CCC23J1() throws Exception{
        // step 1: get two integer inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        // step 2: calculate points
        int result = 50 * d -10 * c;
        // step 3: check if bonus
        result += d > c? 500: 0;
        // step 4: output result
        System.out.println(result);
        return result;
    }

    // get n inputs and calculate the total based on info in table
    // Poblano 1500
    // Mirasol 6000
    // Serrano 15500
    // Cayenne 40000
    // Thai 75000
    // Habanero 125000
    public static int J2() throws Exception{
        int result = 0;
        // step 1: get input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String name = br.readLine();
            int spciy;
            switch (name) {
                case "Poblano":
                    spciy = 1500;
                    break;
                case "Mirasol":
                    spciy = 6000;
                    break;
                case "Serrano":
                    spciy = 15500;
                    break;
                case "Cayenne":
                    spciy = 40000;
                    break;
                case "Thai":
                    spciy = 75000;
                    break;
                case "Habanero" :
                    spciy = 125000;
                    break;
                default:
                    spciy = 0;
                    break;
            }
//            System.out.println(spciy);
            result += spciy;
        }
        System.out.println(result);
        return result;
    }
}
