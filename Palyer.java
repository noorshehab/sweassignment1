public class Player{
    // Decleartion The Name
    protected String Name;
    // Decleartion The Symbol
    protected char Symbol;
    // Decleartion The Constructor
    public Player(String n , char S){
        Name = n;
        Symbol = S;
    }
    // Get The Owen Symbol
    public char Get_Symbol() {
        return Symbol;
    }
    // Get The Owen Name
    public String Get_Name(){
        return Name;
    }
    // The Player Moving
    public void Get_move(int x , int y){

    }
    public static void main(String [] args){
        // P1 Decleartion
        Player P1 = new Player("Zain" , 'X');
        // P2 Decleartion
        Player P2 = new Player("Younes" , 'O');
        System.out.println(P1.Get_Name());
        System.out.println(P1.Get_Symbol());
        System.out.println(P2.Get_Name());
        System.out.println(P2.Get_Symbol());
    }
}