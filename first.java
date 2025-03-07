package interfaces;

    interface Jala_01 {
    
        void oneMethod();
    }
    
    public class first implements Jala_01 {
        @Override
        public void oneMethod() {
            System.out.println("it's a beautiful day");
        }
    
        public static void main(String[] args) {
            first  if1 = new first();
     
            if1.oneMethod();
        }
    }
    

