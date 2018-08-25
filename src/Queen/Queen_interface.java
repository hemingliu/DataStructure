package Queen;

public interface Queen_interface {

    static final int QUEUELEN = 15;

    class DATA{
        String name;
        int age;
    }

    class SQType{
        DATA[] data = new DATA[QUEUELEN];
        int head;
        int tail;
    }

    public SQType SQInit();

    public int SQIsFull(SQType q);

    public int SQIsEmpty(SQType q);

    public void SQClear(SQType q);

    public void SQFree(SQType q);

    public int InSQ(SQType q,DATA data);

    public DATA OutSQ(SQType q);

    public DATA PeekSQ(SQType q);

    public int SQLen(SQType q);
}
