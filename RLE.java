package Algorithm_and_Structure;

public class RLE {
    public static void main(String[] args) {
        System.out.println(rle("AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"));
    }

    private static String rle(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Пустая строка");
        }
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i+1 != str.length() && str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                result.append(count).append(str.charAt(i));
                count = 1;
            }
        }
        return result.toString();
    }
}
