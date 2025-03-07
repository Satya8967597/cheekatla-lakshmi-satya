package interfaces;


    public interface publicin {
       
        int num = 154; 
    
        public void myMethod();
    }
    
   
    class Jala_08 implements publicin {
        @Override
        public void myMethod() {
            System.out.println("This is a satya mohan");
        }
    
       
        public static void main(String[] args) {
            Jala_08 j = new Jala_08();
          
            System.out.println(num);
       
            j.myMethod();
        }
    }
    

