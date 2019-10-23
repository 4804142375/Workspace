import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class connectBro extends JComponent implements MouseListener {
	
	//who goes first
	int[] diceRolls = new int[2];
	
	public void printDice(int dieNum){
		if(dieNum < diceRolls.length){
			diceRolls[dieNum] = rollDice(6);
			System.out.println(diceRolls[dieNum]);
			printDice(dieNum + 1);
		}
	}
	
	public int rollDice(int sides) {
		return (int)(Math.random()*sides+1);
		
	}
	
	
	Color[][] board;
	int turn = 0;
	
	public connectBro() {
		
		//board colors
		board = new Color[4][4]; // (y, x)
		addMouseListener(this);
		
		System.out.println("The person on the left is assigned the first number."
				+ "\nThe person on the right is assigned the second number."
				+ "\nThe person with the higher number goes first.");
		
		printDice(0);
		
		board[0][0] = Color.blue;
		board[0][1] = Color.blue;
		board[0][2] = Color.blue;
		board[0][3] = Color.blue;
		board[1][0] = Color.blue;
		board[1][1] = Color.blue;
		board[1][2] = Color.blue;
		board[1][3] = Color.blue;
		board[2][0] = Color.blue;
		board[2][1] = Color.blue;
		board[2][2] = Color.blue;
		board[2][3] = Color.blue;
		board[3][0] = Color.blue;
		board[3][1] = Color.blue;
		board[3][2] = Color.blue;
		board[3][3] = Color.blue;

	}
	
	//drawing lines
	public void paintComponent(Graphics g) {
		g.fillRect(100, 0, 100, 400);
		g.fillRect(200, 0, 100, 400);
		g.fillRect(300, 0, 100, 400);
		g.fillRect(0, 100, 400, 100);
		g.fillRect(0, 200, 400, 100); 
		g.fillRect(0, 300, 400, 100);

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				g.setColor(board[row][col]);
				g.fillRect(row*100+1, col*100+1, 99, 99);
			}
		}

	}
	
	//size of board
	public static void main(String[] args) {

		JFrame frame = new JFrame("Connect Bro - Title");
		frame.setVisible(true);
		frame.setSize(400, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new connectBro());
	}
	
	//change color when clicked
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX()/100 + ", " + e.getY()/100);
		if (board[e.getX()/100][e.getY()/100].equals(Color.blue)) {
			if (turn%2 == 0) {
				board[e.getX()/100][e.getY()/100] = Color.yellow;
			} else {
				board[e.getX()/100][e.getY()/100] = Color.red;
			}
			turn++;
			
			//win condition
			if(board[0][0] == Color.yellow && board[0][1] == Color.yellow && board[0][2] == Color.yellow && board[0][3] == Color.yellow){
				board[0][0] = Color.yellow;
				board[0][1] = Color.yellow;
				board[0][2] = Color.yellow;
				board[0][3] = Color.yellow;
				board[1][0] = Color.yellow;
				board[1][1] = Color.yellow;
				board[1][2] = Color.yellow;
				board[1][3] = Color.yellow;
				board[2][0] = Color.yellow;
				board[2][1] = Color.yellow;
				board[2][2] = Color.yellow;
				board[2][3] = Color.yellow;
				board[3][0] = Color.yellow;
				board[3][1] = Color.yellow;
				board[3][2] = Color.yellow;
				board[3][3] = Color.yellow;
			}
			
			if(board[1][0] == Color.yellow && board[1][1] == Color.yellow && board[1][2] == Color.yellow && board[1][3] == Color.yellow){
				board[0][0] = Color.yellow;
				board[0][1] = Color.yellow;
				board[0][2] = Color.yellow;
				board[0][3] = Color.yellow;
				board[1][0] = Color.yellow;
				board[1][1] = Color.yellow;
				board[1][2] = Color.yellow;
				board[1][3] = Color.yellow;
				board[2][0] = Color.yellow;
				board[2][1] = Color.yellow;
				board[2][2] = Color.yellow;
				board[2][3] = Color.yellow;
				board[3][0] = Color.yellow;
				board[3][1] = Color.yellow;
				board[3][2] = Color.yellow;
				board[3][3] = Color.yellow;
			}
			
			if(board[2][0] == Color.yellow && board[2][1] == Color.yellow && board[2][2] == Color.yellow && board[2][3] == Color.yellow){
				board[0][0] = Color.yellow;
				board[0][1] = Color.yellow;
				board[0][2] = Color.yellow;
				board[0][3] = Color.yellow;
				board[1][0] = Color.yellow;
				board[1][1] = Color.yellow;
				board[1][2] = Color.yellow;
				board[1][3] = Color.yellow;
				board[2][0] = Color.yellow;
				board[2][1] = Color.yellow;
				board[2][2] = Color.yellow;
				board[2][3] = Color.yellow;
				board[3][0] = Color.yellow;
				board[3][1] = Color.yellow;
				board[3][2] = Color.yellow;
				board[3][3] = Color.yellow;
			}
			
			if(board[0][0] == Color.yellow && board[1][0] == Color.yellow && board[2][0] == Color.yellow && board[3][0] == Color.yellow){
				board[0][0] = Color.yellow;
				board[0][1] = Color.yellow;
				board[0][2] = Color.yellow;
				board[0][3] = Color.yellow;
				board[1][0] = Color.yellow;
				board[1][1] = Color.yellow;
				board[1][2] = Color.yellow;
				board[1][3] = Color.yellow;
				board[2][0] = Color.yellow;
				board[2][1] = Color.yellow;
				board[2][2] = Color.yellow;
				board[2][3] = Color.yellow;
				board[3][0] = Color.yellow;
				board[3][1] = Color.yellow;
				board[3][2] = Color.yellow;
				board[3][3] = Color.yellow;
			}
			
			if(board[0][1] == Color.yellow && board[1][1] == Color.yellow && board[2][1] == Color.yellow && board[3][1] == Color.yellow){
				board[0][0] = Color.yellow;
				board[0][1] = Color.yellow;
				board[0][2] = Color.yellow;
				board[0][3] = Color.yellow;
				board[1][0] = Color.yellow;
				board[1][1] = Color.yellow;
				board[1][2] = Color.yellow;
				board[1][3] = Color.yellow;
				board[2][0] = Color.yellow;
				board[2][1] = Color.yellow;
				board[2][2] = Color.yellow;
				board[2][3] = Color.yellow;
				board[3][0] = Color.yellow;
				board[3][1] = Color.yellow;
				board[3][2] = Color.yellow;
				board[3][3] = Color.yellow;
			}
			
			if(board[0][2] == Color.yellow && board[1][2] == Color.yellow && board[2][2] == Color.yellow && board[3][2] == Color.yellow){
				board[0][0] = Color.yellow;
				board[0][1] = Color.yellow;
				board[0][2] = Color.yellow;
				board[0][3] = Color.yellow;
				board[1][0] = Color.yellow;
				board[1][1] = Color.yellow;
				board[1][2] = Color.yellow;
				board[1][3] = Color.yellow;
				board[2][0] = Color.yellow;
				board[2][1] = Color.yellow;
				board[2][2] = Color.yellow;
				board[2][3] = Color.yellow;
				board[3][0] = Color.yellow;
				board[3][1] = Color.yellow;
				board[3][2] = Color.yellow;
				board[3][3] = Color.yellow;
			}
			
			if(board[0][0] == Color.yellow && board[1][1] == Color.yellow && board[2][2] == Color.yellow && board[3][3] == Color.yellow){
				board[0][0] = Color.yellow;
				board[0][1] = Color.yellow;
				board[0][2] = Color.yellow;
				board[0][3] = Color.yellow;
				board[1][0] = Color.yellow;
				board[1][1] = Color.yellow;
				board[1][2] = Color.yellow;
				board[1][3] = Color.yellow;
				board[2][0] = Color.yellow;
				board[2][1] = Color.yellow;
				board[2][2] = Color.yellow;
				board[2][3] = Color.yellow;
				board[3][0] = Color.yellow;
				board[3][1] = Color.yellow;
				board[3][2] = Color.yellow;
				board[3][3] = Color.yellow;
			}
			
			if(board[3][0] == Color.yellow && board[1][2] == Color.yellow && board[2][1] == Color.yellow && board[0][3] == Color.yellow){
				board[0][0] = Color.yellow;
				board[0][1] = Color.yellow;
				board[0][2] = Color.yellow;
				board[0][3] = Color.yellow;
				board[1][0] = Color.yellow;
				board[1][1] = Color.yellow;
				board[1][2] = Color.yellow;
				board[1][3] = Color.yellow;
				board[2][0] = Color.yellow;
				board[2][1] = Color.yellow;
				board[2][2] = Color.yellow;
				board[2][3] = Color.yellow;
				board[3][0] = Color.yellow;
				board[3][1] = Color.yellow;
				board[3][2] = Color.yellow;
				board[3][3] = Color.yellow;
			}
			
			
			
			
			
			if(board[0][0] == Color.red && board[0][1] == Color.red && board[0][2] == Color.red && board[0][3] == Color.red){
				board[0][0] = Color.red;
				board[0][1] = Color.red;
				board[0][2] = Color.red;
				board[0][3] = Color.red;
				board[1][0] = Color.red;
				board[1][1] = Color.red;
				board[1][2] = Color.red;
				board[1][3] = Color.red;
				board[2][0] = Color.red;
				board[2][1] = Color.red;
				board[2][2] = Color.red;
				board[2][3] = Color.red;
				board[3][0] = Color.red;
				board[3][1] = Color.red;
				board[3][2] = Color.red;
				board[3][3] = Color.red;
			}
			
			if(board[1][0] == Color.red && board[1][1] == Color.red && board[1][2] == Color.red && board[1][3] == Color.red){
				board[0][0] = Color.red;
				board[0][1] = Color.red;
				board[0][2] = Color.red;
				board[0][3] = Color.red;
				board[1][0] = Color.red;
				board[1][1] = Color.red;
				board[1][2] = Color.red;
				board[1][3] = Color.red;
				board[2][0] = Color.red;
				board[2][1] = Color.red;
				board[2][2] = Color.red;
				board[2][3] = Color.red;
				board[3][0] = Color.red;
				board[3][1] = Color.red;
				board[3][2] = Color.red;
				board[3][3] = Color.red;
			}
			
			if(board[2][0] == Color.red && board[2][1] == Color.red && board[2][2] == Color.red && board[2][3] == Color.red){
				board[0][0] = Color.red;
				board[0][1] = Color.red;
				board[0][2] = Color.red;
				board[0][3] = Color.red;
				board[1][0] = Color.red;
				board[1][1] = Color.red;
				board[1][2] = Color.red;
				board[1][3] = Color.red;
				board[2][0] = Color.red;
				board[2][1] = Color.red;
				board[2][2] = Color.red;
				board[2][3] = Color.red;
				board[3][0] = Color.red;
				board[3][1] = Color.red;
				board[3][2] = Color.red;
				board[3][3] = Color.red;
			}
			
			if(board[0][0] == Color.red && board[1][0] == Color.red && board[2][0] == Color.red && board[3][0] == Color.red){
				board[0][0] = Color.red;
				board[0][1] = Color.red;
				board[0][2] = Color.red;
				board[0][3] = Color.red;
				board[1][0] = Color.red;
				board[1][1] = Color.red;
				board[1][2] = Color.red;
				board[1][3] = Color.red;
				board[2][0] = Color.red;
				board[2][1] = Color.red;
				board[2][2] = Color.red;
				board[2][3] = Color.red;
				board[3][0] = Color.red;
				board[3][1] = Color.red;
				board[3][2] = Color.red;
				board[3][3] = Color.red;
			}
			
			if(board[0][1] == Color.red && board[1][1] == Color.red && board[2][1] == Color.red && board[3][1] == Color.red){
				board[0][0] = Color.red;
				board[0][1] = Color.red;
				board[0][2] = Color.red;
				board[0][3] = Color.red;
				board[1][0] = Color.red;
				board[1][1] = Color.red;
				board[1][2] = Color.red;
				board[1][3] = Color.red;
				board[2][0] = Color.red;
				board[2][1] = Color.red;
				board[2][2] = Color.red;
				board[2][3] = Color.red;
				board[3][0] = Color.red;
				board[3][1] = Color.red;
				board[3][2] = Color.red;
				board[3][3] = Color.red;
			}
			
			if(board[0][2] == Color.red && board[1][2] == Color.red && board[2][2] == Color.red && board[3][2] == Color.red){
				board[0][0] = Color.red;
				board[0][1] = Color.red;
				board[0][2] = Color.red;
				board[0][3] = Color.red;
				board[1][0] = Color.red;
				board[1][1] = Color.red;
				board[1][2] = Color.red;
				board[1][3] = Color.red;
				board[2][0] = Color.red;
				board[2][1] = Color.red;
				board[2][2] = Color.red;
				board[2][3] = Color.red;
				board[3][0] = Color.red;
				board[3][1] = Color.red;
				board[3][2] = Color.red;
				board[3][3] = Color.red;
			}
			
			if(board[0][0] == Color.red && board[1][1] == Color.red && board[2][2] == Color.red && board[3][3] == Color.red){
				board[0][0] = Color.red;
				board[0][1] = Color.red;
				board[0][2] = Color.red;
				board[0][3] = Color.red;
				board[1][0] = Color.red;
				board[1][1] = Color.red;
				board[1][2] = Color.red;
				board[1][3] = Color.red;
				board[2][0] = Color.red;
				board[2][1] = Color.red;
				board[2][2] = Color.red;
				board[2][3] = Color.red;
				board[3][0] = Color.red;
				board[3][1] = Color.red;
				board[3][2] = Color.red;
				board[3][3] = Color.red;
			}
			
			if(board[3][0] == Color.red && board[1][2] == Color.red && board[2][1] == Color.red && board[0][3] == Color.red){
				board[0][0] = Color.red;
				board[0][1] = Color.red;
				board[0][2] = Color.red;
				board[0][3] = Color.red;
				board[1][0] = Color.red;
				board[1][1] = Color.red;
				board[1][2] = Color.red;
				board[1][3] = Color.red;
				board[2][0] = Color.red;
				board[2][1] = Color.red;
				board[2][2] = Color.red;
				board[2][3] = Color.red;
				board[3][0] = Color.red;
				board[3][1] = Color.red;
				board[3][2] = Color.red;
				board[3][3] = Color.red;
			}
			repaint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
