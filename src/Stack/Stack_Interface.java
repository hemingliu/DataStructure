package Stack;

public interface Stack_Interface {
    static final int MAXLength = 50;

    class DATA{
        String name;
        int age;
    }

    class StackType{
        static final int MAXLength = 50;
        DATA[] data = new DATA[MAXLength + 1];
        int top;
    }

    public StackType STinit();

    public boolean STIsEmpty(StackType s);

    public boolean STIsFull(StackType s);

    public void STClear(StackType s);

    public void STFree(StackType s);

    public int PushST(StackType s,DATA data);

    public DATA PopST(StackType s);

    public DATA PeekST(StackType s);
}
