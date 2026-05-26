class VersionControl {

    int bad = 4;

    boolean isBadVersion(int version) {

        return version >= bad;
    }
}

public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {

        int start = 1;
        int end = n;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {

                end = mid - 1;

            } else {

                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        FirstBadVersion obj = new FirstBadVersion();

        int ans = obj.firstBadVersion(5);

        System.out.println("First Bad Version is : " + ans);
    }
}