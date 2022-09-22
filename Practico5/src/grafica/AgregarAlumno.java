package grafica;

import logica.Alumno;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarAlumno extends JFrame {

	private JPanel contentPane;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtGrupo;
	private JTextField txtCuotaBase;
	private JTextField txtCalcular;
	private JButton btnSalir, btnLimpiar, btnCalcular;

	public AgregarAlumno() {
		setTitle("Mi Primer Ventana");
		iniciarComponentes();
		iniciarManejadoresEventos();
	}

	private void iniciarComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelDatos = new JPanel();
		panelDatos.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Datos personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelDatos.setBackground(Color.GREEN);
		panelDatos.setBounds(10, 11, 236, 121);
		contentPane.add(panelDatos);
		panelDatos.setLayout(null);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 19, 76, 14);
		panelDatos.add(lblApellido);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 43, 76, 14);
		panelDatos.add(lblNombre);

		JLabel lblGrupo = new JLabel("Grupo:");
		lblGrupo.setBounds(10, 68, 76, 14);
		panelDatos.add(lblGrupo);

		JLabel lblCuotaBase = new JLabel("Cuota base:");
		lblCuotaBase.setBounds(10, 93, 76, 14);
		panelDatos.add(lblCuotaBase);

		txtApellido = new JTextField();
		txtApellido.setBounds(96, 19, 130, 20);
		panelDatos.add(txtApellido);
		txtApellido.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.setBounds(95, 43, 131, 20);
		panelDatos.add(txtNombre);
		txtNombre.setColumns(10);

		txtGrupo = new JTextField();
		txtGrupo.setColumns(10);
		txtGrupo.setBounds(94, 68, 131, 20);
		panelDatos.add(txtGrupo);

		txtCuotaBase = new JTextField();
		txtCuotaBase.setColumns(10);
		txtCuotaBase.setBounds(94, 93, 131, 20);
		panelDatos.add(txtCuotaBase);

		JPanel panelCalculo = new JPanel();
		panelCalculo.setBorder(new TitledBorder(null, "C\u00E1lculo de la cuota neta", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panelCalculo.setBackground(Color.ORANGE);
		panelCalculo.setBounds(256, 11, 194, 56);
		contentPane.add(panelCalculo);
		panelCalculo.setLayout(null);

		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(10, 22, 81, 23);
		panelCalculo.add(btnCalcular);

		txtCalcular = new JTextField();
		txtCalcular.setBounds(98, 23, 86, 20);
		panelCalculo.add(txtCalcular);
		txtCalcular.setColumns(10);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(258, 96, 89, 23);
		contentPane.add(btnLimpiar);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(361, 96, 89, 23);
		contentPane.add(btnSalir);

	}

	private void iniciarManejadoresEventos() {
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtApellido.setText(null);
				txtNombre.setText(null);
				txtGrupo.setText(null);
				txtCuotaBase.setText(null);
				txtCalcular.setText(null);
			}
		});

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alumno a;
				try {
					String ape = txtApellido.getText();
					String nom = txtNombre.getText();
					int gru = Integer.valueOf(txtGrupo.getText());
					double cuota = Double.valueOf(txtCuotaBase.getText());
					a = new Alumno(ape, nom, gru, cuota);
					txtCalcular.setText(String.valueOf(a.cuotaNeta()));
				} catch (Exception ex) {
					txtCalcular.setText("error");
					JOptionPane.showMessageDialog(null, ex);

				}
			}
		});

	}

	public static void main(String[] args) {
		AgregarAlumno ventanita = new AgregarAlumno();
		ventanita.setVisible(true);

	}

	public static void saludar(String nombre) {
		System.out.println("Hola, bienvenido, " + nombre);
	}

}
