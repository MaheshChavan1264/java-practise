
class HelloWorld {
    public static void main(String[] args) {
        int e;
        for(e=1;e<=10;e++){
            if(e>5){
                continue;
            }
        }
        
        for(int s=0;s<e;s++){
            e--;
            System.out.print(s+" "+e+" ");
            if(e<8){
                break;
            }
        }
    }
}