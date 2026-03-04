package com.mk.codePractice.dsa.strings;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {

        if(haystack.equals(needle))
                return 0;

        int hLen = haystack.length();
        int nLen = needle.length();

        if(nLen > hLen)
            return -1;

        int start = 0;
        while(start + nLen - 1 < hLen) {
            boolean found = true;
            for (int i =0; i<nLen; i++) {
                if (needle.charAt(i) != haystack.charAt(start+i)) {
                    found = false;
                    break;
                }
            }
            if(found)
                return start;
            start ++;
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        int index=haystack.indexOf(needle);
        return index;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "dbut";
        ImplementStrStr impl = new ImplementStrStr();
        System.out.println(impl.strStr(haystack,needle));

    }
}
