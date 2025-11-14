public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        if (hallwayToClean == null) {
            this.hallway = new int[0];
        } else {
            this.hallway = new int[hallwayToClean.length];
            for (int i = 0; i < hallwayToClean.length; i++) {
                this.hallway[i] = Math.max(0, hallwayToClean[i]);
            }
        }
        this.position = startingPosition;
        this.isFacingRight = true;
    }

    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        this.hallway = hallway;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        if (getHallway().length - getPosition() == 1 || getPosition() == 0) {
            return true;
        }
        return false;
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        int[] hall = getHallway();
        int position = getPosition();
        if (hall[position] > 0) {
            hall[position]--;
            setHallway(hall);
            if (hall[position] > 0) {
                return;
            }
        }
        if (isFacingRight()) {
            if (position + 1 < hall.length) {
                setPosition(position + 1);
            } else {
                setFacingRight(false);
            }
        } else {
            if (position - 1 >= 0) {
                setPosition(position - 1);
            } else {
                setFacingRight(true);
            }
        }

    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        displayState();
        while (!hallIsClear()) {
            move();
            count++;
            displayState();
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        int[] hall = getHallway();
        for (int i = 0; i < hall.length; i++) {
            if (hall[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        // to-do: implement this method
        String theString = "";
        for (int num = 0; num < getHallway().length; num++) {
            theString += getHallway()[num] + " ";
        }
        System.out.println(theString);
        if (isFacingRight() == true) {
            System.out.println("  >");
        } else {
            System.out.println("  <");
        }
    }
}
