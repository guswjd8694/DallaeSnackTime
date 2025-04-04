public class SnackDrop {
    static String[] LocationArr = {"[침대]", "[베개 밑]", "[달래 계단]", "[커튼 밑]", "[달래 방석]", "[화장실 발매트]", "[옷방 러그]", "[2층 문 앞]"};
    static String[] droppedSnacks = new String[5];
    static int snackCount = 0;


    static void dropSnack() {
        String location;

        if (snackCount >= 5){
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
