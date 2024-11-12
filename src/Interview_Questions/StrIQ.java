package Interview_Questions;

public class StrIQ {
    public static void main(String[] args) {
        String str=" Tushar Sinha   ";
        String[] newStr = str.trim().split(" ");
        for(String m:newStr){
            for(int i=m.length()-1;i>=0;i--){
                System.out.print(m.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
