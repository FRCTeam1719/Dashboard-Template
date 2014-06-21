/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.firstteam1719.dashboard.dashboardtestrobot;

import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 * @author aaroneline
 */
public class DashBoardTestRobot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        NetworkTable.setClientMode();
        NetworkTable.setIPAddress("127.0.0.1");
        
        SmartDashboard.putNumber("Test", 3);
        
        NetworkTable.getTable("SmartDashboard");
        
        
        
        
        
        
        
    }
}
