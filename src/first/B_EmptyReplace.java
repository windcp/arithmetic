package first;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 思路：使用StringBuilder、StringBuffer类重新构造一个
 */
public class B_EmptyReplace {

    public String replaceSpace(StringBuffer str) {
        if (str == null)
            return null;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }

}
