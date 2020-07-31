package sr.unasat.superkip.util;

import sr.unasat.superkip.entities.VerpakteKip;

import java.util.Arrays;

public class ArrayUtility {
    public static VerpakteKip[] merge(VerpakteKip[] vk1) {
        VerpakteKip[] opgeslagenVK100 = new VerpakteKip[100];
        System.arraycopy(vk1, 0, opgeslagenVK100, 0, vk1.length);
        return opgeslagenVK100;
    }


}
