package com.parmentier;

public class CodingInterview1 {

    public String replace(String str, char ch){
        StringBuilder result = new StringBuilder();
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == ch ){
                result.append("$");
            }else{
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public String recurrentReplace(String str, char ch, int pos){
        if(pos == str.length()) return "";

        char c = str.charAt(pos);
        pos++;
        if( c == ch ){
            return '$' + recurrentReplace(str, ch, pos);
        }else{
            return c + recurrentReplace(str, ch, pos);
        }
    }

}
