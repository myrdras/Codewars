import java.util.*;
public class Simple_Drawing_Board{
	public static void main(String[] args) {
		Canvas c = new Canvas(5, 5);
		c.draw(0, 2, 4, 2).draw(2, 0, 2, 4);
		System.out.println(c.drawCanvas() ); 
	}
	//class Canvas
	String[] canvas;
	int width, height;

	public Canvas(int width, int height) {
		if (width < 0 || height < 0) 
			throw new IllegalArgumentException();
		this.width = width;
		this.height = height;
		canvas = new String[height + 2];
		Arrays.fill(canvas, "");
		for (int w = 0; w < width + 2; w++) {
			canvas[0] += "-";
		}
		for (int h = 1; h < height + 1; h++) {
			canvas[h] += "|";
			for (int w = 0; w < width; w++) {
				canvas[h] += " ";
			}
			canvas[h] += "|";
		}
		for (int w = 0; w < width + 2; w++) {
			canvas[height+1] += "-";
		}
	}

	public Canvas draw(int x1, int y1, int x2, int y2) {
		if (width < ++x1 || width < ++x2 || height < ++y1 || height < ++y2)
			throw new IllegalArgumentException();
		if (y1 == y2 || x1 == x2) {
			if (y1 == y2) {
				for (int x = x1; x <= x2; x++) {
					canvas[y1] = changeChar(canvas[y1], (x), 'x');
				}
			} else {
				for (int y = y1; y <= y2; y++) {
					canvas[y] = changeChar(canvas[y], (x1), 'x');
				}
			}
		} else {
			int minX = (x1 < x2) ? x1 : x2;
			int maxX = (x1 < x2) ? x2 : x1;
			for (; minX <= maxX;) {
				canvas[y1] = changeChar(canvas[y1], (minX), 'x');
				canvas[y2] = changeChar(canvas[y2], (minX++), 'x');
			}
			int minY = (y1 < y2) ? y1 : y2;
			int maxY = (y1 < y2) ? y2 : y1;
			for (; minY <= maxY;) {
				canvas[minY] = changeChar(canvas[minY], (x1), 'x');
				canvas[minY] = changeChar(canvas[minY++], (x2), 'x');
			}
		}
		return this;
	}

	public Canvas fill(int x, int y, char ch) {
		if (height < ++y || width < ++x)
			throw new IllegalArgumentException();
		if (verifySpace(x, y)) {
			canvas[y] = changeChar(canvas[y], x, ch);
			canvas = fillLine(canvas, x, y, ch, '-');
			if ( verifySpace(x, ++y) ) {
				canvas = fillLine(canvas, x, y, ch, '+');
			}
		}
		return this;
	}

	private String changeChar(String str, int y, char ch) {
		StringBuilder line = new StringBuilder(str);
		line.setCharAt(y, ch);
		return line.toString();
	}

	private boolean verifySpace(int x, int y) {
		if (x < 0 || y < 0) return false;
		if (x > width+1 || y > height+1) return false;
		return canvas[y].charAt(x) == ' ';
	}

	private boolean thereIsSpace(int x, int y) {
		if (verifySpace(x - 1, y)) return true;
		if (verifySpace(x + 1, y)) return true;
		if (verifySpace(x, y - 1)) return true;
		return verifySpace(x, y + 1);
	}

	private String[] fillLine( String[] arr, int x, int y, char ch, char op ) {
		int foundX = 0, first = 0, last = 1;
		while (first != last) {
			first = arr[y].lastIndexOf('x', x);
			if (first == -1) first = arr[y].lastIndexOf('-', x);
			if (first == -1) first = arr[y].lastIndexOf('|', x);
			if (first == -1) first = arr[y].lastIndexOf(ch, x);
			last = arr[y].indexOf('x', x);
			if (last == -1) last = arr[y].indexOf('-', x);
			if (last == -1) last = arr[y].indexOf('|', x);
			if (last == -1) last = arr[y].indexOf(ch, x);
			for (int i = first + 1; i < last; i++) {
				arr[y] = changeChar(arr[y], i, ch);
			}
			if (!thereIsSpace(x, y)) {
				foundX++;
			}
			if (last > 0 && foundX == 1 && op == '-') x = first+1;
			if (last > 0 && foundX == 1 && op == '+') x = last-1;
			y = (op == '-') ? ( (foundX == 0) ? y - 1 : y + 1 )
				: ( (foundX == 0) ? y + 1 : y - 1 );
		}
		return arr;
	}

	public String drawCanvas() {
		return String.join("\n", canvas);
	}
}