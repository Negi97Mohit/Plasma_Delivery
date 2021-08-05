/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

/**
 *
 * @author DELL
 */


import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;

public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    boolean a = true;
    Enterprise enterprise;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public AdminWorkAreaJPanel(Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
        this.enterprise = enterprise;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    public void changeimage(JLabel button, String resourcecheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcecheimg));
        button.setIcon(aimg);
    }
    
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button){
        
        if(dashboard == true){
            
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/Images/menu_32px.png");
        }
        
        else{
            
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            changeimage(button, "/Images/menu_32px.png");
            
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        iconminmaxclose = new javax.swing.JPanel();
        ButtonClose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        ButtonMax = new javax.swing.JPanel();
        fullmax = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        linehidemenu = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        Buttonhidemenu = new javax.swing.JLabel();
        settingsmenu = new javax.swing.JPanel();
        menuhide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(0, 0, 0));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.BorderLayout());

        iconminmaxclose.setBackground(new java.awt.Color(0, 0, 0));
        iconminmaxclose.setPreferredSize(new java.awt.Dimension(150, 50));
        iconminmaxclose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonClose.setBackground(new java.awt.Color(15, 29, 52));
        ButtonClose.setPreferredSize(new java.awt.Dimension(50, 50));

        close.setBackground(new java.awt.Color(31, 31, 31));
        close.setForeground(new java.awt.Color(31, 31, 31));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ButtonCloseLayout = new javax.swing.GroupLayout(ButtonClose);
        ButtonClose.setLayout(ButtonCloseLayout);
        ButtonCloseLayout.setHorizontalGroup(
            ButtonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(ButtonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );
        ButtonCloseLayout.setVerticalGroup(
            ButtonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(ButtonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        iconminmaxclose.add(ButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        ButtonMax.setBackground(new java.awt.Color(15, 29, 52));
        ButtonMax.setPreferredSize(new java.awt.Dimension(50, 50));

        fullmax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullmax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/full_screen_32px.png"))); // NOI18N
        fullmax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullmaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fullmaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fullmaxMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ButtonMaxLayout = new javax.swing.GroupLayout(ButtonMax);
        ButtonMax.setLayout(ButtonMaxLayout);
        ButtonMaxLayout.setHorizontalGroup(
            ButtonMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(ButtonMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fullmax, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );
        ButtonMaxLayout.setVerticalGroup(
            ButtonMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(ButtonMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fullmax, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        iconminmaxclose.add(ButtonMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        Header.add(iconminmaxclose, java.awt.BorderLayout.LINE_END);

        add(Header, java.awt.BorderLayout.PAGE_START);

        menu.setPreferredSize(new java.awt.Dimension(270, 450));
        menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(0, 0, 0));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 450));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linehidemenu.setBackground(new java.awt.Color(0, 0, 0));
        linehidemenu.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linehidemenuLayout = new javax.swing.GroupLayout(linehidemenu);
        linehidemenu.setLayout(linehidemenuLayout);
        linehidemenuLayout.setHorizontalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linehidemenuLayout.setVerticalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        MenuIcon.add(linehidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 10));

        hidemenu.setBackground(new java.awt.Color(15, 29, 52));
        hidemenu.setPreferredSize(new java.awt.Dimension(50, 50));

        Buttonhidemenu.setBackground(new java.awt.Color(0, 0, 0));
        Buttonhidemenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buttonhidemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_32px.png"))); // NOI18N
        Buttonhidemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonhidemenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonhidemenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonhidemenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hidemenuLayout = new javax.swing.GroupLayout(hidemenu);
        hidemenu.setLayout(hidemenuLayout);
        hidemenuLayout.setHorizontalGroup(
            hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Buttonhidemenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );
        hidemenuLayout.setVerticalGroup(
            hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Buttonhidemenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        MenuIcon.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 50));

        settingsmenu.setBackground(new java.awt.Color(0, 0, 0));
        settingsmenu.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout settingsmenuLayout = new javax.swing.GroupLayout(settingsmenu);
        settingsmenu.setLayout(settingsmenuLayout);
        settingsmenuLayout.setHorizontalGroup(
            settingsmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        settingsmenuLayout.setVerticalGroup(
            settingsmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        MenuIcon.add(settingsmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 50, 50));

        menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        menuhide.setBackground(new java.awt.Color(31, 31, 31));
        menuhide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Oranganization");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        menuhide.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 220, -1));

        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Employees");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menuhide.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, -1));

        jPanel3.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Users");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menuhide.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, -1));

        jPanel4.setOpaque(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuhide.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 220, 70));

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        add(menu, java.awt.BorderLayout.LINE_START);

        userProcessContainer.setBackground(new java.awt.Color(208, 93, 2));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void fullmaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseClicked
        // TODO add your handling code here:
        
//        if(this.getExtendedState() != AdminWorkAreaJPanel.MAXIMIZED_BOTH){
//            
//            this.setExtendedState(AdminWorkAreaJPanel.MAXIMIZED_BOTH);
//        }
//        else{
//            this.setExtendedState(AdminWorkAreaJPanel.NORMAL);
//        }
    }//GEN-LAST:event_fullmaxMouseClicked

    private void fullmaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseEntered
        // TODO add your handling code here:
        changecolor(ButtonMax, new Color(0,237,0));
    }//GEN-LAST:event_fullmaxMouseEntered

    private void fullmaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseExited
        // TODO add your handling code here:
        changecolor(ButtonClose, new Color(15,29,52));
    }//GEN-LAST:event_fullmaxMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        changecolor(ButtonClose, new Color(204,0,0));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
        changecolor(ButtonClose, new Color(15,29,52));
    }//GEN-LAST:event_closeMouseExited

    private void ButtonhidemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonhidemenuMouseClicked
        // TODO add your handling code here:
        clickmenu(hidemenu, settingsmenu, 1);
        
        // reate void for methods hide and show panel menu
        
        if(a==true){
            hideshow(menu,a, Buttonhidemenu );
            SwingUtilities.updateComponentTreeUI(this);
            a=false;
        }
        else{
            
            hideshow(menu, a, Buttonhidemenu);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
        }
    }//GEN-LAST:event_ButtonhidemenuMouseClicked

    private void ButtonhidemenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonhidemenuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonhidemenuMouseEntered

    private void ButtonhidemenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonhidemenuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonhidemenuMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise, system);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise, system);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jLabel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonClose;
    private javax.swing.JPanel ButtonMax;
    private javax.swing.JLabel Buttonhidemenu;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JLabel close;
    private javax.swing.JLabel fullmax;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel iconminmaxclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel settingsmenu;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
