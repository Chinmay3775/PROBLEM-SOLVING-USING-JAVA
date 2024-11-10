class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0;

        // Traverse both arrays using two pointers
        while (i < a.length && j < b.length) {
            // Skip duplicate elements in array `a`
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            // Skip duplicate elements in array `b`
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            // Add the smaller element to the union list
            if (a[i] < b[j]) {
                unionList.add(a[i++]);
            } else if (a[i] > b[j]) {
                unionList.add(b[j++]);
            } else { // If both elements are equal, add only one and move both pointers
                unionList.add(a[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from array `a`
        while (i < a.length) {
            if (i == 0 || a[i] != a[i - 1]) {
                unionList.add(a[i]);
            }
            i++;
        }

        // Add remaining elements from array `b`
        while (j < b.length) {
            if (j == 0 || b[j] != b[j - 1]) {
                unionList.add(b[j]);
            }
            j++;
        }

        return unionList;
    }
}
