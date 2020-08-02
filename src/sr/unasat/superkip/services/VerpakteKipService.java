package sr.unasat.superkip.services;

import sr.unasat.superkip.datastructures.BinarySearch;
import sr.unasat.superkip.datastructures.InsertionSort;
import sr.unasat.superkip.datastructures.LinearySearch;
import sr.unasat.superkip.entities.VerpakteKip;
import sr.unasat.superkip.util.ArrayUtility;

public class VerpakteKipService {
    VerpakteKip[] opgeslagenVK;

    public VerpakteKipService(VerpakteKip[] verpakteKippen) {

        if (verpakteKippen != null || verpakteKippen.length > 0) {
            InsertionSort.execute(verpakteKippen);
            this.opgeslagenVK = verpakteKippen.length < 100 ? ArrayUtility.merge(verpakteKippen)  : verpakteKippen;
        } else {
            this.opgeslagenVK = new VerpakteKip[100];
        }
        sorteerVerpakteKip();
    }

    public void voegVerpakteKipToe(VerpakteKip VerpakteKip) throws Exception {
        int vkOpslagIndex = LinearySearch.findNextInsert(opgeslagenVK);
        if (vkOpslagIndex >= 0 && vkOpslagIndex < 100) {
            opgeslagenVK[vkOpslagIndex] = VerpakteKip;
        } else {
            throw new Exception("Het opslagruim is vol!");
        }
    }

    public void sorteerVerpakteKip() {
        InsertionSort.execute(opgeslagenVK);
    }

    public VerpakteKip zoek(int labelNumber) {
        return opgeslagenVK.length > 0 ? BinarySearch.execute(opgeslagenVK, labelNumber, 0, (opgeslagenVK.length - 1)) : null;
    }




}
