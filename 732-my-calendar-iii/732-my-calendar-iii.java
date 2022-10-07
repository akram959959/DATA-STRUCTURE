class MyCalendarThree {

    int max;
    Node root;
    public MyCalendarThree() {
        max = 0;
    }
    
    public int book(int start, int end) {
        root = insert(root, start, end);
        return max;
    }
    
    private Node insert(Node node, int start, int end) {
        if(node==null) {
            max = Math.max(max, 1);
            return new Node(start, end, 1);
        }
        if(end<=node.start) {
            node.left = insert(node.left, start, end);
        } else if(start>=node.end) {
            node.right = insert(node.right, start, end);
        } else {
            if(start<node.start) {
                node.left = insert(node.left, start, node.start);
            } 
            if(end>node.end) {
                node.right = insert(node.right, node.end, end);
            }
            if(start>node.start) {
                Node l = new Node(node.start, start, node.k);
                l.left = node.left;
                node.left = l;
                node.start = start;
            } 
            if(end<node.end) {
                Node r = new Node(end, node.end, node.k);
                r.right = node.right;
                node.right = r;
                node.end = end;
            } 
            max = Math.max(max, ++node.k);
        }
        return node;
    }
}

class Node{
    int start;
    int end;
    int k;
    Node left;
    Node right;
    public Node(int start, int end, int k) {
        this.start = start;
        this.end = end;
        this.k = k;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */