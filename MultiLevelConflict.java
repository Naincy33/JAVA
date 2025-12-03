interface ParentInterface {
    default void action() {
        System.out.println("ParentInterface: Default action()");
    }
}

interface ChildInterfaceA extends ParentInterface {
    default void action() {
        System.out.println("ChildInterfaceA: Overridden action()");
    }
}

interface ChildInterfaceB extends ParentInterface {
    default void action() {
        System.out.println("ChildInterfaceB: Overridden action()");
    }
}

class ClassE implements ChildInterfaceA, ChildInterfaceB {
    public void action() {
        System.out.println("ClassE resolves conflict from both child interfaces.");

        // Call ChildInterfaceA's method
        ChildInterfaceA.super.action();

        // Call ChildInterfaceB's method
        ChildInterfaceB.super.action();
    }
}

public class MultiLevelConflict {
    public static void main(String[] args) {
        ClassE obj = new ClassE();
        obj.action();
    }
}
