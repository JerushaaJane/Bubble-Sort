public class MyClass {
    static int[] bubblesort(int[]a){
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String args[]) {
      int[]a={23,2,67,1,100};
      int[]b=new int[a.length];
      b=bubblesort(a);
      for(int i=0;i<b.length;i++){
          System.out.println(b[i]);
      }
    }
}
