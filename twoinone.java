package interfaces;

    interface Jala_4 {
        void methodOne();
    }
    
  
    interface Jala_04 {
        void methodTwo();
    }
    

    public class twoinone implements Jala_4, Jala_04 {
        @Override
        public void methodOne() {
            System.out.println("love on mothe and father");
        }
    
        @Override
        public void methodTwo() {
            System.out.println("mother and fater are real gods");
        }
    
  
        public static void main(String[] args) {
            twoinone if4 = new twoinone();
        
            if4.methodOne();
            if4.methodTwo();
        }
    }
    

