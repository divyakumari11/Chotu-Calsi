package practise2BArraylistA;
import java.math.*;
import java.util.*;
public class OrderOfOperations {
	ArrayList<String> contents;
    String item;
    String ex;
    OrderOfOperations check;
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Expression: ");
        String a = input.nextLine();//takes the input string 
        OrderOfOperations go = new OrderOfOperations();
        a = go.brackets(a);
        System.out.println("Result of the given expression is: "+a);//it will hold the answer(output string) at the end of execution//
    }
    public String brackets(String s){             //method which deal with brackets separately
        check = new OrderOfOperations();
        while(s.contains(Character.toString('('))||s.contains(Character.toString(')'))){
            for(int o=0; o<s.length();o++){
                try{                                                        //i there is not sign
                    if((s.charAt(o)==')' || Character.isDigit(s.charAt(o))) //between separate brackets
                            && s.charAt(o+1)=='('){                         //or number and bracket,
                        s=s.substring(0,o+1)+"*"+(s.substring(o+1));        //it treat it as
                    }                                                       //a multiplication
                }catch (Exception ignored){}                                //ignore out of range ex
                if(s.charAt(o)==')'){                                  //search for a closing bracket
                    for(int i=o; i>=0;i--){
                        if(s.charAt(i)=='('){                          //search for a opening bracket
                            String in = s.substring(i+1,o);
                            in = check.recognize(in);
                            s=s.substring(0,i)+in+s.substring(o+1);
                            i=o=0;
                        }
                    }
                }
            }
            if(s.contains(Character.toString('('))||s.contains(Character.toString(')'))||
                    s.contains(Character.toString('('))||s.contains(Character.toString(')'))){
                System.out.println("Error: incorrect brackets placement");
                return "Error: incorrect brackets placement";
            }
        }
        s=check.recognize(s);
        return s;
    }
    public String recognize(String s){              //method divide String on numbers and operators
        PutIt putIt = new PutIt();
        contents = new ArrayList<String>();         //holds numbers and operators
        item = "";
        for(int i=s.length()-1;i>=0;i--){           //is scan String from right to left,
            if(Character.isDigit(s.charAt(i))){     //Strings are added to list, if scan finds
                item=s.charAt(i)+item;              //a operator, or beginning of String
                if(i==0){
                    putIt.put();
                }
            }else{
                if(s.charAt(i)=='.'){
                    item=s.charAt(i)+item;
                }else if(s.charAt(i)=='-' && (i==0 || (!Character.isDigit(s.charAt(i-1))))){
                    item=s.charAt(i)+item;          //this part should recognize
                    putIt.put();                    //negative numbers
                }else{
                    putIt.put();                //it add already formed number and
                    item+=s.charAt(i);          //operators to list
                    putIt.put();                //as separate Strings
                if(s.charAt(i)=='|'){       //add empty String to list, before "|" sign,
                        item+=" ";          //to avoid removing of any meaningful String
                        putIt.put();        //in last part of result method
                    }
                }
            }
        }
        contents = putIt.result(contents, "^", "|");    //check Strings
        contents = putIt.result(contents, "*", "/");    //for chosen
        contents = putIt.result(contents, "+", "-");    //operators
        return contents.get(0);
    }
    public class PutIt{
        public void put(){
            if(!item.equals("")){
                contents.add(0,item);
                item="";
            }
        }
        public ArrayList<String>result(ArrayList<String> arrayList, String op1, String op2){
            int scale = 10;                              //controls BigDecimal decimal point accuracy
            BigDecimal result = new BigDecimal(0);
            for(int c = 0; c<arrayList.size();c++){
                if(arrayList.get(c).equals(op1)|| arrayList.get(c).equals(op2)){
                    if(arrayList.get(c).equals("^")){
                        result = new BigDecimal(arrayList.get(c-1)).pow(Integer.parseInt(arrayList.get(c+1)));
                    }else if(arrayList.get(c).equals("|")){
                        result = new BigDecimal(Math.sqrt(Double.parseDouble(arrayList.get(c+1))));
                    }else if(arrayList.get(c).equals("*")){
                        result = new BigDecimal(arrayList.get(c-1)).multiply
                                (new BigDecimal(arrayList.get(c+1)));
                    }else if(arrayList.get(c).equals("/")){
                        result = new BigDecimal(arrayList.get(c-1)).divide
                                (new BigDecimal(arrayList.get(c+1)),scale,BigDecimal.ROUND_DOWN);
                    }else if(arrayList.get(c).equals("+")){
                        result = new BigDecimal(arrayList.get(c-1)).add(new BigDecimal(arrayList.get(c+1)));
                    }else if(arrayList.get(c).equals("-")){
                        result = new BigDecimal(arrayList.get(c-1)).subtract(new BigDecimal(arrayList.get(c+1)));
                    }
                    try{       //in a case of to "out of range" ex
                        arrayList.set(c, (result.setScale(scale, RoundingMode.HALF_DOWN).
                                stripTrailingZeros().toPlainString()));
                        arrayList.remove(c + 1);            //it replace the operator with result
                        arrayList.remove(c-1);              //and remove used numbers from list
                    }catch (Exception ignored){}
                }else{
                    continue;            
                }
                c=0; //loop reset, as arrayList changed size
                
            }
            return arrayList;
            
             }
        
        
    }
    
}

