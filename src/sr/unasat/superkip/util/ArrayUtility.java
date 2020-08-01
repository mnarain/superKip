package sr.unasat.superkip.util;

import sr.unasat.superkip.entities.VerpakteKip;

import java.time.LocalDate;
import java.util.Arrays;

public class ArrayUtility {
    public static VerpakteKip[] merge(VerpakteKip[] vk1) {
        VerpakteKip[] opgeslagenVK100 = new VerpakteKip[100];
        System.arraycopy(vk1, 0, opgeslagenVK100, 0, vk1.length);
        return opgeslagenVK100;
    }

    public static void main(String[] args) {
        VerpakteKip[] vk1 = {new VerpakteKip(445,34.2d, LocalDate.now())};
        VerpakteKip[] opgeslagenVK100 = merge(vk1);
        for (VerpakteKip vk:opgeslagenVK100) {
            System.out.println(vk);
        }
    }


}
