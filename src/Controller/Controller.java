package Controller;

import Model.Info;
import View.View;
import java.util.ArrayList;



public class Controller {
    ArrayList<Info> todos ;
    View view;

    public Controller(View view){
        this.todos = new ArrayList<>();
        this.view = view;
    }

    public void  addTodo(){
        Info newTodo = new Info(view.adewh(),false);
        todos.add(newTodo);
        view.added();
    }

    public void showList(){
        if(todos.isEmpty()){
            view.printEmpty();;
        }

        else {
            view.printList(todos);
        }
    }

    public void editTodo(){
        showList();
        int choice;
        int index = view.inputIndex()-1;
        choice = view.choice();

        if(choice==1) todos.get(index).setName(view.inputNewName());

        else todos.get(index).setDoneornot(!todos.get(index).isDoneornot());

        view.editcom();

    }

    public void deletetodo(){
        showList();
        int index = view.getDeleteNum()-1;
        String de = todos.get(index).getName();
        todos.remove(index);
        view.deletsuce(de);



    }




}
