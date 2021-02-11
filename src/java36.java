import java.util.ArrayList;
import java.util.List;

public class java36 {
    public static void main(String[] args) {
        int[] asd = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] fourone = new int[]{1,4, 1, 4, 1, 4, 1, 4, 1, 4};

        for (int i :makeNewArray(asd)) {
            System.out.println(i);
        }

        System.out.println(array4and1(fourone));

    }

    public static int[] makeNewArray(int[] inArray) throws RuntimeException {
        List<Integer> outArray = new ArrayList<>();
        int counter = 0;
        for (int i : inArray) {
            if (i == 4) {
                counter += 1;
            }
        }
        if (counter >= 1) {
            for (int i = (inArray.length - 1); i >= 0; i--) {
                if (inArray[i] == 4) {
                    for (int k = i + 1; k < inArray.length; k++) {
                        outArray.add(inArray[k]);
                    }
                    break;
                }
            }
        } else {
            throw new RuntimeException("В массиве нет ни одной четверки");
        }
        int[] outIntArray = new int[outArray.size()];
        for (int i = 0; i < outIntArray.length; i++) {
            outIntArray[i] = outArray.get(i);
        }
        return outIntArray;
    }

    public static boolean array4and1(int[] inArray) {
        int oneCount = 0;
        int fourCount = 0;
        for (int i: inArray) {
            if (i==1) {
                oneCount += 1;
            } else if (i==4) {
                fourCount += 1;
            }
        }
        if (oneCount > 0 & fourCount >0) {
            return true;
        } else {
            return false;
        }
    }

}
