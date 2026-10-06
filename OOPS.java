class Calculator {
    int a;  //variable

    public int add(int n1, int n2){   // method
        int r = n1 + n2;
        return r;
    }

    
}



public class OOPS {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        Calculator cal = new  Calculator();  // object
        int result = cal.add(4,5);

        
        
        // int result = num1+num2;
        System.out.println(result);

        
    }
    
}


// Object oriented programming
// Object - Properties and behaviour
// to created object JVM(java) need Class file