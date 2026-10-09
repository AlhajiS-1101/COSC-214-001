import java.util.Stack;

public class AlhajiStack {
    
    public static void main(String[] args) {
        Stack <String> heroes = new Stack<>();

        heroes.push("Iron Man");
        heroes.push("Hulk");
        heroes.push("Spider-Man");
        heroes.push("Captain America");
        heroes.push("Thor");

        while (!heroes.isEmpty()) {
            String top = heroes.peek();
            System.out.println(top);
            heroes.pop();
        }
            
        }   
}
