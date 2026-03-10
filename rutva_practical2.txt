package pkg240760107168_rutva;


/**
 *
 * @author STUDENT
 */
import java.util.*;
public class practical2 {
    public static void main(String []args){
    double a ,b ,c, d, e, f;
    double D,Dx,Dy,x,y;
    
    Scanner input = new Scanner(System.in);
    Scanner n = new Scanner(System.in);
    System.out.println("enter a:");
    System.out.println("enter b:");
    System.out.println("enter c:");
    System.out.println("enter d:");
    System.out.println("enter e:");
    System.out.println("enter f:");
    
    a = n.nextDouble();
    b= n.nextDouble();
    c = n.nextDouble();
    d = n.nextDouble();
    e = n.nextDouble();
    f = n.nextDouble();
    
    System.out.println("a" + a);
    D = a*d - b*c;
    Dx = e*d - b*f;
    Dy = a*f - c*e;
    
    if(D!=0){
        
    
    x = Dx / D;
    y = Dy / D;
    }
    else{
        x=0;
        y=0;
    }
    
  
    
    System.out.println("x="+x+"and y="+y);
    
    
    
    
    }
    
    
    
}



enter a:
enter b:
enter c:
enter d:
enter e:
enter f:
2
3
56
70
45
50
a2.0
x=-107.14285714285714and y=86.42857142857143
BUILD SUCCESSFUL (total time: 20 seconds)
]

            
    
