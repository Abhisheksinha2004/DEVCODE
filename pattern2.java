// // public class pattern2{
// //     public static void main(String[] args)
// //     {
// //         int n=4;
// //         int num=1;
// //         for(int i=0;i<n;i++)
// //         {
// //           for(int j=0;j<i+1;j++)
// //           {
// //             System.out.print(num +" ");
// //           }
// //           System.out.println();
// //             num++;
//         }
    //     public class pattern2{
    //         public static void main(String[] args)
    //         {
    //             int n=4;
    //           int num;
    //           for(int i=0;i<n;i++)
    //           {
    //             num=1;
    //             for(int j=0;j<i+1;j++)
    //             {
    //                 System.out.print(num +" ");
    //                 num++;
                    
    //             }
    //             System.out.println();

    //           }
    //         }
        
    // }

            public class pattern2{
            public static void main(String[] args)
            {
                int n=5;
              int num;
              for(int i=0;i<n;i++)
              {
                
                for(int j=0;j<n-i-1;j++)
                {
                    System.out.print(" ");
                }
                for(int k=0;k<i+1;k++)
                {
                    System.out.print(+(i+1));
                }
                    System.out.println();
                    
                }
                
                
              }
            }
        
    

