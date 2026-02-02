public class Node {
    private char data;
    private Node next;
    private Node prior;

    public Node(char data, Node next, Node prior) {
        this.data = data;
        this.next = next;
        this.prior = prior;
    }

    public Node() {
        next = null;
        prior = null;
    }
    
    // Getters and setters
    public char getData() {
        return data;
    }
    public void setData(char data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrior() {
        return prior;
    }
    public void setPrior(Node prior) {
        this.prior = prior;
    }

    // Make actual list
    public class DoubleNode {
        private Node first;
        private Node last;
        private int length;

        public DoubleNode() {
            first = new Node(data, next, prior);
            last = new Node(data, next, first);
            first.setNext(last);
        }

        public boolean empty() {
            return length == 0;
        }

        public char one(){
            if(empty()){
                return '0';
            }
            return first.getNext().getData();
        }

        public char end(){
            if(empty()){
                return '0';
            }
            return last.getPrior().getData();
        }

        public void addFirst(char data){
            addBetween(data, first, first.getNext());
        }
        public void addLast(char data){
            addBetween(data, last.getPrior(), last);
        }

        public void addBetween(char data, Node aft, Node bef){
            Node newest = new Node(data, aft, bef);
            bef.setNext(newest);
            aft.setPrior(newest);
            length++;
        }

        public char removeFirst(){
            if(empty()){
                return '0';
            }
            return remove(first.getNext());
        }
        public char removeLast(){
            if(empty()){
                return '0';
            }
            return remove(last.getPrior());
        }
        public char remove(Node x){
            Node bef = x.getPrior();
            Node aft = x.getNext();

            bef.setNext(aft);
            aft.setPrior(bef);

            length--;

            return x.getData();
        }

        public void printList() {
            if(empty()){
                System.out.println("List is empty");
            } else {
                Node start = first.getNext();
                while (start != last) {
                    System.out.print(start.getData() + " ");
                    start = start.getNext();
                }
                System.out.println("\n");
            }
        }
        
    }

    /*
        Implement a nested class DoubleNode for building doubly-linked lists, where each node contains
        a reference to the item preceding it and the item following it in the list (null if there is no such
        item). 
        Then implement methods for the following tasks:
        • Print the contents of the list
        • Insert at the beginning
        • Insert at the end
        • Remove from the beginning
        • Remove from the end
        • Insert before a give node (Insert before the first occurrence of the node, if the
        node exists; else insert at the end)
        • Insert after a given node (Insert after the first occurrence of the node, if the node
        exists; else insert at the end)
        • Remove a given node (Remove the first occurrence of the node, remove nothing if
        node not found)
        • Move to front (move the first occurrence of the node to the front)
        • Move to end (moved and first occurrence of the node to the end)
    */
}