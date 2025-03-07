package interfaces;


    interface Jala_5 {
        void sameMethod();
    }
    
    
    interface Jala_05 {
        void sameMethod();
    }
    
   
    class TwoInterfaceSameMethod implements Jala_5, Jala_05 {
        @Override
        public void sameMethod() {
            System.out.println("crack the it job in a short time period");
        }
    
       
        public static void main(String[] args) {
            TwoInterfaceSameMethod if5 = new TwoInterfaceSameMethod();
            if5.sameMethod();
        }
    }
    

