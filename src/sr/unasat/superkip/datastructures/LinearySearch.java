package sr.unasat.superkip.datastructures;

import sr.unasat.superkip.entities.VerpakteKip;

public class LinearySearch {

    public static int findNextInsert(VerpakteKip[] opgeslagenVK){
        for (int index = 0; index < opgeslagenVK.length; index++) {
            if(opgeslagenVK[index] == null){
                return index;
            }
        }
        return -1; // geen open opslagplek meer
    }
}
