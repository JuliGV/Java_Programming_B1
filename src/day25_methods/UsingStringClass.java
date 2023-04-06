package day25_methods;

import my_util.StringUtil;

public class UsingStringClass {
    public static void main(String[] args) {
        System.out.println(StringUtil.reversStr("java"));
        String fixed = StringUtil.fixFormat("tOm") + " is friend with "+StringUtil.fixFormat("jEry");
        System.out.println(fixed);
        System.out.println(StringUtil.cameCase("JAVA will ruLE tHe wORLd"));
        System.out.println(StringUtil.frequencyOfCharacter("rrrfffdddedsdtggggggg", 'g'));
    }
}
