/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Math.random;
import static java.lang.System.load;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import static monopoly.FXMLDocumentController.load;









public class PlaySceneController implements Initializable {
    
    public static int c;
    public static int b;
     public static int n=0;
     
     public static int n2=0;
     
     public int PlayerCredit;
     
     public int PlayerCredit2;
     //public String pcr;
     
     public boolean single=true;
     public boolean ami=true;
     
     public static Random r=new Random();
     
     
     public static String singleName,twoPlayer1,twoPlayer2;
    
    
   public Player [] p=new Player[40];
   public Player [] op=new Player[40]; 
   
   
   
   
   
   
   
    
    
    
    
    
    Image image1 = new Image(Monopoly.class.getResourceAsStream("Img/1.png"));
    Image image2 = new Image(Monopoly.class.getResourceAsStream("Img/2.png"));
    Image image3 = new Image(Monopoly.class.getResourceAsStream("Img/3.png"));
    Image image4 = new Image(Monopoly.class.getResourceAsStream("Img/4.png"));
    Image image5 = new Image(Monopoly.class.getResourceAsStream("Img/5.png"));
    Image image6 = new Image(Monopoly.class.getResourceAsStream("Img/6.png"));
    
    Image chest=new Image(Monopoly.class.getResourceAsStream("Img/Chest.jpg"));
    
    Image infoImage;
    
    @FXML
    ImageView info;
    


   
    @FXML
    private ImageView imageHolder1;
    @FXML
    private ImageView imageHolder2;
    @FXML
    private ImageView pointer;
    @FXML
    private Label PlayerName;
    @FXML
    private Label TwoPlayer1;
    @FXML
    private Label TwoPlayer2;
    @FXML
    private ImageView amarImage;
    @FXML
    private Label cr;
    @FXML
    private ImageView pointer2;
    @FXML
    private Label Credit2;
    @FXML
    private Button buyButton;
    @FXML
    private Button cancelButton;
  
        
    
    
    
    
    
   
    /**
     * Initializes the controller class.
     */
    @Override 
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         
           
                    
            PlayerName.setText(singleName);
            
            //amarImage.setVisible(false);//sssssssssssssssssssssssssssssssssss
            
            TwoPlayer1.setText(twoPlayer1);
            
            if(twoPlayer2.length()>0){
                 TwoPlayer2.setText(twoPlayer2);
                 
                 
                 
                 single=false;
            }
            
            PlayerCredit=1500;
            
            PlayerCredit2=1500;
            //System.out.println("dsdfsdfs");
            if(load==true){
                //System.out.println("dsdfsdfs");
                try {
                    load();
                } catch (IOException ex) {
                    Logger.getLogger(PlaySceneController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        
        
        
    } 
    
    private void load() throws FileNotFoundException, IOException {
         FileReader tfile = new FileReader("Savefile.txt");
          BufferedReader tread = new BufferedReader(tfile);
          //String p=tread.readLine();
          
          //System.out.println("fsdxv");
//          while(true){
//          if(p!=null){
//              System.out.println(p);
//              p=tread.readLine();
//          }
//          }
          
         c=Integer.parseInt(tread.readLine());
         
         b=Integer.parseInt(tread.readLine());
         n=Integer.parseInt(tread.readLine());
         n2=Integer.parseInt(tread.readLine()); 
         PlayerCredit=Integer.parseInt(tread.readLine());
        PlayerCredit2=Integer.parseInt(tread.readLine());
         single=Boolean.valueOf(tread.readLine());
         ami=Boolean.valueOf(tread.readLine());
        singleName=tread.readLine();
        twoPlayer1=tread.readLine();
      twoPlayer2=tread.readLine();
      
      tread.close();
      
         System.out.println(n);
        
//     
//       pointer.setLayoutX(p[n].getx());
//      pointer.setLayoutY(p[n].gety());
//      
//       pointer2.setLayoutX(p[n].getx());
//      pointer2.setLayoutY(p[n].gety());
        
            
             
//       pointer.setLayoutX(p[20].getx());
//      pointer.setLayoutY(p[20].gety());
//      
//       pointer2.setLayoutX(p[20].getx());
//      pointer2.setLayoutY(p[20].gety());


       cr.setText(Integer.toString(PlayerCredit));
       
        Credit2.setText(Integer.toString(PlayerCredit2));
        
        if(single==true){
               PlayerName.setText(singleName);
           
            
            
        }
        else{
            
            TwoPlayer1.setText(twoPlayer1);
            TwoPlayer2.setText(twoPlayer2);
        }
        
        
      
      
       
        
       ;
        
          
          
          
         
    }
    
    
    void set(){
        p[0]=new Player(701,636,0);
        p[1]=new Player(587,666,60);
        p[2]=new Player(520,669,0);
        p[3]=new Player(474,669,60);
        p[4]=new Player(420,658,200);
        p[5]=new Player(361,665,200);
        p[6]=new Player(303,668,100);
        p[7]=new Player(250,667,-1000);
        p[8]=new Player(189,668,100);
        p[9]=new Player(135,667,120);
        p[10]=new Player(25,684,0);
        p[11]=new Player(49,574,140);
        p[12]=new Player(48,521,140);
        p[13]=new Player(46,462,150);
        p[14]=new Player(48,410,160);
        p[15]=new Player(48,352,200);
        p[16]=new Player(44,296,160);
        p[17]=new Player(41,237,180);
        p[18]=new Player(22,174,-400);
        p[19]=new Player(42,126,200);
        p[20]=new Player(22,20,0);
        p[21]=new Player(133,34,220);
        p[22]=new Player(193,32,-200);
        p[23]=new Player(247,36,220);
        p[24]=new Player(303,39,240);
        p[25]=new Player(361,42,200);
        p[26]=new Player(415,35,260);
        p[27]=new Player(473,32,260);
        p[28]=new Player(531,38,150);
        p[29]=new Player(585,36,280);
        p[30]=new Player(661,42,0);
        p[31]=new Player(676,120,300);
        p[32]=new Player(677,177,300);
        p[33]=new Player(677,235,-400);
        p[34]=new Player(675,293,320);
        p[35]=new Player(675,353,200);
        p[36]=new Player(673,408,-500);
        p[37]=new Player(675,461,350);
        p[38]=new Player(671,521,75);
       p[39]=new Player(672,576,400);
       
       
       
       
       op[0]=new Player(701,636,0);
        op[1]=new Player(587,666,60);
        op[2]=new Player(520,669,0);
        op[3]=new Player(474,669,60);
        op[4]=new Player(420,658,200);
        op[5]=new Player(361,665,200);
        op[6]=new Player(303,668,100);
        op[7]=new Player(250,667,-1000);
        op[8]=new Player(189,668,100);
        op[9]=new Player(135,667,120);
        op[10]=new Player(25,684,0);
        op[11]=new Player(49,574,140);
        op[12]=new Player(48,521,140);
        op[13]=new Player(46,462,150);
        op[14]=new Player(48,410,160);
        op[15]=new Player(48,352,200);
        op[16]=new Player(44,296,160);
        op[17]=new Player(41,237,180);
        op[18]=new Player(22,174,-400);
        op[19]=new Player(42,126,200);
        op[20]=new Player(22,20,0);
        op[21]=new Player(133,34,220);
        op[22]=new Player(193,32,-200);
        op[23]=new Player(247,36,220);
        op[24]=new Player(303,39,240);
        op[25]=new Player(361,42,200);
        op[26]=new Player(415,35,260);
        op[27]=new Player(473,32,260);
        op[28]=new Player(531,38,150);
        op[29]=new Player(585,36,280);
        op[30]=new Player(661,42,0);
        op[31]=new Player(676,120,300);
        op[32]=new Player(677,177,300);
        op[33]=new Player(677,235,-400);
        op[34]=new Player(675,293,320);
        op[35]=new Player(675,353,200);
        op[36]=new Player(673,408,-500);
        op[37]=new Player(675,461,350);
        op[38]=new Player(671,521,75);
       op[39]=new Player(672,576,400);
       
        
        
        
        
        
        
    
   }

    @FXML
    private void onTestClick(ActionEvent event) {
        
        Thread t; 
        
      
  
        t = new Thread(new Runnable(){
            @Override
            public void run() {
                if(single==false){
                    
                    if(ami==false){  
                for(int i=n;i<n+(c+b);i++){
                   //System.out.println(c+" "+n+" ");
                  // System.out.println(b);
                    pointer.setLayoutX(p[(i+1)%40].getx());
                    pointer.setLayoutY(p[(i+1)%40].gety());
                    
                    infoImage=new Image(Monopoly.class.getResourceAsStream("Img/i/"+(i+1)%40+".png"));
                    
                    info.setImage(infoImage);
                    
                    
                    
                    
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PlaySceneController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                n=(n+c+b)%40;
                
                buyButton.setVisible(true);
                cancelButton.setVisible(true);
                
                    ami=true;
                    
                    }
                else{
                     for(int i=n2;i<n2+(c+b);i++){
                   //System.out.println(c+" "+n+" ");
                  // System.out.println(b);
                    pointer2.setLayoutX(p[(i+1)%40].getx());
                    pointer2.setLayoutY(p[(i+1)%40].gety());
                    
                    
                    infoImage=new Image(Monopoly.class.getResourceAsStream("Img/i/"+(i+1)%40+".png"));
                    
                    info.setImage(infoImage);
                    
                    
                    
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PlaySceneController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                n2=(n2+c+b)%40;
                
                buyButton.setVisible(true);
                cancelButton.setVisible(true);
                    
                    ami=false;
                    
                    }
                
                
                
                
                
                }
                else{
                    
                    
                  ///////////////////////////////////////////////////////////////////
                    
                    
                    if(ami==false){
                        
                        
//                        try {       
//                            NewThread1 tt=new NewThread1();
//                            
//                            tt.t.join();
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(PlaySceneController.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                        
//                    for(int i=n2;i<n2+(c+b);i++){
//                   //System.out.println(c+" "+n+" ");
//                  // System.out.println(b);
//                    pointer2.setLayoutX(p[(i+1)%40].getx());
//                    pointer2.setLayoutY(p[(i+1)%40].gety());
//                    
//                    infoImage=new Image(Monopoly.class.getResourceAsStream("Img/i/"+(i+1)%40+".png"));
//                    
//                    info.setImage(infoImage);
//                    
//                    
//                    
//                    
//                    try {
//                        Thread.sleep(600);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(PlaySceneController.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//                n2=(n2+c+b)%40;
//                    
//                    ami=true;
                    //
                    
                    }     else{
                        for(int i=n;i<n+(c+b);i++){
                   //System.out.println(c+" "+n+" ");
                  // System.out.println(b);
                    pointer.setLayoutX(p[(i+1)%40].getx());
                    pointer.setLayoutY(p[(i+1)%40].gety());
                    
                    infoImage=new Image(Monopoly.class.getResourceAsStream("Img/i/"+(i+1)%40+".png"));
                    
                    info.setImage(infoImage);
                    
                    
                    
                    
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PlaySceneController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                n=(n+c+b)%40;
                buyButton.setVisible(true);
                cancelButton.setVisible(true);
                
                ami=false;
                    }               
                }
                
                
                
                
               
                
                //System.out.println(b+"     dsvdvsdvsdvVVV");
            }
            
        });
        
        t.start();
        
        
        
    
    }
    
    
    void ai(){
        NewThread1 tt;
        try {       
                            tt=new NewThread1();
                            
                            
                            //if(r.nextInt(2)==0){
                             //n2=(n2+c+b)%40;
                    //PlayerCredit2-=op[n2].getMoney();
                  PlayerCredit2-=100*(b%2);
        Credit2.setText(Integer.toString(PlayerCredit2));//}
                            
                            //tt.t.join();
                            
                            Thread ttt;
                        
                        ttt=new Thread(new Runnable() {
            @Override
            public void run() {
                 for(int i=n2;i<n2+(c+b);i++){
                   //System.out.println(c+" "+n+" ");
                  // System.out.println(b);
                    pointer2.setLayoutX(p[(i+1)%40].getx());
                    pointer2.setLayoutY(p[(i+1)%40].gety());
                    
                    infoImage=new Image(Monopoly.class.getResourceAsStream("Img/i/"+(i+1)%40+".png"));
                    
                    info.setImage(infoImage);
                    
                    
                    
                    
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PlaySceneController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                n2=(n2+c+b)%40;
                    
                    ami=true;
                  
            }
        });
                        
                        ttt.start();
                           
                            
                        } catch (InterruptedException ex) {
                            Logger.getLogger(PlaySceneController.class.getName()).log(Level.SEVERE, null, ex);
                        }
        
        
        
                        
//                    for(int i=n2;i<n2+(c+b);i++){
//                   //System.out.println(c+" "+n+" ");
//                  // System.out.println(b);
//                    pointer2.setLayoutX(p[(i+1)%40].getx());
//                    pointer2.setLayoutY(p[(i+1)%40].gety());
//                    
//                    infoImage=new Image(Monopoly.class.getResourceAsStream("Img/i/"+(i+1)%40+".png"));
//                    
//                    info.setImage(infoImage);
//                    
//                    
//                    
//                    
//                    try {
//                        Thread.sleep(600);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(PlaySceneController.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//                n2=(n2+c+b)%40;
//                    
//                    ami=true;
//                  if(r.nextInt(2)==0){  
//                    PlayerCredit2-=op[n].getMoney();
//        Credit2.setText(Integer.toString(PlayerCredit2));}

    
    }

    @FXML
    private void showMe(MouseEvent event) {
        
        //amarImage.setImage(image1);
        //amarImage.setVisible(true);
        
        
    }

    @FXML
    private void onClickBuy(ActionEvent event) {
        
        
        
        
        
        
        //PlayerCredit-=500;
        //System.out.println(PlayerCredit);
        //System.out.println(p[n].getMoney());
        if(ami==false){
        PlayerCredit-=p[n].getMoney();
        
        //System.out.println("Hello");
        cr.setText(Integer.toString(PlayerCredit));
        
        }
        else{
        PlayerCredit2-=op[n2].getMoney();
        Credit2.setText(Integer.toString(PlayerCredit2));
        }
        
        buyButton.setVisible(false);
                cancelButton.setVisible(false);
                
                 if(ami==false && single==true){
                    ai();
                }
                
               
        
        
        
    }

    @FXML
    private void onEndCLick(ActionEvent event) {
        
          buyButton.setVisible(false);
                cancelButton.setVisible(false);
                
                if(ami==false && single==true){
                    
                    ai();
                }
    }

    @FXML
    private void onSaveClick(ActionEvent event) throws FileNotFoundException, IOException {
        //FileWriter mwriter = new FileWriter("Savefile.txt");
        PrintWriter nfile = new PrintWriter("Savefile.txt");
        nfile.println(c);
        nfile.println(b);
        nfile.println(n);
        nfile.println(n2);
        nfile.println(PlayerCredit);
        nfile.println(PlayerCredit2);
        nfile.println(single);
        nfile.println(ami);
         nfile.println(singleName);
        nfile.println(twoPlayer1);
        nfile.println(twoPlayer2);
        nfile.close();
    
     
     
    
    }

    @FXML
    private void onLoadCLick(ActionEvent event) throws IOException {
        load();
    }

    @FXML
    private void onExitClicked(ActionEvent event) {
        
        System.exit(0);
    }

  
    
    class NewThread1 implements Runnable
{
    Thread t;
    NewThread1() throws InterruptedException {
        t = new Thread(this, "Runnable Thread");
        t.start();
     
    }
    // This is the entry point for the thread.
    
    
   
    
    public void run() {
        try {
            for(int i = 3; i > 0; i--) {
               
                imageHolder1.setImage(image1);
                imageHolder2.setImage(image6);
                Thread.sleep(200);
                 imageHolder1.setImage(image2);
                imageHolder2.setImage(image5);
                Thread.sleep(200);
                 imageHolder1.setImage(image3);
                imageHolder2.setImage(image3);
                Thread.sleep(200);
                 imageHolder1.setImage(image4);
                imageHolder2.setImage(image2);
                Thread.sleep(200);
                 imageHolder1.setImage(image5);
                imageHolder2.setImage(image1);
                Thread.sleep(200);
                 imageHolder1.setImage(image6);
                imageHolder2.setImage(image1);
                Thread.sleep(200);
                
                
                
                           
                    
                
       
                
            }
            
            
            
            
            
            
            
            
        b=r.nextInt(6)%6+1;
            switch(b){
                case 1:
                    imageHolder1.setImage(image1);break;
                    
                case 2:
                    imageHolder1.setImage(image2);break;
                case 3:
                    imageHolder1.setImage(image3);break;
                case 4:
                    imageHolder1.setImage(image4);break;
                case 5:
                    imageHolder1.setImage(image5);break;
                case 6:
                    imageHolder1.setImage(image6);break;
            }
            
            c=r.nextInt(6)%6+1;
            switch(c){
                case 1:
                    imageHolder2.setImage(image1);break;
                case 2:
                    imageHolder2.setImage(image2);break;
                case 3:
                    imageHolder2.setImage(image3);break;
                case 4:
                    imageHolder2.setImage(image4);break;
                case 5:
                    imageHolder2.setImage(image5);break;
                case 6:
                    imageHolder2.setImage(image6);break;
               
        
    }
            
            
            
            
            
            
        } catch (InterruptedException e) {
            
        }
       
    }
    
    
}



    @FXML
    private void onRollClick(ActionEvent event) throws InterruptedException  {
        
        
        
         NewThread1 t=new NewThread1();
        
        
        
          set();
        
        
      
       
        
        
    
}
}