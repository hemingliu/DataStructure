package S_LIST;

public interface Sequential_List {
    static final int MaxLength = 100;

    class DATA{
        String key;
        String name;
        int age;
    }

    class SLTYPE{
        DATA[] ListData = new DATA[MaxLength + 1];
        int ListLength;
    }

    public void SLinit(SLTYPE SL);

    public int SLLength(SLTYPE SL);

    public int SLInsert(SLTYPE SL,int n,DATA data);

    public int SLAdd(SLTYPE SL,DATA data);

    public int SLDelete(SLTYPE SL,int n);

    public int SLFindByKey(SLTYPE SL,String key);

    public DATA SLFindByNum(SLTYPE SL,int n);

    public int SLShowAll(SLTYPE SL);
}
