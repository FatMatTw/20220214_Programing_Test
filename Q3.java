public class App
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Program 3 Start" );  
        
        merge(null, null);
                
        System.out.println( "End" );
    }
    
    public ListNode merge(ListNode ln1, ListNode ln2) {
        if (null == ln1 && null == ln2)
            return null;
        else if (null != ln1 && null == ln2)
            return ln1;
        else if (null == ln1 && null != ln2)
            return ln2;

    	ListNode answer = new ListNode();
	
    	while(null != ln1 || null != ln2) {
    		if (ln1.val < ln2.val) {
    			answer.next = new ListNode(ln1.val);
    			ln1 = ln1.next;
    		} 
    		else if (ln1.val > ln2.val ) {
    			answer.next = new ListNode(ln2.val);
    			ln2 = ln2.next;
    		} 
    		else if (null != ln1) {
    			answer.next = new ListNode(ln1.val);
    			ln1 = ln1.next;
    		}
    		else if (null != ln2) {
    			answer.next = new ListNode(ln2.val);
    			ln2 = ln2.next;
    		}
    		else
    			continue;
    	}
    	return answer;
    }    
}
