public class Dallae {
    static void moveDallae(){
        String location = SnackDropper.getRandomLocation();
        System.out.println("🐶 달래가 " + location + "에 갔다!");

        dallaeAction(location);
        eatSnack(location);
    }

    static void eatSnack(String location){
        double randomNum = Math.random();

        for (int i = 0; i < SnackDropper.droppedSnacks.length; i++){
            if (SnackDropper.droppedSnacks[i] != null && SnackDropper.droppedSnacks[i].equals(location)){

                if (randomNum <= 0.7) {
                    System.out.println("   -> 😏 냠냠! 달래가 간식을 먹었다!");
                    SnackDropper.droppedSnacks[i] = null;
                    SnackDropper.snackCount--;
                }else {
                    System.out.println("   -> 🍖🐶‼️ 간식을 무시하고 그냥 지나간다...");
                }
                return;
            }
        }

        System.out.println("   -> 간식이 없어 분노한 달래가 응아를 한다 💩");

    }

    static void dallaeAction(String location){
        switch (location) {
            case "[침대]" :
                System.out.println("   -> 😴 쏘옥~ 이불 속으로 들어가 버렸다!");
                break;

            case "[베개 밑]":
                System.out.println("   -> 🔍 킁킁... 뭔가 숨겨져 있는 것 같은데?!! 파바바박");
                break;

            case "[달래 계단]":
                System.out.println("   -> 🐕 터벅터벅... 계단을 타고 위아래로 왔다갔다");
                break;

            case "[커튼 밑]":
                System.out.println("   -> 🐣 촤악! 갑자기 튀어나와서 온 집안을 뛰어다닌다!");
                break;

            case "[달래 방석]":
                System.out.println("   -> 🧸 배를 보이고 데구르르~ 뒹굴뒹굴!");
                break;

            case "[화장실 발매트]":
                System.out.println("   -> 🐾 킁킁 여기서 발냄시가 나는 것 같은데!!?? 킁킁 킁킁");
                break;

            case "[옷방 러그]":
                System.out.println("   -> ☁️ 언니 냄새가 가득해! 기분 좋아");
                break;

            case "[2층 문 앞]":
                System.out.println("   -> 😯 엘베 소리 들리는데... 언니 왔어!? 문 앞에서 귀 쫑긋!");
                break;

            default:
                System.out.println("   -> 👀 흐음... 다음 목표물은!? 주변을 살핀다");
        }
    }
}

