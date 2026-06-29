package Array_ADT;

public class MergeArray {
    public static void main(String[] args){
        int[] A=new int[]{10,20,30,40,50,60,70,80,90,100};
        int[] B= new int[]{5,15,25,35,45,55,65,75,85,95};
        int[] C=new int[30];
        int i=0;
        int j=0;
        int k=0;
        int m=10,n=10;

        while(i<m && j<n){
            if(A[i]<B[j])
                C[k++]=A[i++];
            else
                C[k++]=B[j++];

        }
        while(i < m){
            C[k++] = A[i++];
        }

        while(j < n){
            C[k++] = B[j++];
        }
        for(int z=0;z<k;z++){
            System.out.print(C[z]+" ");
        }
    }
}
