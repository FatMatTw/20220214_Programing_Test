public class App
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Program 1 Start" );  
        
        getAnswer(null, null);
                
        System.out.println( "End" );
    }
    
    private static int[] getAnswer(Integer target, int[] nums) {
    	int[] answer = new int[2];
    	boolean isGetAns = false;
    	
    	for(int oneIndex=0; oneIndex<nums.length; oneIndex++) {
    		for(int twoIndex=oneIndex+1; twoIndex<nums.length; twoIndex++) {
    			if(nums[oneIndex] + nums[twoIndex] == target) {
    				answer[0] = oneIndex;
    				answer[1] = twoIndex;
    				isGetAns = true;
    				break;
    			}    				
    		}
    		if(isGetAns) break;
    	}    	
    	return answer;
    }
}