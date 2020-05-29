import java.util.Scanner;

public class gen {
    char [][] grad;
    String word = "1";
    int size;
    int size_w;
    int count=0;
    public static final String AR="\u001B[0m";
    public static final String RED="\u001B[35m";


    public void gen_grid(){
        size_w = word.length();
        grad=new char [size][size];

        for (int i=1;i<size;i++){
            for (int j=1;j<size;j++){
                grad[i][j]=(char)rand();
                System.out.print(RED+" "+grad[i][j]+AR);
            }
            System.out.println();
        }
        word_search();

    }
    public  int rand (){
        int number;
        number = (int)(65+Math.random()*(25));
        return number;
    }

    public void word_search(){
        if (size_w!=1){
            for(int x=1;x<size;x++){
                for(int y=1;y<size;y++){
                    if (grad[x][y]==word.charAt(0)){
                    R(x,y);L(x,y);T(x,y);D(x,y);
                    LT(x,y);LD(x,y);RD(x,y);RT(x,y);} } } }
        else {
            for(int x=1;x<size;x++){
                for(int y=1;y<size;y++) {
                    if (grad[x][y] == word.charAt(0)) {
                        count++; } } } }
        System.out.println("NUMBER OF MATCHES: "+count);
    }

    public void R(int x,int y){
        if (size_w<=size-y){
            int i;
            for(i=1; i<size_w;i++){
                if (grad[x][y+i]!=word.charAt(i)){i=size_w+10;} }
            if (size_w>=i) {count++;System.out.println(count+")["+x+","+y+"] RIGHT");}
        }
    }
    public void L(int x,int y){
        if (size_w<=y){
            int i;
            for(i=1; i<size_w;i++){
                if (grad[x][y-i]!=word.charAt(i)){i=size_w+2;} }
            if (size_w>=i) {count++;System.out.println(count+")["+x+","+y+"] LEFT");}
        }

    }
    public void D(int x,int y){
        if (size_w<=size-x){
                int i;
                for(i=1; i<size_w;i++){
                    if (grad[x+i][y]!=word.charAt(i)){i=size_w+2;} }
                if (size_w>=i) {count++;System.out.println(count+")["+x+","+y+"] DOWN");}
        }

    }
    public void T(int x,int y){
        if (size_w<=x){
                int i;
                for(i=1; i<size_w;i++){
                    if (grad[x-i][y]!=word.charAt(i)){i=size_w+2;} }
                if (size_w>=i) {count++;System.out.println(count+")["+x+","+y+"] TOP");}
        }
    }
    public void RT(int x,int y){
        if ((size_w<=x)&&(size_w<=size-y)){
            int i;
            for(i=1; i<size_w;i++){
                if (grad[x-i][y+i]!=word.charAt(i)){i=size_w+2;} }
            if (size_w>=i) {count++;System.out.println(count+")["+x+","+y+"] R/T");}
        }

    }
    public void RD(int x,int y){
        if ((size_w<=size-x)&&(size_w<=size-y)){
            int i;
            for(i=1; i<size_w;i++){
                if (grad[x+i][y+i]!=word.charAt(i)){i=size_w+2;} }
            if (size_w>=i) {count++;System.out.println(count+")["+x+","+y+"] R/D");}
        }

    }
    public void LT(int x,int y){
        if ((size_w<=x)&&(size_w<=x)){
            int i;
            for(i=1; i<size_w;i++){
                if (grad[x-i][y-i]!=word.charAt(i)){i=size_w+2;} }
            if (size_w>=i) {count++;System.out.println(count+")["+x+","+y+"] L/T");}
        }

    }
    public void LD(int x,int y){
        if ((size_w<=x)&&(size_w<=size-x)){
            int i;
            for(i=1; i<size_w;i++){
                if (grad[x+i][y-i]!=word.charAt(i)){i=size_w+2;} }
            if (size_w>=i) {count++;System.out.println(count+")["+x+","+y+"] L/D");}
        }

    }

}
