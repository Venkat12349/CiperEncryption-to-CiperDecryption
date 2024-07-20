import java.util.HashMap;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args){
        String str=ciperEncrption("VENKATAREDDY","ZOHO");
System.out.println("Encrpytion:"+str);
System.out.println("Decrpytion:"+ciperDecryption(str,"ZOHO"));
    }


    public static String ciperEncrption(String str,String str1) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Integer,Character> map1=new HashMap<>();
        int count=0;
        for(int i=0;i<26;i++){
            char c=(char)((char)'A'+count);
            map.put(c,i);
            map1.put(i,c);
            count++;
        }
       // System.out.println(map);
       // System.out.println(map1);
        String str2="";
    for(int i=0,j=0;i<str.length();i++,j++){
        if(j>=str1.length()){
            j=0;
        }
        char a=str.charAt(i);
        char b=str1.charAt(j);
        int c=map.get(a);
        int d=map.get(b);
        int e=c+d;
        if(e>25){
            int f=e-25;
            char g=map1.get(f);
            str2+=g;
        }else{
           char g=map1.get(e);
           str2+=g;
        }
    }
    return str2;
      }
      public static String ciperDecryption(String str,String str1) {
          HashMap<Character, Integer> map = new HashMap<>();
          HashMap<Integer, Character> map1 = new HashMap<>();
          int count = 0;
          for (int i = 0; i < 26; i++) {
              char c = (char) ((char) 'A' + count);
              map.put(c, i);
              map1.put(i, c);
              count++;
          }
        //  System.out.println(map);
          // System.out.println(map1);
          String str2 = "";
          for (int i = 0, j = 0; i < str.length(); i++, j++) {
              if (j >= str1.length()) {
                  j = 0;
              }
              char a = str.charAt(i);
              char b = str1.charAt(j);
              int c = map.get(a);
              int d = map.get(b);
              int e = c - d;
              if (e <0) {
                  int u = Math.abs(e);
                  int f = 25 - u;
                  char g = map1.get(f);
                  str2 += g;
              } else {
                  char g = map1.get(e);
                  str2 += g;
              }
          }
          return str2;

      }
}
