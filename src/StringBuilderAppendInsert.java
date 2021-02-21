/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Manipulate Data With StringBuilder
Sub-Topic: Append Methods
*/

public class StringBuilderAppendInsert {
    public static void main(String[] args) {

        /*
            These are the many flavors of append:

            StringBuilder append(boolean b)
            StringBuilder append(char c)
            StringBuilder append(char[] str)
            StringBuilder append(char[] str, int offset, int len)
            StringBuilder append(double d)
            StringBuilder append(float f)
            StringBuilder append(int i)
            StringBuilder append(long lng)
            StringBuilder append(CharSequence s)
            StringBuilder append(CharSequence s, int start, int end)
            StringBuilder append(Object obj)
            StringBuilder append(String str)
            StringBuilder append(StringBuffer sb)
            StringBuilder appendCodePoint(int codePoint)
         */

        StringBuilder sb = new StringBuilder(100);
        sb.append("Hello ")
                .append(new char[]{'W', 'o', 'r', 'l', 'd'})
                .append(',')
                .append((Object) " My ")
                .append("NewNumber ", 3, 9)
                .append(" is ")
                .appendCodePoint(97)
                .append(" float with the value of: ")
                .append(204.50f);
        System.out.println("sb = " + sb);
        System.out.println("sb.length() = " + sb.length());
        System.out.println("sb.capacity() = " + sb.capacity());

        /*
        Some of the many insert methods...
        StringBuilder insert(int offset, boolean b)
        StringBuilder insert(int offset, char c)
        StringBuilder insert(int offset, char[] str)
        StringBuilder insert(int offset, char[] str, int offset, int len)
        StringBuilder insert(int offset, double d)
        StringBuilder insert(int offset, float f)
        StringBuilder insert(int offset, int i)
        StringBuilder insert(int offset, long lng)
        StringBuilder insert(int dstoffset, CharSequence s)
        StringBuilder insert(int dstoffset, CharSequence s, int start, int end)
        StringBuilder insert(int offset, Object obj)
        StringBuilder insert(int offset, String str)
     */

        StringBuilder sb2 = new StringBuilder(100);
        sb2.insert(0, "Hello , is a float with the value of ")
                .insert(6, new char[]{'W', 'o', 'r', 'l', 'd'})
                .insert(13, (Object) "My ")
                .insert(16, "NewNumber ", 3, 10)
                .insert(sb2.length(), 204.5f);

        System.out.println("sb2 = " + sb);
        System.out.println("sb2.length() = " + sb.length());
        System.out.println("sb2.capacity() = " + sb.capacity());
    }//public static void main(String[] args) {
}//public class StringBuilderAppendInsert {
