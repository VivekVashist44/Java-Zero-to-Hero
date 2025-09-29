// Brute Force

// public class Arrays1 {

//     public static void markRow(int [][] matrix,int m,int n,int i){
//         for(int j=0;j<m;j++){
//             for(int k=0;k<n;k++){
//                 if(j==i){
//                     matrix[j][k] =-1;
//                 }
//             }
//         }
//     }
//     public static void markColumn(int[][] matrix, int m, int n, int i){
//         for(int j=0;j<m;j++){
//             for(int k=0;k<n;k++){
//                 if(k==i){
//                     matrix[j][k] =-1;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {


//         int matrix[][]={
//             {1,0}
//             // {1,0,1},
//             // {1,1,1}
//         };
//         // Your code goes her
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 if (matrix[i][j] == 0) {
//                     markRow(matrix,matrix.length,matrix[i].length,i);
//                     markColumn(matrix, matrix.length, matrix[i].length, j);
//                 }
//             }
//         }

//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[i].length;j++){
//                 if(matrix[i][j]==-1){
//                     matrix[i][j]=0;
//                 }
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Time Complexity optimized

// public class Arrays1 {

//     public static void main(String []args){
//         int matrix[][]={
//             {1,1,1},
//             {1,0,1},
//             {1,1,1}
//         };

//         int [] row=new int[matrix.length];
//         int [] column =new int[matrix[0].length];

//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[i].length;j++){
//                 if(matrix[i][j] == 0){
//                     row[i]=1;
//                     column[j]=1;
//                 }
//             }
//         }

//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[i].length;j++){
//                 if(row[i]==1 || column[j]==1){
//                     matrix[i][j]=0;
//                 }
//                 System.out.print(matrix[i][j]);
//             }
//             System.out.println();
//         }

//     }

// }

// Space Complexity Optimized

public class Arrays1{
    public static void main(String []args){
        int matrix[][]={
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };

        // row[m] =matrix[..][0]
        // col[n] =matrix[0][..]
        int col0=1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    //col update
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                    //row update
                    matrix[i][0]=0;
                }
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j]!=0){
                    if(matrix[0][j]==0 || matrix[i][0]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0; 
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}