class Ball {
private double xPos, yPos, deltaSec;
private double alpha, v;
private double yVel, xVel;
private static final double gravity = -9.81;

public Ball(double xPos){
    this.xPos=xPos;
    yPos=0;
}

public Point move(double deltaSec){
    xPos += xVel*deltaSec;
    yPos += yPos*deltaSec;
    return new Point();
}

public void yVel(){
    yVel=v*Math.sin(alpha)*(deltaSec*gravity);
}

public void xVel(){
    xVel=v*Math.cos(alpha);
}

public Point getLocation(double xPos, double yPos){
    return new Point();
}

public void setAngle(double aplha){
    this.alpha=alpha;
}

public void setVel(double v){
    this.v=v;
}

public ArrayList<Point> shoot = new ArrayList<Point>();
{
    while(deltaSec<60){
        move(deltaSec);
        shoot.add(getLocation(xPos, yPos));
        deltaSec++;
    }
}
}
