public class SnackLimitChecker {
    public boolean canDrop(int snackCount){
        return snackCount < 5;
    }

    public boolean canDropAll(int dropAllCount){
        return dropAllCount < 2;
    }
}
