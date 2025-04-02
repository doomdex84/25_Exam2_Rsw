package org.example;

import org.util.CurrentDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc = new Scanner(System.in);
    CurrentDateTime currentDateTime = new CurrentDateTime();

    public App() {
        Motivation motivation = null;
    }

    public void run() {

        System.out.println("==Motivation 실행==");

        int lastId = 0;

       while (true) {
           System.out.print("명령어) ");
           String cmd= sc.nextLine();

           if (cmd.equals("exit")) {
               break;
           }
           if(cmd.equals("add")) {
               int id = lastId + 1;
               System.out.printf("명언 : ");
               String body = sc.nextLine();
               System.out.printf("작가 : ");
               String source = sc.nextLine();
               String regdate = sc.nextLine();
               System.out.println(id + "번 명언이 등록되었습니다.");

               List<Motivation>motivations = new ArrayList<>();
               motivations.add(new Motivation(id, body, source,regdate));

               lastId++;

           }else if (cmd.equals("list")) {
               System.out.print("   번호    /   작가   /    명언    \n");
               System.out.println("=".repeat(40));





           }else if (cmd.startsWith("detail")){
               lastId = Integer.parseInt(cmd);
//               if (cmd.split(2)) {
//                   System.out.println("%d번 명언은 존재하지 않습니다.",lastId);
//                    continue;
//               }

               System.out.printf("명언(기존) : ");
               System.out.printf("작가(기존) : ");
               System.out.println("날짜 : ");
               System.out.printf("명언 : ");
               String newbody = sc.nextLine();
               System.out.printf("작가 : ");
               String newsource = sc.nextLine();

               List<Motivation>motivations = new ArrayList<>();


               System.out.println(lastId+ "명언이 수정되었습니다.");
           }
           else if (cmd.startsWith("modify")){
               lastId = Integer.parseInt(cmd);
//               if (cmd.split(2)) {
//                   System.out.println("%d번 명언은 존재하지 않습니다.",lastId);
//                   continue;
//               }

               System.out.printf("명언(기존) : ");
               System.out.printf("작가(기존) : ");
               System.out.printf("명언 : ");
               String newbody = sc.nextLine();
               System.out.printf("작가 : ");
               String newsource = sc.nextLine();


               List<Motivation>motivations = new ArrayList<>();


               System.out.println(lastId+ "명언이 수정되었습니다.");
           }else if (cmd.startsWith("delete")){
               lastId = Integer.parseInt(cmd);

//               if (cmd.split(2)) {
//                   System.out.println("%d번 명언은 존재하지 않습니다.",lastId);
//                   continue;
//               }
//               Motivation.remove(motivation);

           }


       }
        System.out.println("==Motivation 종료==");


    }

}
class Motivation {
    private int id;
    private String body;
    private String source;
    String regdate;


    public Motivation(int id, String body, String source, String regdate) {
        this.id = id;
        this.body = body;
        this.source = source;
        this.regdate = regdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}