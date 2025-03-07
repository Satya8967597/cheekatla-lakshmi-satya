package interfaces;

    interface Jala_09 {

        public int n1 = 11;
        static final int n2 = 22;
        final int n3 = 33;
    }
    
    class privatein implements Jala_09 {
    
        public static void main(String[] args) {
            privatein if9 = new privatein();
            System.out.println(if9.n1 + " " + if9.n2);
        }
   
    }
    

