package com.mk.codePractice.dsa.strings;

public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");

        while (--n > 0) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < sb.length(); ++i) {
                int count = 1;
                while (i + 1 < sb.length() && sb.charAt(i) == sb.charAt(i + 1)) {
                    ++count;
                    ++i;
                }
                next.append(count).append(sb.charAt(i));
            }
            sb = next;
        }

        return sb.toString();
    }

    public String countAndSay2(int n) {
        if(n == 1)return "1";

        String res = countAndSay2(n -1);

        int count = 1;
        StringBuilder sb = new StringBuilder();
        char curr = res.charAt(0);
        for(int i = 1 ; i < res.length(); i++){
            if(curr == res.charAt(i)){
                count++;
            }else{
                sb.append(count);
                count = 1;
                sb.append(curr);
                curr = res.charAt(i);
            }
        }
        if(count > 0){
            sb.append(count).append(curr);
        }
        return sb.toString();
    }


}
