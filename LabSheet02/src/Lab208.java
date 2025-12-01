import javax.swing.*;
import java.text.DecimalFormat;

public class Lab208 {
    public static void main(String[] args) {
        final int parkhourprice = 50;
        final double parkminuteprice = 0.25;
        DecimalFormat frm = new DecimalFormat("00");

        int Starttimehour = Integer.parseInt(JOptionPane.showInputDialog("Input start time (hour) : "));

        int Starttimeminute = Integer.parseInt(JOptionPane.showInputDialog("Input start time (minutes) : "));

        int Endtimehour = Integer.parseInt(JOptionPane.showInputDialog("Input end time (hour) : "));

        int Endtimeminute = Integer.parseInt(JOptionPane.showInputDialog("Input end time (minutes) : "));

        int Sttime = (Starttimehour * 60) + Starttimeminute;
        int Entime = (Endtimehour * 60) + Endtimeminute;

        int finalhour = (Entime - Sttime) / 60;
        int finalmin = (Entime - Sttime) % 60;

        double Totalprice = (parkhourprice * finalhour) + (parkminuteprice * finalmin);


        JOptionPane.showMessageDialog(null,
                "Start parking at " + Starttimehour + ":" + frm.format(Starttimeminute) +
                        "\nEnd parking at " + Endtimehour +":"+ frm.format(Endtimeminute) +
                "\nTotal Time is " + finalhour + "hour" + finalmin + " minutes "+
                "\nParking payment is " + Totalprice + " baht.");

    }
}
