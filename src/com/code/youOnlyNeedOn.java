package com.code;
//You will be given an array a and a value x. All you need to do is check
// whether the provided array contains the value.
//
//        Array can contain numbers or strings. X can be either.
//
//        Return true if the array contains the value, false if not.
public class youOnlyNeedOn {
    public static boolean check(Object[] a, Object x) {
        for(Object obj : a){
            if(obj.equals(x)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(check(new Object[] {66, 101}, 66));
        System.out.println(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
//                assertEquals(Solution.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
//                assertEquals(Solution.check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
            }
    }

