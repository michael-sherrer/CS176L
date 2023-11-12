package edu.monmouth.interfaceAssignment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
	   JFrame frame = new JFrame("Measurable Tester");

       JPanel panel = new JPanel();

       JButton avgButton = new JButton("Calculate Average");
       JButton maxButton = new JButton("Calculate Maximum");
       JButton minButton = new JButton("Calculate Minimum");

       panel.add(avgButton);
       panel.add(maxButton);
       panel.add(minButton);

       frame.add(panel);
       frame.setSize(300, 150);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);

       Measurable[] countries = new Measurable[3];
       countries[0] = new Country("Uruguay", 176220);
       countries[1] = new Country("Thailand", 513120);
       countries[2] = new Country("Belgium", 30510);

       avgButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               double avg = Data.average(countries);
               JOptionPane.showMessageDialog(null, "Average area: " + avg);
           }
       });

       maxButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               double maxData = Data.max(countries);
               JOptionPane.showMessageDialog(null, "Maximum area: " + maxData);
           }
       });

       minButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               double minData = Data.min(countries);
               JOptionPane.showMessageDialog(null, "Minimum area: " + minData);
           }
       });
   }
}
