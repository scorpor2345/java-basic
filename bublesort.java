import java .util.*;
public class  bubblesort{
public static void bubblesort(int arr[]){
for (int i=0;i<arr.length-1;i++){
 for(int j=0;j<arr.length-1-i;j++){
if(arr[j]>arr[j+1]){
//swap
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
}
//funtion for print array
public static void printArr(int arr[]){
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]+" ");
}
System.out.println();
}
public static void main (String args[]){
int arr[]={5,4,3,7,8,2};
bubblesort(arr);
printArr(arr);


}
}
