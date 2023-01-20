import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the reference string: ");
        String ref = sc.nextLine();
        str = str.toLowerCase();
        ref = ref.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        for(int j=0;j<ref.length();j++) {
            count =0;
            for (int i = 0; i < str.length(); i++) {
                if (ref.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            map.put(ref.charAt(j),count);
        }
        for(int i=0;i<ref.length();i++){
            System.out.print(ref.charAt(i)+":");
            System.out.print(map.get(ref.charAt(i))+" ");
        }
    }
}
