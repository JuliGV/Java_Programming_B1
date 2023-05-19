package day44_map;
/*
StringBuffer
   - obkect that represent sequence of characters
   - it is Mutable
   - synchronized-theard-save
   - can create only by NEW keyword
   - come from java.lang package
 */

public class StringBBufferPractice {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Test");
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.indexOf("st"));
        stringBuffer.append("ststststs");
        System.out.println(stringBuffer.lastIndexOf("st"));

        stringBuffer.reverse();
        System.out.println(stringBuffer);


    }
}
