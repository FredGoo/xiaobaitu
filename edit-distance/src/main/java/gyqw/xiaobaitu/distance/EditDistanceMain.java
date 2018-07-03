package gyqw.xiaobaitu.distance;

/**
 * @author fred
 * @date 2018/06/14 10:17
 */
public class EditDistanceMain {
    public static void main(String[] args) {
        System.out.println(distance("上海市", "上海"));
        System.out.println(distance("上海市", "上海杨浦区"));
        System.out.println(distance("上海市", "上海杨浦"));
        System.out.println(distance("上海", "上海杨浦"));
        System.out.println(distance("即务有限公中文政立路一百号撒", "jk"));
    }

    private static int distance(String s1, String s2) {
        int edits[][] = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            edits[i][0] = i;
        }
        for (int j = 1; j <= s2.length(); j++) {
            edits[0][j] = j;
        }
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                int u = (s1.charAt(i - 1) == s2.charAt(j - 1) ? 0 : 1);
                edits[i][j] = Math.min(
                        edits[i - 1][j] + 1,
                        Math.min(
                                edits[i][j - 1] + 1,
                                edits[i - 1][j - 1] + u
                        )
                );
            }
        }
        return edits[s1.length()][s2.length()];
    }

}
