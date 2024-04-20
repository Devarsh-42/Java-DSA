public class BinarySearch {
    public static int Binary(int numbers[],int key){
        int start = 0;
        int end = (numbers.length)-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(numbers[mid]>key){  //Left Half
                end = mid-1;
            }
            else if(numbers[mid]<key){ //Right Half
                start = mid+1;
            }else{ //numbers[mid]==key hence, FOUND
                return mid;
            }

        }
        return -1;
    }
    public static void main(String arg[]){
            int numbers[]={1,2,3,4,8,9,933,44};
            int key = 9;
        System.out.println("Index for key "+key+" is : "+Binary(numbers,key));
    }
}
