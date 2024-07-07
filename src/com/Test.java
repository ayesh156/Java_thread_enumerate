package com;

public class Test {
    public static void main(String[] args) {
        ThreadGroup tg = Thread.currentThread().getThreadGroup();
        
        ThreadGroup tg1 = new ThreadGroup("XYZ");
        
        ThreadGroup tg2 = new ThreadGroup(tg1,"ABC");
        
        ThreadGroup system = tg.getParent();

//        ThreadGroup[] groups = new ThreadGroup[10];
//        
//        int enumerate = system.enumerate(groups,false);
//       
//        for (int i = 0; i < enumerate; i++) {
//            System.out.println(groups[i]);
//        }
        
        Thread[] threads = new Thread[10];
        
        int enumerate = system.enumerate(threads,false);
        
        for (int i = 0; i < enumerate; i++) {
            System.out.println(threads[i]);
        }
       
//        for(Thread thread : threads){
//            System.out.println(thread);
//        }
        
    }
}
