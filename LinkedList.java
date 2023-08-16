public class LinkedList {
    int value;
    LinkedList nextNode;

    LinkedList(int value, LinkedList linkedList) {
        this.value = value;
        nextNode = linkedList;
    }

    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList(2, null);
        while (linkedList != null) {
            System.out.println("value " + linkedList.value);
            linkedList = linkedList.nextNode;
        }
    }
}
