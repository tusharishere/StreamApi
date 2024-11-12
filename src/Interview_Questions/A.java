package Interview_Questions;

import java.io.BufferedReader;
import java.io.FileReader;

public class A {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("D://A.txt");
            BufferedReader br = new BufferedReader(fr);
            String val = br.readLine();
            B b = new B();
            b.setPassword(val);
            System.out.println(b.getPassword());
        } catch (Exception e) {
                e.printStackTrace();
        }

        }
    }

