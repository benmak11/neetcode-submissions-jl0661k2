// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        int l = 0, r = pairs.size() - 1;
        return mergePairs(pairs, l, r);
    }

    private List<Pair> mergePairs(List<Pair> arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            mergePairs(arr, l, m);
            mergePairs(arr, m + 1, r);

            merge(arr, l, m, r);
        }
        return arr;
    }

    public void merge(List<Pair> arr, int l, int m, int r) {
        int len1 = m - l + 1, len2 = r - m;

        Pair[] L = new Pair[len1];
        Pair[] R = new Pair[len2];

        for (int i = 0; i < len1; i++)
            L[i] = arr.get(l + i);
        for (int j = 0; j < len2; j++)
            R[j] = arr.get(m + 1 + j);
        
        int i = 0, j = 0, k = l;

        while (i < len1 && j < len2) {
            if (L[i].key <= R[j].key) {
                arr.set(k, L[i]);
                i++;
            } else {
                arr.set(k, R[j]);
                j++;
            }
            k++;
        }

        while (i < len1) {
            arr.set(k, L[i]);
            i++;
            k++;
        }

        while (j < len2) {
            arr.set(k, R[j]);
            j++;
            k++;
        }
    }
}
