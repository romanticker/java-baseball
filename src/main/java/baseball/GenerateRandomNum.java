package baseball;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class GenerateRandomNum { //랜덤숫자뽑기 기능
    public int randomMake(){
        int rannum = Randoms.pickNumberInRange(1, 9);
        return rannum;
    }

    public List<Integer> create(){
        List<Integer> computerNumber = new ArrayList<>();
        while (computerNumber.size() < 3){
            int randomNumber = randomMake();
            if(computerNumber.contains(randomNumber)){
                continue;
            }else {
                computerNumber.add(randomNumber);
            }
        }
        return computerNumber;
    }
}