package Strings;

public class Regx_Repace {
    public static void main(String[] args) {
        String str ="Hello@World#2025!";
        String result=str.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(result);

    }
}

