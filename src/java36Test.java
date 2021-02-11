import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class java36Test {
    @Test
    public void testA() {
        int[] testA = new int[]{1, 2, 4, 34, 664, 3, 234, 63, 234, 63, 12, 55, 6, 6, 2, 78, 5};
        int[] result = new int[]{34, 664, 3, 234, 63, 234, 63, 12, 55, 6, 6, 2, 78, 5};
        for (int i = 0; i < result.length; i++) {
            Assertions.assertEquals(result[i], java36.makeNewArray(testA)[i]);
        }
    }

    @Test
    public void testB() {
        int[] testA = new int[]{56, 44, 55, 90, 54, 3, 244, 567, 8543, 674, 326, 78, 4, 45, 7, 4, 37, 89, 54, 36, 790, 345865, 345, 6, 7};
        int[] result = new int[]{37, 89, 54, 36, 790, 345865, 345, 6, 7};
        for (int i = 0; i < result.length; i++) {
            Assertions.assertEquals(result[i], java36.makeNewArray(testA)[i]);
        }
    }

    @Test
    public void testC() {
        int[] testA = new int[]{1, 2, 4, 34, 664, 3, 234, 63, 234, 63, 12, 55, 6, 6, 2, 78, 5};
        int[] result = new int[]{34, 664, 3, 234, 63, 234, 63, 12, 55, 6, 6, 2, 78, 5};
        for (int i = 0; i < result.length; i++) {
            Assertions.assertEquals(result[i], java36.makeNewArray(testA)[i]);
        }
    }

    @Test
    public void test4and1A() {
        int[] a = new int[] {4,1,4,4,4,1,4,1,1,5};
        Assertions.assertTrue(java36.array4and1(a));
    }

    @Test
    public void test4and1B() {
        int[] a = new int[] {5,6,5,6,5,6,5,6,5,6};
        Assertions.assertTrue(java36.array4and1(a));
    }

    @Test
    public void test4and1C() {
        int[] a = new int[] {1,2,1,2,1,2,1,2,1,2,1};
        Assertions.assertTrue(java36.array4and1(a));
    }
}