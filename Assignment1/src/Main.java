public class Main {
    public static void main(String[] args) {
        // Create list object
        Node n = new Node();
        Node.DoubleNode dll = n.new DoubleNode();
        
        // Create a list with the given elements
        dll.addLast('C');
        dll.addLast('O');
        dll.addLast('M');
        dll.addLast('P');
        dll.addLast('U');
        dll.addLast('T');
        dll.addLast('E');

        // 1. Print list
        dll.printList();

        // 2. Insert M at start of list and print the result
        dll.addFirst('M');
        dll.printList();

        // 3. Insert R at the end
        dll.addLast('R');
        dll.printList();

        // 4. Remove the first item from the list
        dll.removeFirst();
        dll.printList();
        
        // 5. Remove the last item from the list
        dll.removeLast();
        dll.printList();

    }

    /*
    test each of these cases and print the list after each test and verify the correctness of the code.
    Examples:
    Suppose the link list contains the following elements:
    C-> O -> M -> P -> U -> T -> E
    1. Print the contents of the list:
    C-> O -> M -> P -> U -> T -> E
    2. Insert M at the beginning of the list:
    M -> C-> O -> M -> P -> U -> T -> E
    3. Insert R at the end:
    M -> C-> O -> M -> P -> U -> T -> E -> R
    4. Remove from the beginning:
    C-> O -> M -> P -> U -> T -> E -> R
    5. Remove from the end:
    C-> O -> M -> P -> U -> T -> E
    6. Insert M before P:
    C-> O -> M -> M -> P -> U -> T -> E
    7. Insert H before M:
    C-> O -> H -> M -> M -> P -> U -> T -> E -> B
    8. Insert B before A:
    C-> O -> M -> M -> P -> U -> T -> E -> B
    9. Insert C after P:
    C-> O -> M -> M -> P-> C -> U -> T -> E -> B
    10.Insert L after M:
    C-> O -> M -> L -> M -> P -> C-> -> U -> T -> E -> B
    11.Remove M
    C-> O -> L -> M -> P -> C-> -> U -> T -> E -> B
    12.Remove G
    C-> O -> L -> M -> P -> C-> -> U -> T -> E -> B
    13.Move P to the front of the list:
    P -> C-> O -> L -> M -> C-> -> U -> T -> E -> B
    14.Move L to the end of the list:
    P -> C-> O -> M -> C-> -> U -> T -> E -> B -> L
    */
}