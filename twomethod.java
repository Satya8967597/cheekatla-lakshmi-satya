package interfaces;

    interface Jala_02 {
        void methodOne();
    
        void methodTwo();
    }
    
    public class twomethod implements Jala_02 {
       
        @Override
        public void methodOne() {
            System.out.println("lakshmi satya");
        }
    
        @Override
        public void methodTwo() {
            System.out.println("mohan");
        }
    
     
        public static void main(String[] args) {
            twomethod if2 = new twomethod();
            //Calling the methods implemented
            if2.methodOne();
            if2.methodTwo();
        }
       
    }
    

