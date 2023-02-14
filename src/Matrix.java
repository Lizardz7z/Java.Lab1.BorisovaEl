public class Matrix {
    private int str;
    private int stl;
    private ComplexNumb [][] matrix;

    public Matrix(int n, int m){
        try {
            this.str = n;
            this.stl = m;
            this.matrix = new ComplexNumb[n][];
            for (int i = 0; i < n; i++) {
                this.matrix[i] = new ComplexNumb[m];
                for (int j = 0; j < m; j++) {
                    this.matrix[i][j] = new ComplexNumb();
                }
            }
        }catch (NegativeArraySizeException e){
            System.out.println("Sizes of matrix cannot be negative. Matrix is empty");
        }
    }
    public Matrix(int n){
        try {
            this.str = n;
            this.stl = n;
            this.matrix = new ComplexNumb[n][n];
            for (int i = 0; i < n; i++) {
                this.matrix[i] = new ComplexNumb[n];
                for (int j = 0; j < n; j++) {
                    this.matrix[i][j] = new ComplexNumb();
                }
            }
        }catch (NegativeArraySizeException e){
            System.out.println("Sizes of matrix cannot be negative. Matrix is empty");
        }
    }

    public void setMatrix() {
        for (int i=0;i<this.str;++i){
            for (int j=0;j<this.stl;++j){
                this.matrix[i][j].setComlexNumber();
            }
        }
    }
    public void PrintMatrix(){
        for (int i=0;i<this.str;++i){
            for (int j=0;j<this.stl;++j){
                this.matrix[i][j].Print();
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public Matrix addMatrix(Matrix mat2){
        if (this.str==mat2.str && this.stl== mat2.stl){
            Matrix newmat=new Matrix(mat2.str, mat2.stl);
            for (int i=0;i<this.str;++i){
                for (int j=0;j<this.stl;++j){
                    newmat.matrix[i][j]=this.matrix[i][j].add(mat2.matrix[i][j]);
                }
            }
            return newmat;
        }
        else{
            System.out.println("Sizes of matrix are not equal. The initial matrix was returned");
            return this;
        }
    }
    public Matrix transpone(){
        Matrix newmat=new Matrix(this.stl, this.str);
        for (int i=0;i<this.str;++i) {
            for (int j = 0; j < this.stl; ++j) {
                newmat.matrix[j][i] = this.matrix[i][j];
            }
        }
        return newmat;
    }
    public Matrix MultMatrix(Matrix mat2){
        if (this.stl==mat2.str){
            Matrix newmat=new Matrix(this.str, mat2.stl);
            for (int a=0;a<this.str;++a) {
                for (int b = 0; b < mat2.stl; ++b) {
                    for (int i = 0; i < this.stl; ++i) {
                        newmat.matrix[a][b]=newmat.matrix[a][b].add(this.matrix[a][i].multiply(mat2.matrix[i][b]));
                    }
                }
            }
            return newmat;
        }
        else{
            System.out.println("Incompatible sizes of matrix. Initial matrix is returned");
            return this;
        }
    }
}
