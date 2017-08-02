package ticTacToeN;

import javax.swing.JOptionPane;

public class FillInTheBlank {
	public static void main(String args[]){
		new FillInTheBlank();  // calling the constructor
	}

	public FillInTheBlank(){
		boolean done =false;

		while(!done){

			done =true;
			String ans[]=new String[11];   // eleven questions
			//		start us off
			JOptionPane.showMessageDialog(null,"Let's make a story :)","Fill In The Blank Game",JOptionPane.INFORMATION_MESSAGE);
			String colors[]={"green","blue","red","yellow","violet","orange"};
			int color_index=JOptionPane.showOptionDialog(null, "What's your favourite colour ?", "Color", 0, JOptionPane.INFORMATION_MESSAGE, null, colors, 0);  
			// 0 is  the initial value , means green is the initial value
			ans[0]=colors[color_index];
			ans[1]=JOptionPane.showInputDialog(null,"What is your favourite thing to drink ?","Liquid",JOptionPane.QUESTION_MESSAGE);
			ans[2]=JOptionPane.showInputDialog("Give a plural noun");
			ans[3]=JOptionPane.showInputDialog("Give a singular noun");
			ans[4]=JOptionPane.showInputDialog("Give an adjective");
			ans[5]=JOptionPane.showInputDialog("Give a present tense verb ");
			ans[6]=JOptionPane.showInputDialog("Give a plural noun");
			ans[7]=JOptionPane.showInputDialog("Give a singular noun");
			ans[8]=JOptionPane.showInputDialog("Give an adjective ");
			ans[9]=JOptionPane.showInputDialog("Give a present tense verb(travelling) ");
			ans[10]=JOptionPane.showInputDialog("Give a present tense verb(gym) ");

			// confirm with user
			int input=JOptionPane.showConfirmDialog(null, "Are you sure you are ready to see the result ?");
			if (input==1 || input ==2) {   // 0 = yes , 1= no ,2 = cancel
				done = false;
			}else{   // when input 


				input=JOptionPane.showConfirmDialog(null, "Really, this is your last chance to bail, are you certain ?",
						"",
						JOptionPane.YES_NO_OPTION
						);
				if (input==0){
					done=true;
				}
				else{
					done=false;
				}
			}

//			if(input==2){
//				done=true;
//			}


			if (done){
				JOptionPane.showMessageDialog(null,
						"Each spring, the sky turns "+ ans[0]+". Giant drops of "+ans[1]+" fall from the sky.\n"+ 
								"All this "+ans[1]+" helps the grass and the "+ans[2]+" to grow, but it can make things\n"+
								"really "+ans[3]+" too.\n"+

					"Some places get so much "+ans[1]+", that rivers "+ans[4]+" into the streets. Driving can\n"+ 
					"be tricky when this happens, so some people put special "+ans[5]+" on their cars.\n"+

					"And when the "+ans[1]+" is falling, don't forget your "+ans[6]+". Otherwise, your feet\n"+ 
					"might get "+ans[7]+" if you "+ans[8]+" in puddles!\n"+

					"After all the "+ans[1]+" has fallen, the skies begin to "+ans[9]+". If you are lucky, you\n"+ 
					"might see a huge "+ans[10]+" stretched across the sky.\n");
			}
			else{
				JOptionPane.showMessageDialog(null, "Okay,let's start over again");
			}

		}


	}
}
