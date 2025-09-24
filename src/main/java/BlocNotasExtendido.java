import javax.swing.*;
import java.awt.*;

public class BlocNotasExtendido {
    private JPanel panelBlocExtendido;

    public BlocNotasExtendido() {
        panelBlocExtendido = new JPanel();
        panelBlocExtendido.setLayout(null);
        panelBlocExtendido.setBackground(new Color(10, 42, 94));

        // Logo - JLabel
        ImageIcon logo = new ImageIcon("Fotos/logo.png");
        Image imgR = logo.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon logoR = new ImageIcon(imgR);
        JLabel logoLabel = new JLabel(logoR);
        logoLabel.setBounds(60, 10, 180, 180);
        panelBlocExtendido.add(logoLabel);

        // Título
        JLabel titulo = new JLabel("La vitrina del Jugon V.2");
        titulo.setFont(new Font("Georgia Pro Cond Black", Font.BOLD, 22));
        titulo.setBounds(240, 90, 350, 25);
        titulo.setForeground(Color.WHITE);
        panelBlocExtendido.add(titulo);

        // Usuario - Label
        JLabel usuario = new JLabel("Usuario:");
        usuario.setFont(new Font("Georgia Pro Cond", Font.BOLD, 18));
        usuario.setBounds(240, 160, 100, 25);
        usuario.setForeground(Color.WHITE);
        panelBlocExtendido.add(usuario);

        // Usuario - TextField
        JTextField usuarioTexto = new JTextField();
        usuarioTexto.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 18));
        usuarioTexto.setBounds(360, 160, 150, 25);
        panelBlocExtendido.add(usuarioTexto);

        // Contraseña - Label
        JLabel contrasena = new JLabel("Contraseña:");
        contrasena.setFont(new Font("Georgia Pro Cond", Font.BOLD, 18));
        contrasena.setBounds(240, 200, 150, 25);
        contrasena.setForeground(Color.WHITE);
        panelBlocExtendido.add(contrasena);

        // Contraseña - PasswordField
        JPasswordField contrasenaTexto = new JPasswordField();
        contrasenaTexto.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 18));
        contrasenaTexto.setBounds(360, 200, 150, 25);
        panelBlocExtendido.add(contrasenaTexto);

        // Idioma - Label
        JLabel labelIdioma = new JLabel("Idioma:");
        labelIdioma.setFont(new Font("Georgia Pro Cond", Font.BOLD, 18));
        labelIdioma.setBounds(240, 240, 100, 25);
        labelIdioma.setForeground(Color.WHITE);
        panelBlocExtendido.add(labelIdioma);

        // Idioma - ComboBox
        String[] idiomas = {"Español", "Inglés", "Portugués", "Alemán", "Italiano"};
        JComboBox<String> comboIdiomas = new JComboBox<>(idiomas);
        comboIdiomas.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 16));
        comboIdiomas.setBounds(360, 240, 150, 25);
        panelBlocExtendido.add(comboIdiomas);

        // Terminos y condiciones - Checkbox
        JCheckBox terminos = new JCheckBox("Acepto los términos y condiciones");
        terminos.setFont(new Font("Georgia Pro Cond", 1, 16));
        terminos.setBounds(250, 280, 300, 25);
        terminos.setBackground(new Color(10, 42, 94));
        terminos.setForeground(Color.WHITE);
        panelBlocExtendido.add(terminos);

        // Botón
        JButton acceder = new JButton("Acceder");
        acceder.setFont(new Font("Georgia Pro Cond", Font.BOLD, 18));
        acceder.setBounds(300, 320, 150, 30);
        panelBlocExtendido.add(acceder);

        //Recordar Usuario - JRadioButton
        JRadioButton recordarUsuario = new JRadioButton("Recordar Usuario");
        recordarUsuario.setFont(new Font("Georgia Pro Cond",1, 14));
        recordarUsuario.setBounds(300, 360, 200, 25);
        recordarUsuario.setBackground(new Color(10, 42, 94));
        recordarUsuario.setForeground(Color.WHITE);
        panelBlocExtendido.add(recordarUsuario);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Bloc de Notas v.2");
            frame.setContentPane(new BlocNotasExtendido().panelBlocExtendido);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(750, 450);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}