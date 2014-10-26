public class Ques1 {
public static int mode(final int[] n) {
    int maxKey = 0;
	int maxkey1=0;
    double maxCounts = 0;

    int[] counts = new int[n.length];

    for (int i=0; i < n.length; i++) {
        counts[n[i]]++;
        if (maxCounts < counts[n[i]]) {
            maxCounts = counts[n[i]];
            maxKey = n[i];
        }
    }
    return maxKey;
}

public static void main(String[] args) {
    int[] n = new int[] {4,7,4,1,3,4,9,3,7,1 };
    System.out.println(mode(n));
}
}