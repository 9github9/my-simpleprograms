package com.darojunav.practise.javaprograms.basicPrograms;

public class RevereString {
    public static void main(String[] args) {
        RevereString cmain = new RevereString();
        System.out.println(cmain.revereString("Naveen"));
    }

    public String revereString(String input) {
        if (null != input && !input.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                sb.append(input.charAt(i));
            }
            return sb.toString();
        }
        return null;
    }
}
