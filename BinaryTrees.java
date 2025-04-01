public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left , key);
        }
        else{
            return search(root.right , key);
        }
    }
     if(search(root , 7)){
            System.out.print("found");
        }else{
            System.out.print("not found");
        }
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        