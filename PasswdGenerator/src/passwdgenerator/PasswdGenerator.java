/*
icsd17093
koufalis-kanelis xristos
Ergasia 1 Askisi 3 
*/
package passwdgenerator;
//dilwsi aparaititwn vivliothikwn
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PasswdGenerator {


    public static void main(String[] args) {
        //dilwnw frame,panel,label,textfield kai button kai ena gridbaglyout
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel l1 = new JLabel("Please enter your first name");
        JTextField onoma = new JTextField(40);
        JLabel l2 = new JLabel("Please enter your last name");
        JTextField epitheto = new JTextField(40);
        JLabel l3 = new JLabel("Please enter your pets name");
        JTextField katoikidio = new JTextField(40);
        JButton b1 = new JButton("Create Username and Password");
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
//ta stoixizw gia na nai omoiomorfa kai ta kanw add sto panel mou
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridwidth = 5;
        l1.setPreferredSize(new Dimension(200, 30));
        panel.add(l1, gbc);

        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridwidth = 7;
        onoma.setPreferredSize(new Dimension(100, 30));
        panel.add(onoma, gbc);
        
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridwidth = 9;
        l2.setPreferredSize(new Dimension(200, 30));
        panel.add(l2, gbc);
        
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridwidth = 11;
        epitheto.setPreferredSize(new Dimension(100, 30));
        panel.add(epitheto, gbc);
        
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridwidth = 13;
        l3.setPreferredSize(new Dimension(200, 30));
        panel.add(l3, gbc);
        
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 15;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridwidth = 15;
        katoikidio.setPreferredSize(new Dimension(100, 30));
        panel.add(katoikidio, gbc);
 
        
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 18;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridwidth = 17;
        b1.setPreferredSize(new Dimension(250, 30));
        panel.add(b1, gbc);
    
    //vazw to panel sto frame kai ruthmizw to 2o
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setLocationRelativeTo(null);
    
        b1.addActionListener((java.awt.event.ActionEvent ae) -> {
            String username = null;
            User us = new User(onoma.getText(),epitheto.getText(),katoikidio.getText());//dimiourgia antikeimenou user
 //kalw tis static sunartiseis 
        usernameGen(us);
        passGen1(us);
        passGen2(us);
 
        });
        
        
       
        
    }
    
    
    //sunartisi gia dimiourgia username
    public static void usernameGen(User us1){
//kanw pinakes xaraktirwn to onoma kai to epitheto
    char[]c1 = us1.getFirstname().toLowerCase().toCharArray();
    char[]c2 = us1.getLastname().toLowerCase().toCharArray();
    char[] str = new char[11];//dimiourgia pinaka xaraktirwn gia to username
  

        str[0] = c1[0]; 
     
    for(int i=1; i<=8;i++)
    {
        str[i]=c2[i-1];
    }
 
        str[9]='_';
        
        str[10]= (char) (new Random().nextInt(57-48)+48); //paragwgi tuxaioy arithmou se char me voitheia pinaka ascci 
          String str2 = String.valueOf(str); //metatropi tou pinaka xaraktirwn se string
    //    System.out.println(str2);
 JOptionPane.showMessageDialog(null, str2, "Username1", EXIT_ON_CLOSE); // typwsi username me Joptionpane

    
}
    

    //sunartisi gia dimiourgia password1
    public static void passGen1(User us1){
        //metatropi tou onomatos,tou epithetou kai tou katoikidiou apo string se char
    char[]c1 = us1.getFirstname().toLowerCase().toCharArray();
    char[]c2 = us1.getLastname().toLowerCase().toCharArray();
    char[]c3 = us1.getPetsname().toLowerCase().toCharArray();
    //dimiourgia neou pinaka char
    char [] pass1 = new char[100];
    //spaw to pass se 3 kommatia pinakwn char ta metatrepw se string kai ta enwnw
    for(int i =0; i<=(new Random().nextInt(c1.length-1)+1);i++){
    pass1[i]=c1[i];
   
    }
    String s1 = String.copyValueOf(pass1);
    
    for(int i=0; i<=(new Random().nextInt(c2.length-1)+1);i++)
    {
    pass1[i]= c2[i];

    }
    String s2 = String.copyValueOf(pass1);
        for(int i=0; i<=(new Random().nextInt(c3.length-1)+1);i++)
    {
    pass1[i]= c3[i];

    }
        String s3 = String.copyValueOf(pass1);
        String str = s1+s2+s3;
        
        

    str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase(); //kanw to 1o stoixeio kefalaio
        
 JOptionPane.showMessageDialog(null, str, "Password 1:", EXIT_ON_CLOSE); //typwnw to password
    
    
    
    }
   
    //sunartisi gia password2    
    public static void passGen2(User us1){
    //metatropi onoma kai epithetou se char array apo string
    char[]c1 = us1.getFirstname().toLowerCase().toCharArray();
    char[]c2 = us1.getLastname().toLowerCase().toCharArray();

    char [] pass2 = new char[100];
        
    pass2[0]=c1[0];
    pass2[1]= (char) (new Random().nextInt(49-48)+48);
   //kanw mia if pou se periptwsi pou o 1os arithmos einai 1 ta upoloipa na nai 0 alliws an einai 0 o 1os ta upoloipa na nai apo 0 ews 9 (afou thelw mexri 100)
    if(pass2[1]=='1')
    {
    pass2[2]= '0';
    pass2[3]='0';
    }
    
    else
    {
    pass2[2]= (char) (new Random().nextInt(57-48)+48);
    pass2[3]= (char) (new Random().nextInt(57-48)+48);
    }

    for(int i=4; i<=c2.length;i++)
    {
       pass2[i]=c2[i-4];

    }
   //metatrepw to a se @ , to s se $, to o se 0 kai to l se 1
      //    System.out.println(pass2);
for(int x=0; x<=50;x++){

        if(pass2[x]=='a')
            pass2[x]='@';
}
        
for(int x=0; x<=50;x++){

        if(pass2[x]=='s')
            pass2[x]='$';
}    
for(int x=0; x<=50;x++){

      if(pass2[x]=='o')
            pass2[x]='0';
}    
for(int x=0; x<=50;x++){

       if(pass2[x]=='l')
            pass2[x]='1';
}
       String pass = String.valueOf(pass2);
//typwnw to password se string me metatropi apo char me grafika
 JOptionPane.showMessageDialog(null, pass, "Password 2:", EXIT_ON_CLOSE);
    
    }











}
