package com.darojunav.practise.javaprograms.basicPrograms;

public class CharacterPresence {
    public static void main(String[] args) {
        CharacterPresence cmain = new CharacterPresence();
        System.out.println(cmain.characterPresence("Naveen&", "@$#%&"));
    }

    public boolean characterPresence(String input, String charSeq) {
        String[] ary = charSeq.split("");
        if (null != input && !input.isEmpty()) {
            for (int i = 0; i <= charSeq.length() - 1; i++) {
                if (input.contains(ary[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}