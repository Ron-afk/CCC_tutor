import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
//        int j1 = J1();
//        J2();
        J3();
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

    public static void J3() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> direction = new ArrayList<>();
        ArrayList<Integer> steps = new ArrayList<>();
        // ver j3temp class
        ArrayList<J3Temp> result = new ArrayList<>();
        do {
            int first = n/10000;
            int second = (n-first) /1000;
            int step = n-first*10000-second*1000;
            if(first + second == 0) {
                direction.add(direction.get(direction.size()-1));
            } else {
                direction.add((first + second) % 2 == 0 ? "right" : "left");
                steps.add(step);
            }
            n = Integer.parseInt(br.readLine());
        } while(n != 99999);
        for(int i = 0; i < direction.size(); i++) {
            System.out.println(direction.get(i)+" " + steps.get(i));
        }

    }

    public class J3Temp {
        public String direction;
        public int steps;

        public J3Temp(String s, int i) {
            direction = s;
            steps = i;
        }

        @Override
        public String toString() {
            return direction + " "+steps;
        }
    }
}
