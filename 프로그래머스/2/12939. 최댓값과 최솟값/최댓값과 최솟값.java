class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for(int i=1; i<arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        return min + " " + max;
    }
}