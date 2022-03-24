package homework_20220320;

public class OverStack {
static     public int fff(int s){
        s++;
        s = fff(s);
        return s;
    }
    public static void main(String[] args) {
        int s =0;
        fff(s);
    }
}
