public class Die {
    private int numDots;

    public Die(){
        numDots=0;


    }
    public void roll(){
        numDots= (int) (Math.random() * 6) +1;

    }




    public int getNumDots(){
        System.out.println(numDots);
        return numDots;

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
    }

}
