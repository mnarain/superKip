package sr.unasat.superkip.datastructures;

import sr.unasat.superkip.entities.VerpakteKip;

public class BinarySearch {
    // recursive
    //Time Complexity: O(log n)
   public static VerpakteKip execute(VerpakteKip[] vk, int term, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + ((right - left) / 2);
        if (vk[mid].getLabelNumber() == term) { // search term found
            return vk[mid]; // return vk index of search term
        } else if (term < vk[mid].getLabelNumber()) { // search term is smaller than mid point value
            // right bound = mid - 1;
            return execute(vk, term, left, mid - 1); // set right bound
        } else {
            // left bound = mid + 1;
            return execute(vk, term, mid + 1, right); // set left bound
        }
    }
}