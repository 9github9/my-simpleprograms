//package com.darojunav.practise.javaprograms.Interview;

import java.util.*;

/*
Implement a magic directory with buildDict, and search methods.

For the method buildDict, you'll be given a list of non-repetitive words to build a dictionary.

For the method search, you'll be given a word, and judge whether if you modify exactly one character into another character in this word, the modified word is in the dictionary you just built.

Example 1:
Input: buildDict(["hello", "nordstrom"]), Output: Null

Input: search("hello"), Output: False
Input: search("hllo"), Output: False
Input: search("norstrom"), Output: False
Input: search("hhllo"), Output: True
Input: search("nardstrom"), Output: True

Note:
You may assume that all the inputs are consist of lowercase letters a-z.

*/


//public class MagicDictionarySolution {

  /**
    Let N be the number of words and K be the search word length
  
  */

  //public static class MagicDictionary {

//      Set<String> set;
//      /** Initialize your data structure here. */
//      public MagicDictionary() {
//        set = new HashSet<>();
//      }
//
//
//
//      /** Build a dictionary through a list of words o(N) */
//      public void buildDictionary(String[] dictionary) {
//          for (String s : dictionary) {
//            set.add(s);
//          }
//      }
//
//      /** Returns true if there is any word in the that equals to the given word after modifying exactly one character o(K)*/
//      public boolean search(String word) {
//          for (int i = 0; i < word.length(); i++) {//k
//            char temp = word.charAt(i);
//            StringBuilder sb = new StringBuilder(word);
//            for (char c = 'a'; c <= 'z'; c++) {// 26
//              if (temp != c) {
//               sb.setCharAt(i, c);
//               if (set.contains(sb.toString())) { // o(1)
//                 return true;
//               }
//              }
//            }
//          }
//        return false;
//      }
//  }
//
//  // n + k
//  public static void main(String[] args) {
//    MagicDictionary md = new MagicDictionary();
//    String[] dictionary = new String[] {"hello", "nordstrom"};
//    md.buildDictionary(dictionary); // n
//    boolean result = md.search("jello"); // k
//    System.out.println("Got : " + result);
//
//  }
//  // todo
////   class MagicDictionary {
//
//
////     String[] Dictionary ;     /** Initialize your data structure here. */
////       public MagicDictionary() {
//
////       }
//
////       /** Build a dictionary through a list of words */
////       public void buildDictionary(String[] dictionary) {
//// this.Dictionary = dictionary;
////       }
//
////       /** Returns true if there is any word in the that equals to the given word after modifying exactly one character */
////       public boolean search(String word) {
////            ArrayList arrayList = new ArrayList(word.toCharArray());
////         ArrayList arayList ;
////         for(String s : this.Dictionary){
////          if(s.equals(word)){
////            return false;
////          }else{
////           arayList = new ArrayList(s.toCharArray());
////           arrayList.retainAll(arayList);
////          }
////         }
////         if(arrayList.size() == 1){
////           return true;
////         }else{
////           return false;
//// }
//
//// }
////   }
//}


