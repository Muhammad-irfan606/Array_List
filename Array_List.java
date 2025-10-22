import java.util.ArrayList;

class Main {
    static ArrayList<Integer> reverselist(ArrayList<Integer> l1) {
        int first = 0;
        int last = l1.size() - 1;

        while (first < last) {
            Integer temp = l1.get(first);
            l1.set(first, l1.get(last));
            l1.set(last, temp);
            first++;
            last--;
        }
        return l1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);

        System.out.println(reverselist(l1)); // prints reversed list
    }
}
