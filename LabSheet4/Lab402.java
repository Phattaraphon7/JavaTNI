import javax.swing.*;

public class Lab402 {
    static void main() {
        String id = JOptionPane.showInputDialog("Enter student ID: ");

        if(id == null || id.length() < 2) {
            JOptionPane.showMessageDialog(null, "Invalid student ID: ");
            return;
        }

        String major = "";
        String prefix = id.substring(2, 5);

        switch(prefix) {
            case "131": major = "Information Technology (IT)"; break;
            case "132": major = "Multimedia Technology (MT)"; break;
            case "133": major = "Digital Business Information Technology (DB)"; break;
            case "134": major = "Digital Technology & Mass Communication (DC)"; break;
            case "135": major = "Data Science and Data Analytics (DS)"; break;
            default: major = "Cannot found major";
        }

        JOptionPane.showMessageDialog(null, "Student ID: " + id
                + "\nMajor: " + major);
    }
}
