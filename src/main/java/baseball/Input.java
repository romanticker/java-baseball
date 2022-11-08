package baseball;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class Input {//랜덤으로 가져온 숫자 넣기
    public List<Integer> playerNumber(){
        System.out.println("숫자를 입력해주세요");
        //Scanner scanner = new Scanner(System.in);
        List<Integer> playerNum = new ArrayList<>();
        //String input = scanner.next();
        String input = readLine();

        for(String number: input.split("")){
            playerNum.add(Integer.parseInt(number));
        }
        return playerNum;
    }
}