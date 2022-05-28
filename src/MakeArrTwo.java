public class MakeArrTwo implements InterfaceNew {

    int length;
    @Override
    public int[] Get() {
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * x);
        }
        return arr;
    }
}
