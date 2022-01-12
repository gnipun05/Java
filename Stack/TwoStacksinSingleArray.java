package Stack;

public class TwoStacksinSingleArray {
    
    int arr[];
    int cap;
    int top1;
    int top2;

    TwoStacksinSingleArray(int n){
        arr=new int[n];
        cap=n;
        top1=-1;
        top2=cap;
    }

    void push1(int x){
        if(top1<top2-1){
            top1++; 
            arr[top1]=x;
        }
    }

    void push2(int x){
        if(top1>top2){
            top2--;
            arr[top2]=x;
        }
    }

    int pop1(){
        if(top1==-1)
            return Integer.MAX_VALUE;
        int res=arr[top1];
        top1--;
        return res;
    }

    int pop2(){
        if(top2==cap)
            return Integer.MAX_VALUE;
        int res=arr[top2];
        top2++;
        return res;
    }

    int peek1(){
        if(top1==-1)
            return Integer.MAX_VALUE;
        return arr[top1];
    }

    int peek2(){
        if(top2==cap)
            return Integer.MAX_VALUE;
        return arr[top2];
    }

    int size1(){
        return top1+1;
    }

    int size2(){
        return cap-top1;
    }

    boolean isEmpty1(){
        return (top1==-1);
    }

    boolean isEmpty2(){
        return (top2==cap);
    }
}
