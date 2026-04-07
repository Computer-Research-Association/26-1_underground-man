package View;

import java.util.Scanner;
import Model.Info;
import java.util.ArrayList;

public class View{
    Scanner sc = new Scanner(System.in);
    public void showlist(){
        System.out.printf("=====TODO LIST=====\n1. 목록보기 \n2. 생성\n3. 수정\n4. 삭제\n5. 종료");
    }

    public int getNumbers(){
        int num;
        System.out.println("메뉴를 선택하세요: ");
        num = sc.nextInt();
        sc.nextLine();
        return num;
    }

    public String adewh(){
        System.out.println("추가 할 일 내용을 입력하세요");
        return sc.nextLine();
    }

    public void added(){
        System.out.println("할 일이 추가되었습니다.");
    }

    public void printEmpty(){
        System.out.println("할 일이 없습니다.");
    }

    public void printList(ArrayList<Info> todos){
        System.out.println("[todo list]");
        for (int i=0;i<todos.size();i++){
            System.out.printf("%d. %s [%s]\n",i+1,todos.get(i).getName(),todos.get(i).isDoneornot() ? "완료" : "미완료");
        }
    }

    public int inputIndex(){
        int get;
        System.out.println("수정할 번호를 입력하세요");
        get = sc.nextInt();
        return  get;
    }

    public int choice(){
        int get;
        System.out.println("1. 내용 수정\n2. 완료 상태 변경\n선택하세요: ");
        get = sc.nextInt();
        sc.nextLine();
        return get;
    }

    public void editcom(){
        System.out.println("변경되었습니다.");
    }

    public String inputNewName(){
        String name;
        System.out.println("새 이름을 입력하세요");
        name = sc.nextLine();
        return name;
    }

    public int getDeleteNum(){
        System.out.println("삭제할 번호를 입력하세요: ");
        return sc.nextInt();

    }

    public void deletsuce(String name){
        System.out.printf("'%s'항목이 삭제 되었습니다 ",name);
    }





}