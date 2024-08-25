class Parent {
    public String Tree(String TreeName) {
        return TreeName;
    }
}

class Child1 extends Parent{
    public String ChildTree(String ChildTree){
        return ChildTree;
    }
}

class Child2 extends Child1{
    public String ChildTree2(String ChildTree2){
        return ChildTree2;
    }
    public static void main(String[] args) {
        Child2 obj = new Child2();
        System.out.println(obj.ChildTree("Empty"));
    }
}

