class Point {
	String id
	double x,y;

	//TODO add new variable
	String color;

	//TODO constructor
	
	public Point( String id, double x, double y, String color){
		this.id = id;
        	this.x = x;
        	this.y = y;
        	this.color = color;
	}

	//TODO setters and getters

	
	public void setId(String id){
		this.id=id;
	}
	public void setX(double x){
		this.x=x;
	}
	public void setX(double y){
		this.y=y;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getId(){
		return id;
	}
	public String getX() {
        	return x;
    	}
	public String getY() {
        	return y;
    	}
	public String getColor() {
        	return color;
    	}

	public void move (char xDirection, char yDirection) {
		//TODO
		if(xDirection=='L')
           	 x++;
        	else if(xDirection=='R')
           	 x++;
       	 	else if(yDirection=='U')
           	 y++;
        	else if(yDirection=='D')
           	 y++;
	}

	public void draw () {
		//TODO
		System.out.println("("+x+", "+y+")");
	}

	class Canvas{
		List<Point> tocka=new List<Point>();
		
		public void addPoint(Point tocka){
			tocka.add(tocka);
		}
		public void middle(){
			int middle=tocka.size();
			double x=0;
			double y=0;
			for (Point tmp: tocka){
				x+=tmp.getX();
				y+=tmp.getY();
			}
			double final_x=x/middle;
			double final_y=y/middle;

		}
		public void removePoint(Point tocka){
			tocka.remove(tocka);
		}

	}
}