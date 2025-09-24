import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginCreativo {
    private JPanel panelBlocCreativo;
    private JProgressBar barraProgreso;
    private Timer timer;

    public LoginCreativo() {

        panelBlocCreativo = new JPanel() {
            private Image imagenFondo = new ImageIcon("Fotos/fondo.png").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.drawImage(imagenFondo, 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        panelBlocCreativo.setLayout(null);

        // Logo - JLabel
        ImageIcon logo = new ImageIcon("Fotos/logo.png");
        Image imgR = logo.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon logoR = new ImageIcon(imgR);
        JLabel logoLabel = new JLabel(logoR);
        logoLabel.setBounds(90, 15, 100, 100);  // Ajustada la posición
        panelBlocCreativo.add(logoLabel);

        // Título
        JLabel titulo = new JLabel("La vitrina del Jugon V.3");
        titulo.setFont(new Font("Georgia Pro Cond Black", Font.BOLD, 32));
        titulo.setBounds(190, 40, 450, 40);  // Mantenida la posición del título
        titulo.setHorizontalAlignment(SwingConstants.LEFT);
        titulo.setForeground(Color.WHITE);
        panelBlocCreativo.add(titulo);

        // JTabbedPane - Login vs Registro
        JTabbedPane pestañas = new JTabbedPane();
        pestañas.setFont(new Font("Georgia Pro Cond", Font.BOLD, 14));
        pestañas.setBounds(50, 140, 650, 240);  // Mantenido en la misma posición
        pestañas.setBackground(new Color(10, 42, 94));
        pestañas.setForeground(Color.WHITE);

        // Panel de Login
        JPanel panelLogin = crearPanelLogin();
        pestañas.addTab("Iniciar Sesión", panelLogin);

        // Panel de Registro
        JPanel panelRegistro = crearPanelRegistro();
        pestañas.addTab("Registrarse", panelRegistro);

        panelBlocCreativo.add(pestañas);

        // JProgressBar - Barra de progreso
        barraProgreso = new JProgressBar(0, 100);
        barraProgreso.setBounds(200, 375, 350, 20);
        barraProgreso.setStringPainted(true);
        barraProgreso.setString("Esperando conexión...");
        barraProgreso.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 12));
        barraProgreso.setVisible(false);
        panelBlocCreativo.add(barraProgreso);

        // Botón principal
        JButton acceder = new JButton("Acceder al Sistema");
        acceder.setFont(new Font("Georgia Pro Cond", Font.BOLD, 16));
        acceder.setBounds(300, 400, 180, 35);
        acceder.addActionListener(e -> iniciarBarraProgreso());
        panelBlocCreativo.add(acceder);
    }

    private JPanel crearPanelLogin() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255, 220, 160));

        // Usuario - Label y TextField
        JLabel usuario = new JLabel("Usuario:");
        usuario.setFont(new Font("Georgia Pro Cond", Font.BOLD, 16));
        usuario.setBounds(50, 30, 100, 25);
        panel.add(usuario);

        JTextField usuarioTexto = new JTextField();
        usuarioTexto.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 16));
        usuarioTexto.setBounds(150, 30, 180, 25);
        panel.add(usuarioTexto);

        // Contraseña - Label y PasswordField
        JLabel contrasena = new JLabel("Contraseña:");
        contrasena.setFont(new Font("Georgia Pro Cond", Font.BOLD, 16));
        contrasena.setBounds(50, 70, 100, 25);
        panel.add(contrasena);

        JPasswordField contrasenaTexto = new JPasswordField();
        contrasenaTexto.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 16));
        contrasenaTexto.setBounds(150, 70, 180, 25);
        panel.add(contrasenaTexto);

        // Recordar Usuario - JRadioButton
        JRadioButton recordarUsuario = new JRadioButton("Recordar Usuario");
        recordarUsuario.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 14));
        recordarUsuario.setBounds(50, 110, 200, 25);
        recordarUsuario.setBackground(new Color(255, 220, 160));
        panel.add(recordarUsuario);

        // JSlider - Nivel de seguridad
        JLabel labelSeguridad = new JLabel("Experiencia como jugador:");
        labelSeguridad.setFont(new Font("Georgia Pro Cond", Font.BOLD, 14));
        labelSeguridad.setBounds(350, 30, 250, 25);
        panel.add(labelSeguridad);

        JSlider sliderSeguridad = new JSlider(JSlider.HORIZONTAL, 1, 5, 3);
        sliderSeguridad.setBounds(350, 55, 200, 50);
        sliderSeguridad.setMajorTickSpacing(1);
        sliderSeguridad.setPaintTicks(true);
        sliderSeguridad.setPaintLabels(true);
        sliderSeguridad.setBackground(new Color(255, 220, 160));
        sliderSeguridad.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 12));
        panel.add(sliderSeguridad);

        return panel;
    }

    private JPanel crearPanelRegistro() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255, 220, 160));

        // Nombre completo
        JLabel nombre = new JLabel("Nombre:");
        nombre.setFont(new Font("Georgia Pro Cond", Font.BOLD, 16));
        nombre.setBounds(50, 20, 100, 25);
        panel.add(nombre);

        JTextField nombreTexto = new JTextField();
        nombreTexto.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 16));
        nombreTexto.setBounds(150, 20, 180, 25);
        panel.add(nombreTexto);

        // Email
        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Georgia Pro Cond", Font.BOLD, 16));
        email.setBounds(50, 55, 100, 25);
        panel.add(email);

        JTextField emailTexto = new JTextField();
        emailTexto.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 16));
        emailTexto.setBounds(150, 55, 180, 25);
        panel.add(emailTexto);

        // Contraseña
        JLabel nuevaContrasena = new JLabel("Contraseña:");
        nuevaContrasena.setFont(new Font("Georgia Pro Cond", Font.BOLD, 16));
        nuevaContrasena.setBounds(50, 90, 100, 25);
        panel.add(nuevaContrasena);

        JPasswordField nuevaContrasenaTexto = new JPasswordField();
        nuevaContrasenaTexto.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 16));
        nuevaContrasenaTexto.setBounds(150, 90, 180, 25);
        panel.add(nuevaContrasenaTexto);

        // JSpinner - Edad
        JLabel labelEdad = new JLabel("Edad:");
        labelEdad.setFont(new Font("Georgia Pro Cond", Font.BOLD, 16));
        labelEdad.setBounds(350, 20, 100, 25);
        panel.add(labelEdad);

        SpinnerNumberModel modeloEdad = new SpinnerNumberModel(18, 16, 100, 1);
        JSpinner spinnerEdad = new JSpinner(modeloEdad);
        spinnerEdad.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 16));
        spinnerEdad.setBounds(420, 20, 80, 25);
        panel.add(spinnerEdad);

        // Idioma - ComboBox
        JLabel labelIdioma = new JLabel("Idioma:");
        labelIdioma.setFont(new Font("Georgia Pro Cond", Font.BOLD, 16));
        labelIdioma.setBounds(350, 55, 100, 25);
        panel.add(labelIdioma);

        String[] idiomas = {"Español", "Inglés", "Portugués", "Alemán", "Italiano"};
        JComboBox<String> comboIdiomas = new JComboBox<>(idiomas);
        comboIdiomas.setFont(new Font("Georgia Pro Cond", Font.PLAIN, 14));
        comboIdiomas.setBounds(420, 55, 150, 25);
        panel.add(comboIdiomas);

        // Terminos y condiciones - Checkbox
        JCheckBox terminos = new JCheckBox("Acepto los términos y condiciones");
        terminos.setFont(new Font("Georgia Pro Cond", Font.BOLD, 14));
        terminos.setBounds(50, 130, 300, 25);
        terminos.setBackground(new Color(255, 220, 160));
        panel.add(terminos);

        return panel;
    }

    private void iniciarBarraProgreso() {
        barraProgreso.setVisible(true);
        barraProgreso.setValue(0);
        barraProgreso.setString("Conectando...");

        timer = new Timer(100, new ActionListener() {
            int progreso = 0;
            String[] mensajes = {
                    "Verificando credenciales...",
                    "Cargando configuración...",
                    "Estableciendo conexión...",
                    "Sincronizando datos...",
                    "¡Acceso concedido!"
            };

            @Override
            public void actionPerformed(ActionEvent e) {
                progreso += 2;
                barraProgreso.setValue(progreso);

                if (progreso <= 100) {
                    int indice = Math.min(progreso / 20, mensajes.length - 1);
                    barraProgreso.setString(mensajes[indice]);
                } else {
                    timer.stop();
                    barraProgreso.setString("¡Conexión establecida!");
                    // Aquí podrías abrir la ventana principal de la aplicación
                }
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("La vitrina del Jugon V.3");
            frame.setContentPane(new LoginCreativo().panelBlocCreativo);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(750, 480);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}