package demo;

public class Demo {

    //(2n+2)*unit_time-->O(n)
    int cal(int n) {
        int sum = 0;
        int i = 1; //O(1)
//        for (; i <= n; ++i) {
//            sum = sum + i;
//        }
        return sum;
    }

    //(2n^2+2n+3)*unit_time--->O(n^2)
    int cal_3(int n) {
        int sum = 0;
        int i = 1;
        int j = 1;
        for (; i < n; i++) {
            j = 1;
            for (; j < n; j++) {
                sum = sum + i * j;
            }
        }
        return sum;
    }
    //O(f(n))


    int cal_1(int n) {
        int sum_1 = 0;
        int p = 1;
        for (; p < 100000000; ++p) {
            sum_1 = sum_1 + p;
        }
        int sum_2 = 0;
        int q = 1;
        for (; q < n; ++q) {
            sum_2 = sum_2 + q;
        }
        int sum_3 = 0;
        int i = 1;
        int j = 1;
        for (; i <= n; ++i) {
            j = 1;
            for (; j <= n; ++j) {
                sum_3 = sum_3 + i * j;
            }
        }
        return sum_1 + sum_2 + sum_3;
    }

    void cal_2(int n) {
        int ret = 0;
        int i = 1;
        for (; i < n; ++i) {
            ret = ret + f(i);
        }
    }

    int f(int n) {
        int sum = 0;
        int i = 1;
        for (; i < n; ++i) {
            sum = sum + i;
        }
        return sum;
    }

    void logn(int n) {
        int i = 1;
        while (i <= n) {
            i = i * 3;
        }
        //O(log2 n)
        //O(log3 n)=常量*log2n
        //log3 n=(log3 2)*(log2 n)
        // 2^0 2^1 2^2 ...2^k ...2^x=n
        //O(logn)
    }

    //    int main(int argc, char* argv[]){
//        int i = 0;
//        int arr[3] = {0};
//        for(; i<=3; i++){
//            arr[i] = 0;
//            printf("hello world\n");
//        }
//        return 0;
//    }
    int main() {
        int a = 1;
        int ret = 0;
        int res = 0;
        ret = add(3, 5);
        res = a + ret;
        System.out.printf("%d", res);
        return 0;
    }

    int add(int x, int y) {
        int sum = 0;
        sum = x + y;
        return sum;
    }


    void test(int n) {
        for (int i = 0; i < n; n++) {
            logn(i);
        }
    }
    //O(nlogn)

    int test1(int m, int n) {
        int sum_1 = 0;
        int i = 1;
        for (; i < m; i++) {
            sum_1 = sum_1 + i;
        }
        int sum_2 = 0;
        int j = 1;
        for (; j < n; j++) {
            sum_2 = sum_2 + j;
        }
        return sum_1 + sum_2;
    }
    //O(m+n)

    int test2(int m, int n) {
        int sum_1 = 0;
        int i = 1;
        int j = 1;
        for (; i < m; i++) {
            for (; j < n; j++) {
                sum_1 = sum_1 + j;
            }
        }
        return sum_1;
    }
    //O(m*n)

    void print(int n) {
        int i = 0;
        int[] a = new int[n];
        for (; i < n; i++) {
            a[i] = i * i;
        }
        for (i = n - 1; i >= 0; --i) {
            System.out.println(a[i]);
        }
    }
    //空间复杂度：O(n)

}
