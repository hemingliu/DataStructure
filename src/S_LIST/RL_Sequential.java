package S_LIST;

public class RL_Sequential implements Sequential_List {
    @Override
    public void SLinit(SLTYPE SL) {
        SL.ListLength = 0;
    }

    @Override
    public int SLLength(SLTYPE SL) {
        return (SL.ListLength);
    }

    @Override
    public int SLInsert(SLTYPE SL, int n, DATA data) {
        if(SL.ListLength >= MaxLength){
            System.out.print("FULL!Can't insert");
            return 0;
        }else if(n < 1 || n > SL.ListLength - 1){
            System.out.print("Error element number!");
            return 0;
        }
        for(int i = SL.ListLength;i > n;i--){
            SL.ListData[i+1] = SL.ListData[i];
        }
        SL.ListData[n] = data;
        SL.ListLength++;
        return 1;
    }

    @Override
    public int SLAdd(SLTYPE SL, DATA data) {
        if(SL.ListLength >= MaxLength){
            System.out.print("FULL!Can't insert");
            return 0;
        }
        int i = SL.ListLength;
        SL.ListData[i+1] = data;
        SL.ListLength++;
        return 1;
    }

    @Override
    public int SLDelete(SLTYPE SL, int n) {
        if(n < 1 || n > SL.ListLength){
            System.out.print("Error element number!");
            return 0;
        }
        for(int i = n;i < SL.ListLength;i--){
            SL.ListData[i] = SL.ListData[i+1];
        }
        SL.ListLength--;
        return 1;
    }

    @Override
    public int SLFindByKey(SLTYPE SL, String key) {
        for(int i = 1;i <= SL.ListLength;i++){
            if(SL.ListData[i].key.compareTo(key) == 0){
                return i;
            }
        }
        return 0;
    }

    @Override
    public DATA SLFindByNum(SLTYPE SL, int n) {
        if(n < 1 || n > SL.ListLength){
            System.out.print("Error element number!");
            return null;
        }
        return SL.ListData[n];
    }

    @Override
    public int SLShowAll(SLTYPE SL) {
        for(int i = 1;i <= SL.ListLength;i++){
            System.out.printf("(%s,%s,%d)\n",SL.ListData[i].key,SL.ListData[i].name,SL.ListData[i].age);
        }
        return 0;
    }
}
