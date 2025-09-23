public class Arrays1 {
    public static void main(String[] args) {


        int matrix[][]={
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        // Your code goes her
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    for(int k=0;k<matrix.length;k++){
                        matrix[i][k]=-1;
                        matrix[k][j]=-1;
                    }
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

