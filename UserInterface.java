import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;


public class UserInterface {

    private Scanner scanner;
    private RecipeList recipeList;

    public UserInterface(Scanner scanner, RecipeList recipeList) {
        this.scanner = scanner;
        this.recipeList = recipeList;
    }

    public void start() {
        readFile();
        listCommands();
        readCommand();
    }

    public void readFile() {

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(fileName))) {

            while (scan.hasNextLine()) {

                int i = 0;
                String name = "";
                int cookingTime = 0;
                String ingredientList = "";
                
                while (true) {
                    String line = scan.nextLine();

                    if (i==0) {
                        name = line;
                    }
                    if (i==1) {
                        cookingTime = Integer.valueOf(line);
                    }
                    if (i>1) {
                        ingredientList = ingredientList + line + " ";
                    }
                    if (line.isEmpty()) {
                        recipeList.add(new Recipe(name, cookingTime, ingredientList));
                        break;
                    }

                    i++;

                }

            }

        } catch (Exception e) {
            System.out.println("Failed reading the file.");
        }

    }

    public void listCommands() {
        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
    }

    public void readCommand() {
        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();
    
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                recipeList.printList();
            }
    
        }
    }
    
}
