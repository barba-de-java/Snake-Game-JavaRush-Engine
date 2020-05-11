public enum Direction {
    UP, RIGHT, DOWN, LEFT;

    public Direction getOpposite(){
        switch (this){
            case UP:
                return DOWN;
            case DOWN:
                return UP;
            case LEFT:
                return RIGHT;
            case RIGHT:
                return LEFT;
            default: //This will never happen
                return null;
        }
    }
}