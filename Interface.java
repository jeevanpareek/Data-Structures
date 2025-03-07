// interface A{
//     void show();
// }
// class B implements A{
//    public void show(){
//     System.out.println("Hello");
//    }
// }





// abstract class A{
//     abstract void show();
//     A (){
//         System.out.println("hello hello");
//     }
//     private void show1(){
//         System.out.println("Jeevan");
//     }
//     public void show2(){
//         this.show1();
//         show1();
//     }
// }

// class B extends A{
//     public void show(){
//         System.out.println("Hello");
//     }
// }
// public class Interface{
//     public static void main(String[] args) {
//       A p = new B();
//       p.show();
//       p.show2();
//     }
// }



// abstract class A{
//     abstract void show();
// }

// public class Interface{
//     public static void main(String[] args) {
//         A p = new A() {
//             public void show(){
//                 System.out.println("hii");
//             } 
//         };
//         p.show();
//     }
// }


//multiple inheritace 

class A{
    static int a = 20;
    // void show(){
    //     System.out.println(a);

    // }

}
public class Interface{
    public static void main(String[] args) {
        // 
        System.out.println(A.a);
    }
}