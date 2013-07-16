// Applet for counting pancake ingredients.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.lang.*;
import javax.swing.*;

public class LaettyApplet extends Applet implements ActionListener {
    TextField inputLine = new TextField(15);
    private LayoutManager Layout;
    private Label Label1;
    private Label Label2;
    private Label Label3;
    private Label Label4;
    private Label Label5;


    public LaettyApplet() {
        Layout = new GridLayout (6, 1);
        Label1 = new Label ("a");
        Label2 = new Label ("b");
        Label3 = new Label ("c");
        Label4 = new Label ("d");
        Label5 = new Label ("e");
        setLayout(Layout);
        add(inputLine);
        add(Label1);
        add(Label2);
        add(Label3);
        add(Label4);
        add(Label5);
        inputLine.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        String s = inputLine.getText();
        countIngredients(s);
        //String sUp = s.toUpperCase();
        //inputLine.setText(sUp);
    }
    private void countIngredients(String t) {
        int y = Integer.parseInt(t);
        double x=(double)y/4;
        double Kananmuna = 2;
        double Jauho = 2;
        double Maito = 5;
        double Suola = 0.75;
        double Oljy = 2;

        Label1.setText(Palautamerkkijono( "Kananmunia kpl ",Kananmuna,x));
        Label2.setText(Palautamerkkijono( "Jauho dl ",Jauho,x));
        Label3.setText(Palautamerkkijono( "Maito dl ",Maito,x));
        Label4.setText(Palautamerkkijono( "Suola tl ",Suola,x));
        Label5.setText(Palautamerkkijono( "Öljy rkl ",Oljy,x));
    }
    private String Palautamerkkijono(String x,double kerroin,double maara) {
        return x + kerroin*maara;
    }
}
