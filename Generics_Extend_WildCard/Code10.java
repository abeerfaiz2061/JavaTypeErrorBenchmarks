import java.util.ArrayList;
import java.util.List;

public class Code10<T> {
    private T data;
    private List<Code10<T>> children;
    private Code10<T> parent;

    public Code10(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public Code10(Code10<T> node) {
        this.data = node.getData();
        this.children = new ArrayList<>();
    }

    public void addChild(Code10<T> child) {
        child.setParent(this);
        children.add(child);
    }

    public void addChildAt(int index, Code10<T> child) {
        child.setParent(this);
        this.children.add(index, child);
    }

    public void setChildren(List<Code10<T>> children) {
        for (Code10<T> child : children) {
            child.setParent(this);
        }
        this.children = children;
    }

    public void removeChildren() {
        this.children.clear();
    }

    public Code10<T> removeChildAt(int index) {
        return children.remove(index);
    }

    public boolean removeChild(Code10<T> childToBeDeleted) {
        List<Code10<T>> list = getChildren();
        return list.remove(childToBeDeleted);
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Code10<T> getParent() {
        return this.parent;
    }

    public void setParent(Code10<T> parent) {
        this.parent = parent;
    }

    public List<Code10<T>> getChildren() {
        return this.children;
    }

    public Code10<T> getChildAt(int index) {
        return children.get(index);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Code10)) return false;
        Code10<?> other = (Code10<?>) obj;
        return this.data.equals(other.getData());
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

    public static <T> void addChildWithInvalidType(Code10<T> node, List<Code10<? extends T>> children) {
        for (Code10<? extends T> child : children) {
            node.addChild(child);
        }
    }

    public static void main(String[] args) {
        Code10<String> stringNode = new Code10<>("Parent");
        List<Code10<? extends String>> validChildren = new ArrayList<>();
        validChildren.add(new Code10<>("Child1"));
        validChildren.add(new Code10<>("Child2"));

        addChildWithInvalidType(stringNode, validChildren);
    }
}

// Original Code Credits - https://github.com/c05mic/GenericN-aryTree