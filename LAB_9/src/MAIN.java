import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size...");
        int size = sc.nextInt();
        System.out.println("Enter word...");
        String word = sc.next();

        gen ob = new gen();
        ob.word=word;
        ob.size=size+1;
        ob.gen_grid();



        long time = start - System.currentTimeMillis();
        System.out.println("TIME: "+(-time));}
}
