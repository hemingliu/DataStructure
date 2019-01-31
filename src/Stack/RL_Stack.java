package Stack;

public class RL_Stack implements Stack_Interface {
    @Override
    public StackType STinit() {
        StackType p;
        if((p = new StackType()) != null){
            p.top = 0;
            return p;
        }
        return null;
    }

    @Override
    public boolean STIsEmpty(StackType s) {
        boolean t;
        t = (s.top == 0);
        return t;
    }

    @Override
    public boolean STIsFull(StackType s) {
        boolean t;
        t = (s.top == MAXLength);
        return t;
    }

    @Override
    public void STClear(StackType s) {
        s.top = 0;
    }

    @Override
    public void STFree(StackType s) {
        if(s != null){
            s = null;
        }
    }

    @Override
    public int PushST(StackType s, DATA data) {
        if((s.top + 1) > MAXLength){
            System.out.print("栈溢出！\n");
            return 0;
        }
        s.data[++s.top] = data;
        return 1;
    }

    @Override
    public DATA PopST(StackType s) {
        if(s.top == 0){
            System.out.print("栈为空！\n");
            System.exit(0);
        }
        return (s.data[s.top--]);
    }

    @Override
    public DATA PeekST(StackType s) {
        if(s.top == 0){
            System.out.print("栈为空！\n");
            System.exit(0);
        }
        return (s.data[s.top]);
    }
}
