/**
 * @author Rishabh Tandon
 */

package firstdeliverable;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel implements ActionListener{

	private JLabel title;
    private JLabel description;
    private JButton start;
    
    public Panel(){
            makeComponents();
            makeLayout();
    }
    
	
	private void makeComponents(){
		title = new JLabel("Prototype Demonstration I");
        title.setFont(new Font("Times", Font.BOLD, 37));
        title.setBounds(310, 10, 510, 45);
        
        start = new JButton("Start Game");
        start.setBounds(440, 166, 200, 60);
        start.addActionListener(this);
        
        description = new JLabel("© Copyright of Group 7, ECSE 321, McGill University");
        description.setFont(new Font("Times", Font.BOLD, 10));
        description.setBounds(100, 500, 510, 45);
	}
	
	private void makeLayout(){
		setLayout(null);
        add(title);
        add(start);
        add(description);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
