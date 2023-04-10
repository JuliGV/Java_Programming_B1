package day27_wrapper_arraylist;

import my_util.ArrayUtil;

import java.util.Arrays;

public class UsingArrayUtil {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrayUtil.addEmementBegining(34, 65, 98, 87, 9)));
        System.out.println(Arrays.toString(ArrayUtil.addEmementBegining("loop", "is", "good", "language")));
    }
}
