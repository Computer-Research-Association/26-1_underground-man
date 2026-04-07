import View.View;
import Controller.Controller;

public class  Main {
    public static void main(String[] args){
        View view = new View();
        Controller controller = new Controller(view);

        int choice;
        do {
            view.showlist();
            choice = view.getNumbers();

            if (choice == 1) controller.showList();
            else if (choice == 2) controller.addTodo();
            else if (choice == 3) controller.editTodo();
            else if (choice == 4) controller.deletetodo();



        }while (choice !=5);



    }
}