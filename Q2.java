public class App
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Program 2 Start" );  
        
        romanToInt("");
                
        System.out.println( "End" );
    }
    
    public static int romanToInt(String s) {
        
        int answer = 0;
        
        for(int firstIndex=0; firstIndex<s.length(); firstIndex++){
            
            String number = s.charAt(firstIndex)+"";
            if("I".equals(number)&&(firstIndex+1)<s.length()){
                if("V".equals(s.charAt(firstIndex+1)+"")||"X".equals(s.charAt(firstIndex+1)+"")){
                    answer += cout(number+s.charAt(firstIndex+1));
                    firstIndex++;
                }else
                    answer += cout(number);                
            }
            else if("X".equals(number)&&(firstIndex+1)<s.length()){
                if("L".equals(s.charAt(firstIndex+1)+"")||"C".equals(s.charAt(firstIndex+1)+"")){
                    answer += cout(number+s.charAt(firstIndex+1));
                    firstIndex++;
                }else
                    answer += cout(number);  
            }
            else if("C".equals(number)&&(firstIndex+1)<s.length()){
                if("D".equals(s.charAt(firstIndex+1)+"")||"M".equals(s.charAt(firstIndex+1)+"")){
                    answer += cout(number+s.charAt(firstIndex+1));
                    firstIndex++;
                }else
                    answer += cout(number);                 
            }
            else{
                answer += cout(number);
            }
        }
        
        return answer;
    }
    
    private static int cout(String number){        
        switch(number){
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
            default:
                return 0;
        }        
    }
}
