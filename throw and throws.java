class Test{
    void div(int a ,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[]args){
        Test t1 = new Test();
        try{
            t1.div(12,0);
        }
        catch(Exception e){
            System.out.println("The value of b is zero");
        }

    }
 }