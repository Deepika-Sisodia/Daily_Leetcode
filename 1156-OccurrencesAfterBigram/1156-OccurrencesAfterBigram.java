// Last updated: 7/31/2025, 2:07:16 PM
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        int count = 0;
        for(int i=0; i<arr.length-2; i++){
            if(arr[i].equals(first) && arr[i+1].equals(second)){
                count++;
            }
        }
        String[] result = new String[count];
        int idx = 0;
        for(int i=0; i<arr.length-2; i++){
            if(arr[i].equals(first) && arr[i+1].equals(second)){
                result[idx++] = arr[i+2];
            }
        }
        return result;
    }
}