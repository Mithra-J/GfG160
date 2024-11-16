class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int lar=arr[0];
        int sec=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>lar){
                sec=lar;
                lar=arr[i];
            }
            else if(arr[i]<lar&&arr[i]>sec){
                sec=arr[i];
            }
        }
        return sec;
    }
}
