import javax.swing.*;
import java.awt.*;

public class LoginClasico {
    private JPanel panelBloc;

    public LoginClasico() {
        panelBloc = new JPanel();
        panelBloc.setLayout(null);

        // Logo
        ImageIcon logo = new ImageIcon("Fotos/logo.png");
        Image imgR = logo.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon logoR = new ImageIcon(imgR);
        JLabel logoLabel = new JLabel(logoR);
        logoLabel.setBounds(250, 10, 100, 100);
        panelBloc.add(logoLabel);

        // Título
        JLabel titulo = new JLabel("La vitrina del Jugon");
        titulo.setFont(new Font("Georgia Pro Cond Black", Font.BOLD, 22));
        titulo.setBounds(190, 120, 260, 25);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelBloc.add(titulo);

        // Usuario - Label
        JLabel usuario = new JLabel("Usuario:");
        usuario.setFont(new Font("Georgia Pro Cond", Font.BOLD, 18));
        usuario.setBounds(180, 160, 100, 25);
        panelBloc.add(usuario);

        // Usuario - TextField
        JTextField usuarioTexto = new JTextField();
        usuarioTexto.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 18));
        usuarioTexto.setBounds(300, 160, 150, 25);
        panelBloc.add(usuarioTexto);

        // Contraseña - Label
        JLabel contrasena = new JLabel("Contraseña:");
        contrasena.setFont(new Font("Georgia Pro Cond", Font.BOLD, 18));
        contrasena.setBounds(180, 200, 150, 25);
        panelBloc.add(contrasena);

        // Contraseña - PasswordField
        JPasswordField contrasenaTexto = new JPasswordField();
        contrasenaTexto.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 18));
        contrasenaTexto.setBounds(300, 200, 150, 25);
        panelBloc.add(contrasenaTexto);

        // Checkbox
        JCheckBox terminos = new JCheckBox("Acepto los términos y condiciones");
        terminos.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 14));
        terminos.setBounds(180, 240, 300, 25);
        panelBloc.add(terminos);

        // Botón
        JButton acceder = new JButton("Acceder");
        acceder.setFont(new Font("Georgia Pro Cond", Font.BOLD, 18));
        acceder.setBounds(225, 280, 150, 30);
        panelBloc.add(acceder);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("La vitrina del Jugon");
        frame.setContentPane(new LoginClasico().panelBloc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 350);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
