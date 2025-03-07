package interfaces;

    interface Jala_7 {
        void methodOne();
    }
    
   
    interface Jala_07 extends Jala_7 {
        void methodTwo();
    }
    
    class InheritedInterface implements Jala_07 {
        
        @Override
        public void methodOne() {
            System.out.println("love your self");
        }
     
        @Override
        public void methodTwo() {
            System.out.println("love other self");
        }
    
        public static void main(String[] args) {
           
            InheritedInterface if7 = new InheritedInterface();
           
            if7.methodOne();
            if7.methodTwo();
        }
    }
    

