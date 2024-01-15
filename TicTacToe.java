import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends Frame implements ActionListener {
    Button[] buttons = new Button[9];

    Button newGame = new Button("New Game");
    int b0 = 0, b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0, b6 = 0, b7 = 0, b8 = 0;
    int x = 5;
    int y = 30;
    int turn = 0;

    int index = 0;
    int l = 50;

    Label[] winnings = new Label[5];

    int n = 0;
    Font font = new Font("", Font.BOLD, 40);
   public TicTacToe(){
       setLayout(null);
       setVisible(true);
       setBackground(Color.DARK_GRAY);
       setLocation(100, 200);
       setSize(800, 500);
   }
    public void createButtons(){
        for(int k=0; k<3; k++){
            for(int j=0; j<3; j++){
                buttons[index] = new Button();
                buttons[index].setBackground(Color.ORANGE);
                buttons[index].setSize(100,100);
                buttons[index].setLocation(x, y);
                buttons[index].setFont(font);
                add(buttons[index]);
                buttons[index].addActionListener(this);

                x += 100;
                index++;
            }
            x = 5;
            y += 100;
        }
   }

   public void createResetButton(){
       newGame.setFont(new Font("", Font.BOLD, 20));
       newGame.setLocation(350,350);
       newGame.setSize(150,50);
       newGame.setBackground(Color.blue);
       newGame.addActionListener(this);
       add(newGame);
   }


    public void actionPerformed(ActionEvent e) {
        System.out.println("A BUTTON WAS CLICKED......");
       if(e.getSource() == newGame) {
           if(n == 5){
               for(int i=0; i<5; i++){
                   winnings[i].setText("");
               }
               n = 0;
               l = 50;
           }
           for(int i=0; i<9; i++) {
               buttons[i].setLabel("");
           }
           b0 = 0; b1 = 0; b2 = 0; b3 = 0; b4 = 0; b5 = 0; b6 = 0; b7 = 0; b8 = 0;
       }

        if(e.getSource() == buttons[0] && b0 == 0){
            System.out.println("BUTTON 0 WAS CLICKED ");
            System.out.println("n value is 33:  " + n);
            if(turn % 2 == 0){
                buttons[0].setLabel("X");
                turn++;
                b0++;
            }
            else{
                buttons[0].setLabel("O");
                turn++;
                b0++;
            }
            System.out.println("n value is 1:  " + n);
        }
        if(e.getSource() == buttons[1] && b1 == 0){
            if(turn % 2 == 0){
                buttons[1].setLabel("X");
                turn++;
                b1++;
            }
            else{
                buttons[1].setLabel("O");
                turn++;
                b1++;
            }
            System.out.println("n value is 2:  " + n);
        }
        if(e.getSource() == buttons[2] && b2 == 0){
            if(turn % 2 == 0){
                buttons[2].setLabel("X");
                turn++;
                b2++;
            }
            else{
                buttons[2].setLabel("O");
                turn++;
                b2++;
            }
            System.out.println("n value is 3:  " + n);
        }
        if(e.getSource() == buttons[3] && b3 == 0){
            if(turn % 2 == 0){
                buttons[3].setLabel("X");
                turn++;
                b3++;
            }
            else{
                buttons[3].setLabel("O");
                turn++;
                b3++;
            }
        }
        if(e.getSource() == buttons[4] && b4 == 0){
            if(turn % 2 == 0){
                buttons[4].setLabel("X");
                turn++;
                b4++;
            }
            else{
                buttons[4].setLabel("O");
                turn++;
                b4++;
            }
        }
        if(e.getSource() == buttons[5] && b5 == 0){
            if(turn % 2 == 0){
                buttons[5].setLabel("X");
                turn++;
                b5++;
            }
            else{
                buttons[5].setLabel("O");
                turn++;
                b5++;
            }
        }
        if(e.getSource() == buttons[6] && b6 == 0){
            if(turn % 2 == 0){
                buttons[6].setLabel("X");
                turn++;
                b6++;
            }
            else{
                buttons[6].setLabel("O");
                turn++;
                b6++;
            }
        }
        if(e.getSource() == buttons[7] && b7 == 0){
            if(turn % 2 == 0){
                buttons[7].setLabel("X");
                turn++;
                b7++;
            }
            else{
                buttons[7].setLabel("O");
                turn++;
                b7++;
            }
        }
        if(e.getSource() == buttons[8] && b8 == 0){
            if(turn % 2 == 0){
                buttons[8].setLabel("X");
                turn++;
                b8++;
            }
            else{
                buttons[8].setLabel("O");
                turn++;
                b8++;
            }
        }
        setWinner();
    }

    public void setWinner() {
        Font textFont = new Font("", Font.ITALIC, 20);
        if (buttons[0].getLabel().equals(buttons[1].getLabel()) && buttons[0].getLabel().equals(buttons[2].getLabel())) {
            if (buttons[0].getLabel().equals("X")) {
                System.out.println("PLAYER 1 WINS 44444444");
                System.out.println("N value is 11111 : "+ n);
                winnings[n] = new Label();
                winnings[n].setText("Player 1 wins!");
                System.out.println("which player ? "+ winnings[n]);
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
            if (buttons[0].getLabel().equals("O")){
                winnings[n] = new Label();
                winnings[n].setText("Player 2 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }

        }
        if (buttons[3].getLabel().equals(buttons[4].getLabel()) && buttons[4].getLabel().equals(buttons[5].getLabel())) {
            if (buttons[3].getLabel().equals("X")) {
                winnings[n] = new Label("Player 1 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
            if (buttons[3].getLabel().equals("O")){
                winnings[n] = new Label("Player 2 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
           // n+=1;
        }
        if (buttons[6].getLabel().equals(buttons[7].getLabel()) && buttons[7].getLabel().equals(buttons[8].getLabel())) {
            if (buttons[6].getLabel().equals("X")) {
                winnings[n] = new Label("Player 1 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
            if (buttons[6].getLabel().equals("O")){
                winnings[n] = new Label("Player 2 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;

            }
            //n+=1;
        }
        if (buttons[0].getLabel().equals(buttons[3].getLabel()) && buttons[3].getLabel().equals(buttons[6].getLabel())) {
            if (buttons[0].getLabel().equals("X")) {
                winnings[n] = new Label("Player 1 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
            if (buttons[0].getLabel().equals("O")){
                winnings[n] = new Label("Player 2 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
           // n+=1;
        }
        if (buttons[1].getLabel().equals(buttons[4].getLabel()) && buttons[4].getLabel().equals(buttons[7].getLabel())) {
            if (buttons[1].getLabel().equals("X")) {
                winnings[n] = new Label("Player 1 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
            if (buttons[1].getLabel().equals("O")){
                winnings[n] = new Label("Player 2 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
           // n+=1;
        }

        if (buttons[2].getLabel().equals(buttons[5].getLabel()) && buttons[5].getLabel().equals(buttons[8].getLabel())) {
            if (buttons[2].getLabel().equals("X")) {
                winnings[n] = new Label("Player 1 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
            if (buttons[2].getLabel().equals("O")){
                winnings[n] = new Label("Player 2 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
          //  n+=1;
        }
        if (buttons[0].getLabel().equals(buttons[4].getLabel()) && buttons[4].getLabel().equals(buttons[8].getLabel())) {
            if (buttons[0].getLabel().equals("X")) {
                winnings[n] = new Label("Player 1 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
            if (buttons[0].getLabel().equals("O")){
                winnings[n] = new Label("Player 2 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
           // n+=1;
        }
        if (buttons[2].getLabel().equals(buttons[4].getLabel()) && buttons[4].getLabel().equals(buttons[6].getLabel())) {
            if (buttons[2].getLabel().equals("X")) {
                winnings[n] = new Label("Player 1 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
            if (buttons[2].getLabel().equals("O")){
                winnings[n] = new Label("Player 2 wins!");
                winnings[n].setLocation(350, l);
                winnings[n].setSize(500,60);
                winnings[n].setFont(textFont);
                winnings[n].setForeground(Color.white);
                add(winnings[n]);
                l+= 50;
                n+=1;
            }
            //n+=1;
        }
//        else {
//            Label draw = new Label("Game draw!");
//            draw.setLocation(350,70);
//            draw.setFont(textFont);
//            add(draw);
//        }
    }

}