package baseball;
public class Application {
    public static void main(String[] args) {
        GenerateRandomNum randomNum = new GenerateRandomNum(); //랜덤숫자뽑기
        Input input = new Input();//
        Judge judge = new Judge();
        Playagain playagain = new Playagain();
        boolean again = true;

        while (again) {
            List<Integer> computer = randomNum.create();
            String result = "";
            while (!result.equals("3스트라이크")) {
                result = judge.judgement(computer, input.playerNumber());
                System.out.println(result);
            }
            again = playagain.playagain();
        }
    }
}