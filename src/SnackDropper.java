public class SnackDropper {
    static String[] LocationArr = {"[침대]", "[베개 밑]", "[달래 계단]", "[커튼 밑]", "[달래 방석]", "[화장실 발매트]", "[옷방 러그]", "[2층 문 앞]"};
    static String[] droppedSnacks = new String[5];
    static int snackCount = 0;
    static int dropAllCount = 0;

    static SnackLimitChecker checker = new SnackLimitChecker();


    static void dropSnack() {
        String location;

        if (!checker.canDrop(snackCount)){
            System.out.println("더 이상 간식을 뿌릴 수 없습니다! 🙅🏻‍♀️");
            return;
        }

        do {
            location = getRandomLocation();
        } while (isDuplicateLocation(location));

        System.out.println("🍖 " + location + "에 간식을 뿌렸습니다!");

        droppedSnacks[snackCount] = location;
        snackCount++;
    }

    static void dropAllSnack(){
        if(!checker.canDrop(dropAllCount)){
            System.out.println("🐷 간식 파티는 오늘 여기까지! 꿀꿀 달래 멈춰! 🖐🏻  🐶💨");
            return;
        }

        for (String s : LocationArr) {
            snackCount++;
        }

        dropAllCount++;
        System.out.println("🌈 간식 파티 오픈! 모든 장소에 간식이 뿌려졌어요!! 🎉🍖");
    }



    static String getRandomLocation(){
        int randomIndex = (int)(Math.random() * LocationArr.length);
        return LocationArr[randomIndex];
    }

    static boolean isDuplicateLocation(String location){
        for (String droppedSnack : droppedSnacks) {
            if(droppedSnack != null && droppedSnack.equals(location)){
                return true;
            }
        }
        return false;
    }

}
