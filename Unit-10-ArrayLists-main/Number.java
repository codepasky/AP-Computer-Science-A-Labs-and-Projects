//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

//write the Number class
//use the handout and
//sample runner code
//to guide you

public class Number {

    private int num;

    public Number(int num) {
        this.num = num;
    }

    public boolean isOdd(){
        return num % 2 != 0;
    }

    public boolean isPerfect(){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }

    public String toString(){
        return "" + num;
    }
}