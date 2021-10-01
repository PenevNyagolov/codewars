package com.code;

public class schoolPaperwork {
    public static int paperWork(int n, int m)
        {
            if(n < 0 || m < 0){
                return 0;
            }else {
                return n * m;
            }
        }

        public static void main(String[] args) {
            System.out.println(paperWork(5,5));
        }
}
