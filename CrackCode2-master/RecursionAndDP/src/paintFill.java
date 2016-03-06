
public class paintFill {
	
	enum Color {
		Black, White, Red, Yellow, Green		
	}
	
	public static boolean paintFillRec(Color[][] screen, int x, int y, Color ocolor, Color ncolor){
		
		if(x < 0 || x >= screen[0].length ||
		   y < 0 || y >= screen.length){
			return false;
		}
		
		if(screen[y][x] == ocolor){
			screen[y][x] = ncolor;
			paintFillRec(screen, x - 1 , y,ocolor, ncolor);
			paintFillRec(screen, x + 1 , y,ocolor, ncolor);
			paintFillRec(screen, x  , y -1, ocolor, ncolor);
			paintFillRec(screen, x ,  y + 1,ocolor, ncolor);
		}
		return true;
			
	}
	
	public static boolean paintFill(Color[][] screen, int x, int y, Color ncolor){
		if(screen[y][x] == ncolor){
			return false;
		}
		return paintFillRec(screen, x, y, screen[y][x], ncolor);
	}

}
